// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Identifies the effect the search field had on the possible choices presented
 * to the user.
 * </pre>
 *
 * Protobuf enum {@code android_studio.SearchOption}
 */
public enum SearchOption
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_SEARCH_OPTION = 0;</code>
   */
  UNKNOWN_SEARCH_OPTION(0),
  /**
   * <pre>
   * The search field was empty
   * </pre>
   *
   * <code>NONE = 1;</code>
   */
  NONE(1),
  /**
   * <pre>
   * The search field was not empty and it does not specify a unique match
   * </pre>
   *
   * <code>MULTIPLE_MATCHES = 2;</code>
   */
  MULTIPLE_MATCHES(2),
  /**
   * <pre>
   * The search field identified a unique match
   * </pre>
   *
   * <code>SINGLE_MATCH = 3;</code>
   */
  SINGLE_MATCH(3),
  ;

  /**
   * <code>UNKNOWN_SEARCH_OPTION = 0;</code>
   */
  public static final int UNKNOWN_SEARCH_OPTION_VALUE = 0;
  /**
   * <pre>
   * The search field was empty
   * </pre>
   *
   * <code>NONE = 1;</code>
   */
  public static final int NONE_VALUE = 1;
  /**
   * <pre>
   * The search field was not empty and it does not specify a unique match
   * </pre>
   *
   * <code>MULTIPLE_MATCHES = 2;</code>
   */
  public static final int MULTIPLE_MATCHES_VALUE = 2;
  /**
   * <pre>
   * The search field identified a unique match
   * </pre>
   *
   * <code>SINGLE_MATCH = 3;</code>
   */
  public static final int SINGLE_MATCH_VALUE = 3;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SearchOption valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SearchOption forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_SEARCH_OPTION;
      case 1: return NONE;
      case 2: return MULTIPLE_MATCHES;
      case 3: return SINGLE_MATCH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SearchOption>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SearchOption> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SearchOption>() {
          public SearchOption findValueByNumber(int number) {
            return SearchOption.forNumber(number);
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.getDescriptor().getEnumTypes().get(4);
  }

  private static final SearchOption[] VALUES = values();

  public static SearchOption valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SearchOption(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:android_studio.SearchOption)
}
