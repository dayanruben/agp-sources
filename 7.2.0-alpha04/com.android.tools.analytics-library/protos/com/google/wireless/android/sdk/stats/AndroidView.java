// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Reference to a View used in an Android application.
 * Although this proto contains just a single field, we may decide
 * to represent a view with an enum in the future.
 * </pre>
 *
 * Protobuf type {@code android_studio.AndroidView}
 */
public  final class AndroidView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.AndroidView)
    AndroidViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AndroidView.newBuilder() to construct.
  private AndroidView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AndroidView() {
    tagName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AndroidView();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AndroidView(
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
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            tagName_ = bs;
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AndroidView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AndroidView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.AndroidView.class, com.google.wireless.android.sdk.stats.AndroidView.Builder.class);
  }

  private int bitField0_;
  public static final int TAG_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object tagName_;
  /**
   * <pre>
   * Specifies the tag name used in XML for a given Android View class.
   * This will typically be a fully qualified class name or an unqualified
   * Android framework class name.
   * Only Google view tags will be specified by name. The name of custom view
   * tags will be left unspecified.
   * Examples:
   *   "ToggleButton"
   *   "android.support.design.widget.CoordinatorLayout"
   * </pre>
   *
   * <code>optional string tag_name = 1;</code>
   * @return Whether the tagName field is set.
   */
  public boolean hasTagName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Specifies the tag name used in XML for a given Android View class.
   * This will typically be a fully qualified class name or an unqualified
   * Android framework class name.
   * Only Google view tags will be specified by name. The name of custom view
   * tags will be left unspecified.
   * Examples:
   *   "ToggleButton"
   *   "android.support.design.widget.CoordinatorLayout"
   * </pre>
   *
   * <code>optional string tag_name = 1;</code>
   * @return The tagName.
   */
  public java.lang.String getTagName() {
    java.lang.Object ref = tagName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        tagName_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Specifies the tag name used in XML for a given Android View class.
   * This will typically be a fully qualified class name or an unqualified
   * Android framework class name.
   * Only Google view tags will be specified by name. The name of custom view
   * tags will be left unspecified.
   * Examples:
   *   "ToggleButton"
   *   "android.support.design.widget.CoordinatorLayout"
   * </pre>
   *
   * <code>optional string tag_name = 1;</code>
   * @return The bytes for tagName.
   */
  public com.google.protobuf.ByteString
      getTagNameBytes() {
    java.lang.Object ref = tagName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tagName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tagName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tagName_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.AndroidView)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.AndroidView other = (com.google.wireless.android.sdk.stats.AndroidView) obj;

    if (hasTagName() != other.hasTagName()) return false;
    if (hasTagName()) {
      if (!getTagName()
          .equals(other.getTagName())) return false;
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
    if (hasTagName()) {
      hash = (37 * hash) + TAG_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTagName().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.AndroidView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AndroidView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AndroidView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AndroidView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AndroidView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AndroidView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AndroidView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AndroidView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AndroidView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AndroidView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AndroidView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AndroidView parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.AndroidView prototype) {
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
   * Reference to a View used in an Android application.
   * Although this proto contains just a single field, we may decide
   * to represent a view with an enum in the future.
   * </pre>
   *
   * Protobuf type {@code android_studio.AndroidView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.AndroidView)
      com.google.wireless.android.sdk.stats.AndroidViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AndroidView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AndroidView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.AndroidView.class, com.google.wireless.android.sdk.stats.AndroidView.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.AndroidView.newBuilder()
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
      tagName_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AndroidView_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AndroidView getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.AndroidView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AndroidView build() {
      com.google.wireless.android.sdk.stats.AndroidView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AndroidView buildPartial() {
      com.google.wireless.android.sdk.stats.AndroidView result = new com.google.wireless.android.sdk.stats.AndroidView(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.tagName_ = tagName_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.AndroidView) {
        return mergeFrom((com.google.wireless.android.sdk.stats.AndroidView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.AndroidView other) {
      if (other == com.google.wireless.android.sdk.stats.AndroidView.getDefaultInstance()) return this;
      if (other.hasTagName()) {
        bitField0_ |= 0x00000001;
        tagName_ = other.tagName_;
        onChanged();
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
      com.google.wireless.android.sdk.stats.AndroidView parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.AndroidView) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object tagName_ = "";
    /**
     * <pre>
     * Specifies the tag name used in XML for a given Android View class.
     * This will typically be a fully qualified class name or an unqualified
     * Android framework class name.
     * Only Google view tags will be specified by name. The name of custom view
     * tags will be left unspecified.
     * Examples:
     *   "ToggleButton"
     *   "android.support.design.widget.CoordinatorLayout"
     * </pre>
     *
     * <code>optional string tag_name = 1;</code>
     * @return Whether the tagName field is set.
     */
    public boolean hasTagName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Specifies the tag name used in XML for a given Android View class.
     * This will typically be a fully qualified class name or an unqualified
     * Android framework class name.
     * Only Google view tags will be specified by name. The name of custom view
     * tags will be left unspecified.
     * Examples:
     *   "ToggleButton"
     *   "android.support.design.widget.CoordinatorLayout"
     * </pre>
     *
     * <code>optional string tag_name = 1;</code>
     * @return The tagName.
     */
    public java.lang.String getTagName() {
      java.lang.Object ref = tagName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tagName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies the tag name used in XML for a given Android View class.
     * This will typically be a fully qualified class name or an unqualified
     * Android framework class name.
     * Only Google view tags will be specified by name. The name of custom view
     * tags will be left unspecified.
     * Examples:
     *   "ToggleButton"
     *   "android.support.design.widget.CoordinatorLayout"
     * </pre>
     *
     * <code>optional string tag_name = 1;</code>
     * @return The bytes for tagName.
     */
    public com.google.protobuf.ByteString
        getTagNameBytes() {
      java.lang.Object ref = tagName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tagName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies the tag name used in XML for a given Android View class.
     * This will typically be a fully qualified class name or an unqualified
     * Android framework class name.
     * Only Google view tags will be specified by name. The name of custom view
     * tags will be left unspecified.
     * Examples:
     *   "ToggleButton"
     *   "android.support.design.widget.CoordinatorLayout"
     * </pre>
     *
     * <code>optional string tag_name = 1;</code>
     * @param value The tagName to set.
     * @return This builder for chaining.
     */
    public Builder setTagName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      tagName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the tag name used in XML for a given Android View class.
     * This will typically be a fully qualified class name or an unqualified
     * Android framework class name.
     * Only Google view tags will be specified by name. The name of custom view
     * tags will be left unspecified.
     * Examples:
     *   "ToggleButton"
     *   "android.support.design.widget.CoordinatorLayout"
     * </pre>
     *
     * <code>optional string tag_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTagName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tagName_ = getDefaultInstance().getTagName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the tag name used in XML for a given Android View class.
     * This will typically be a fully qualified class name or an unqualified
     * Android framework class name.
     * Only Google view tags will be specified by name. The name of custom view
     * tags will be left unspecified.
     * Examples:
     *   "ToggleButton"
     *   "android.support.design.widget.CoordinatorLayout"
     * </pre>
     *
     * <code>optional string tag_name = 1;</code>
     * @param value The bytes for tagName to set.
     * @return This builder for chaining.
     */
    public Builder setTagNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      tagName_ = value;
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


    // @@protoc_insertion_point(builder_scope:android_studio.AndroidView)
  }

  // @@protoc_insertion_point(class_scope:android_studio.AndroidView)
  private static final com.google.wireless.android.sdk.stats.AndroidView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.AndroidView();
  }

  public static com.google.wireless.android.sdk.stats.AndroidView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AndroidView>
      PARSER = new com.google.protobuf.AbstractParser<AndroidView>() {
    @java.lang.Override
    public AndroidView parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AndroidView(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AndroidView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AndroidView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.AndroidView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
