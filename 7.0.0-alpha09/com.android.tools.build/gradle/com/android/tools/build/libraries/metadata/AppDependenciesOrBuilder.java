// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app_bundle_dependencies_metadata.proto

package com.android.tools.build.libraries.metadata;

public interface AppDependenciesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AppDependencies)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of all the dependencies, direct and indirect.
   * </pre>
   *
   * <code>repeated .Library library = 1;</code>
   */
  java.util.List<com.android.tools.build.libraries.metadata.Library>
      getLibraryList();
  /**
   * <pre>
   * List of all the dependencies, direct and indirect.
   * </pre>
   *
   * <code>repeated .Library library = 1;</code>
   */
  com.android.tools.build.libraries.metadata.Library getLibrary(int index);
  /**
   * <pre>
   * List of all the dependencies, direct and indirect.
   * </pre>
   *
   * <code>repeated .Library library = 1;</code>
   */
  int getLibraryCount();
  /**
   * <pre>
   * List of all the dependencies, direct and indirect.
   * </pre>
   *
   * <code>repeated .Library library = 1;</code>
   */
  java.util.List<? extends com.android.tools.build.libraries.metadata.LibraryOrBuilder>
      getLibraryOrBuilderList();
  /**
   * <pre>
   * List of all the dependencies, direct and indirect.
   * </pre>
   *
   * <code>repeated .Library library = 1;</code>
   */
  com.android.tools.build.libraries.metadata.LibraryOrBuilder getLibraryOrBuilder(
      int index);

  /**
   * <pre>
   * Dependencies of the libraries from the list above.
   * </pre>
   *
   * <code>repeated .LibraryDependencies library_dependencies = 2;</code>
   */
  java.util.List<com.android.tools.build.libraries.metadata.LibraryDependencies>
      getLibraryDependenciesList();
  /**
   * <pre>
   * Dependencies of the libraries from the list above.
   * </pre>
   *
   * <code>repeated .LibraryDependencies library_dependencies = 2;</code>
   */
  com.android.tools.build.libraries.metadata.LibraryDependencies getLibraryDependencies(int index);
  /**
   * <pre>
   * Dependencies of the libraries from the list above.
   * </pre>
   *
   * <code>repeated .LibraryDependencies library_dependencies = 2;</code>
   */
  int getLibraryDependenciesCount();
  /**
   * <pre>
   * Dependencies of the libraries from the list above.
   * </pre>
   *
   * <code>repeated .LibraryDependencies library_dependencies = 2;</code>
   */
  java.util.List<? extends com.android.tools.build.libraries.metadata.LibraryDependenciesOrBuilder>
      getLibraryDependenciesOrBuilderList();
  /**
   * <pre>
   * Dependencies of the libraries from the list above.
   * </pre>
   *
   * <code>repeated .LibraryDependencies library_dependencies = 2;</code>
   */
  com.android.tools.build.libraries.metadata.LibraryDependenciesOrBuilder getLibraryDependenciesOrBuilder(
      int index);

  /**
   * <pre>
   * List of direct dependencies per bundle module.
   * </pre>
   *
   * <code>repeated .ModuleDependencies module_dependencies = 3;</code>
   */
  java.util.List<com.android.tools.build.libraries.metadata.ModuleDependencies>
      getModuleDependenciesList();
  /**
   * <pre>
   * List of direct dependencies per bundle module.
   * </pre>
   *
   * <code>repeated .ModuleDependencies module_dependencies = 3;</code>
   */
  com.android.tools.build.libraries.metadata.ModuleDependencies getModuleDependencies(int index);
  /**
   * <pre>
   * List of direct dependencies per bundle module.
   * </pre>
   *
   * <code>repeated .ModuleDependencies module_dependencies = 3;</code>
   */
  int getModuleDependenciesCount();
  /**
   * <pre>
   * List of direct dependencies per bundle module.
   * </pre>
   *
   * <code>repeated .ModuleDependencies module_dependencies = 3;</code>
   */
  java.util.List<? extends com.android.tools.build.libraries.metadata.ModuleDependenciesOrBuilder>
      getModuleDependenciesOrBuilderList();
  /**
   * <pre>
   * List of direct dependencies per bundle module.
   * </pre>
   *
   * <code>repeated .ModuleDependencies module_dependencies = 3;</code>
   */
  com.android.tools.build.libraries.metadata.ModuleDependenciesOrBuilder getModuleDependenciesOrBuilder(
      int index);
}