// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface MetaMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.MetaMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * number of times connecting to the clearcut server failed since
   * the last successful upload.
   * </pre>
   *
   * <code>optional int32 failed_connections = 1;</code>
   * @return Whether the failedConnections field is set.
   */
  boolean hasFailedConnections();
  /**
   * <pre>
   * number of times connecting to the clearcut server failed since
   * the last successful upload.
   * </pre>
   *
   * <code>optional int32 failed_connections = 1;</code>
   * @return The failedConnections.
   */
  int getFailedConnections();

  /**
   * <pre>
   * number of bytes used to send metrics in the last upload.
   * </pre>
   *
   * <code>optional int64 bytes_sent_in_last_upload = 2;</code>
   * @return Whether the bytesSentInLastUpload field is set.
   */
  boolean hasBytesSentInLastUpload();
  /**
   * <pre>
   * number of bytes used to send metrics in the last upload.
   * </pre>
   *
   * <code>optional int64 bytes_sent_in_last_upload = 2;</code>
   * @return The bytesSentInLastUpload.
   */
  long getBytesSentInLastUpload();

  /**
   * <pre>
   * number of times the clearcut server failed with an http error since
   * the last successful upload.
   * </pre>
   *
   * <code>optional int32 failed_server_replies = 3;</code>
   * @return Whether the failedServerReplies field is set.
   */
  boolean hasFailedServerReplies();
  /**
   * <pre>
   * number of times the clearcut server failed with an http error since
   * the last successful upload.
   * </pre>
   *
   * <code>optional int32 failed_server_replies = 3;</code>
   * @return The failedServerReplies.
   */
  int getFailedServerReplies();
}