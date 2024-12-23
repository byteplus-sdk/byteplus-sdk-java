// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_measure.proto

package com.byteplus.service.vod.model.business;

/**
 * <pre>
 * 点播画质增强用量
 * </pre>
 *
 * Protobuf type {@code Byteplus.Vod.Models.Business.DescribeVodEnhanceImageDataItem}
 */
public final class DescribeVodEnhanceImageDataItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.DescribeVodEnhanceImageDataItem)
    DescribeVodEnhanceImageDataItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DescribeVodEnhanceImageDataItem.newBuilder() to construct.
  private DescribeVodEnhanceImageDataItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DescribeVodEnhanceImageDataItem() {
    time_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DescribeVodEnhanceImageDataItem();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DescribeVodEnhanceImageDataItem(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            time_ = s;
            break;
          }
          case 16: {

            sR_ = input.readInt64();
            break;
          }
          case 24: {

            vFI_ = input.readInt64();
            break;
          }
          case 32: {

            sDREnhance_ = input.readInt64();
            break;
          }
          case 40: {

            sDR2HDR_ = input.readInt64();
            break;
          }
          case 48: {

            audioDenose_ = input.readInt64();
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
    return com.byteplus.service.vod.model.business.VodMeasure.internal_static_Byteplus_Vod_Models_Business_DescribeVodEnhanceImageDataItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodMeasure.internal_static_Byteplus_Vod_Models_Business_DescribeVodEnhanceImageDataItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem.class, com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem.Builder.class);
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private volatile java.lang.Object time_;
  /**
   * <code>string Time = 1;</code>
   * @return The time.
   */
  @java.lang.Override
  public java.lang.String getTime() {
    java.lang.Object ref = time_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      time_ = s;
      return s;
    }
  }
  /**
   * <code>string Time = 1;</code>
   * @return The bytes for time.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTimeBytes() {
    java.lang.Object ref = time_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      time_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SR_FIELD_NUMBER = 2;
  private long sR_;
  /**
   * <code>int64 SR = 2;</code>
   * @return The sR.
   */
  @java.lang.Override
  public long getSR() {
    return sR_;
  }

  public static final int VFI_FIELD_NUMBER = 3;
  private long vFI_;
  /**
   * <code>int64 VFI = 3;</code>
   * @return The vFI.
   */
  @java.lang.Override
  public long getVFI() {
    return vFI_;
  }

  public static final int SDRENHANCE_FIELD_NUMBER = 4;
  private long sDREnhance_;
  /**
   * <code>int64 SDREnhance = 4;</code>
   * @return The sDREnhance.
   */
  @java.lang.Override
  public long getSDREnhance() {
    return sDREnhance_;
  }

  public static final int SDR2HDR_FIELD_NUMBER = 5;
  private long sDR2HDR_;
  /**
   * <code>int64 SDR2HDR = 5;</code>
   * @return The sDR2HDR.
   */
  @java.lang.Override
  public long getSDR2HDR() {
    return sDR2HDR_;
  }

  public static final int AUDIODENOSE_FIELD_NUMBER = 6;
  private long audioDenose_;
  /**
   * <code>int64 AudioDenose = 6;</code>
   * @return The audioDenose.
   */
  @java.lang.Override
  public long getAudioDenose() {
    return audioDenose_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(time_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, time_);
    }
    if (sR_ != 0L) {
      output.writeInt64(2, sR_);
    }
    if (vFI_ != 0L) {
      output.writeInt64(3, vFI_);
    }
    if (sDREnhance_ != 0L) {
      output.writeInt64(4, sDREnhance_);
    }
    if (sDR2HDR_ != 0L) {
      output.writeInt64(5, sDR2HDR_);
    }
    if (audioDenose_ != 0L) {
      output.writeInt64(6, audioDenose_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(time_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, time_);
    }
    if (sR_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, sR_);
    }
    if (vFI_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, vFI_);
    }
    if (sDREnhance_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, sDREnhance_);
    }
    if (sDR2HDR_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, sDR2HDR_);
    }
    if (audioDenose_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, audioDenose_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem other = (com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem) obj;

    if (!getTime()
        .equals(other.getTime())) return false;
    if (getSR()
        != other.getSR()) return false;
    if (getVFI()
        != other.getVFI()) return false;
    if (getSDREnhance()
        != other.getSDREnhance()) return false;
    if (getSDR2HDR()
        != other.getSDR2HDR()) return false;
    if (getAudioDenose()
        != other.getAudioDenose()) return false;
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
    hash = (53 * hash) + getTime().hashCode();
    hash = (37 * hash) + SR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSR());
    hash = (37 * hash) + VFI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVFI());
    hash = (37 * hash) + SDRENHANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSDREnhance());
    hash = (37 * hash) + SDR2HDR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSDR2HDR());
    hash = (37 * hash) + AUDIODENOSE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAudioDenose());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem prototype) {
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
   * 点播画质增强用量
   * </pre>
   *
   * Protobuf type {@code Byteplus.Vod.Models.Business.DescribeVodEnhanceImageDataItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.DescribeVodEnhanceImageDataItem)
      com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.business.VodMeasure.internal_static_Byteplus_Vod_Models_Business_DescribeVodEnhanceImageDataItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodMeasure.internal_static_Byteplus_Vod_Models_Business_DescribeVodEnhanceImageDataItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem.class, com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem.newBuilder()
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
      time_ = "";

      sR_ = 0L;

      vFI_ = 0L;

      sDREnhance_ = 0L;

      sDR2HDR_ = 0L;

      audioDenose_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodMeasure.internal_static_Byteplus_Vod_Models_Business_DescribeVodEnhanceImageDataItem_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem build() {
      com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem buildPartial() {
      com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem result = new com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem(this);
      result.time_ = time_;
      result.sR_ = sR_;
      result.vFI_ = vFI_;
      result.sDREnhance_ = sDREnhance_;
      result.sDR2HDR_ = sDR2HDR_;
      result.audioDenose_ = audioDenose_;
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
      if (other instanceof com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem) {
        return mergeFrom((com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem other) {
      if (other == com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem.getDefaultInstance()) return this;
      if (!other.getTime().isEmpty()) {
        time_ = other.time_;
        onChanged();
      }
      if (other.getSR() != 0L) {
        setSR(other.getSR());
      }
      if (other.getVFI() != 0L) {
        setVFI(other.getVFI());
      }
      if (other.getSDREnhance() != 0L) {
        setSDREnhance(other.getSDREnhance());
      }
      if (other.getSDR2HDR() != 0L) {
        setSDR2HDR(other.getSDR2HDR());
      }
      if (other.getAudioDenose() != 0L) {
        setAudioDenose(other.getAudioDenose());
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
      com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object time_ = "";
    /**
     * <code>string Time = 1;</code>
     * @return The time.
     */
    public java.lang.String getTime() {
      java.lang.Object ref = time_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        time_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Time = 1;</code>
     * @return The bytes for time.
     */
    public com.google.protobuf.ByteString
        getTimeBytes() {
      java.lang.Object ref = time_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        time_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Time = 1;</code>
     * @param value The time to set.
     * @return This builder for chaining.
     */
    public Builder setTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Time = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTime() {
      
      time_ = getDefaultInstance().getTime();
      onChanged();
      return this;
    }
    /**
     * <code>string Time = 1;</code>
     * @param value The bytes for time to set.
     * @return This builder for chaining.
     */
    public Builder setTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      time_ = value;
      onChanged();
      return this;
    }

    private long sR_ ;
    /**
     * <code>int64 SR = 2;</code>
     * @return The sR.
     */
    @java.lang.Override
    public long getSR() {
      return sR_;
    }
    /**
     * <code>int64 SR = 2;</code>
     * @param value The sR to set.
     * @return This builder for chaining.
     */
    public Builder setSR(long value) {
      
      sR_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 SR = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSR() {
      
      sR_ = 0L;
      onChanged();
      return this;
    }

    private long vFI_ ;
    /**
     * <code>int64 VFI = 3;</code>
     * @return The vFI.
     */
    @java.lang.Override
    public long getVFI() {
      return vFI_;
    }
    /**
     * <code>int64 VFI = 3;</code>
     * @param value The vFI to set.
     * @return This builder for chaining.
     */
    public Builder setVFI(long value) {
      
      vFI_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 VFI = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVFI() {
      
      vFI_ = 0L;
      onChanged();
      return this;
    }

    private long sDREnhance_ ;
    /**
     * <code>int64 SDREnhance = 4;</code>
     * @return The sDREnhance.
     */
    @java.lang.Override
    public long getSDREnhance() {
      return sDREnhance_;
    }
    /**
     * <code>int64 SDREnhance = 4;</code>
     * @param value The sDREnhance to set.
     * @return This builder for chaining.
     */
    public Builder setSDREnhance(long value) {
      
      sDREnhance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 SDREnhance = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSDREnhance() {
      
      sDREnhance_ = 0L;
      onChanged();
      return this;
    }

    private long sDR2HDR_ ;
    /**
     * <code>int64 SDR2HDR = 5;</code>
     * @return The sDR2HDR.
     */
    @java.lang.Override
    public long getSDR2HDR() {
      return sDR2HDR_;
    }
    /**
     * <code>int64 SDR2HDR = 5;</code>
     * @param value The sDR2HDR to set.
     * @return This builder for chaining.
     */
    public Builder setSDR2HDR(long value) {
      
      sDR2HDR_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 SDR2HDR = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSDR2HDR() {
      
      sDR2HDR_ = 0L;
      onChanged();
      return this;
    }

    private long audioDenose_ ;
    /**
     * <code>int64 AudioDenose = 6;</code>
     * @return The audioDenose.
     */
    @java.lang.Override
    public long getAudioDenose() {
      return audioDenose_;
    }
    /**
     * <code>int64 AudioDenose = 6;</code>
     * @param value The audioDenose to set.
     * @return This builder for chaining.
     */
    public Builder setAudioDenose(long value) {
      
      audioDenose_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 AudioDenose = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioDenose() {
      
      audioDenose_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.DescribeVodEnhanceImageDataItem)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.DescribeVodEnhanceImageDataItem)
  private static final com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem();
  }

  public static com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeVodEnhanceImageDataItem>
      PARSER = new com.google.protobuf.AbstractParser<DescribeVodEnhanceImageDataItem>() {
    @java.lang.Override
    public DescribeVodEnhanceImageDataItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DescribeVodEnhanceImageDataItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DescribeVodEnhanceImageDataItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeVodEnhanceImageDataItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.DescribeVodEnhanceImageDataItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

