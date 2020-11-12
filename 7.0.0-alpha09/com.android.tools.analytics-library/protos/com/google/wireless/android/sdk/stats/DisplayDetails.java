// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Details of a display screen.
 * </pre>
 *
 * Protobuf type {@code android_studio.DisplayDetails}
 */
public  final class DisplayDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.DisplayDetails)
    DisplayDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DisplayDetails.newBuilder() to construct.
  private DisplayDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DisplayDetails() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DisplayDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DisplayDetails(
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
            width_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            height_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            dotsPerInchHorizontal_ = input.readInt32();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            dotsPerInchVertical_ = input.readInt32();
            break;
          }
          case 45: {
            bitField0_ |= 0x00000010;
            systemScale_ = input.readFloat();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DisplayDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DisplayDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.DisplayDetails.class, com.google.wireless.android.sdk.stats.DisplayDetails.Builder.class);
  }

  private int bitField0_;
  public static final int WIDTH_FIELD_NUMBER = 1;
  private long width_;
  /**
   * <pre>
   * Width of the display screen in pixels.
   * </pre>
   *
   * <code>optional int64 width = 1;</code>
   * @return Whether the width field is set.
   */
  public boolean hasWidth() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Width of the display screen in pixels.
   * </pre>
   *
   * <code>optional int64 width = 1;</code>
   * @return The width.
   */
  public long getWidth() {
    return width_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private long height_;
  /**
   * <pre>
   * Height of the display screen in pixels.
   * </pre>
   *
   * <code>optional int64 height = 2;</code>
   * @return Whether the height field is set.
   */
  public boolean hasHeight() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Height of the display screen in pixels.
   * </pre>
   *
   * <code>optional int64 height = 2;</code>
   * @return The height.
   */
  public long getHeight() {
    return height_;
  }

  public static final int DOTS_PER_INCH_HORIZONTAL_FIELD_NUMBER = 3;
  private int dotsPerInchHorizontal_;
  /**
   * <pre>
   * Densitiy of the pixels on the screen horiziontally.
   * </pre>
   *
   * <code>optional int32 dots_per_inch_horizontal = 3;</code>
   * @return Whether the dotsPerInchHorizontal field is set.
   */
  public boolean hasDotsPerInchHorizontal() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Densitiy of the pixels on the screen horiziontally.
   * </pre>
   *
   * <code>optional int32 dots_per_inch_horizontal = 3;</code>
   * @return The dotsPerInchHorizontal.
   */
  public int getDotsPerInchHorizontal() {
    return dotsPerInchHorizontal_;
  }

  public static final int DOTS_PER_INCH_VERTICAL_FIELD_NUMBER = 4;
  private int dotsPerInchVertical_;
  /**
   * <pre>
   * Densitiy of the pixels on the screen vertically.
   * </pre>
   *
   * <code>optional int32 dots_per_inch_vertical = 4;</code>
   * @return Whether the dotsPerInchVertical field is set.
   */
  public boolean hasDotsPerInchVertical() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Densitiy of the pixels on the screen vertically.
   * </pre>
   *
   * <code>optional int32 dots_per_inch_vertical = 4;</code>
   * @return The dotsPerInchVertical.
   */
  public int getDotsPerInchVertical() {
    return dotsPerInchVertical_;
  }

  public static final int SYSTEM_SCALE_FIELD_NUMBER = 5;
  private float systemScale_;
  /**
   * <pre>
   * System scale factor for the screen resolution.
   * </pre>
   *
   * <code>optional float system_scale = 5;</code>
   * @return Whether the systemScale field is set.
   */
  public boolean hasSystemScale() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * System scale factor for the screen resolution.
   * </pre>
   *
   * <code>optional float system_scale = 5;</code>
   * @return The systemScale.
   */
  public float getSystemScale() {
    return systemScale_;
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
      output.writeInt64(1, width_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(2, height_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, dotsPerInchHorizontal_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(4, dotsPerInchVertical_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeFloat(5, systemScale_);
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
        .computeInt64Size(1, width_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, height_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, dotsPerInchHorizontal_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, dotsPerInchVertical_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, systemScale_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.DisplayDetails)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.DisplayDetails other = (com.google.wireless.android.sdk.stats.DisplayDetails) obj;

    if (hasWidth() != other.hasWidth()) return false;
    if (hasWidth()) {
      if (getWidth()
          != other.getWidth()) return false;
    }
    if (hasHeight() != other.hasHeight()) return false;
    if (hasHeight()) {
      if (getHeight()
          != other.getHeight()) return false;
    }
    if (hasDotsPerInchHorizontal() != other.hasDotsPerInchHorizontal()) return false;
    if (hasDotsPerInchHorizontal()) {
      if (getDotsPerInchHorizontal()
          != other.getDotsPerInchHorizontal()) return false;
    }
    if (hasDotsPerInchVertical() != other.hasDotsPerInchVertical()) return false;
    if (hasDotsPerInchVertical()) {
      if (getDotsPerInchVertical()
          != other.getDotsPerInchVertical()) return false;
    }
    if (hasSystemScale() != other.hasSystemScale()) return false;
    if (hasSystemScale()) {
      if (java.lang.Float.floatToIntBits(getSystemScale())
          != java.lang.Float.floatToIntBits(
              other.getSystemScale())) return false;
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
    if (hasWidth()) {
      hash = (37 * hash) + WIDTH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getWidth());
    }
    if (hasHeight()) {
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getHeight());
    }
    if (hasDotsPerInchHorizontal()) {
      hash = (37 * hash) + DOTS_PER_INCH_HORIZONTAL_FIELD_NUMBER;
      hash = (53 * hash) + getDotsPerInchHorizontal();
    }
    if (hasDotsPerInchVertical()) {
      hash = (37 * hash) + DOTS_PER_INCH_VERTICAL_FIELD_NUMBER;
      hash = (53 * hash) + getDotsPerInchVertical();
    }
    if (hasSystemScale()) {
      hash = (37 * hash) + SYSTEM_SCALE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getSystemScale());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.DisplayDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DisplayDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DisplayDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DisplayDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DisplayDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DisplayDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DisplayDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DisplayDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DisplayDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DisplayDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DisplayDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DisplayDetails parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.DisplayDetails prototype) {
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
   * Details of a display screen.
   * </pre>
   *
   * Protobuf type {@code android_studio.DisplayDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.DisplayDetails)
      com.google.wireless.android.sdk.stats.DisplayDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DisplayDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DisplayDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.DisplayDetails.class, com.google.wireless.android.sdk.stats.DisplayDetails.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.DisplayDetails.newBuilder()
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
      width_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      height_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      dotsPerInchHorizontal_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      dotsPerInchVertical_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      systemScale_ = 0F;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DisplayDetails_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DisplayDetails getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.DisplayDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DisplayDetails build() {
      com.google.wireless.android.sdk.stats.DisplayDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DisplayDetails buildPartial() {
      com.google.wireless.android.sdk.stats.DisplayDetails result = new com.google.wireless.android.sdk.stats.DisplayDetails(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.width_ = width_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.height_ = height_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dotsPerInchHorizontal_ = dotsPerInchHorizontal_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.dotsPerInchVertical_ = dotsPerInchVertical_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.systemScale_ = systemScale_;
        to_bitField0_ |= 0x00000010;
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
      if (other instanceof com.google.wireless.android.sdk.stats.DisplayDetails) {
        return mergeFrom((com.google.wireless.android.sdk.stats.DisplayDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.DisplayDetails other) {
      if (other == com.google.wireless.android.sdk.stats.DisplayDetails.getDefaultInstance()) return this;
      if (other.hasWidth()) {
        setWidth(other.getWidth());
      }
      if (other.hasHeight()) {
        setHeight(other.getHeight());
      }
      if (other.hasDotsPerInchHorizontal()) {
        setDotsPerInchHorizontal(other.getDotsPerInchHorizontal());
      }
      if (other.hasDotsPerInchVertical()) {
        setDotsPerInchVertical(other.getDotsPerInchVertical());
      }
      if (other.hasSystemScale()) {
        setSystemScale(other.getSystemScale());
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
      com.google.wireless.android.sdk.stats.DisplayDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.DisplayDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long width_ ;
    /**
     * <pre>
     * Width of the display screen in pixels.
     * </pre>
     *
     * <code>optional int64 width = 1;</code>
     * @return Whether the width field is set.
     */
    public boolean hasWidth() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Width of the display screen in pixels.
     * </pre>
     *
     * <code>optional int64 width = 1;</code>
     * @return The width.
     */
    public long getWidth() {
      return width_;
    }
    /**
     * <pre>
     * Width of the display screen in pixels.
     * </pre>
     *
     * <code>optional int64 width = 1;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(long value) {
      bitField0_ |= 0x00000001;
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Width of the display screen in pixels.
     * </pre>
     *
     * <code>optional int64 width = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      bitField0_ = (bitField0_ & ~0x00000001);
      width_ = 0L;
      onChanged();
      return this;
    }

    private long height_ ;
    /**
     * <pre>
     * Height of the display screen in pixels.
     * </pre>
     *
     * <code>optional int64 height = 2;</code>
     * @return Whether the height field is set.
     */
    public boolean hasHeight() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Height of the display screen in pixels.
     * </pre>
     *
     * <code>optional int64 height = 2;</code>
     * @return The height.
     */
    public long getHeight() {
      return height_;
    }
    /**
     * <pre>
     * Height of the display screen in pixels.
     * </pre>
     *
     * <code>optional int64 height = 2;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {
      bitField0_ |= 0x00000002;
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Height of the display screen in pixels.
     * </pre>
     *
     * <code>optional int64 height = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      height_ = 0L;
      onChanged();
      return this;
    }

    private int dotsPerInchHorizontal_ ;
    /**
     * <pre>
     * Densitiy of the pixels on the screen horiziontally.
     * </pre>
     *
     * <code>optional int32 dots_per_inch_horizontal = 3;</code>
     * @return Whether the dotsPerInchHorizontal field is set.
     */
    public boolean hasDotsPerInchHorizontal() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Densitiy of the pixels on the screen horiziontally.
     * </pre>
     *
     * <code>optional int32 dots_per_inch_horizontal = 3;</code>
     * @return The dotsPerInchHorizontal.
     */
    public int getDotsPerInchHorizontal() {
      return dotsPerInchHorizontal_;
    }
    /**
     * <pre>
     * Densitiy of the pixels on the screen horiziontally.
     * </pre>
     *
     * <code>optional int32 dots_per_inch_horizontal = 3;</code>
     * @param value The dotsPerInchHorizontal to set.
     * @return This builder for chaining.
     */
    public Builder setDotsPerInchHorizontal(int value) {
      bitField0_ |= 0x00000004;
      dotsPerInchHorizontal_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Densitiy of the pixels on the screen horiziontally.
     * </pre>
     *
     * <code>optional int32 dots_per_inch_horizontal = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDotsPerInchHorizontal() {
      bitField0_ = (bitField0_ & ~0x00000004);
      dotsPerInchHorizontal_ = 0;
      onChanged();
      return this;
    }

    private int dotsPerInchVertical_ ;
    /**
     * <pre>
     * Densitiy of the pixels on the screen vertically.
     * </pre>
     *
     * <code>optional int32 dots_per_inch_vertical = 4;</code>
     * @return Whether the dotsPerInchVertical field is set.
     */
    public boolean hasDotsPerInchVertical() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Densitiy of the pixels on the screen vertically.
     * </pre>
     *
     * <code>optional int32 dots_per_inch_vertical = 4;</code>
     * @return The dotsPerInchVertical.
     */
    public int getDotsPerInchVertical() {
      return dotsPerInchVertical_;
    }
    /**
     * <pre>
     * Densitiy of the pixels on the screen vertically.
     * </pre>
     *
     * <code>optional int32 dots_per_inch_vertical = 4;</code>
     * @param value The dotsPerInchVertical to set.
     * @return This builder for chaining.
     */
    public Builder setDotsPerInchVertical(int value) {
      bitField0_ |= 0x00000008;
      dotsPerInchVertical_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Densitiy of the pixels on the screen vertically.
     * </pre>
     *
     * <code>optional int32 dots_per_inch_vertical = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDotsPerInchVertical() {
      bitField0_ = (bitField0_ & ~0x00000008);
      dotsPerInchVertical_ = 0;
      onChanged();
      return this;
    }

    private float systemScale_ ;
    /**
     * <pre>
     * System scale factor for the screen resolution.
     * </pre>
     *
     * <code>optional float system_scale = 5;</code>
     * @return Whether the systemScale field is set.
     */
    public boolean hasSystemScale() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * System scale factor for the screen resolution.
     * </pre>
     *
     * <code>optional float system_scale = 5;</code>
     * @return The systemScale.
     */
    public float getSystemScale() {
      return systemScale_;
    }
    /**
     * <pre>
     * System scale factor for the screen resolution.
     * </pre>
     *
     * <code>optional float system_scale = 5;</code>
     * @param value The systemScale to set.
     * @return This builder for chaining.
     */
    public Builder setSystemScale(float value) {
      bitField0_ |= 0x00000010;
      systemScale_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * System scale factor for the screen resolution.
     * </pre>
     *
     * <code>optional float system_scale = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSystemScale() {
      bitField0_ = (bitField0_ & ~0x00000010);
      systemScale_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:android_studio.DisplayDetails)
  }

  // @@protoc_insertion_point(class_scope:android_studio.DisplayDetails)
  private static final com.google.wireless.android.sdk.stats.DisplayDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.DisplayDetails();
  }

  public static com.google.wireless.android.sdk.stats.DisplayDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DisplayDetails>
      PARSER = new com.google.protobuf.AbstractParser<DisplayDetails>() {
    @java.lang.Override
    public DisplayDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DisplayDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DisplayDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisplayDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.DisplayDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
