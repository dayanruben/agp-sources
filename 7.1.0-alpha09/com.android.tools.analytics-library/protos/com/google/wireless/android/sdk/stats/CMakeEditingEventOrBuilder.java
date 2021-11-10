// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface CMakeEditingEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.CMakeEditingEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .android_studio.CMakeEditingEvent.CMakeEditingEventKind kind = 1;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <code>optional .android_studio.CMakeEditingEvent.CMakeEditingEventKind kind = 1;</code>
   * @return The kind.
   */
  com.google.wireless.android.sdk.stats.CMakeEditingEvent.CMakeEditingEventKind getKind();

  /**
   * <pre>
   * The amount of time taken for the event to complete in milliseconds.
   * </pre>
   *
   * <code>optional int64 event_duration_ms = 2;</code>
   * @return Whether the eventDurationMs field is set.
   */
  boolean hasEventDurationMs();
  /**
   * <pre>
   * The amount of time taken for the event to complete in milliseconds.
   * </pre>
   *
   * <code>optional int64 event_duration_ms = 2;</code>
   * @return The eventDurationMs.
   */
  long getEventDurationMs();
}