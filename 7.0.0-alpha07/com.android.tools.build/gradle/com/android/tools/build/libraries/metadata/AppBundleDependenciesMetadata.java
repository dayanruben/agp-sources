// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app_bundle_dependencies_metadata.proto

package com.android.tools.build.libraries.metadata;

public final class AppBundleDependenciesMetadata {
  private AppBundleDependenciesMetadata() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AppDependencies_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AppDependencies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LibraryDependencies_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LibraryDependencies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModuleDependencies_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModuleDependencies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Library_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Library_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Library_Digests_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Library_Digests_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MavenLibrary_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MavenLibrary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&app_bundle_dependencies_metadata.proto" +
      "\"\222\001\n\017AppDependencies\022\031\n\007library\030\001 \003(\0132\010." +
      "Library\0222\n\024library_dependencies\030\002 \003(\0132\024." +
      "LibraryDependencies\0220\n\023module_dependenci" +
      "es\030\003 \003(\0132\023.ModuleDependencies\"G\n\023Library" +
      "Dependencies\022\025\n\rlibrary_index\030\001 \001(\005\022\031\n\021l" +
      "ibrary_dep_index\030\002 \003(\005\"C\n\022ModuleDependen" +
      "cies\022\023\n\013module_name\030\001 \001(\t\022\030\n\020dependency_" +
      "index\030\002 \003(\005\"\200\001\n\007Library\022&\n\rmaven_library" +
      "\030\001 \001(\0132\r.MavenLibraryH\000\022!\n\007digests\030\002 \001(\013" +
      "2\020.Library.Digests\032\031\n\007Digests\022\016\n\006sha256\030" +
      "\001 \001(\014B\017\n\rlibrary_oneof\"k\n\014MavenLibrary\022\017" +
      "\n\007groupId\030\001 \001(\t\022\022\n\nartifactId\030\002 \001(\t\022\021\n\tp" +
      "ackaging\030\003 \001(\t\022\022\n\nclassifier\030\004 \001(\t\022\017\n\007ve" +
      "rsion\030\005 \001(\tB.\n*com.android.tools.build.l" +
      "ibraries.metadataP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AppDependencies_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AppDependencies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AppDependencies_descriptor,
        new java.lang.String[] { "Library", "LibraryDependencies", "ModuleDependencies", });
    internal_static_LibraryDependencies_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_LibraryDependencies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LibraryDependencies_descriptor,
        new java.lang.String[] { "LibraryIndex", "LibraryDepIndex", });
    internal_static_ModuleDependencies_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ModuleDependencies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModuleDependencies_descriptor,
        new java.lang.String[] { "ModuleName", "DependencyIndex", });
    internal_static_Library_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Library_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Library_descriptor,
        new java.lang.String[] { "MavenLibrary", "Digests", "LibraryOneof", });
    internal_static_Library_Digests_descriptor =
      internal_static_Library_descriptor.getNestedTypes().get(0);
    internal_static_Library_Digests_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Library_Digests_descriptor,
        new java.lang.String[] { "Sha256", });
    internal_static_MavenLibrary_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_MavenLibrary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MavenLibrary_descriptor,
        new java.lang.String[] { "GroupId", "ArtifactId", "Packaging", "Classifier", "Version", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}