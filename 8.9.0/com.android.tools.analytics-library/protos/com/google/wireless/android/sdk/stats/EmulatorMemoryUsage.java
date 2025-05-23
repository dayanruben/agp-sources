// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * RAM usage info for the emulator, in bytes.
 * </pre>
 *
 * Protobuf type {@code android_studio.EmulatorMemoryUsage}
 */
public final class EmulatorMemoryUsage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.EmulatorMemoryUsage)
    EmulatorMemoryUsageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmulatorMemoryUsage.newBuilder() to construct.
  private EmulatorMemoryUsage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmulatorMemoryUsage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmulatorMemoryUsage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorMemoryUsage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorMemoryUsage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.EmulatorMemoryUsage.class, com.google.wireless.android.sdk.stats.EmulatorMemoryUsage.Builder.class);
  }

  private int bitField0_;
  public static final int RESIDENT_MEMORY_FIELD_NUMBER = 1;
  private long residentMemory_ = 0L;
  /**
   * <code>optional uint64 resident_memory = 1;</code>
   * @return Whether the residentMemory field is set.
   */
  @java.lang.Override
  public boolean hasResidentMemory() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional uint64 resident_memory = 1;</code>
   * @return The residentMemory.
   */
  @java.lang.Override
  public long getResidentMemory() {
    return residentMemory_;
  }

  public static final int RESIDENT_MEMORY_MAX_FIELD_NUMBER = 2;
  private long residentMemoryMax_ = 0L;
  /**
   * <code>optional uint64 resident_memory_max = 2;</code>
   * @return Whether the residentMemoryMax field is set.
   */
  @java.lang.Override
  public boolean hasResidentMemoryMax() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional uint64 resident_memory_max = 2;</code>
   * @return The residentMemoryMax.
   */
  @java.lang.Override
  public long getResidentMemoryMax() {
    return residentMemoryMax_;
  }

  public static final int VIRTUAL_MEMORY_FIELD_NUMBER = 3;
  private long virtualMemory_ = 0L;
  /**
   * <code>optional uint64 virtual_memory = 3;</code>
   * @return Whether the virtualMemory field is set.
   */
  @java.lang.Override
  public boolean hasVirtualMemory() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional uint64 virtual_memory = 3;</code>
   * @return The virtualMemory.
   */
  @java.lang.Override
  public long getVirtualMemory() {
    return virtualMemory_;
  }

  public static final int VIRTUAL_MEMORY_MAX_FIELD_NUMBER = 4;
  private long virtualMemoryMax_ = 0L;
  /**
   * <code>optional uint64 virtual_memory_max = 4;</code>
   * @return Whether the virtualMemoryMax field is set.
   */
  @java.lang.Override
  public boolean hasVirtualMemoryMax() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional uint64 virtual_memory_max = 4;</code>
   * @return The virtualMemoryMax.
   */
  @java.lang.Override
  public long getVirtualMemoryMax() {
    return virtualMemoryMax_;
  }

  public static final int TOTAL_PHYS_MEMORY_FIELD_NUMBER = 5;
  private long totalPhysMemory_ = 0L;
  /**
   * <code>optional uint64 total_phys_memory = 5;</code>
   * @return Whether the totalPhysMemory field is set.
   */
  @java.lang.Override
  public boolean hasTotalPhysMemory() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>optional uint64 total_phys_memory = 5;</code>
   * @return The totalPhysMemory.
   */
  @java.lang.Override
  public long getTotalPhysMemory() {
    return totalPhysMemory_;
  }

  public static final int TOTAL_PAGE_FILE_FIELD_NUMBER = 6;
  private long totalPageFile_ = 0L;
  /**
   * <code>optional uint64 total_page_file = 6;</code>
   * @return Whether the totalPageFile field is set.
   */
  @java.lang.Override
  public boolean hasTotalPageFile() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <code>optional uint64 total_page_file = 6;</code>
   * @return The totalPageFile.
   */
  @java.lang.Override
  public long getTotalPageFile() {
    return totalPageFile_;
  }

  public static final int TOTAL_GUEST_MEMORY_FIELD_NUMBER = 7;
  private long totalGuestMemory_ = 0L;
  /**
   * <code>optional uint64 total_guest_memory = 7;</code>
   * @return Whether the totalGuestMemory field is set.
   */
  @java.lang.Override
  public boolean hasTotalGuestMemory() {
    return ((bitField0_ & 0x00000040) != 0);
  }
  /**
   * <code>optional uint64 total_guest_memory = 7;</code>
   * @return The totalGuestMemory.
   */
  @java.lang.Override
  public long getTotalGuestMemory() {
    return totalGuestMemory_;
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
      output.writeUInt64(1, residentMemory_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt64(2, residentMemoryMax_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt64(3, virtualMemory_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt64(4, virtualMemoryMax_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeUInt64(5, totalPhysMemory_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      output.writeUInt64(6, totalPageFile_);
    }
    if (((bitField0_ & 0x00000040) != 0)) {
      output.writeUInt64(7, totalGuestMemory_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, residentMemory_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, residentMemoryMax_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, virtualMemory_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, virtualMemoryMax_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, totalPhysMemory_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, totalPageFile_);
    }
    if (((bitField0_ & 0x00000040) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(7, totalGuestMemory_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.wireless.android.sdk.stats.EmulatorMemoryUsage)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.EmulatorMemoryUsage other = (com.google.wireless.android.sdk.stats.EmulatorMemoryUsage) obj;

    if (hasResidentMemory() != other.hasResidentMemory()) return false;
    if (hasResidentMemory()) {
      if (getResidentMemory()
          != other.getResidentMemory()) return false;
    }
    if (hasResidentMemoryMax() != other.hasResidentMemoryMax()) return false;
    if (hasResidentMemoryMax()) {
      if (getResidentMemoryMax()
          != other.getResidentMemoryMax()) return false;
    }
    if (hasVirtualMemory() != other.hasVirtualMemory()) return false;
    if (hasVirtualMemory()) {
      if (getVirtualMemory()
          != other.getVirtualMemory()) return false;
    }
    if (hasVirtualMemoryMax() != other.hasVirtualMemoryMax()) return false;
    if (hasVirtualMemoryMax()) {
      if (getVirtualMemoryMax()
          != other.getVirtualMemoryMax()) return false;
    }
    if (hasTotalPhysMemory() != other.hasTotalPhysMemory()) return false;
    if (hasTotalPhysMemory()) {
      if (getTotalPhysMemory()
          != other.getTotalPhysMemory()) return false;
    }
    if (hasTotalPageFile() != other.hasTotalPageFile()) return false;
    if (hasTotalPageFile()) {
      if (getTotalPageFile()
          != other.getTotalPageFile()) return false;
    }
    if (hasTotalGuestMemory() != other.hasTotalGuestMemory()) return false;
    if (hasTotalGuestMemory()) {
      if (getTotalGuestMemory()
          != other.getTotalGuestMemory()) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasResidentMemory()) {
      hash = (37 * hash) + RESIDENT_MEMORY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getResidentMemory());
    }
    if (hasResidentMemoryMax()) {
      hash = (37 * hash) + RESIDENT_MEMORY_MAX_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getResidentMemoryMax());
    }
    if (hasVirtualMemory()) {
      hash = (37 * hash) + VIRTUAL_MEMORY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getVirtualMemory());
    }
    if (hasVirtualMemoryMax()) {
      hash = (37 * hash) + VIRTUAL_MEMORY_MAX_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getVirtualMemoryMax());
    }
    if (hasTotalPhysMemory()) {
      hash = (37 * hash) + TOTAL_PHYS_MEMORY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTotalPhysMemory());
    }
    if (hasTotalPageFile()) {
      hash = (37 * hash) + TOTAL_PAGE_FILE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTotalPageFile());
    }
    if (hasTotalGuestMemory()) {
      hash = (37 * hash) + TOTAL_GUEST_MEMORY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTotalGuestMemory());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.EmulatorMemoryUsage prototype) {
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
   * RAM usage info for the emulator, in bytes.
   * </pre>
   *
   * Protobuf type {@code android_studio.EmulatorMemoryUsage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.EmulatorMemoryUsage)
      com.google.wireless.android.sdk.stats.EmulatorMemoryUsageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorMemoryUsage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorMemoryUsage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.EmulatorMemoryUsage.class, com.google.wireless.android.sdk.stats.EmulatorMemoryUsage.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.EmulatorMemoryUsage.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      residentMemory_ = 0L;
      residentMemoryMax_ = 0L;
      virtualMemory_ = 0L;
      virtualMemoryMax_ = 0L;
      totalPhysMemory_ = 0L;
      totalPageFile_ = 0L;
      totalGuestMemory_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorMemoryUsage_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorMemoryUsage getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.EmulatorMemoryUsage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorMemoryUsage build() {
      com.google.wireless.android.sdk.stats.EmulatorMemoryUsage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorMemoryUsage buildPartial() {
      com.google.wireless.android.sdk.stats.EmulatorMemoryUsage result = new com.google.wireless.android.sdk.stats.EmulatorMemoryUsage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.EmulatorMemoryUsage result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.residentMemory_ = residentMemory_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.residentMemoryMax_ = residentMemoryMax_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.virtualMemory_ = virtualMemory_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.virtualMemoryMax_ = virtualMemoryMax_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.totalPhysMemory_ = totalPhysMemory_;
        to_bitField0_ |= 0x00000010;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.totalPageFile_ = totalPageFile_;
        to_bitField0_ |= 0x00000020;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.totalGuestMemory_ = totalGuestMemory_;
        to_bitField0_ |= 0x00000040;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.EmulatorMemoryUsage) {
        return mergeFrom((com.google.wireless.android.sdk.stats.EmulatorMemoryUsage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.EmulatorMemoryUsage other) {
      if (other == com.google.wireless.android.sdk.stats.EmulatorMemoryUsage.getDefaultInstance()) return this;
      if (other.hasResidentMemory()) {
        setResidentMemory(other.getResidentMemory());
      }
      if (other.hasResidentMemoryMax()) {
        setResidentMemoryMax(other.getResidentMemoryMax());
      }
      if (other.hasVirtualMemory()) {
        setVirtualMemory(other.getVirtualMemory());
      }
      if (other.hasVirtualMemoryMax()) {
        setVirtualMemoryMax(other.getVirtualMemoryMax());
      }
      if (other.hasTotalPhysMemory()) {
        setTotalPhysMemory(other.getTotalPhysMemory());
      }
      if (other.hasTotalPageFile()) {
        setTotalPageFile(other.getTotalPageFile());
      }
      if (other.hasTotalGuestMemory()) {
        setTotalGuestMemory(other.getTotalGuestMemory());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              residentMemory_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              residentMemoryMax_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              virtualMemory_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              virtualMemoryMax_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              totalPhysMemory_ = input.readUInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              totalPageFile_ = input.readUInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              totalGuestMemory_ = input.readUInt64();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long residentMemory_ ;
    /**
     * <code>optional uint64 resident_memory = 1;</code>
     * @return Whether the residentMemory field is set.
     */
    @java.lang.Override
    public boolean hasResidentMemory() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint64 resident_memory = 1;</code>
     * @return The residentMemory.
     */
    @java.lang.Override
    public long getResidentMemory() {
      return residentMemory_;
    }
    /**
     * <code>optional uint64 resident_memory = 1;</code>
     * @param value The residentMemory to set.
     * @return This builder for chaining.
     */
    public Builder setResidentMemory(long value) {

      residentMemory_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 resident_memory = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResidentMemory() {
      bitField0_ = (bitField0_ & ~0x00000001);
      residentMemory_ = 0L;
      onChanged();
      return this;
    }

    private long residentMemoryMax_ ;
    /**
     * <code>optional uint64 resident_memory_max = 2;</code>
     * @return Whether the residentMemoryMax field is set.
     */
    @java.lang.Override
    public boolean hasResidentMemoryMax() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint64 resident_memory_max = 2;</code>
     * @return The residentMemoryMax.
     */
    @java.lang.Override
    public long getResidentMemoryMax() {
      return residentMemoryMax_;
    }
    /**
     * <code>optional uint64 resident_memory_max = 2;</code>
     * @param value The residentMemoryMax to set.
     * @return This builder for chaining.
     */
    public Builder setResidentMemoryMax(long value) {

      residentMemoryMax_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 resident_memory_max = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResidentMemoryMax() {
      bitField0_ = (bitField0_ & ~0x00000002);
      residentMemoryMax_ = 0L;
      onChanged();
      return this;
    }

    private long virtualMemory_ ;
    /**
     * <code>optional uint64 virtual_memory = 3;</code>
     * @return Whether the virtualMemory field is set.
     */
    @java.lang.Override
    public boolean hasVirtualMemory() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional uint64 virtual_memory = 3;</code>
     * @return The virtualMemory.
     */
    @java.lang.Override
    public long getVirtualMemory() {
      return virtualMemory_;
    }
    /**
     * <code>optional uint64 virtual_memory = 3;</code>
     * @param value The virtualMemory to set.
     * @return This builder for chaining.
     */
    public Builder setVirtualMemory(long value) {

      virtualMemory_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 virtual_memory = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVirtualMemory() {
      bitField0_ = (bitField0_ & ~0x00000004);
      virtualMemory_ = 0L;
      onChanged();
      return this;
    }

    private long virtualMemoryMax_ ;
    /**
     * <code>optional uint64 virtual_memory_max = 4;</code>
     * @return Whether the virtualMemoryMax field is set.
     */
    @java.lang.Override
    public boolean hasVirtualMemoryMax() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional uint64 virtual_memory_max = 4;</code>
     * @return The virtualMemoryMax.
     */
    @java.lang.Override
    public long getVirtualMemoryMax() {
      return virtualMemoryMax_;
    }
    /**
     * <code>optional uint64 virtual_memory_max = 4;</code>
     * @param value The virtualMemoryMax to set.
     * @return This builder for chaining.
     */
    public Builder setVirtualMemoryMax(long value) {

      virtualMemoryMax_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 virtual_memory_max = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearVirtualMemoryMax() {
      bitField0_ = (bitField0_ & ~0x00000008);
      virtualMemoryMax_ = 0L;
      onChanged();
      return this;
    }

    private long totalPhysMemory_ ;
    /**
     * <code>optional uint64 total_phys_memory = 5;</code>
     * @return Whether the totalPhysMemory field is set.
     */
    @java.lang.Override
    public boolean hasTotalPhysMemory() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional uint64 total_phys_memory = 5;</code>
     * @return The totalPhysMemory.
     */
    @java.lang.Override
    public long getTotalPhysMemory() {
      return totalPhysMemory_;
    }
    /**
     * <code>optional uint64 total_phys_memory = 5;</code>
     * @param value The totalPhysMemory to set.
     * @return This builder for chaining.
     */
    public Builder setTotalPhysMemory(long value) {

      totalPhysMemory_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 total_phys_memory = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalPhysMemory() {
      bitField0_ = (bitField0_ & ~0x00000010);
      totalPhysMemory_ = 0L;
      onChanged();
      return this;
    }

    private long totalPageFile_ ;
    /**
     * <code>optional uint64 total_page_file = 6;</code>
     * @return Whether the totalPageFile field is set.
     */
    @java.lang.Override
    public boolean hasTotalPageFile() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional uint64 total_page_file = 6;</code>
     * @return The totalPageFile.
     */
    @java.lang.Override
    public long getTotalPageFile() {
      return totalPageFile_;
    }
    /**
     * <code>optional uint64 total_page_file = 6;</code>
     * @param value The totalPageFile to set.
     * @return This builder for chaining.
     */
    public Builder setTotalPageFile(long value) {

      totalPageFile_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 total_page_file = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalPageFile() {
      bitField0_ = (bitField0_ & ~0x00000020);
      totalPageFile_ = 0L;
      onChanged();
      return this;
    }

    private long totalGuestMemory_ ;
    /**
     * <code>optional uint64 total_guest_memory = 7;</code>
     * @return Whether the totalGuestMemory field is set.
     */
    @java.lang.Override
    public boolean hasTotalGuestMemory() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <code>optional uint64 total_guest_memory = 7;</code>
     * @return The totalGuestMemory.
     */
    @java.lang.Override
    public long getTotalGuestMemory() {
      return totalGuestMemory_;
    }
    /**
     * <code>optional uint64 total_guest_memory = 7;</code>
     * @param value The totalGuestMemory to set.
     * @return This builder for chaining.
     */
    public Builder setTotalGuestMemory(long value) {

      totalGuestMemory_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 total_guest_memory = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalGuestMemory() {
      bitField0_ = (bitField0_ & ~0x00000040);
      totalGuestMemory_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:android_studio.EmulatorMemoryUsage)
  }

  // @@protoc_insertion_point(class_scope:android_studio.EmulatorMemoryUsage)
  private static final com.google.wireless.android.sdk.stats.EmulatorMemoryUsage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.EmulatorMemoryUsage();
  }

  public static com.google.wireless.android.sdk.stats.EmulatorMemoryUsage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<EmulatorMemoryUsage>
      PARSER = new com.google.protobuf.AbstractParser<EmulatorMemoryUsage>() {
    @java.lang.Override
    public EmulatorMemoryUsage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<EmulatorMemoryUsage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmulatorMemoryUsage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.EmulatorMemoryUsage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

