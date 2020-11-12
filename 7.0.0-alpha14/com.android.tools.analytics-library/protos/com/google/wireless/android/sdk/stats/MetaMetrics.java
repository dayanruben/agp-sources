// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * describes Metrics on Metrics.
 * </pre>
 *
 * Protobuf type {@code android_studio.MetaMetrics}
 */
public  final class MetaMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.MetaMetrics)
    MetaMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetaMetrics.newBuilder() to construct.
  private MetaMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetaMetrics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MetaMetrics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MetaMetrics(
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
            failedConnections_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            bytesSentInLastUpload_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            failedServerReplies_ = input.readInt32();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_MetaMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_MetaMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.MetaMetrics.class, com.google.wireless.android.sdk.stats.MetaMetrics.Builder.class);
  }

  private int bitField0_;
  public static final int FAILED_CONNECTIONS_FIELD_NUMBER = 1;
  private int failedConnections_;
  /**
   * <pre>
   * number of times connecting to the clearcut server failed since
   * the last successful upload.
   * </pre>
   *
   * <code>optional int32 failed_connections = 1;</code>
   * @return Whether the failedConnections field is set.
   */
  public boolean hasFailedConnections() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * number of times connecting to the clearcut server failed since
   * the last successful upload.
   * </pre>
   *
   * <code>optional int32 failed_connections = 1;</code>
   * @return The failedConnections.
   */
  public int getFailedConnections() {
    return failedConnections_;
  }

  public static final int BYTES_SENT_IN_LAST_UPLOAD_FIELD_NUMBER = 2;
  private long bytesSentInLastUpload_;
  /**
   * <pre>
   * number of bytes used to send metrics in the last upload.
   * </pre>
   *
   * <code>optional int64 bytes_sent_in_last_upload = 2;</code>
   * @return Whether the bytesSentInLastUpload field is set.
   */
  public boolean hasBytesSentInLastUpload() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * number of bytes used to send metrics in the last upload.
   * </pre>
   *
   * <code>optional int64 bytes_sent_in_last_upload = 2;</code>
   * @return The bytesSentInLastUpload.
   */
  public long getBytesSentInLastUpload() {
    return bytesSentInLastUpload_;
  }

  public static final int FAILED_SERVER_REPLIES_FIELD_NUMBER = 3;
  private int failedServerReplies_;
  /**
   * <pre>
   * number of times the clearcut server failed with an http error since
   * the last successful upload.
   * </pre>
   *
   * <code>optional int32 failed_server_replies = 3;</code>
   * @return Whether the failedServerReplies field is set.
   */
  public boolean hasFailedServerReplies() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * number of times the clearcut server failed with an http error since
   * the last successful upload.
   * </pre>
   *
   * <code>optional int32 failed_server_replies = 3;</code>
   * @return The failedServerReplies.
   */
  public int getFailedServerReplies() {
    return failedServerReplies_;
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
      output.writeInt32(1, failedConnections_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(2, bytesSentInLastUpload_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, failedServerReplies_);
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
        .computeInt32Size(1, failedConnections_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, bytesSentInLastUpload_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, failedServerReplies_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.MetaMetrics)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.MetaMetrics other = (com.google.wireless.android.sdk.stats.MetaMetrics) obj;

    if (hasFailedConnections() != other.hasFailedConnections()) return false;
    if (hasFailedConnections()) {
      if (getFailedConnections()
          != other.getFailedConnections()) return false;
    }
    if (hasBytesSentInLastUpload() != other.hasBytesSentInLastUpload()) return false;
    if (hasBytesSentInLastUpload()) {
      if (getBytesSentInLastUpload()
          != other.getBytesSentInLastUpload()) return false;
    }
    if (hasFailedServerReplies() != other.hasFailedServerReplies()) return false;
    if (hasFailedServerReplies()) {
      if (getFailedServerReplies()
          != other.getFailedServerReplies()) return false;
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
    if (hasFailedConnections()) {
      hash = (37 * hash) + FAILED_CONNECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getFailedConnections();
    }
    if (hasBytesSentInLastUpload()) {
      hash = (37 * hash) + BYTES_SENT_IN_LAST_UPLOAD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBytesSentInLastUpload());
    }
    if (hasFailedServerReplies()) {
      hash = (37 * hash) + FAILED_SERVER_REPLIES_FIELD_NUMBER;
      hash = (53 * hash) + getFailedServerReplies();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.MetaMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.MetaMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.MetaMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.MetaMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.MetaMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.MetaMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.MetaMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.MetaMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.MetaMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.MetaMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.MetaMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.MetaMetrics parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.MetaMetrics prototype) {
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
   * describes Metrics on Metrics.
   * </pre>
   *
   * Protobuf type {@code android_studio.MetaMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.MetaMetrics)
      com.google.wireless.android.sdk.stats.MetaMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_MetaMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_MetaMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.MetaMetrics.class, com.google.wireless.android.sdk.stats.MetaMetrics.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.MetaMetrics.newBuilder()
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
      failedConnections_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      bytesSentInLastUpload_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      failedServerReplies_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_MetaMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.MetaMetrics getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.MetaMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.MetaMetrics build() {
      com.google.wireless.android.sdk.stats.MetaMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.MetaMetrics buildPartial() {
      com.google.wireless.android.sdk.stats.MetaMetrics result = new com.google.wireless.android.sdk.stats.MetaMetrics(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.failedConnections_ = failedConnections_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bytesSentInLastUpload_ = bytesSentInLastUpload_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.failedServerReplies_ = failedServerReplies_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.wireless.android.sdk.stats.MetaMetrics) {
        return mergeFrom((com.google.wireless.android.sdk.stats.MetaMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.MetaMetrics other) {
      if (other == com.google.wireless.android.sdk.stats.MetaMetrics.getDefaultInstance()) return this;
      if (other.hasFailedConnections()) {
        setFailedConnections(other.getFailedConnections());
      }
      if (other.hasBytesSentInLastUpload()) {
        setBytesSentInLastUpload(other.getBytesSentInLastUpload());
      }
      if (other.hasFailedServerReplies()) {
        setFailedServerReplies(other.getFailedServerReplies());
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
      com.google.wireless.android.sdk.stats.MetaMetrics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.MetaMetrics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int failedConnections_ ;
    /**
     * <pre>
     * number of times connecting to the clearcut server failed since
     * the last successful upload.
     * </pre>
     *
     * <code>optional int32 failed_connections = 1;</code>
     * @return Whether the failedConnections field is set.
     */
    public boolean hasFailedConnections() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * number of times connecting to the clearcut server failed since
     * the last successful upload.
     * </pre>
     *
     * <code>optional int32 failed_connections = 1;</code>
     * @return The failedConnections.
     */
    public int getFailedConnections() {
      return failedConnections_;
    }
    /**
     * <pre>
     * number of times connecting to the clearcut server failed since
     * the last successful upload.
     * </pre>
     *
     * <code>optional int32 failed_connections = 1;</code>
     * @param value The failedConnections to set.
     * @return This builder for chaining.
     */
    public Builder setFailedConnections(int value) {
      bitField0_ |= 0x00000001;
      failedConnections_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * number of times connecting to the clearcut server failed since
     * the last successful upload.
     * </pre>
     *
     * <code>optional int32 failed_connections = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedConnections() {
      bitField0_ = (bitField0_ & ~0x00000001);
      failedConnections_ = 0;
      onChanged();
      return this;
    }

    private long bytesSentInLastUpload_ ;
    /**
     * <pre>
     * number of bytes used to send metrics in the last upload.
     * </pre>
     *
     * <code>optional int64 bytes_sent_in_last_upload = 2;</code>
     * @return Whether the bytesSentInLastUpload field is set.
     */
    public boolean hasBytesSentInLastUpload() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * number of bytes used to send metrics in the last upload.
     * </pre>
     *
     * <code>optional int64 bytes_sent_in_last_upload = 2;</code>
     * @return The bytesSentInLastUpload.
     */
    public long getBytesSentInLastUpload() {
      return bytesSentInLastUpload_;
    }
    /**
     * <pre>
     * number of bytes used to send metrics in the last upload.
     * </pre>
     *
     * <code>optional int64 bytes_sent_in_last_upload = 2;</code>
     * @param value The bytesSentInLastUpload to set.
     * @return This builder for chaining.
     */
    public Builder setBytesSentInLastUpload(long value) {
      bitField0_ |= 0x00000002;
      bytesSentInLastUpload_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * number of bytes used to send metrics in the last upload.
     * </pre>
     *
     * <code>optional int64 bytes_sent_in_last_upload = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBytesSentInLastUpload() {
      bitField0_ = (bitField0_ & ~0x00000002);
      bytesSentInLastUpload_ = 0L;
      onChanged();
      return this;
    }

    private int failedServerReplies_ ;
    /**
     * <pre>
     * number of times the clearcut server failed with an http error since
     * the last successful upload.
     * </pre>
     *
     * <code>optional int32 failed_server_replies = 3;</code>
     * @return Whether the failedServerReplies field is set.
     */
    public boolean hasFailedServerReplies() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * number of times the clearcut server failed with an http error since
     * the last successful upload.
     * </pre>
     *
     * <code>optional int32 failed_server_replies = 3;</code>
     * @return The failedServerReplies.
     */
    public int getFailedServerReplies() {
      return failedServerReplies_;
    }
    /**
     * <pre>
     * number of times the clearcut server failed with an http error since
     * the last successful upload.
     * </pre>
     *
     * <code>optional int32 failed_server_replies = 3;</code>
     * @param value The failedServerReplies to set.
     * @return This builder for chaining.
     */
    public Builder setFailedServerReplies(int value) {
      bitField0_ |= 0x00000004;
      failedServerReplies_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * number of times the clearcut server failed with an http error since
     * the last successful upload.
     * </pre>
     *
     * <code>optional int32 failed_server_replies = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedServerReplies() {
      bitField0_ = (bitField0_ & ~0x00000004);
      failedServerReplies_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.MetaMetrics)
  }

  // @@protoc_insertion_point(class_scope:android_studio.MetaMetrics)
  private static final com.google.wireless.android.sdk.stats.MetaMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.MetaMetrics();
  }

  public static com.google.wireless.android.sdk.stats.MetaMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<MetaMetrics>
      PARSER = new com.google.protobuf.AbstractParser<MetaMetrics>() {
    @java.lang.Override
    public MetaMetrics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MetaMetrics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MetaMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetaMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.MetaMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
