// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_cdn.proto

package com.byteplus.service.vod.model.business;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Business.CdnStatusDataItem}
 */
public final class CdnStatusDataItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.CdnStatusDataItem)
    CdnStatusDataItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CdnStatusDataItem.newBuilder() to construct.
  private CdnStatusDataItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CdnStatusDataItem() {
    area_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CdnStatusDataItem();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CdnStatusDataItem(
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

            time_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            area_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              statusDetail_ = com.google.protobuf.MapField.newMapField(
                  StatusDetailDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData>
            statusDetail__ = input.readMessage(
                StatusDetailDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            statusDetail_.getMutableMap().put(
                statusDetail__.getKey(), statusDetail__.getValue());
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
    return com.byteplus.service.vod.model.business.VodCdn.internal_static_Byteplus_Vod_Models_Business_CdnStatusDataItem_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetStatusDetail();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodCdn.internal_static_Byteplus_Vod_Models_Business_CdnStatusDataItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.business.CdnStatusDataItem.class, com.byteplus.service.vod.model.business.CdnStatusDataItem.Builder.class);
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private long time_;
  /**
   * <pre>
   * 时间戳
   * </pre>
   *
   * <code>int64 Time = 1;</code>
   * @return The time.
   */
  @java.lang.Override
  public long getTime() {
    return time_;
  }

  public static final int AREA_FIELD_NUMBER = 2;
  private volatile java.lang.Object area_;
  /**
   * <pre>
   * 国家/地区
   * </pre>
   *
   * <code>string Area = 2;</code>
   * @return The area.
   */
  @java.lang.Override
  public java.lang.String getArea() {
    java.lang.Object ref = area_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      area_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 国家/地区
   * </pre>
   *
   * <code>string Area = 2;</code>
   * @return The bytes for area.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAreaBytes() {
    java.lang.Object ref = area_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      area_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUSDETAIL_FIELD_NUMBER = 3;
  private static final class StatusDetailDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData>newDefaultInstance(
                com.byteplus.service.vod.model.business.VodCdn.internal_static_Byteplus_Vod_Models_Business_CdnStatusDataItem_StatusDetailEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.byteplus.service.vod.model.business.CdnStatusData.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> statusDetail_;
  private com.google.protobuf.MapField<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData>
  internalGetStatusDetail() {
    if (statusDetail_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          StatusDetailDefaultEntryHolder.defaultEntry);
    }
    return statusDetail_;
  }

  public int getStatusDetailCount() {
    return internalGetStatusDetail().getMap().size();
  }
  /**
   * <pre>
   * 各个状态码的请求数
   * </pre>
   *
   * <code>map&lt;string, .Byteplus.Vod.Models.Business.CdnStatusData&gt; StatusDetail = 3;</code>
   */

  @java.lang.Override
  public boolean containsStatusDetail(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetStatusDetail().getMap().containsKey(key);
  }
  /**
   * Use {@link #getStatusDetailMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> getStatusDetail() {
    return getStatusDetailMap();
  }
  /**
   * <pre>
   * 各个状态码的请求数
   * </pre>
   *
   * <code>map&lt;string, .Byteplus.Vod.Models.Business.CdnStatusData&gt; StatusDetail = 3;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> getStatusDetailMap() {
    return internalGetStatusDetail().getMap();
  }
  /**
   * <pre>
   * 各个状态码的请求数
   * </pre>
   *
   * <code>map&lt;string, .Byteplus.Vod.Models.Business.CdnStatusData&gt; StatusDetail = 3;</code>
   */
  @java.lang.Override

  public com.byteplus.service.vod.model.business.CdnStatusData getStatusDetailOrDefault(
      java.lang.String key,
      com.byteplus.service.vod.model.business.CdnStatusData defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> map =
        internalGetStatusDetail().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * 各个状态码的请求数
   * </pre>
   *
   * <code>map&lt;string, .Byteplus.Vod.Models.Business.CdnStatusData&gt; StatusDetail = 3;</code>
   */
  @java.lang.Override

  public com.byteplus.service.vod.model.business.CdnStatusData getStatusDetailOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> map =
        internalGetStatusDetail().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (time_ != 0L) {
      output.writeInt64(1, time_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(area_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, area_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetStatusDetail(),
        StatusDetailDefaultEntryHolder.defaultEntry,
        3);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (time_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, time_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(area_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, area_);
    }
    for (java.util.Map.Entry<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> entry
         : internalGetStatusDetail().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData>
      statusDetail__ = StatusDetailDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, statusDetail__);
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.CdnStatusDataItem)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.CdnStatusDataItem other = (com.byteplus.service.vod.model.business.CdnStatusDataItem) obj;

    if (getTime()
        != other.getTime()) return false;
    if (!getArea()
        .equals(other.getArea())) return false;
    if (!internalGetStatusDetail().equals(
        other.internalGetStatusDetail())) return false;
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
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTime());
    hash = (37 * hash) + AREA_FIELD_NUMBER;
    hash = (53 * hash) + getArea().hashCode();
    if (!internalGetStatusDetail().getMap().isEmpty()) {
      hash = (37 * hash) + STATUSDETAIL_FIELD_NUMBER;
      hash = (53 * hash) + internalGetStatusDetail().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.CdnStatusDataItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.CdnStatusDataItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.CdnStatusDataItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.CdnStatusDataItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.CdnStatusDataItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.CdnStatusDataItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.CdnStatusDataItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.CdnStatusDataItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.CdnStatusDataItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.CdnStatusDataItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.CdnStatusDataItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.CdnStatusDataItem parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.business.CdnStatusDataItem prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Business.CdnStatusDataItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.CdnStatusDataItem)
      com.byteplus.service.vod.model.business.CdnStatusDataItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.business.VodCdn.internal_static_Byteplus_Vod_Models_Business_CdnStatusDataItem_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetStatusDetail();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableStatusDetail();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodCdn.internal_static_Byteplus_Vod_Models_Business_CdnStatusDataItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.business.CdnStatusDataItem.class, com.byteplus.service.vod.model.business.CdnStatusDataItem.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.CdnStatusDataItem.newBuilder()
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
      time_ = 0L;

      area_ = "";

      internalGetMutableStatusDetail().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodCdn.internal_static_Byteplus_Vod_Models_Business_CdnStatusDataItem_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.CdnStatusDataItem getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.CdnStatusDataItem.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.CdnStatusDataItem build() {
      com.byteplus.service.vod.model.business.CdnStatusDataItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.CdnStatusDataItem buildPartial() {
      com.byteplus.service.vod.model.business.CdnStatusDataItem result = new com.byteplus.service.vod.model.business.CdnStatusDataItem(this);
      int from_bitField0_ = bitField0_;
      result.time_ = time_;
      result.area_ = area_;
      result.statusDetail_ = internalGetStatusDetail();
      result.statusDetail_.makeImmutable();
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
      if (other instanceof com.byteplus.service.vod.model.business.CdnStatusDataItem) {
        return mergeFrom((com.byteplus.service.vod.model.business.CdnStatusDataItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.CdnStatusDataItem other) {
      if (other == com.byteplus.service.vod.model.business.CdnStatusDataItem.getDefaultInstance()) return this;
      if (other.getTime() != 0L) {
        setTime(other.getTime());
      }
      if (!other.getArea().isEmpty()) {
        area_ = other.area_;
        onChanged();
      }
      internalGetMutableStatusDetail().mergeFrom(
          other.internalGetStatusDetail());
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
      com.byteplus.service.vod.model.business.CdnStatusDataItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.CdnStatusDataItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long time_ ;
    /**
     * <pre>
     * 时间戳
     * </pre>
     *
     * <code>int64 Time = 1;</code>
     * @return The time.
     */
    @java.lang.Override
    public long getTime() {
      return time_;
    }
    /**
     * <pre>
     * 时间戳
     * </pre>
     *
     * <code>int64 Time = 1;</code>
     * @param value The time to set.
     * @return This builder for chaining.
     */
    public Builder setTime(long value) {
      
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 时间戳
     * </pre>
     *
     * <code>int64 Time = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTime() {
      
      time_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object area_ = "";
    /**
     * <pre>
     * 国家/地区
     * </pre>
     *
     * <code>string Area = 2;</code>
     * @return The area.
     */
    public java.lang.String getArea() {
      java.lang.Object ref = area_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        area_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 国家/地区
     * </pre>
     *
     * <code>string Area = 2;</code>
     * @return The bytes for area.
     */
    public com.google.protobuf.ByteString
        getAreaBytes() {
      java.lang.Object ref = area_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        area_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 国家/地区
     * </pre>
     *
     * <code>string Area = 2;</code>
     * @param value The area to set.
     * @return This builder for chaining.
     */
    public Builder setArea(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      area_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 国家/地区
     * </pre>
     *
     * <code>string Area = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearArea() {
      
      area_ = getDefaultInstance().getArea();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 国家/地区
     * </pre>
     *
     * <code>string Area = 2;</code>
     * @param value The bytes for area to set.
     * @return This builder for chaining.
     */
    public Builder setAreaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      area_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> statusDetail_;
    private com.google.protobuf.MapField<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData>
    internalGetStatusDetail() {
      if (statusDetail_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            StatusDetailDefaultEntryHolder.defaultEntry);
      }
      return statusDetail_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData>
    internalGetMutableStatusDetail() {
      onChanged();;
      if (statusDetail_ == null) {
        statusDetail_ = com.google.protobuf.MapField.newMapField(
            StatusDetailDefaultEntryHolder.defaultEntry);
      }
      if (!statusDetail_.isMutable()) {
        statusDetail_ = statusDetail_.copy();
      }
      return statusDetail_;
    }

    public int getStatusDetailCount() {
      return internalGetStatusDetail().getMap().size();
    }
    /**
     * <pre>
     * 各个状态码的请求数
     * </pre>
     *
     * <code>map&lt;string, .Byteplus.Vod.Models.Business.CdnStatusData&gt; StatusDetail = 3;</code>
     */

    @java.lang.Override
    public boolean containsStatusDetail(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetStatusDetail().getMap().containsKey(key);
    }
    /**
     * Use {@link #getStatusDetailMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> getStatusDetail() {
      return getStatusDetailMap();
    }
    /**
     * <pre>
     * 各个状态码的请求数
     * </pre>
     *
     * <code>map&lt;string, .Byteplus.Vod.Models.Business.CdnStatusData&gt; StatusDetail = 3;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> getStatusDetailMap() {
      return internalGetStatusDetail().getMap();
    }
    /**
     * <pre>
     * 各个状态码的请求数
     * </pre>
     *
     * <code>map&lt;string, .Byteplus.Vod.Models.Business.CdnStatusData&gt; StatusDetail = 3;</code>
     */
    @java.lang.Override

    public com.byteplus.service.vod.model.business.CdnStatusData getStatusDetailOrDefault(
        java.lang.String key,
        com.byteplus.service.vod.model.business.CdnStatusData defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> map =
          internalGetStatusDetail().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * 各个状态码的请求数
     * </pre>
     *
     * <code>map&lt;string, .Byteplus.Vod.Models.Business.CdnStatusData&gt; StatusDetail = 3;</code>
     */
    @java.lang.Override

    public com.byteplus.service.vod.model.business.CdnStatusData getStatusDetailOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> map =
          internalGetStatusDetail().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearStatusDetail() {
      internalGetMutableStatusDetail().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * 各个状态码的请求数
     * </pre>
     *
     * <code>map&lt;string, .Byteplus.Vod.Models.Business.CdnStatusData&gt; StatusDetail = 3;</code>
     */

    public Builder removeStatusDetail(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableStatusDetail().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData>
    getMutableStatusDetail() {
      return internalGetMutableStatusDetail().getMutableMap();
    }
    /**
     * <pre>
     * 各个状态码的请求数
     * </pre>
     *
     * <code>map&lt;string, .Byteplus.Vod.Models.Business.CdnStatusData&gt; StatusDetail = 3;</code>
     */
    public Builder putStatusDetail(
        java.lang.String key,
        com.byteplus.service.vod.model.business.CdnStatusData value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableStatusDetail().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * 各个状态码的请求数
     * </pre>
     *
     * <code>map&lt;string, .Byteplus.Vod.Models.Business.CdnStatusData&gt; StatusDetail = 3;</code>
     */

    public Builder putAllStatusDetail(
        java.util.Map<java.lang.String, com.byteplus.service.vod.model.business.CdnStatusData> values) {
      internalGetMutableStatusDetail().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.CdnStatusDataItem)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.CdnStatusDataItem)
  private static final com.byteplus.service.vod.model.business.CdnStatusDataItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.CdnStatusDataItem();
  }

  public static com.byteplus.service.vod.model.business.CdnStatusDataItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CdnStatusDataItem>
      PARSER = new com.google.protobuf.AbstractParser<CdnStatusDataItem>() {
    @java.lang.Override
    public CdnStatusDataItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CdnStatusDataItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CdnStatusDataItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CdnStatusDataItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.CdnStatusDataItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

