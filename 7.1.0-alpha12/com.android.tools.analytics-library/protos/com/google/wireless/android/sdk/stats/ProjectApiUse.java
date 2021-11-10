// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Records use of APIs used at the gradle project level
 * </pre>
 *
 * Protobuf type {@code android_studio.ProjectApiUse}
 */
public  final class ProjectApiUse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.ProjectApiUse)
    ProjectApiUseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProjectApiUse.newBuilder() to construct.
  private ProjectApiUse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProjectApiUse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProjectApiUse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProjectApiUse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            bitField0_ |= 0x00000001;
            builderTestApiDeviceProvider_ = input.readBool();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            builderTestApiTestServer_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProjectApiUse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProjectApiUse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.ProjectApiUse.class, com.google.wireless.android.sdk.stats.ProjectApiUse.Builder.class);
  }

  private int bitField0_;
  public static final int BUILDER_TEST_API_DEVICE_PROVIDER_FIELD_NUMBER = 1;
  private boolean builderTestApiDeviceProvider_;
  /**
   * <pre>
   * Whether the device provider API is used in this project.
   * </pre>
   *
   * <code>optional bool builder_test_api_device_provider = 1;</code>
   * @return Whether the builderTestApiDeviceProvider field is set.
   */
  public boolean hasBuilderTestApiDeviceProvider() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Whether the device provider API is used in this project.
   * </pre>
   *
   * <code>optional bool builder_test_api_device_provider = 1;</code>
   * @return The builderTestApiDeviceProvider.
   */
  public boolean getBuilderTestApiDeviceProvider() {
    return builderTestApiDeviceProvider_;
  }

  public static final int BUILDER_TEST_API_TEST_SERVER_FIELD_NUMBER = 2;
  private boolean builderTestApiTestServer_;
  /**
   * <pre>
   * Whether the test server API is used in this project.
   * </pre>
   *
   * <code>optional bool builder_test_api_test_server = 2;</code>
   * @return Whether the builderTestApiTestServer field is set.
   */
  public boolean hasBuilderTestApiTestServer() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Whether the test server API is used in this project.
   * </pre>
   *
   * <code>optional bool builder_test_api_test_server = 2;</code>
   * @return The builderTestApiTestServer.
   */
  public boolean getBuilderTestApiTestServer() {
    return builderTestApiTestServer_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(1, builderTestApiDeviceProvider_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, builderTestApiTestServer_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, builderTestApiDeviceProvider_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, builderTestApiTestServer_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.wireless.android.sdk.stats.ProjectApiUse)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.ProjectApiUse other = (com.google.wireless.android.sdk.stats.ProjectApiUse) obj;

    if (hasBuilderTestApiDeviceProvider() != other.hasBuilderTestApiDeviceProvider()) return false;
    if (hasBuilderTestApiDeviceProvider()) {
      if (getBuilderTestApiDeviceProvider()
          != other.getBuilderTestApiDeviceProvider()) return false;
    }
    if (hasBuilderTestApiTestServer() != other.hasBuilderTestApiTestServer()) return false;
    if (hasBuilderTestApiTestServer()) {
      if (getBuilderTestApiTestServer()
          != other.getBuilderTestApiTestServer()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBuilderTestApiDeviceProvider()) {
      hash = (37 * hash) + BUILDER_TEST_API_DEVICE_PROVIDER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBuilderTestApiDeviceProvider());
    }
    if (hasBuilderTestApiTestServer()) {
      hash = (37 * hash) + BUILDER_TEST_API_TEST_SERVER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBuilderTestApiTestServer());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.ProjectApiUse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ProjectApiUse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProjectApiUse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ProjectApiUse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProjectApiUse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ProjectApiUse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProjectApiUse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ProjectApiUse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProjectApiUse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ProjectApiUse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProjectApiUse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ProjectApiUse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.ProjectApiUse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Records use of APIs used at the gradle project level
   * </pre>
   *
   * Protobuf type {@code android_studio.ProjectApiUse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.ProjectApiUse)
      com.google.wireless.android.sdk.stats.ProjectApiUseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProjectApiUse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProjectApiUse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.ProjectApiUse.class, com.google.wireless.android.sdk.stats.ProjectApiUse.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.ProjectApiUse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      builderTestApiDeviceProvider_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      builderTestApiTestServer_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProjectApiUse_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ProjectApiUse getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.ProjectApiUse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ProjectApiUse build() {
      com.google.wireless.android.sdk.stats.ProjectApiUse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ProjectApiUse buildPartial() {
      com.google.wireless.android.sdk.stats.ProjectApiUse result = new com.google.wireless.android.sdk.stats.ProjectApiUse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.builderTestApiDeviceProvider_ = builderTestApiDeviceProvider_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.builderTestApiTestServer_ = builderTestApiTestServer_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.ProjectApiUse) {
        return mergeFrom((com.google.wireless.android.sdk.stats.ProjectApiUse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.ProjectApiUse other) {
      if (other == com.google.wireless.android.sdk.stats.ProjectApiUse.getDefaultInstance()) return this;
      if (other.hasBuilderTestApiDeviceProvider()) {
        setBuilderTestApiDeviceProvider(other.getBuilderTestApiDeviceProvider());
      }
      if (other.hasBuilderTestApiTestServer()) {
        setBuilderTestApiTestServer(other.getBuilderTestApiTestServer());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.wireless.android.sdk.stats.ProjectApiUse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.ProjectApiUse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean builderTestApiDeviceProvider_ ;
    /**
     * <pre>
     * Whether the device provider API is used in this project.
     * </pre>
     *
     * <code>optional bool builder_test_api_device_provider = 1;</code>
     * @return Whether the builderTestApiDeviceProvider field is set.
     */
    public boolean hasBuilderTestApiDeviceProvider() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Whether the device provider API is used in this project.
     * </pre>
     *
     * <code>optional bool builder_test_api_device_provider = 1;</code>
     * @return The builderTestApiDeviceProvider.
     */
    public boolean getBuilderTestApiDeviceProvider() {
      return builderTestApiDeviceProvider_;
    }
    /**
     * <pre>
     * Whether the device provider API is used in this project.
     * </pre>
     *
     * <code>optional bool builder_test_api_device_provider = 1;</code>
     * @param value The builderTestApiDeviceProvider to set.
     * @return This builder for chaining.
     */
    public Builder setBuilderTestApiDeviceProvider(boolean value) {
      bitField0_ |= 0x00000001;
      builderTestApiDeviceProvider_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the device provider API is used in this project.
     * </pre>
     *
     * <code>optional bool builder_test_api_device_provider = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuilderTestApiDeviceProvider() {
      bitField0_ = (bitField0_ & ~0x00000001);
      builderTestApiDeviceProvider_ = false;
      onChanged();
      return this;
    }

    private boolean builderTestApiTestServer_ ;
    /**
     * <pre>
     * Whether the test server API is used in this project.
     * </pre>
     *
     * <code>optional bool builder_test_api_test_server = 2;</code>
     * @return Whether the builderTestApiTestServer field is set.
     */
    public boolean hasBuilderTestApiTestServer() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Whether the test server API is used in this project.
     * </pre>
     *
     * <code>optional bool builder_test_api_test_server = 2;</code>
     * @return The builderTestApiTestServer.
     */
    public boolean getBuilderTestApiTestServer() {
      return builderTestApiTestServer_;
    }
    /**
     * <pre>
     * Whether the test server API is used in this project.
     * </pre>
     *
     * <code>optional bool builder_test_api_test_server = 2;</code>
     * @param value The builderTestApiTestServer to set.
     * @return This builder for chaining.
     */
    public Builder setBuilderTestApiTestServer(boolean value) {
      bitField0_ |= 0x00000002;
      builderTestApiTestServer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the test server API is used in this project.
     * </pre>
     *
     * <code>optional bool builder_test_api_test_server = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuilderTestApiTestServer() {
      bitField0_ = (bitField0_ & ~0x00000002);
      builderTestApiTestServer_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:android_studio.ProjectApiUse)
  }

  // @@protoc_insertion_point(class_scope:android_studio.ProjectApiUse)
  private static final com.google.wireless.android.sdk.stats.ProjectApiUse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.ProjectApiUse();
  }

  public static com.google.wireless.android.sdk.stats.ProjectApiUse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ProjectApiUse>
      PARSER = new com.google.protobuf.AbstractParser<ProjectApiUse>() {
    @java.lang.Override
    public ProjectApiUse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProjectApiUse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProjectApiUse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProjectApiUse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.ProjectApiUse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
