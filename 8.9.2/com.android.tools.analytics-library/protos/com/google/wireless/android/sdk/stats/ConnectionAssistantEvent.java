// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Details for connection assistant event
 * </pre>
 *
 * Protobuf type {@code android_studio.ConnectionAssistantEvent}
 */
public final class ConnectionAssistantEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.ConnectionAssistantEvent)
    ConnectionAssistantEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConnectionAssistantEvent.newBuilder() to construct.
  private ConnectionAssistantEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConnectionAssistantEvent() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConnectionAssistantEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ConnectionAssistantEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ConnectionAssistantEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.class, com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.ConnectionAssistantEvent.ConnectionAssistantEventType}
   */
  public enum ConnectionAssistantEventType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_EVENT_TYPE = 0;</code>
     */
    UNKNOWN_EVENT_TYPE(0),
    /**
     * <pre>
     * Assistant is opened
     * </pre>
     *
     * <code>OPEN = 1;</code>
     */
    OPEN(1),
    /**
     * <pre>
     * Scan USB devices button clicked
     * </pre>
     *
     * <code>SCAN_USB_DEVICES_CLICKED = 2;</code>
     */
    SCAN_USB_DEVICES_CLICKED(2),
    /**
     * <pre>
     * USB devices detected
     * </pre>
     *
     * <code>USB_DEVICES_DETECTED = 3;</code>
     */
    USB_DEVICES_DETECTED(3),
    /**
     * <pre>
     * Restart ADB devices button clicked
     * </pre>
     *
     * <code>RESTART_ADB_CLICKED = 4;</code>
     */
    RESTART_ADB_CLICKED(4),
    /**
     * <pre>
     * ADB devices detected
     * </pre>
     *
     * <code>ADB_DEVICES_DETECTED = 5;</code>
     */
    ADB_DEVICES_DETECTED(5),
    /**
     * <pre>
     * Report issue button clicked, opens report dialog
     * </pre>
     *
     * <code>REPORT_ISSUE_CLICKED = 6;</code>
     */
    REPORT_ISSUE_CLICKED(6),
    /**
     * <pre>
     * Issue reported
     * </pre>
     *
     * <code>ISSUE_REPORTED = 7;</code>
     */
    ISSUE_REPORTED(7),
    ;

    /**
     * <code>UNKNOWN_EVENT_TYPE = 0;</code>
     */
    public static final int UNKNOWN_EVENT_TYPE_VALUE = 0;
    /**
     * <pre>
     * Assistant is opened
     * </pre>
     *
     * <code>OPEN = 1;</code>
     */
    public static final int OPEN_VALUE = 1;
    /**
     * <pre>
     * Scan USB devices button clicked
     * </pre>
     *
     * <code>SCAN_USB_DEVICES_CLICKED = 2;</code>
     */
    public static final int SCAN_USB_DEVICES_CLICKED_VALUE = 2;
    /**
     * <pre>
     * USB devices detected
     * </pre>
     *
     * <code>USB_DEVICES_DETECTED = 3;</code>
     */
    public static final int USB_DEVICES_DETECTED_VALUE = 3;
    /**
     * <pre>
     * Restart ADB devices button clicked
     * </pre>
     *
     * <code>RESTART_ADB_CLICKED = 4;</code>
     */
    public static final int RESTART_ADB_CLICKED_VALUE = 4;
    /**
     * <pre>
     * ADB devices detected
     * </pre>
     *
     * <code>ADB_DEVICES_DETECTED = 5;</code>
     */
    public static final int ADB_DEVICES_DETECTED_VALUE = 5;
    /**
     * <pre>
     * Report issue button clicked, opens report dialog
     * </pre>
     *
     * <code>REPORT_ISSUE_CLICKED = 6;</code>
     */
    public static final int REPORT_ISSUE_CLICKED_VALUE = 6;
    /**
     * <pre>
     * Issue reported
     * </pre>
     *
     * <code>ISSUE_REPORTED = 7;</code>
     */
    public static final int ISSUE_REPORTED_VALUE = 7;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConnectionAssistantEventType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConnectionAssistantEventType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_EVENT_TYPE;
        case 1: return OPEN;
        case 2: return SCAN_USB_DEVICES_CLICKED;
        case 3: return USB_DEVICES_DETECTED;
        case 4: return RESTART_ADB_CLICKED;
        case 5: return ADB_DEVICES_DETECTED;
        case 6: return REPORT_ISSUE_CLICKED;
        case 7: return ISSUE_REPORTED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConnectionAssistantEventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConnectionAssistantEventType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConnectionAssistantEventType>() {
            public ConnectionAssistantEventType findValueByNumber(int number) {
              return ConnectionAssistantEventType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConnectionAssistantEventType[] VALUES = values();

    public static ConnectionAssistantEventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ConnectionAssistantEventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.ConnectionAssistantEvent.ConnectionAssistantEventType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.ConnectionAssistantEvent.ConnectionAssistantEventType type = 1;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.ConnectionAssistantEvent.ConnectionAssistantEventType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.ConnectionAssistantEventType getType() {
    com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.ConnectionAssistantEventType result = com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.ConnectionAssistantEventType.forNumber(type_);
    return result == null ? com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.ConnectionAssistantEventType.UNKNOWN_EVENT_TYPE : result;
  }

  public static final int USB_DEVICES_DETECTED_FIELD_NUMBER = 2;
  private int usbDevicesDetected_ = 0;
  /**
   * <pre>
   * defined if ConnectionAssistantEventType = USB_DEVICES_DETECTED,
   * ADB_DEVICES_DETECTEd
   * </pre>
   *
   * <code>optional int32 usb_devices_detected = 2;</code>
   * @return Whether the usbDevicesDetected field is set.
   */
  @java.lang.Override
  public boolean hasUsbDevicesDetected() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * defined if ConnectionAssistantEventType = USB_DEVICES_DETECTED,
   * ADB_DEVICES_DETECTEd
   * </pre>
   *
   * <code>optional int32 usb_devices_detected = 2;</code>
   * @return The usbDevicesDetected.
   */
  @java.lang.Override
  public int getUsbDevicesDetected() {
    return usbDevicesDetected_;
  }

  public static final int ADB_DEVICES_DETECTED_FIELD_NUMBER = 3;
  private int adbDevicesDetected_ = 0;
  /**
   * <pre>
   * defined if ConnectionAssistantEventType = USB_DEVICES_DETECTED,
   * ADB_DEVICES_DETECTEd
   * </pre>
   *
   * <code>optional int32 adb_devices_detected = 3;</code>
   * @return Whether the adbDevicesDetected field is set.
   */
  @java.lang.Override
  public boolean hasAdbDevicesDetected() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * defined if ConnectionAssistantEventType = USB_DEVICES_DETECTED,
   * ADB_DEVICES_DETECTEd
   * </pre>
   *
   * <code>optional int32 adb_devices_detected = 3;</code>
   * @return The adbDevicesDetected.
   */
  @java.lang.Override
  public int getAdbDevicesDetected() {
    return adbDevicesDetected_;
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
      output.writeInt32(2, usbDevicesDetected_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, adbDevicesDetected_);
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
        .computeEnumSize(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, usbDevicesDetected_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, adbDevicesDetected_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.ConnectionAssistantEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.ConnectionAssistantEvent other = (com.google.wireless.android.sdk.stats.ConnectionAssistantEvent) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
    }
    if (hasUsbDevicesDetected() != other.hasUsbDevicesDetected()) return false;
    if (hasUsbDevicesDetected()) {
      if (getUsbDevicesDetected()
          != other.getUsbDevicesDetected()) return false;
    }
    if (hasAdbDevicesDetected() != other.hasAdbDevicesDetected()) return false;
    if (hasAdbDevicesDetected()) {
      if (getAdbDevicesDetected()
          != other.getAdbDevicesDetected()) return false;
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
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
    }
    if (hasUsbDevicesDetected()) {
      hash = (37 * hash) + USB_DEVICES_DETECTED_FIELD_NUMBER;
      hash = (53 * hash) + getUsbDevicesDetected();
    }
    if (hasAdbDevicesDetected()) {
      hash = (37 * hash) + ADB_DEVICES_DETECTED_FIELD_NUMBER;
      hash = (53 * hash) + getAdbDevicesDetected();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.ConnectionAssistantEvent prototype) {
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
   * Details for connection assistant event
   * </pre>
   *
   * Protobuf type {@code android_studio.ConnectionAssistantEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.ConnectionAssistantEvent)
      com.google.wireless.android.sdk.stats.ConnectionAssistantEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ConnectionAssistantEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ConnectionAssistantEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.class, com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.newBuilder()
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
      type_ = 0;
      usbDevicesDetected_ = 0;
      adbDevicesDetected_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ConnectionAssistantEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ConnectionAssistantEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ConnectionAssistantEvent build() {
      com.google.wireless.android.sdk.stats.ConnectionAssistantEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ConnectionAssistantEvent buildPartial() {
      com.google.wireless.android.sdk.stats.ConnectionAssistantEvent result = new com.google.wireless.android.sdk.stats.ConnectionAssistantEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.ConnectionAssistantEvent result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.usbDevicesDetected_ = usbDevicesDetected_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.adbDevicesDetected_ = adbDevicesDetected_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.ConnectionAssistantEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.ConnectionAssistantEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.ConnectionAssistantEvent other) {
      if (other == com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasUsbDevicesDetected()) {
        setUsbDevicesDetected(other.getUsbDevicesDetected());
      }
      if (other.hasAdbDevicesDetected()) {
        setAdbDevicesDetected(other.getAdbDevicesDetected());
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
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.ConnectionAssistantEventType tmpValue =
                  com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.ConnectionAssistantEventType.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                type_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              usbDevicesDetected_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              adbDevicesDetected_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int type_ = 0;
    /**
     * <pre>
     * Type of event
     * </pre>
     *
     * <code>optional .android_studio.ConnectionAssistantEvent.ConnectionAssistantEventType type = 1;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Type of event
     * </pre>
     *
     * <code>optional .android_studio.ConnectionAssistantEvent.ConnectionAssistantEventType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.ConnectionAssistantEventType getType() {
      com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.ConnectionAssistantEventType result = com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.ConnectionAssistantEventType.forNumber(type_);
      return result == null ? com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.ConnectionAssistantEventType.UNKNOWN_EVENT_TYPE : result;
    }
    /**
     * <pre>
     * Type of event
     * </pre>
     *
     * <code>optional .android_studio.ConnectionAssistantEvent.ConnectionAssistantEventType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.wireless.android.sdk.stats.ConnectionAssistantEvent.ConnectionAssistantEventType value) {
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
     * Type of event
     * </pre>
     *
     * <code>optional .android_studio.ConnectionAssistantEvent.ConnectionAssistantEventType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private int usbDevicesDetected_ ;
    /**
     * <pre>
     * defined if ConnectionAssistantEventType = USB_DEVICES_DETECTED,
     * ADB_DEVICES_DETECTEd
     * </pre>
     *
     * <code>optional int32 usb_devices_detected = 2;</code>
     * @return Whether the usbDevicesDetected field is set.
     */
    @java.lang.Override
    public boolean hasUsbDevicesDetected() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * defined if ConnectionAssistantEventType = USB_DEVICES_DETECTED,
     * ADB_DEVICES_DETECTEd
     * </pre>
     *
     * <code>optional int32 usb_devices_detected = 2;</code>
     * @return The usbDevicesDetected.
     */
    @java.lang.Override
    public int getUsbDevicesDetected() {
      return usbDevicesDetected_;
    }
    /**
     * <pre>
     * defined if ConnectionAssistantEventType = USB_DEVICES_DETECTED,
     * ADB_DEVICES_DETECTEd
     * </pre>
     *
     * <code>optional int32 usb_devices_detected = 2;</code>
     * @param value The usbDevicesDetected to set.
     * @return This builder for chaining.
     */
    public Builder setUsbDevicesDetected(int value) {

      usbDevicesDetected_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * defined if ConnectionAssistantEventType = USB_DEVICES_DETECTED,
     * ADB_DEVICES_DETECTEd
     * </pre>
     *
     * <code>optional int32 usb_devices_detected = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsbDevicesDetected() {
      bitField0_ = (bitField0_ & ~0x00000002);
      usbDevicesDetected_ = 0;
      onChanged();
      return this;
    }

    private int adbDevicesDetected_ ;
    /**
     * <pre>
     * defined if ConnectionAssistantEventType = USB_DEVICES_DETECTED,
     * ADB_DEVICES_DETECTEd
     * </pre>
     *
     * <code>optional int32 adb_devices_detected = 3;</code>
     * @return Whether the adbDevicesDetected field is set.
     */
    @java.lang.Override
    public boolean hasAdbDevicesDetected() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * defined if ConnectionAssistantEventType = USB_DEVICES_DETECTED,
     * ADB_DEVICES_DETECTEd
     * </pre>
     *
     * <code>optional int32 adb_devices_detected = 3;</code>
     * @return The adbDevicesDetected.
     */
    @java.lang.Override
    public int getAdbDevicesDetected() {
      return adbDevicesDetected_;
    }
    /**
     * <pre>
     * defined if ConnectionAssistantEventType = USB_DEVICES_DETECTED,
     * ADB_DEVICES_DETECTEd
     * </pre>
     *
     * <code>optional int32 adb_devices_detected = 3;</code>
     * @param value The adbDevicesDetected to set.
     * @return This builder for chaining.
     */
    public Builder setAdbDevicesDetected(int value) {

      adbDevicesDetected_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * defined if ConnectionAssistantEventType = USB_DEVICES_DETECTED,
     * ADB_DEVICES_DETECTEd
     * </pre>
     *
     * <code>optional int32 adb_devices_detected = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdbDevicesDetected() {
      bitField0_ = (bitField0_ & ~0x00000004);
      adbDevicesDetected_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.ConnectionAssistantEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.ConnectionAssistantEvent)
  private static final com.google.wireless.android.sdk.stats.ConnectionAssistantEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.ConnectionAssistantEvent();
  }

  public static com.google.wireless.android.sdk.stats.ConnectionAssistantEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ConnectionAssistantEvent>
      PARSER = new com.google.protobuf.AbstractParser<ConnectionAssistantEvent>() {
    @java.lang.Override
    public ConnectionAssistantEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConnectionAssistantEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectionAssistantEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.ConnectionAssistantEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

