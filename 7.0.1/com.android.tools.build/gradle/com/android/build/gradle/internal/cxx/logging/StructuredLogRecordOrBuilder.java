// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_logging.proto

package com.android.build.gradle.internal.cxx.logging;

public interface StructuredLogRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:StructuredLogRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.NewString new_string = 1;</code>
   * @return Whether the newString field is set.
   */
  boolean hasNewString();
  /**
   * <code>.NewString new_string = 1;</code>
   * @return The newString.
   */
  com.android.build.gradle.internal.cxx.logging.NewString getNewString();
  /**
   * <code>.NewString new_string = 1;</code>
   */
  com.android.build.gradle.internal.cxx.logging.NewStringOrBuilder getNewStringOrBuilder();

  /**
   * <code>.PayloadHeader payload_header = 2;</code>
   * @return Whether the payloadHeader field is set.
   */
  boolean hasPayloadHeader();
  /**
   * <code>.PayloadHeader payload_header = 2;</code>
   * @return The payloadHeader.
   */
  com.android.build.gradle.internal.cxx.logging.PayloadHeader getPayloadHeader();
  /**
   * <code>.PayloadHeader payload_header = 2;</code>
   */
  com.android.build.gradle.internal.cxx.logging.PayloadHeaderOrBuilder getPayloadHeaderOrBuilder();

  public com.android.build.gradle.internal.cxx.logging.StructuredLogRecord.RecordCase getRecordCase();
}