// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_logging.proto

package com.android.build.gradle.internal.cxx.logging;

public interface LoggingMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LoggingMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.LoggingMessage.LoggingLevel level = 1;</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <code>.LoggingMessage.LoggingLevel level = 1;</code>
   * @return The level.
   */
  com.android.build.gradle.internal.cxx.logging.LoggingMessage.LoggingLevel getLevel();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>string file = 3;</code>
   * @return The file.
   */
  java.lang.String getFile();
  /**
   * <code>string file = 3;</code>
   * @return The bytes for file.
   */
  com.google.protobuf.ByteString
      getFileBytes();

  /**
   * <code>string tag = 4;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <code>string tag = 4;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <code>int32 diagnostic_code = 5;</code>
   * @return The diagnosticCode.
   */
  int getDiagnosticCode();
}