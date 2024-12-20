/*
 * Copyright (C) 2023 The Android Open Source Project
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

package com.android.build.api.component.analytics

import com.android.build.api.variant.ApplicationAndroidResources
import com.android.tools.build.gradle.internal.profile.VariantPropertiesMethodType
import com.google.wireless.android.sdk.stats.GradleBuildVariant
import org.gradle.api.provider.SetProperty
import javax.inject.Inject

open class AnalyticsEnabledApplicationAndroidResources @Inject constructor(
    override val delegate: ApplicationAndroidResources,
    stats: GradleBuildVariant.Builder,
): ApplicationAndroidResources, AnalyticsEnabledAndroidResources(
    delegate,
    stats,
) {
    override val generateLocaleConfig: Boolean
        get() {
            stats.variantApiAccessBuilder.addVariantPropertiesAccessBuilder().type =
                VariantPropertiesMethodType.GENERATE_LOCALE_CONFIG_FLAG_VALUE
            return delegate.generateLocaleConfig
        }

    override val localeFilters: SetProperty<String>
        get() {
            return delegate.localeFilters
        }
}
