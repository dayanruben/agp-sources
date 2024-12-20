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

package com.android.build.api.variant.impl

import com.android.build.api.variant.BuiltArtifactsLoader
import com.android.ide.common.build.ListingFileRedirect
import com.google.gson.stream.JsonReader
import org.gradle.api.file.Directory
import org.gradle.api.file.FileCollection
import org.gradle.api.file.FileSystemLocation
import org.gradle.api.provider.Provider
import java.io.File
import java.io.FileReader
import java.io.IOException
import java.io.StringReader
import java.nio.file.Paths

class BuiltArtifactsLoaderImpl: BuiltArtifactsLoader {

    override fun load(folder: Directory): BuiltArtifactsImpl? {
        return load(folder as FileSystemLocation)
    }

    fun load(folder: FileSystemLocation): BuiltArtifactsImpl? {
        return loadFromFile(
            getMetadataFile(folder)
        )
    }

    override fun load(fileCollection: FileCollection): BuiltArtifactsImpl? {
        val metadataFile =
            fileCollection.asFileTree.files.find { it.name == BuiltArtifactsImpl.METADATA_FILE_NAME }
        return loadFromFile(metadataFile)
    }

    fun load(folder: Provider<Directory>): BuiltArtifactsImpl? = load(folder.get())

    companion object {
        @JvmStatic
        fun loadFromDirectory(folder: File): BuiltArtifactsImpl? =
            loadFromFile(File(folder, BuiltArtifactsImpl.METADATA_FILE_NAME))


        @JvmStatic
        fun loadFromFile(inputFile: File?): BuiltArtifactsImpl? {
            if (inputFile == null || !inputFile.exists()) {
                return null
            }
            val redirectFileContent = inputFile.readText()
            val redirectedFile =
                ListingFileRedirect.maybeExtractRedirectedFile(inputFile, redirectFileContent)
            val relativePathToUse = if (redirectedFile != null) {
                redirectedFile.parentFile.toPath()
            } else {
                inputFile.parentFile.toPath()
            }

            val reader = redirectedFile?.let { FileReader(it) } ?: StringReader(redirectFileContent)
            val buildOutputs = try {
                JsonReader(reader).use {
                    BuiltArtifactsTypeAdapter(relativePathToUse).read(it)
                }
            } catch (e: Exception) {
                throw IOException("Error parsing build artifacts from ${if (redirectedFile!=null) "$redirectedFile redirected from $inputFile" else inputFile}", e)
            }
            // resolve the file path to the current project location.
            return buildOutputs.copy(
                elements = buildOutputs.elements.map {
                    it.newOutput(relativePathToUse.resolve(Paths.get(it.outputFile)).normalize())
                }
            )
        }

        @JvmStatic
        fun getMetadataFile(folder: FileSystemLocation): File {
            return File(folder.asFile, BuiltArtifactsImpl.METADATA_FILE_NAME)
        }
    }
}
