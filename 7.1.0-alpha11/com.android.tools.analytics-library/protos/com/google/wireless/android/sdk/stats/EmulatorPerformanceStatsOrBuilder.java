// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface EmulatorPerformanceStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.EmulatorPerformanceStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Collection of estimations of performance metrics.
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorPercentileEstimator estimator = 1;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.EmulatorPercentileEstimator>
      getEstimatorList();
  /**
   * <pre>
   * Collection of estimations of performance metrics.
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorPercentileEstimator estimator = 1;</code>
   */
  com.google.wireless.android.sdk.stats.EmulatorPercentileEstimator getEstimator(int index);
  /**
   * <pre>
   * Collection of estimations of performance metrics.
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorPercentileEstimator estimator = 1;</code>
   */
  int getEstimatorCount();
  /**
   * <pre>
   * Collection of estimations of performance metrics.
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorPercentileEstimator estimator = 1;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.EmulatorPercentileEstimatorOrBuilder>
      getEstimatorOrBuilderList();
  /**
   * <pre>
   * Collection of estimations of performance metrics.
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorPercentileEstimator estimator = 1;</code>
   */
  com.google.wireless.android.sdk.stats.EmulatorPercentileEstimatorOrBuilder getEstimatorOrBuilder(
      int index);

  /**
   * <pre>
   * Emulator memory usage over time. (Deprecated)
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorMemoryUsage memory_usage = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.google.wireless.android.sdk.stats.EmulatorMemoryUsage>
      getMemoryUsageList();
  /**
   * <pre>
   * Emulator memory usage over time. (Deprecated)
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorMemoryUsage memory_usage = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.wireless.android.sdk.stats.EmulatorMemoryUsage getMemoryUsage(int index);
  /**
   * <pre>
   * Emulator memory usage over time. (Deprecated)
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorMemoryUsage memory_usage = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getMemoryUsageCount();
  /**
   * <pre>
   * Emulator memory usage over time. (Deprecated)
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorMemoryUsage memory_usage = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.google.wireless.android.sdk.stats.EmulatorMemoryUsageOrBuilder>
      getMemoryUsageOrBuilderList();
  /**
   * <pre>
   * Emulator memory usage over time. (Deprecated)
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorMemoryUsage memory_usage = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.wireless.android.sdk.stats.EmulatorMemoryUsageOrBuilder getMemoryUsageOrBuilder(
      int index);

  /**
   * <pre>
   * Process uptime when this was captured. Relative to when
   * the emulator process was launched---this is not a timestamp.
   * </pre>
   *
   * <code>optional uint64 process_uptime_us = 3;</code>
   * @return Whether the processUptimeUs field is set.
   */
  boolean hasProcessUptimeUs();
  /**
   * <pre>
   * Process uptime when this was captured. Relative to when
   * the emulator process was launched---this is not a timestamp.
   * </pre>
   *
   * <code>optional uint64 process_uptime_us = 3;</code>
   * @return The processUptimeUs.
   */
  long getProcessUptimeUs();

  /**
   * <pre>
   * Resource usage and latency stats.
   * </pre>
   *
   * <code>optional .android_studio.EmulatorResourceUsage resource_usage = 4;</code>
   * @return Whether the resourceUsage field is set.
   */
  boolean hasResourceUsage();
  /**
   * <pre>
   * Resource usage and latency stats.
   * </pre>
   *
   * <code>optional .android_studio.EmulatorResourceUsage resource_usage = 4;</code>
   * @return The resourceUsage.
   */
  com.google.wireless.android.sdk.stats.EmulatorResourceUsage getResourceUsage();
  /**
   * <pre>
   * Resource usage and latency stats.
   * </pre>
   *
   * <code>optional .android_studio.EmulatorResourceUsage resource_usage = 4;</code>
   */
  com.google.wireless.android.sdk.stats.EmulatorResourceUsageOrBuilder getResourceUsageOrBuilder();

  /**
   * <code>optional .android_studio.EmulatorLatencyStats latency_stats = 5;</code>
   * @return Whether the latencyStats field is set.
   */
  boolean hasLatencyStats();
  /**
   * <code>optional .android_studio.EmulatorLatencyStats latency_stats = 5;</code>
   * @return The latencyStats.
   */
  com.google.wireless.android.sdk.stats.EmulatorLatencyStats getLatencyStats();
  /**
   * <code>optional .android_studio.EmulatorLatencyStats latency_stats = 5;</code>
   */
  com.google.wireless.android.sdk.stats.EmulatorLatencyStatsOrBuilder getLatencyStatsOrBuilder();

  /**
   * <pre>
   * Guest system uptime when this was captured. Relative to when
   * the Android system image is started---this is not a timestamp.
   * </pre>
   *
   * <code>optional uint64 guest_uptime_us = 6;</code>
   * @return Whether the guestUptimeUs field is set.
   */
  boolean hasGuestUptimeUs();
  /**
   * <pre>
   * Guest system uptime when this was captured. Relative to when
   * the Android system image is started---this is not a timestamp.
   * </pre>
   *
   * <code>optional uint64 guest_uptime_us = 6;</code>
   * @return The guestUptimeUs.
   */
  long getGuestUptimeUs();
}