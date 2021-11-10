// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.NavDestinationInfo}
 */
public  final class NavDestinationInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.NavDestinationInfo)
    NavDestinationInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NavDestinationInfo.newBuilder() to construct.
  private NavDestinationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NavDestinationInfo() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NavDestinationInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NavDestinationInfo(
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
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.google.wireless.android.sdk.stats.NavDestinationInfo.DestinationType value = com.google.wireless.android.sdk.stats.NavDestinationInfo.DestinationType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              type_ = rawValue;
            }
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            hasClass_ = input.readBool();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            hasLayout_ = input.readBool();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavDestinationInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavDestinationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.NavDestinationInfo.class, com.google.wireless.android.sdk.stats.NavDestinationInfo.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.NavDestinationInfo.DestinationType}
   */
  public enum DestinationType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>FRAGMENT = 1;</code>
     */
    FRAGMENT(1),
    /**
     * <code>ACTIVITY = 2;</code>
     */
    ACTIVITY(2),
    /**
     * <code>OTHER = 3;</code>
     */
    OTHER(3),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>FRAGMENT = 1;</code>
     */
    public static final int FRAGMENT_VALUE = 1;
    /**
     * <code>ACTIVITY = 2;</code>
     */
    public static final int ACTIVITY_VALUE = 2;
    /**
     * <code>OTHER = 3;</code>
     */
    public static final int OTHER_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DestinationType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DestinationType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return FRAGMENT;
        case 2: return ACTIVITY;
        case 3: return OTHER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DestinationType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DestinationType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DestinationType>() {
            public DestinationType findValueByNumber(int number) {
              return DestinationType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.NavDestinationInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final DestinationType[] VALUES = values();

    public static DestinationType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DestinationType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.NavDestinationInfo.DestinationType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * The type of the destination
   * </pre>
   *
   * <code>optional .android_studio.NavDestinationInfo.DestinationType type = 1;</code>
   * @return Whether the type field is set.
   */
  public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The type of the destination
   * </pre>
   *
   * <code>optional .android_studio.NavDestinationInfo.DestinationType type = 1;</code>
   * @return The type.
   */
  public com.google.wireless.android.sdk.stats.NavDestinationInfo.DestinationType getType() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.NavDestinationInfo.DestinationType result = com.google.wireless.android.sdk.stats.NavDestinationInfo.DestinationType.valueOf(type_);
    return result == null ? com.google.wireless.android.sdk.stats.NavDestinationInfo.DestinationType.UNKNOWN : result;
  }

  public static final int HAS_CLASS_FIELD_NUMBER = 2;
  private boolean hasClass_;
  /**
   * <pre>
   * Whether the destination has a class (android:name) specified
   * </pre>
   *
   * <code>optional bool has_class = 2;</code>
   * @return Whether the hasClass field is set.
   */
  public boolean hasHasClass() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Whether the destination has a class (android:name) specified
   * </pre>
   *
   * <code>optional bool has_class = 2;</code>
   * @return The hasClass.
   */
  public boolean getHasClass() {
    return hasClass_;
  }

  public static final int HAS_LAYOUT_FIELD_NUMBER = 3;
  private boolean hasLayout_;
  /**
   * <pre>
   * Whether the destination has a layout (tools:layout) specified
   * </pre>
   *
   * <code>optional bool has_layout = 3;</code>
   * @return Whether the hasLayout field is set.
   */
  public boolean hasHasLayout() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Whether the destination has a layout (tools:layout) specified
   * </pre>
   *
   * <code>optional bool has_layout = 3;</code>
   * @return The hasLayout.
   */
  public boolean getHasLayout() {
    return hasLayout_;
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
      output.writeEnum(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, hasClass_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(3, hasLayout_);
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
        .computeEnumSize(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, hasClass_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, hasLayout_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.NavDestinationInfo)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.NavDestinationInfo other = (com.google.wireless.android.sdk.stats.NavDestinationInfo) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
    }
    if (hasHasClass() != other.hasHasClass()) return false;
    if (hasHasClass()) {
      if (getHasClass()
          != other.getHasClass()) return false;
    }
    if (hasHasLayout() != other.hasHasLayout()) return false;
    if (hasHasLayout()) {
      if (getHasLayout()
          != other.getHasLayout()) return false;
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
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
    }
    if (hasHasClass()) {
      hash = (37 * hash) + HAS_CLASS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHasClass());
    }
    if (hasHasLayout()) {
      hash = (37 * hash) + HAS_LAYOUT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHasLayout());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.NavDestinationInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.NavDestinationInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavDestinationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.NavDestinationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavDestinationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.NavDestinationInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavDestinationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.NavDestinationInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavDestinationInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.NavDestinationInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavDestinationInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.NavDestinationInfo parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.NavDestinationInfo prototype) {
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
   * Protobuf type {@code android_studio.NavDestinationInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.NavDestinationInfo)
      com.google.wireless.android.sdk.stats.NavDestinationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavDestinationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavDestinationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.NavDestinationInfo.class, com.google.wireless.android.sdk.stats.NavDestinationInfo.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.NavDestinationInfo.newBuilder()
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
      type_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      hasClass_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      hasLayout_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavDestinationInfo_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.NavDestinationInfo getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.NavDestinationInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.NavDestinationInfo build() {
      com.google.wireless.android.sdk.stats.NavDestinationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.NavDestinationInfo buildPartial() {
      com.google.wireless.android.sdk.stats.NavDestinationInfo result = new com.google.wireless.android.sdk.stats.NavDestinationInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hasClass_ = hasClass_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.hasLayout_ = hasLayout_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.NavDestinationInfo) {
        return mergeFrom((com.google.wireless.android.sdk.stats.NavDestinationInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.NavDestinationInfo other) {
      if (other == com.google.wireless.android.sdk.stats.NavDestinationInfo.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasHasClass()) {
        setHasClass(other.getHasClass());
      }
      if (other.hasHasLayout()) {
        setHasLayout(other.getHasLayout());
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
      com.google.wireless.android.sdk.stats.NavDestinationInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.NavDestinationInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int type_ = 0;
    /**
     * <pre>
     * The type of the destination
     * </pre>
     *
     * <code>optional .android_studio.NavDestinationInfo.DestinationType type = 1;</code>
     * @return Whether the type field is set.
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The type of the destination
     * </pre>
     *
     * <code>optional .android_studio.NavDestinationInfo.DestinationType type = 1;</code>
     * @return The type.
     */
    public com.google.wireless.android.sdk.stats.NavDestinationInfo.DestinationType getType() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.NavDestinationInfo.DestinationType result = com.google.wireless.android.sdk.stats.NavDestinationInfo.DestinationType.valueOf(type_);
      return result == null ? com.google.wireless.android.sdk.stats.NavDestinationInfo.DestinationType.UNKNOWN : result;
    }
    /**
     * <pre>
     * The type of the destination
     * </pre>
     *
     * <code>optional .android_studio.NavDestinationInfo.DestinationType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.wireless.android.sdk.stats.NavDestinationInfo.DestinationType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the destination
     * </pre>
     *
     * <code>optional .android_studio.NavDestinationInfo.DestinationType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private boolean hasClass_ ;
    /**
     * <pre>
     * Whether the destination has a class (android:name) specified
     * </pre>
     *
     * <code>optional bool has_class = 2;</code>
     * @return Whether the hasClass field is set.
     */
    public boolean hasHasClass() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Whether the destination has a class (android:name) specified
     * </pre>
     *
     * <code>optional bool has_class = 2;</code>
     * @return The hasClass.
     */
    public boolean getHasClass() {
      return hasClass_;
    }
    /**
     * <pre>
     * Whether the destination has a class (android:name) specified
     * </pre>
     *
     * <code>optional bool has_class = 2;</code>
     * @param value The hasClass to set.
     * @return This builder for chaining.
     */
    public Builder setHasClass(boolean value) {
      bitField0_ |= 0x00000002;
      hasClass_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the destination has a class (android:name) specified
     * </pre>
     *
     * <code>optional bool has_class = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasClass() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hasClass_ = false;
      onChanged();
      return this;
    }

    private boolean hasLayout_ ;
    /**
     * <pre>
     * Whether the destination has a layout (tools:layout) specified
     * </pre>
     *
     * <code>optional bool has_layout = 3;</code>
     * @return Whether the hasLayout field is set.
     */
    public boolean hasHasLayout() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Whether the destination has a layout (tools:layout) specified
     * </pre>
     *
     * <code>optional bool has_layout = 3;</code>
     * @return The hasLayout.
     */
    public boolean getHasLayout() {
      return hasLayout_;
    }
    /**
     * <pre>
     * Whether the destination has a layout (tools:layout) specified
     * </pre>
     *
     * <code>optional bool has_layout = 3;</code>
     * @param value The hasLayout to set.
     * @return This builder for chaining.
     */
    public Builder setHasLayout(boolean value) {
      bitField0_ |= 0x00000004;
      hasLayout_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the destination has a layout (tools:layout) specified
     * </pre>
     *
     * <code>optional bool has_layout = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasLayout() {
      bitField0_ = (bitField0_ & ~0x00000004);
      hasLayout_ = false;
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


    // @@protoc_insertion_point(builder_scope:android_studio.NavDestinationInfo)
  }

  // @@protoc_insertion_point(class_scope:android_studio.NavDestinationInfo)
  private static final com.google.wireless.android.sdk.stats.NavDestinationInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.NavDestinationInfo();
  }

  public static com.google.wireless.android.sdk.stats.NavDestinationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<NavDestinationInfo>
      PARSER = new com.google.protobuf.AbstractParser<NavDestinationInfo>() {
    @java.lang.Override
    public NavDestinationInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NavDestinationInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NavDestinationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NavDestinationInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.NavDestinationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
