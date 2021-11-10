// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface AndroidProfilerEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.AndroidProfilerEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The current stage we're on when this event was generated
   * </pre>
   *
   * <code>optional .android_studio.AndroidProfilerEvent.Stage stage = 1;</code>
   * @return Whether the stage field is set.
   */
  boolean hasStage();
  /**
   * <pre>
   * The current stage we're on when this event was generated
   * </pre>
   *
   * <code>optional .android_studio.AndroidProfilerEvent.Stage stage = 1;</code>
   * @return The stage.
   */
  com.google.wireless.android.sdk.stats.AndroidProfilerEvent.Stage getStage();

  /**
   * <pre>
   * The detailed type of this event.
   * </pre>
   *
   * <code>optional .android_studio.AndroidProfilerEvent.Type type = 2;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * The detailed type of this event.
   * </pre>
   *
   * <code>optional .android_studio.AndroidProfilerEvent.Type type = 2;</code>
   * @return The type.
   */
  com.google.wireless.android.sdk.stats.AndroidProfilerEvent.Type getType();

  /**
   * <pre>
   * Used to be set if |type| was |TRACE_CPU|
   * Deprecated since 3.0.0.8 and superseded by cpu_capture_metadata
   * </pre>
   *
   * <code>optional .android_studio.CpuProfilingConfig cpu_config = 3 [deprecated = true];</code>
   * @return Whether the cpuConfig field is set.
   */
  @java.lang.Deprecated boolean hasCpuConfig();
  /**
   * <pre>
   * Used to be set if |type| was |TRACE_CPU|
   * Deprecated since 3.0.0.8 and superseded by cpu_capture_metadata
   * </pre>
   *
   * <code>optional .android_studio.CpuProfilingConfig cpu_config = 3 [deprecated = true];</code>
   * @return The cpuConfig.
   */
  @java.lang.Deprecated com.google.wireless.android.sdk.stats.CpuProfilingConfig getCpuConfig();
  /**
   * <pre>
   * Used to be set if |type| was |TRACE_CPU|
   * Deprecated since 3.0.0.8 and superseded by cpu_capture_metadata
   * </pre>
   *
   * <code>optional .android_studio.CpuProfilingConfig cpu_config = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.wireless.android.sdk.stats.CpuProfilingConfigOrBuilder getCpuConfigOrBuilder();

  /**
   * <pre>
   * Set if |type| is |CAPTURE_TRACE|
   * </pre>
   *
   * <code>optional .android_studio.CpuCaptureMetadata cpu_capture_metadata = 4;</code>
   * @return Whether the cpuCaptureMetadata field is set.
   */
  boolean hasCpuCaptureMetadata();
  /**
   * <pre>
   * Set if |type| is |CAPTURE_TRACE|
   * </pre>
   *
   * <code>optional .android_studio.CpuCaptureMetadata cpu_capture_metadata = 4;</code>
   * @return The cpuCaptureMetadata.
   */
  com.google.wireless.android.sdk.stats.CpuCaptureMetadata getCpuCaptureMetadata();
  /**
   * <pre>
   * Set if |type| is |CAPTURE_TRACE|
   * </pre>
   *
   * <code>optional .android_studio.CpuCaptureMetadata cpu_capture_metadata = 4;</code>
   */
  com.google.wireless.android.sdk.stats.CpuCaptureMetadataOrBuilder getCpuCaptureMetadataOrBuilder();

  /**
   * <pre>
   * Set if |type| is |FILTER|
   * </pre>
   *
   * <code>optional .android_studio.FilterMetadata filter_metadata = 5;</code>
   * @return Whether the filterMetadata field is set.
   */
  boolean hasFilterMetadata();
  /**
   * <pre>
   * Set if |type| is |FILTER|
   * </pre>
   *
   * <code>optional .android_studio.FilterMetadata filter_metadata = 5;</code>
   * @return The filterMetadata.
   */
  com.google.wireless.android.sdk.stats.FilterMetadata getFilterMetadata();
  /**
   * <pre>
   * Set if |type| is |FILTER|
   * </pre>
   *
   * <code>optional .android_studio.FilterMetadata filter_metadata = 5;</code>
   */
  com.google.wireless.android.sdk.stats.FilterMetadataOrBuilder getFilterMetadataOrBuilder();

  /**
   * <pre>
   * Set if |type| is |SELECT_MEMORY_HEAP|
   * </pre>
   *
   * <code>optional .android_studio.AndroidProfilerEvent.MemoryHeap memory_heap = 6;</code>
   * @return Whether the memoryHeap field is set.
   */
  boolean hasMemoryHeap();
  /**
   * <pre>
   * Set if |type| is |SELECT_MEMORY_HEAP|
   * </pre>
   *
   * <code>optional .android_studio.AndroidProfilerEvent.MemoryHeap memory_heap = 6;</code>
   * @return The memoryHeap.
   */
  com.google.wireless.android.sdk.stats.AndroidProfilerEvent.MemoryHeap getMemoryHeap();

  /**
   * <pre>
   * Set if |type| is |SESSION_CREATED|
   * </pre>
   *
   * <code>optional .android_studio.ProfilerSessionCreationMetaData session_start_metadata = 7;</code>
   * @return Whether the sessionStartMetadata field is set.
   */
  boolean hasSessionStartMetadata();
  /**
   * <pre>
   * Set if |type| is |SESSION_CREATED|
   * </pre>
   *
   * <code>optional .android_studio.ProfilerSessionCreationMetaData session_start_metadata = 7;</code>
   * @return The sessionStartMetadata.
   */
  com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData getSessionStartMetadata();
  /**
   * <pre>
   * Set if |type| is |SESSION_CREATED|
   * </pre>
   *
   * <code>optional .android_studio.ProfilerSessionCreationMetaData session_start_metadata = 7;</code>
   */
  com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaDataOrBuilder getSessionStartMetadataOrBuilder();

  /**
   * <pre>
   * Set if |type| is |SESSION_ARTIFACT_SELECTED|
   * </pre>
   *
   * <code>optional .android_studio.ProfilerSessionSelectionMetaData session_artifact_metadata = 8;</code>
   * @return Whether the sessionArtifactMetadata field is set.
   */
  boolean hasSessionArtifactMetadata();
  /**
   * <pre>
   * Set if |type| is |SESSION_ARTIFACT_SELECTED|
   * </pre>
   *
   * <code>optional .android_studio.ProfilerSessionSelectionMetaData session_artifact_metadata = 8;</code>
   * @return The sessionArtifactMetadata.
   */
  com.google.wireless.android.sdk.stats.ProfilerSessionSelectionMetaData getSessionArtifactMetadata();
  /**
   * <pre>
   * Set if |type| is |SESSION_ARTIFACT_SELECTED|
   * </pre>
   *
   * <code>optional .android_studio.ProfilerSessionSelectionMetaData session_artifact_metadata = 8;</code>
   */
  com.google.wireless.android.sdk.stats.ProfilerSessionSelectionMetaDataOrBuilder getSessionArtifactMetadataOrBuilder();

  /**
   * <pre>
   * Set if |type| is |CPU_STARTUP_PROFILING|
   * </pre>
   *
   * <code>optional .android_studio.CpuStartupProfilingMetadata cpu_startup_profiling_metadata = 9;</code>
   * @return Whether the cpuStartupProfilingMetadata field is set.
   */
  boolean hasCpuStartupProfilingMetadata();
  /**
   * <pre>
   * Set if |type| is |CPU_STARTUP_PROFILING|
   * </pre>
   *
   * <code>optional .android_studio.CpuStartupProfilingMetadata cpu_startup_profiling_metadata = 9;</code>
   * @return The cpuStartupProfilingMetadata.
   */
  com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata getCpuStartupProfilingMetadata();
  /**
   * <pre>
   * Set if |type| is |CPU_STARTUP_PROFILING|
   * </pre>
   *
   * <code>optional .android_studio.CpuStartupProfilingMetadata cpu_startup_profiling_metadata = 9;</code>
   */
  com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadataOrBuilder getCpuStartupProfilingMetadataOrBuilder();

  /**
   * <pre>
   * Set if |type| is |CPU_IMPORT_TRACE|
   * </pre>
   *
   * <code>optional .android_studio.CpuImportTraceMetadata cpu_import_trace_metadata = 10;</code>
   * @return Whether the cpuImportTraceMetadata field is set.
   */
  boolean hasCpuImportTraceMetadata();
  /**
   * <pre>
   * Set if |type| is |CPU_IMPORT_TRACE|
   * </pre>
   *
   * <code>optional .android_studio.CpuImportTraceMetadata cpu_import_trace_metadata = 10;</code>
   * @return The cpuImportTraceMetadata.
   */
  com.google.wireless.android.sdk.stats.CpuImportTraceMetadata getCpuImportTraceMetadata();
  /**
   * <pre>
   * Set if |type| is |CPU_IMPORT_TRACE|
   * </pre>
   *
   * <code>optional .android_studio.CpuImportTraceMetadata cpu_import_trace_metadata = 10;</code>
   */
  com.google.wireless.android.sdk.stats.CpuImportTraceMetadataOrBuilder getCpuImportTraceMetadataOrBuilder();

  /**
   * <pre>
   * Set if |type| is |CPU_API_TRACING|
   * </pre>
   *
   * <code>optional .android_studio.CpuApiTracingMetadata cpu_api_tracing_metadata = 11;</code>
   * @return Whether the cpuApiTracingMetadata field is set.
   */
  boolean hasCpuApiTracingMetadata();
  /**
   * <pre>
   * Set if |type| is |CPU_API_TRACING|
   * </pre>
   *
   * <code>optional .android_studio.CpuApiTracingMetadata cpu_api_tracing_metadata = 11;</code>
   * @return The cpuApiTracingMetadata.
   */
  com.google.wireless.android.sdk.stats.CpuApiTracingMetadata getCpuApiTracingMetadata();
  /**
   * <pre>
   * Set if |type| is |CPU_API_TRACING|
   * </pre>
   *
   * <code>optional .android_studio.CpuApiTracingMetadata cpu_api_tracing_metadata = 11;</code>
   */
  com.google.wireless.android.sdk.stats.CpuApiTracingMetadataOrBuilder getCpuApiTracingMetadataOrBuilder();

  /**
   * <pre>
   * Set if |type| is |SELECT_ENERGY_RANGE|
   * </pre>
   *
   * <code>optional .android_studio.EnergyRangeMetadata energy_range_metadata = 12;</code>
   * @return Whether the energyRangeMetadata field is set.
   */
  boolean hasEnergyRangeMetadata();
  /**
   * <pre>
   * Set if |type| is |SELECT_ENERGY_RANGE|
   * </pre>
   *
   * <code>optional .android_studio.EnergyRangeMetadata energy_range_metadata = 12;</code>
   * @return The energyRangeMetadata.
   */
  com.google.wireless.android.sdk.stats.EnergyRangeMetadata getEnergyRangeMetadata();
  /**
   * <pre>
   * Set if |type| is |SELECT_ENERGY_RANGE|
   * </pre>
   *
   * <code>optional .android_studio.EnergyRangeMetadata energy_range_metadata = 12;</code>
   */
  com.google.wireless.android.sdk.stats.EnergyRangeMetadataOrBuilder getEnergyRangeMetadataOrBuilder();

  /**
   * <pre>
   * Set if |type| is |SELECT_ENERGY_EVENT|
   * </pre>
   *
   * <code>optional .android_studio.EnergyEventMetadata energy_event_metadata = 13;</code>
   * @return Whether the energyEventMetadata field is set.
   */
  boolean hasEnergyEventMetadata();
  /**
   * <pre>
   * Set if |type| is |SELECT_ENERGY_EVENT|
   * </pre>
   *
   * <code>optional .android_studio.EnergyEventMetadata energy_event_metadata = 13;</code>
   * @return The energyEventMetadata.
   */
  com.google.wireless.android.sdk.stats.EnergyEventMetadata getEnergyEventMetadata();
  /**
   * <pre>
   * Set if |type| is |SELECT_ENERGY_EVENT|
   * </pre>
   *
   * <code>optional .android_studio.EnergyEventMetadata energy_event_metadata = 13;</code>
   */
  com.google.wireless.android.sdk.stats.EnergyEventMetadataOrBuilder getEnergyEventMetadataOrBuilder();

  /**
   * <pre>
   * Set if |type| is |PERFD_CRASHED|
   * </pre>
   *
   * <code>optional .android_studio.PerfdCrashInfo perfd_crash_info = 14;</code>
   * @return Whether the perfdCrashInfo field is set.
   */
  boolean hasPerfdCrashInfo();
  /**
   * <pre>
   * Set if |type| is |PERFD_CRASHED|
   * </pre>
   *
   * <code>optional .android_studio.PerfdCrashInfo perfd_crash_info = 14;</code>
   * @return The perfdCrashInfo.
   */
  com.google.wireless.android.sdk.stats.PerfdCrashInfo getPerfdCrashInfo();
  /**
   * <pre>
   * Set if |type| is |PERFD_CRASHED|
   * </pre>
   *
   * <code>optional .android_studio.PerfdCrashInfo perfd_crash_info = 14;</code>
   */
  com.google.wireless.android.sdk.stats.PerfdCrashInfoOrBuilder getPerfdCrashInfoOrBuilder();

  /**
   * <pre>
   * Set if |type| is |TRANSPORT_DAEMON_FAILED| OR |TRANSPORT_PROXY_FAILED|
   * </pre>
   *
   * <code>optional .android_studio.TransportFailureMetadata transport_failure_metadata = 15;</code>
   * @return Whether the transportFailureMetadata field is set.
   */
  boolean hasTransportFailureMetadata();
  /**
   * <pre>
   * Set if |type| is |TRANSPORT_DAEMON_FAILED| OR |TRANSPORT_PROXY_FAILED|
   * </pre>
   *
   * <code>optional .android_studio.TransportFailureMetadata transport_failure_metadata = 15;</code>
   * @return The transportFailureMetadata.
   */
  com.google.wireless.android.sdk.stats.TransportFailureMetadata getTransportFailureMetadata();
  /**
   * <pre>
   * Set if |type| is |TRANSPORT_DAEMON_FAILED| OR |TRANSPORT_PROXY_FAILED|
   * </pre>
   *
   * <code>optional .android_studio.TransportFailureMetadata transport_failure_metadata = 15;</code>
   */
  com.google.wireless.android.sdk.stats.TransportFailureMetadataOrBuilder getTransportFailureMetadataOrBuilder();

  /**
   * <pre>
   * Set if |type| is |MEMORY_INSTANCE_FILTER|
   * </pre>
   *
   * <code>optional .android_studio.MemoryInstanceFilterMetadata memory_instance_filter_metadata = 16;</code>
   * @return Whether the memoryInstanceFilterMetadata field is set.
   */
  boolean hasMemoryInstanceFilterMetadata();
  /**
   * <pre>
   * Set if |type| is |MEMORY_INSTANCE_FILTER|
   * </pre>
   *
   * <code>optional .android_studio.MemoryInstanceFilterMetadata memory_instance_filter_metadata = 16;</code>
   * @return The memoryInstanceFilterMetadata.
   */
  com.google.wireless.android.sdk.stats.MemoryInstanceFilterMetadata getMemoryInstanceFilterMetadata();
  /**
   * <pre>
   * Set if |type| is |MEMORY_INSTANCE_FILTER|
   * </pre>
   *
   * <code>optional .android_studio.MemoryInstanceFilterMetadata memory_instance_filter_metadata = 16;</code>
   */
  com.google.wireless.android.sdk.stats.MemoryInstanceFilterMetadataOrBuilder getMemoryInstanceFilterMetadataOrBuilder();

  /**
   * <pre>
   * Set if |type| is |TRANSPORT_DAEMON_STARTED|
   * </pre>
   *
   * <code>optional .android_studio.TransportDaemonStartedInfo transport_daemon_started_info = 17;</code>
   * @return Whether the transportDaemonStartedInfo field is set.
   */
  boolean hasTransportDaemonStartedInfo();
  /**
   * <pre>
   * Set if |type| is |TRANSPORT_DAEMON_STARTED|
   * </pre>
   *
   * <code>optional .android_studio.TransportDaemonStartedInfo transport_daemon_started_info = 17;</code>
   * @return The transportDaemonStartedInfo.
   */
  com.google.wireless.android.sdk.stats.TransportDaemonStartedInfo getTransportDaemonStartedInfo();
  /**
   * <pre>
   * Set if |type| is |TRANSPORT_DAEMON_STARTED|
   * </pre>
   *
   * <code>optional .android_studio.TransportDaemonStartedInfo transport_daemon_started_info = 17;</code>
   */
  com.google.wireless.android.sdk.stats.TransportDaemonStartedInfoOrBuilder getTransportDaemonStartedInfoOrBuilder();

  /**
   * <pre>
   * Set if |type| is |TPD_MANAGER_*|
   * </pre>
   *
   * <code>optional .android_studio.TraceProcessorDaemonManagerStats tpd_manager_stats = 18;</code>
   * @return Whether the tpdManagerStats field is set.
   */
  boolean hasTpdManagerStats();
  /**
   * <pre>
   * Set if |type| is |TPD_MANAGER_*|
   * </pre>
   *
   * <code>optional .android_studio.TraceProcessorDaemonManagerStats tpd_manager_stats = 18;</code>
   * @return The tpdManagerStats.
   */
  com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats getTpdManagerStats();
  /**
   * <pre>
   * Set if |type| is |TPD_MANAGER_*|
   * </pre>
   *
   * <code>optional .android_studio.TraceProcessorDaemonManagerStats tpd_manager_stats = 18;</code>
   */
  com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStatsOrBuilder getTpdManagerStatsOrBuilder();

  /**
   * <pre>
   * Set if |type| is |TPD_QUERY_*|
   * </pre>
   *
   * <code>optional .android_studio.TraceProcessorDaemonQueryStats tpd_query_stats = 19;</code>
   * @return Whether the tpdQueryStats field is set.
   */
  boolean hasTpdQueryStats();
  /**
   * <pre>
   * Set if |type| is |TPD_QUERY_*|
   * </pre>
   *
   * <code>optional .android_studio.TraceProcessorDaemonQueryStats tpd_query_stats = 19;</code>
   * @return The tpdQueryStats.
   */
  com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats getTpdQueryStats();
  /**
   * <pre>
   * Set if |type| is |TPD_QUERY_*|
   * </pre>
   *
   * <code>optional .android_studio.TraceProcessorDaemonQueryStats tpd_query_stats = 19;</code>
   */
  com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStatsOrBuilder getTpdQueryStatsOrBuilder();

  /**
   * <pre>
   * Set if |type| is |SELECT_BOX|
   * </pre>
   *
   * <code>optional .android_studio.AdtUiBoxSelectionMetadata box_selection_metadata = 20;</code>
   * @return Whether the boxSelectionMetadata field is set.
   */
  boolean hasBoxSelectionMetadata();
  /**
   * <pre>
   * Set if |type| is |SELECT_BOX|
   * </pre>
   *
   * <code>optional .android_studio.AdtUiBoxSelectionMetadata box_selection_metadata = 20;</code>
   * @return The boxSelectionMetadata.
   */
  com.google.wireless.android.sdk.stats.AdtUiBoxSelectionMetadata getBoxSelectionMetadata();
  /**
   * <pre>
   * Set if |type| is |SELECT_BOX|
   * </pre>
   *
   * <code>optional .android_studio.AdtUiBoxSelectionMetadata box_selection_metadata = 20;</code>
   */
  com.google.wireless.android.sdk.stats.AdtUiBoxSelectionMetadataOrBuilder getBoxSelectionMetadataOrBuilder();

  /**
   * <pre>
   * Set if |type| is |TRACK_GROUP_METADATA|
   * </pre>
   *
   * <code>optional .android_studio.AdtUiTrackGroupMetadata track_group_metadata = 21;</code>
   * @return Whether the trackGroupMetadata field is set.
   */
  boolean hasTrackGroupMetadata();
  /**
   * <pre>
   * Set if |type| is |TRACK_GROUP_METADATA|
   * </pre>
   *
   * <code>optional .android_studio.AdtUiTrackGroupMetadata track_group_metadata = 21;</code>
   * @return The trackGroupMetadata.
   */
  com.google.wireless.android.sdk.stats.AdtUiTrackGroupMetadata getTrackGroupMetadata();
  /**
   * <pre>
   * Set if |type| is |TRACK_GROUP_METADATA|
   * </pre>
   *
   * <code>optional .android_studio.AdtUiTrackGroupMetadata track_group_metadata = 21;</code>
   */
  com.google.wireless.android.sdk.stats.AdtUiTrackGroupMetadataOrBuilder getTrackGroupMetadataOrBuilder();
}