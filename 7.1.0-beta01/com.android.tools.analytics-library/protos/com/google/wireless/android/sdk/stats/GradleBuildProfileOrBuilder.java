// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface GradleBuildProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.GradleBuildProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Version of the open source Gradle application used.
   * e.g. "2.14" or "3.0-20160617000025+0000"
   * </pre>
   *
   * <code>optional string gradle_version = 2;</code>
   * @return Whether the gradleVersion field is set.
   */
  boolean hasGradleVersion();
  /**
   * <pre>
   * Version of the open source Gradle application used.
   * e.g. "2.14" or "3.0-20160617000025+0000"
   * </pre>
   *
   * <code>optional string gradle_version = 2;</code>
   * @return The gradleVersion.
   */
  java.lang.String getGradleVersion();
  /**
   * <pre>
   * Version of the open source Gradle application used.
   * e.g. "2.14" or "3.0-20160617000025+0000"
   * </pre>
   *
   * <code>optional string gradle_version = 2;</code>
   * @return The bytes for gradleVersion.
   */
  com.google.protobuf.ByteString
      getGradleVersionBytes();

  /**
   * <pre>
   * The value of the "os.name" system property.
   * e.g. "Linux"
   * </pre>
   *
   * <code>optional string os_name = 6;</code>
   * @return Whether the osName field is set.
   */
  boolean hasOsName();
  /**
   * <pre>
   * The value of the "os.name" system property.
   * e.g. "Linux"
   * </pre>
   *
   * <code>optional string os_name = 6;</code>
   * @return The osName.
   */
  java.lang.String getOsName();
  /**
   * <pre>
   * The value of the "os.name" system property.
   * e.g. "Linux"
   * </pre>
   *
   * <code>optional string os_name = 6;</code>
   * @return The bytes for osName.
   */
  com.google.protobuf.ByteString
      getOsNameBytes();

  /**
   * <pre>
   * The value of the "os.version" system property.
   * e.g. "3.13.0-86-generic"
   * </pre>
   *
   * <code>optional string os_version = 7;</code>
   * @return Whether the osVersion field is set.
   */
  boolean hasOsVersion();
  /**
   * <pre>
   * The value of the "os.version" system property.
   * e.g. "3.13.0-86-generic"
   * </pre>
   *
   * <code>optional string os_version = 7;</code>
   * @return The osVersion.
   */
  java.lang.String getOsVersion();
  /**
   * <pre>
   * The value of the "os.version" system property.
   * e.g. "3.13.0-86-generic"
   * </pre>
   *
   * <code>optional string os_version = 7;</code>
   * @return The bytes for osVersion.
   */
  com.google.protobuf.ByteString
      getOsVersionBytes();

  /**
   * <pre>
   * The value of the "java.version" system property.
   * e.g. "1.8.0_40-ea"
   * </pre>
   *
   * <code>optional string java_version = 8;</code>
   * @return Whether the javaVersion field is set.
   */
  boolean hasJavaVersion();
  /**
   * <pre>
   * The value of the "java.version" system property.
   * e.g. "1.8.0_40-ea"
   * </pre>
   *
   * <code>optional string java_version = 8;</code>
   * @return The javaVersion.
   */
  java.lang.String getJavaVersion();
  /**
   * <pre>
   * The value of the "java.version" system property.
   * e.g. "1.8.0_40-ea"
   * </pre>
   *
   * <code>optional string java_version = 8;</code>
   * @return The bytes for javaVersion.
   */
  com.google.protobuf.ByteString
      getJavaVersionBytes();

  /**
   * <pre>
   * The value of the "java.vm.version" system property.
   * e.g. "25.40-b25"
   * </pre>
   *
   * <code>optional string java_vm_version = 9;</code>
   * @return Whether the javaVmVersion field is set.
   */
  boolean hasJavaVmVersion();
  /**
   * <pre>
   * The value of the "java.vm.version" system property.
   * e.g. "25.40-b25"
   * </pre>
   *
   * <code>optional string java_vm_version = 9;</code>
   * @return The javaVmVersion.
   */
  java.lang.String getJavaVmVersion();
  /**
   * <pre>
   * The value of the "java.vm.version" system property.
   * e.g. "25.40-b25"
   * </pre>
   *
   * <code>optional string java_vm_version = 9;</code>
   * @return The bytes for javaVmVersion.
   */
  com.google.protobuf.ByteString
      getJavaVmVersionBytes();

  /**
   * <pre>
   * The value of Runtime.getRuntime().maxMemory()
   * </pre>
   *
   * <code>optional int64 max_memory = 10;</code>
   * @return Whether the maxMemory field is set.
   */
  boolean hasMaxMemory();
  /**
   * <pre>
   * The value of Runtime.getRuntime().maxMemory()
   * </pre>
   *
   * <code>optional int64 max_memory = 10;</code>
   * @return The maxMemory.
   */
  long getMaxMemory();

  /**
   * <pre>
   * The total time taken for this build in milliseconds.
   * This does not include Gradle's startup (before plugin apply) or shutdown
   * (after BuildListener#buildFinished(BuildResult) called.
   * </pre>
   *
   * <code>optional int64 build_time = 11;</code>
   * @return Whether the buildTime field is set.
   */
  boolean hasBuildTime();
  /**
   * <pre>
   * The total time taken for this build in milliseconds.
   * This does not include Gradle's startup (before plugin apply) or shutdown
   * (after BuildListener#buildFinished(BuildResult) called.
   * </pre>
   *
   * <code>optional int64 build_time = 11;</code>
   * @return The buildTime.
   */
  long getBuildTime();

  /**
   * <pre>
   * The number of garbage collections during this build
   * Historical: Used in Android Gradle Plugin 2.2.x, circa 2016-10
   * </pre>
   *
   * <code>optional int64 gc_count = 12 [deprecated = true];</code>
   * @return Whether the gcCount field is set.
   */
  @java.lang.Deprecated boolean hasGcCount();
  /**
   * <pre>
   * The number of garbage collections during this build
   * Historical: Used in Android Gradle Plugin 2.2.x, circa 2016-10
   * </pre>
   *
   * <code>optional int64 gc_count = 12 [deprecated = true];</code>
   * @return The gcCount.
   */
  @java.lang.Deprecated long getGcCount();

  /**
   * <pre>
   * The time spent garbage collecting during this build.
   * Historical: Used in Android Gradle Plugin 2.2.x, circa 2016-10
   * </pre>
   *
   * <code>optional int64 gc_time = 13 [deprecated = true];</code>
   * @return Whether the gcTime field is set.
   */
  @java.lang.Deprecated boolean hasGcTime();
  /**
   * <pre>
   * The time spent garbage collecting during this build.
   * Historical: Used in Android Gradle Plugin 2.2.x, circa 2016-10
   * </pre>
   *
   * <code>optional int64 gc_time = 13 [deprecated = true];</code>
   * @return The gcTime.
   */
  @java.lang.Deprecated long getGcTime();

  /**
   * <pre>
   * The projects that make up this multi-project build.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProject project = 14;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.GradleBuildProject>
      getProjectList();
  /**
   * <pre>
   * The projects that make up this multi-project build.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProject project = 14;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildProject getProject(int index);
  /**
   * <pre>
   * The projects that make up this multi-project build.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProject project = 14;</code>
   */
  int getProjectCount();
  /**
   * <pre>
   * The projects that make up this multi-project build.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProject project = 14;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.GradleBuildProjectOrBuilder>
      getProjectOrBuilderList();
  /**
   * <pre>
   * The projects that make up this multi-project build.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProject project = 14;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildProjectOrBuilder getProjectOrBuilder(
      int index);

  /**
   * <pre>
   * Samples of the memory state of the daemon during the build.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildMemorySample memory_sample = 15;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.GradleBuildMemorySample>
      getMemorySampleList();
  /**
   * <pre>
   * Samples of the memory state of the daemon during the build.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildMemorySample memory_sample = 15;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildMemorySample getMemorySample(int index);
  /**
   * <pre>
   * Samples of the memory state of the daemon during the build.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildMemorySample memory_sample = 15;</code>
   */
  int getMemorySampleCount();
  /**
   * <pre>
   * Samples of the memory state of the daemon during the build.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildMemorySample memory_sample = 15;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.GradleBuildMemorySampleOrBuilder>
      getMemorySampleOrBuilderList();
  /**
   * <pre>
   * Samples of the memory state of the daemon during the build.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildMemorySample memory_sample = 15;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildMemorySampleOrBuilder getMemorySampleOrBuilder(
      int index);

  /**
   * <pre>
   * The fine-grained execution spans which record granular timings.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProfileSpan span = 16;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.GradleBuildProfileSpan>
      getSpanList();
  /**
   * <pre>
   * The fine-grained execution spans which record granular timings.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProfileSpan span = 16;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildProfileSpan getSpan(int index);
  /**
   * <pre>
   * The fine-grained execution spans which record granular timings.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProfileSpan span = 16;</code>
   */
  int getSpanCount();
  /**
   * <pre>
   * The fine-grained execution spans which record granular timings.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProfileSpan span = 16;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.GradleBuildProfileSpanOrBuilder>
      getSpanOrBuilderList();
  /**
   * <pre>
   * The fine-grained execution spans which record granular timings.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProfileSpan span = 16;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildProfileSpanOrBuilder getSpanOrBuilder(
      int index);

  /**
   * <pre>
   * For instant run builds: the resulting instant run build info.
   * </pre>
   *
   * <code>optional .android_studio.InstantRunStatus instant_run_status = 17;</code>
   * @return Whether the instantRunStatus field is set.
   */
  boolean hasInstantRunStatus();
  /**
   * <pre>
   * For instant run builds: the resulting instant run build info.
   * </pre>
   *
   * <code>optional .android_studio.InstantRunStatus instant_run_status = 17;</code>
   * @return The instantRunStatus.
   */
  com.google.wireless.android.sdk.stats.InstantRunStatus getInstantRunStatus();
  /**
   * <pre>
   * For instant run builds: the resulting instant run build info.
   * </pre>
   *
   * <code>optional .android_studio.InstantRunStatus instant_run_status = 17;</code>
   */
  com.google.wireless.android.sdk.stats.InstantRunStatusOrBuilder getInstantRunStatusOrBuilder();

  /**
   * <pre>
   * Client-side salted, sha256 of the root project path.
   * This exists to allow multiple instant run builds in one project by one
   * user to be correlated.
   * The salt is rotated every 28 days, so it is not a permanent pseudonymous
   * identifier. It is anonymized and is unique per user, but has a 1-N
   * relation.
   * </pre>
   *
   * <code>optional string project_id = 18;</code>
   * @return Whether the projectId field is set.
   */
  boolean hasProjectId();
  /**
   * <pre>
   * Client-side salted, sha256 of the root project path.
   * This exists to allow multiple instant run builds in one project by one
   * user to be correlated.
   * The salt is rotated every 28 days, so it is not a permanent pseudonymous
   * identifier. It is anonymized and is unique per user, but has a 1-N
   * relation.
   * </pre>
   *
   * <code>optional string project_id = 18;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Client-side salted, sha256 of the root project path.
   * This exists to allow multiple instant run builds in one project by one
   * user to be correlated.
   * The salt is rotated every 28 days, so it is not a permanent pseudonymous
   * identifier. It is anonymized and is unique per user, but has a 1-N
   * relation.
   * </pre>
   *
   * <code>optional string project_id = 18;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * the project id as used in the playstore, e.g.
   * 'com.google.android.apps.maps'. This is sensitive information and
   * thus restricted to "raw" sawmill access. This data is only available in
   * and for PWG approved scenarios.
   * This is repeated, as a gradle build may include multiple apps, either
   * by variants or by multiple 'app' subprojects.
   * </pre>
   *
   * <code>repeated string raw_project_id = 19;</code>
   * @return A list containing the rawProjectId.
   */
  java.util.List<java.lang.String>
      getRawProjectIdList();
  /**
   * <pre>
   * the project id as used in the playstore, e.g.
   * 'com.google.android.apps.maps'. This is sensitive information and
   * thus restricted to "raw" sawmill access. This data is only available in
   * and for PWG approved scenarios.
   * This is repeated, as a gradle build may include multiple apps, either
   * by variants or by multiple 'app' subprojects.
   * </pre>
   *
   * <code>repeated string raw_project_id = 19;</code>
   * @return The count of rawProjectId.
   */
  int getRawProjectIdCount();
  /**
   * <pre>
   * the project id as used in the playstore, e.g.
   * 'com.google.android.apps.maps'. This is sensitive information and
   * thus restricted to "raw" sawmill access. This data is only available in
   * and for PWG approved scenarios.
   * This is repeated, as a gradle build may include multiple apps, either
   * by variants or by multiple 'app' subprojects.
   * </pre>
   *
   * <code>repeated string raw_project_id = 19;</code>
   * @param index The index of the element to return.
   * @return The rawProjectId at the given index.
   */
  java.lang.String getRawProjectId(int index);
  /**
   * <pre>
   * the project id as used in the playstore, e.g.
   * 'com.google.android.apps.maps'. This is sensitive information and
   * thus restricted to "raw" sawmill access. This data is only available in
   * and for PWG approved scenarios.
   * This is repeated, as a gradle build may include multiple apps, either
   * by variants or by multiple 'app' subprojects.
   * </pre>
   *
   * <code>repeated string raw_project_id = 19;</code>
   * @param index The index of the value to return.
   * @return The bytes of the rawProjectId at the given index.
   */
  com.google.protobuf.ByteString
      getRawProjectIdBytes(int index);

  /**
   * <pre>
   * If at least one module has enableCompose set to true
   * </pre>
   *
   * <code>optional bool compose_enabled = 20;</code>
   * @return Whether the composeEnabled field is set.
   */
  boolean hasComposeEnabled();
  /**
   * <pre>
   * If at least one module has enableCompose set to true
   * </pre>
   *
   * <code>optional bool compose_enabled = 20;</code>
   * @return The composeEnabled.
   */
  boolean getComposeEnabled();

  /**
   * <pre>
   * If Gradle configuration caching is enabled.
   * </pre>
   *
   * <code>optional bool configuration_caching_enabled = 21;</code>
   * @return Whether the configurationCachingEnabled field is set.
   */
  boolean hasConfigurationCachingEnabled();
  /**
   * <pre>
   * If Gradle configuration caching is enabled.
   * </pre>
   *
   * <code>optional bool configuration_caching_enabled = 21;</code>
   * @return The configurationCachingEnabled.
   */
  boolean getConfigurationCachingEnabled();

  /**
   * <pre>
   * If Gradle parallel task execution is enabled.
   * </pre>
   *
   * <code>optional bool parallel_task_execution = 22;</code>
   * @return Whether the parallelTaskExecution field is set.
   */
  boolean hasParallelTaskExecution();
  /**
   * <pre>
   * If Gradle parallel task execution is enabled.
   * </pre>
   *
   * <code>optional bool parallel_task_execution = 22;</code>
   * @return The parallelTaskExecution.
   */
  boolean getParallelTaskExecution();
}