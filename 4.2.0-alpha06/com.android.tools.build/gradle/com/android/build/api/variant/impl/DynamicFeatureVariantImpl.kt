/*
 * Copyright (C) 2020 The Android Open Source Project
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

import com.android.build.api.component.ComponentIdentity
import com.android.build.api.component.analytics.AnalyticsEnabledDynamicFeatureVariant
import com.android.build.api.component.analytics.AnalyticsEnabledVariant
import com.android.build.api.variant.DynamicFeatureVariant
import com.android.build.api.variant.DynamicFeatureVariantProperties
import com.android.build.gradle.internal.core.VariantDslInfo
import com.android.build.gradle.internal.services.ProjectServices
import com.android.build.gradle.internal.services.VariantApiServices
import com.google.wireless.android.sdk.stats.GradleBuildVariant
import javax.inject.Inject

open class DynamicFeatureVariantImpl @Inject constructor(
    variantDslInfo: VariantDslInfo,
    variantConfiguration: ComponentIdentity,
    variantApiServices: VariantApiServices
) : VariantImpl<DynamicFeatureVariantProperties>(
    variantDslInfo,
    variantConfiguration,
    variantApiServices
), DynamicFeatureVariant<DynamicFeatureVariantProperties> {
    override fun createUserVisibleVariantObject(
        projectServices: ProjectServices,
        stats: GradleBuildVariant.Builder
    ): AnalyticsEnabledVariant<in DynamicFeatureVariantProperties> =
        projectServices.objectFactory.newInstance(
            AnalyticsEnabledDynamicFeatureVariant::class.java,
            this,
            stats
        ) as AnalyticsEnabledVariant<in DynamicFeatureVariantProperties>

    override fun executePropertiesActions(target: DynamicFeatureVariantProperties) {
        propertiesActions.executeActions(target)
    }
}