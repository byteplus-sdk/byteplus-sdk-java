// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_cdn.proto

package com.byteplus.service.vod.model.business;

/**
 * <pre>
 * 源站地址类型
 * </pre>
 *
 * Protobuf enum {@code Byteplus.Vod.Models.Business.VodDomainSourceStationAddressType}
 */
public enum VodDomainSourceStationAddressType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未定义的源站地址类型
   * </pre>
   *
   * <code>UndefinedVodDomainSourceStationAddressType = 0;</code>
   */
  UndefinedVodDomainSourceStationAddressType(0),
  /**
   * <pre>
   * 域名类型
   * </pre>
   *
   * <code>DomainVodDomainSourceStationAddressType = 1;</code>
   */
  DomainVodDomainSourceStationAddressType(1),
  /**
   * <pre>
   * IP类型
   * </pre>
   *
   * <code>IPVodDomainSourceStationAddressType = 2;</code>
   */
  IPVodDomainSourceStationAddressType(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未定义的源站地址类型
   * </pre>
   *
   * <code>UndefinedVodDomainSourceStationAddressType = 0;</code>
   */
  public static final int UndefinedVodDomainSourceStationAddressType_VALUE = 0;
  /**
   * <pre>
   * 域名类型
   * </pre>
   *
   * <code>DomainVodDomainSourceStationAddressType = 1;</code>
   */
  public static final int DomainVodDomainSourceStationAddressType_VALUE = 1;
  /**
   * <pre>
   * IP类型
   * </pre>
   *
   * <code>IPVodDomainSourceStationAddressType = 2;</code>
   */
  public static final int IPVodDomainSourceStationAddressType_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VodDomainSourceStationAddressType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VodDomainSourceStationAddressType forNumber(int value) {
    switch (value) {
      case 0: return UndefinedVodDomainSourceStationAddressType;
      case 1: return DomainVodDomainSourceStationAddressType;
      case 2: return IPVodDomainSourceStationAddressType;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VodDomainSourceStationAddressType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VodDomainSourceStationAddressType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VodDomainSourceStationAddressType>() {
          public VodDomainSourceStationAddressType findValueByNumber(int number) {
            return VodDomainSourceStationAddressType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.byteplus.service.vod.model.business.VodCdn.getDescriptor().getEnumTypes().get(1);
  }

  private static final VodDomainSourceStationAddressType[] VALUES = values();

  public static VodDomainSourceStationAddressType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VodDomainSourceStationAddressType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Byteplus.Vod.Models.Business.VodDomainSourceStationAddressType)
}

