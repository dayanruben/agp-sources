/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.build.gradle.internal.dependency

import com.android.SdkConstants
import com.android.SdkConstants.COM_ANDROID_TOOLS_FOLDER
import com.android.utils.FileUtils
import com.google.common.annotations.VisibleForTesting
import org.gradle.api.artifacts.transform.InputArtifact
import org.gradle.api.artifacts.transform.TransformAction
import org.gradle.api.artifacts.transform.TransformOutputs
import org.gradle.api.file.FileSystemLocation
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.work.DisableCachingByDefault
import java.io.File
import java.util.Locale

@DisableCachingByDefault
abstract class FilterShrinkerRulesTransform :
    TransformAction<FilterShrinkerRulesTransform.Parameters> {
    interface Parameters : GenericTransformParameters {
        @get:Input
        val shrinker: Property<ShrinkerVersion>
    }

    @get:InputArtifact
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val inputArtifact: Provider<FileSystemLocation>

    override fun transform(transformOutputs: TransformOutputs) {
        //TODO(b/162813654) record transform execution span
        val input = inputArtifact.get().asFile
        if (input.isFile) {
            // if input is a regular file, it is simply always accepted, no need to filter
            transformOutputs.file(input.absolutePath)
        } else if (input.isDirectory) {
            // this will handle inputs that look like this:
            // input/
            // ├── lib0/
            // |   ├── proguard.txt (optional, coming from AAR)
            // │   └── META-INF/
            // |       ├── proguard/ (optional, coming from JAR)
            // │       └── com.android.tools/ (optional, coming from JAR)
            // │           ├── r8[...][...]
            // │           └── proguard[...][...]
            // ├── lib1/
            // │   └── ...
            // ...

            // loop through top-level directories and join the results into a list
            input.listFiles { file -> file.isDirectory }.flatMap { libDir ->
                // if there is a com.android.tools directory, it takes precedence over legacy rules
                val toolsDir = FileUtils.join(libDir, "META-INF", COM_ANDROID_TOOLS_FOLDER)
                if (toolsDir.isDirectory) {
                    // gather all directories under com.android.tools that match shrinker version...
                    return@flatMap toolsDir.listFiles { file ->
                        file.isDirectory && configDirMatchesVersion(
                            file.name,
                            parameters.shrinker.get()
                        )
                    }.flatMap { shrinkerConfigDir ->
                        // ...then gather all regular files under the matching directories
                        shrinkerConfigDir.listFiles { file -> file.isFile }.asIterable()
                    }
                } else {
                    // there will be either a libDir/proguard.txt file or libDir/META-INF/proguard/*
                    // order doesn't really matter, as there never should be both
                    val proguardTxtFile = File(libDir, SdkConstants.FN_PROGUARD_TXT)
                    if (proguardTxtFile.isFile) {
                        return@flatMap listOf(proguardTxtFile)
                    } else {
                        val proguardConfigDir = FileUtils.join(libDir, "META-INF", "proguard")
                        if (proguardConfigDir.isDirectory) {
                            // gets all files from the META-INF/proguard/ directory
                            return@flatMap proguardConfigDir
                                .listFiles { file -> file.isFile }
                                .asIterable()
                        }
                    }
                }
                emptyList<File>()
            }.forEach { file ->
                transformOutputs.file(file.absolutePath)
            }
        }
    }
}

// Regex for directories containing PG/R8 configuration files inside META-INF/com.android.tools/
private val configDirRegex = """r8(?:-from-([^:@]+?))?(?:-upto-([^:@]+?))?""".toRegex()

@VisibleForTesting
internal fun configDirMatchesVersion(
    dirName: String,
    version: ShrinkerVersion
): Boolean {
    val matchResult = configDirRegex.matchEntire(dirName.lowercase(Locale.US)) ?: return false
    val (minVersionString, maxVersionString) = matchResult.destructured
    if (minVersionString.isEmpty() && maxVersionString.isEmpty()) {
        return true
    }
    val minVersion = ShrinkerVersion.tryParse(minVersionString)
    if (minVersion != null && version < minVersion) {
        return false
    }
    val maxVersion = ShrinkerVersion.tryParse(maxVersionString)
    return maxVersion == null || maxVersion > version
}
