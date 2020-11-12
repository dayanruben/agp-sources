/*
 * Copyright (C) 2021 The Android Open Source Project
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

package com.android.build.gradle.internal.dsl.decorator

import org.objectweb.asm.Type

/** A property type that can be managed by code generated by the [DslDecorator] */
sealed class SupportedPropertyType(
    /** The public type of this property */
    val type: Type,
    /** The type used for the field */
    val implementationType: Type,
) {

    /**
     * This property type may only be used with 'var', e.g. primitives and Strings.
     * These are not explicitly initialized, so use the default values
     * (e.g. null for Strings, false for booleans 0 for ints) are used.
     */
    sealed class Var(type: Type) : SupportedPropertyType(type, type) {
        object String : Var(Type.getType(kotlin.String::class.java))
    }

    sealed class Collection(
        type: Type,
        /**
         * The type to instantiate in the constructor
         *
         * The type here must have a 1-argument constructor that takes a name as argument,
         * and must implement Lockable.
         */
        implementationType: Type,
        /**
         * The supported bridge method return types for overridden getters.
         *
         * e.g. a property of type `List` might allow `Collection`
         */
        val bridgeTypes: kotlin.collections.Collection<Type>,
    ) : SupportedPropertyType(type, implementationType) {

        object List : Collection(
            Type.getType(kotlin.collections.List::class.java),
            implementationType = Type.getType(LockableList::class.java),
            bridgeTypes = listOf(
                Type.getType(kotlin.collections.Collection::class.java),
                Type.getType(Iterable::class.java),
            ),
        )
        object Set : Collection(
            Type.getType(kotlin.collections.Set::class.java),
            implementationType = Type.getType(LockableSet::class.java),
            bridgeTypes = listOf(
                Type.getType(kotlin.collections.Collection::class.java),
                Type.getType(Iterable::class.java),
            ),
        )
    }

    override fun toString(): String = "SupportedPropertyType(type=${type.className})"
}