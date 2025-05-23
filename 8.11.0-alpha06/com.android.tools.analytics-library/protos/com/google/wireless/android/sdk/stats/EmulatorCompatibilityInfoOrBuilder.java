// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface EmulatorCompatibilityInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.EmulatorCompatibilityInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .android_studio.EmulatorCompatibilityInfo.AvdCompatibilityStatus status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>optional .android_studio.EmulatorCompatibilityInfo.AvdCompatibilityStatus status = 1;</code>
   * @return The status.
   */
  com.google.wireless.android.sdk.stats.EmulatorCompatibilityInfo.AvdCompatibilityStatus getStatus();

  /**
   * <code>optional .android_studio.EmulatorCompatibilityInfo.AvdCompatibilityCheck check = 2;</code>
   * @return Whether the check field is set.
   */
  boolean hasCheck();
  /**
   * <code>optional .android_studio.EmulatorCompatibilityInfo.AvdCompatibilityCheck check = 2;</code>
   * @return The check.
   */
  com.google.wireless.android.sdk.stats.EmulatorCompatibilityInfo.AvdCompatibilityCheck getCheck();

  /**
   * <pre>
   * Generic string with system details. For example in the case of
   * AVD_COMPATIBILITY_CHECK_GPU_CHECK_UNSUPPORTED_VULKAN_VERSION, this could
   * contain the version string "GPU: Intel API: 1.2.3"
   * </pre>
   *
   * <code>optional string details = 3;</code>
   * @return Whether the details field is set.
   */
  boolean hasDetails();
  /**
   * <pre>
   * Generic string with system details. For example in the case of
   * AVD_COMPATIBILITY_CHECK_GPU_CHECK_UNSUPPORTED_VULKAN_VERSION, this could
   * contain the version string "GPU: Intel API: 1.2.3"
   * </pre>
   *
   * <code>optional string details = 3;</code>
   * @return The details.
   */
  java.lang.String getDetails();
  /**
   * <pre>
   * Generic string with system details. For example in the case of
   * AVD_COMPATIBILITY_CHECK_GPU_CHECK_UNSUPPORTED_VULKAN_VERSION, this could
   * contain the version string "GPU: Intel API: 1.2.3"
   * </pre>
   *
   * <code>optional string details = 3;</code>
   * @return The bytes for details.
   */
  com.google.protobuf.ByteString
      getDetailsBytes();
}
