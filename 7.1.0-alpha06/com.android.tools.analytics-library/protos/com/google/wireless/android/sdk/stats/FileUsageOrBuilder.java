// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface FileUsageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.FileUsage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Anonymized guid representing file path
   * </pre>
   *
   * <code>optional string file_path = 1;</code>
   * @return Whether the filePath field is set.
   */
  boolean hasFilePath();
  /**
   * <pre>
   * Anonymized guid representing file path
   * </pre>
   *
   * <code>optional string file_path = 1;</code>
   * @return The filePath.
   */
  java.lang.String getFilePath();
  /**
   * <pre>
   * Anonymized guid representing file path
   * </pre>
   *
   * <code>optional string file_path = 1;</code>
   * @return The bytes for filePath.
   */
  com.google.protobuf.ByteString
      getFilePathBytes();

  /**
   * <pre>
   * Type of file, i.e. kotlin, java
   * </pre>
   *
   * <code>optional string file_type = 2;</code>
   * @return Whether the fileType field is set.
   */
  boolean hasFileType();
  /**
   * <pre>
   * Type of file, i.e. kotlin, java
   * </pre>
   *
   * <code>optional string file_type = 2;</code>
   * @return The fileType.
   */
  java.lang.String getFileType();
  /**
   * <pre>
   * Type of file, i.e. kotlin, java
   * </pre>
   *
   * <code>optional string file_type = 2;</code>
   * @return The bytes for fileType.
   */
  com.google.protobuf.ByteString
      getFileTypeBytes();

  /**
   * <pre>
   * Plugin type
   * </pre>
   *
   * <code>optional string plugin_type = 3;</code>
   * @return Whether the pluginType field is set.
   */
  boolean hasPluginType();
  /**
   * <pre>
   * Plugin type
   * </pre>
   *
   * <code>optional string plugin_type = 3;</code>
   * @return The pluginType.
   */
  java.lang.String getPluginType();
  /**
   * <pre>
   * Plugin type
   * </pre>
   *
   * <code>optional string plugin_type = 3;</code>
   * @return The bytes for pluginType.
   */
  com.google.protobuf.ByteString
      getPluginTypeBytes();
}