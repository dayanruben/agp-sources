// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface NavDestinationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.NavDestinationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of the destination
   * </pre>
   *
   * <code>optional .android_studio.NavDestinationInfo.DestinationType type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * The type of the destination
   * </pre>
   *
   * <code>optional .android_studio.NavDestinationInfo.DestinationType type = 1;</code>
   * @return The type.
   */
  com.google.wireless.android.sdk.stats.NavDestinationInfo.DestinationType getType();

  /**
   * <pre>
   * Whether the destination has a class (android:name) specified
   * </pre>
   *
   * <code>optional bool has_class = 2;</code>
   * @return Whether the hasClass field is set.
   */
  boolean hasHasClass();
  /**
   * <pre>
   * Whether the destination has a class (android:name) specified
   * </pre>
   *
   * <code>optional bool has_class = 2;</code>
   * @return The hasClass.
   */
  boolean getHasClass();

  /**
   * <pre>
   * Whether the destination has a layout (tools:layout) specified
   * </pre>
   *
   * <code>optional bool has_layout = 3;</code>
   * @return Whether the hasLayout field is set.
   */
  boolean hasHasLayout();
  /**
   * <pre>
   * Whether the destination has a layout (tools:layout) specified
   * </pre>
   *
   * <code>optional bool has_layout = 3;</code>
   * @return The hasLayout.
   */
  boolean getHasLayout();
}