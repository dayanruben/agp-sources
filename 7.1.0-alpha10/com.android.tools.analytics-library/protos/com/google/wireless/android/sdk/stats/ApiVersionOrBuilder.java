// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface ApiVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.ApiVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 api_level = 1;</code>
   * @return Whether the apiLevel field is set.
   */
  boolean hasApiLevel();
  /**
   * <code>optional int64 api_level = 1;</code>
   * @return The apiLevel.
   */
  long getApiLevel();

  /**
   * <code>optional string codename = 2;</code>
   * @return Whether the codename field is set.
   */
  boolean hasCodename();
  /**
   * <code>optional string codename = 2;</code>
   * @return The codename.
   */
  java.lang.String getCodename();
  /**
   * <code>optional string codename = 2;</code>
   * @return The bytes for codename.
   */
  com.google.protobuf.ByteString
      getCodenameBytes();
}