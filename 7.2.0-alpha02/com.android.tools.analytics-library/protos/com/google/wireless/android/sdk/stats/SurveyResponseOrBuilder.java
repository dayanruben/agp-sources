// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface SurveyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.SurveyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the survey
   * This is one of a set of string constants set by Google,
   * i.e. "analytics/surveys/satisfaction"
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name of the survey
   * This is one of a set of string constants set by Google,
   * i.e. "analytics/surveys/satisfaction"
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the survey
   * This is one of a set of string constants set by Google,
   * i.e. "analytics/surveys/satisfaction"
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * One or more responses selected by the user
   * </pre>
   *
   * <code>repeated int32 responses = 2;</code>
   * @return A list containing the responses.
   */
  java.util.List<java.lang.Integer> getResponsesList();
  /**
   * <pre>
   * One or more responses selected by the user
   * </pre>
   *
   * <code>repeated int32 responses = 2;</code>
   * @return The count of responses.
   */
  int getResponsesCount();
  /**
   * <pre>
   * One or more responses selected by the user
   * </pre>
   *
   * <code>repeated int32 responses = 2;</code>
   * @param index The index of the element to return.
   * @return The responses at the given index.
   */
  int getResponses(int index);
}