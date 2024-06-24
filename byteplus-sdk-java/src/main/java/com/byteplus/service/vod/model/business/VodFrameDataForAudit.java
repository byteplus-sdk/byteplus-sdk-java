// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_media.proto

package com.byteplus.service.vod.model.business;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Business.VodFrameDataForAudit}
 */
public final class VodFrameDataForAudit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.VodFrameDataForAudit)
    VodFrameDataForAuditOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodFrameDataForAudit.newBuilder() to construct.
  private VodFrameDataForAudit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodFrameDataForAudit() {
    storeUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodFrameDataForAudit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodFrameDataForAudit(
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

            storeUri_ = s;
            break;
          }
          case 16: {

            frameNumber_ = input.readInt32();
            break;
          }
          case 25: {

            cutTimeMill_ = input.readDouble();
            break;
          }
          case 32: {

            width_ = input.readInt32();
            break;
          }
          case 40: {

            height_ = input.readInt32();
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
    return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodFrameDataForAudit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodFrameDataForAudit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.business.VodFrameDataForAudit.class, com.byteplus.service.vod.model.business.VodFrameDataForAudit.Builder.class);
  }

  public static final int STOREURI_FIELD_NUMBER = 1;
  private volatile java.lang.Object storeUri_;
  /**
   * <pre>
   * URI of frame store
   * </pre>
   *
   * <code>string StoreUri = 1;</code>
   * @return The storeUri.
   */
  @java.lang.Override
  public java.lang.String getStoreUri() {
    java.lang.Object ref = storeUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storeUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URI of frame store
   * </pre>
   *
   * <code>string StoreUri = 1;</code>
   * @return The bytes for storeUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStoreUriBytes() {
    java.lang.Object ref = storeUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      storeUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FRAMENUMBER_FIELD_NUMBER = 2;
  private int frameNumber_;
  /**
   * <pre>
   *帧号
   * </pre>
   *
   * <code>int32 FrameNumber = 2;</code>
   * @return The frameNumber.
   */
  @java.lang.Override
  public int getFrameNumber() {
    return frameNumber_;
  }

  public static final int CUTTIMEMILL_FIELD_NUMBER = 3;
  private double cutTimeMill_;
  /**
   * <pre>
   *帧对应时间（ms）
   * </pre>
   *
   * <code>double CutTimeMill = 3;</code>
   * @return The cutTimeMill.
   */
  @java.lang.Override
  public double getCutTimeMill() {
    return cutTimeMill_;
  }

  public static final int WIDTH_FIELD_NUMBER = 4;
  private int width_;
  /**
   * <pre>
   *图片宽度
   * </pre>
   *
   * <code>int32 Width = 4;</code>
   * @return The width.
   */
  @java.lang.Override
  public int getWidth() {
    return width_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 5;
  private int height_;
  /**
   * <pre>
   *图片高度
   * </pre>
   *
   * <code>int32 Height = 5;</code>
   * @return The height.
   */
  @java.lang.Override
  public int getHeight() {
    return height_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, storeUri_);
    }
    if (frameNumber_ != 0) {
      output.writeInt32(2, frameNumber_);
    }
    if (java.lang.Double.doubleToRawLongBits(cutTimeMill_) != 0) {
      output.writeDouble(3, cutTimeMill_);
    }
    if (width_ != 0) {
      output.writeInt32(4, width_);
    }
    if (height_ != 0) {
      output.writeInt32(5, height_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, storeUri_);
    }
    if (frameNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, frameNumber_);
    }
    if (java.lang.Double.doubleToRawLongBits(cutTimeMill_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, cutTimeMill_);
    }
    if (width_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, width_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, height_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.VodFrameDataForAudit)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.VodFrameDataForAudit other = (com.byteplus.service.vod.model.business.VodFrameDataForAudit) obj;

    if (!getStoreUri()
        .equals(other.getStoreUri())) return false;
    if (getFrameNumber()
        != other.getFrameNumber()) return false;
    if (java.lang.Double.doubleToLongBits(getCutTimeMill())
        != java.lang.Double.doubleToLongBits(
            other.getCutTimeMill())) return false;
    if (getWidth()
        != other.getWidth()) return false;
    if (getHeight()
        != other.getHeight()) return false;
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
    hash = (37 * hash) + STOREURI_FIELD_NUMBER;
    hash = (53 * hash) + getStoreUri().hashCode();
    hash = (37 * hash) + FRAMENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getFrameNumber();
    hash = (37 * hash) + CUTTIMEMILL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCutTimeMill()));
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getWidth();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.business.VodFrameDataForAudit prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Business.VodFrameDataForAudit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.VodFrameDataForAudit)
      com.byteplus.service.vod.model.business.VodFrameDataForAuditOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodFrameDataForAudit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodFrameDataForAudit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.business.VodFrameDataForAudit.class, com.byteplus.service.vod.model.business.VodFrameDataForAudit.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.VodFrameDataForAudit.newBuilder()
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
      storeUri_ = "";

      frameNumber_ = 0;

      cutTimeMill_ = 0D;

      width_ = 0;

      height_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodFrameDataForAudit_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodFrameDataForAudit getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.VodFrameDataForAudit.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodFrameDataForAudit build() {
      com.byteplus.service.vod.model.business.VodFrameDataForAudit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodFrameDataForAudit buildPartial() {
      com.byteplus.service.vod.model.business.VodFrameDataForAudit result = new com.byteplus.service.vod.model.business.VodFrameDataForAudit(this);
      result.storeUri_ = storeUri_;
      result.frameNumber_ = frameNumber_;
      result.cutTimeMill_ = cutTimeMill_;
      result.width_ = width_;
      result.height_ = height_;
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
      if (other instanceof com.byteplus.service.vod.model.business.VodFrameDataForAudit) {
        return mergeFrom((com.byteplus.service.vod.model.business.VodFrameDataForAudit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.VodFrameDataForAudit other) {
      if (other == com.byteplus.service.vod.model.business.VodFrameDataForAudit.getDefaultInstance()) return this;
      if (!other.getStoreUri().isEmpty()) {
        storeUri_ = other.storeUri_;
        onChanged();
      }
      if (other.getFrameNumber() != 0) {
        setFrameNumber(other.getFrameNumber());
      }
      if (other.getCutTimeMill() != 0D) {
        setCutTimeMill(other.getCutTimeMill());
      }
      if (other.getWidth() != 0) {
        setWidth(other.getWidth());
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
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
      com.byteplus.service.vod.model.business.VodFrameDataForAudit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.VodFrameDataForAudit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object storeUri_ = "";
    /**
     * <pre>
     * URI of frame store
     * </pre>
     *
     * <code>string StoreUri = 1;</code>
     * @return The storeUri.
     */
    public java.lang.String getStoreUri() {
      java.lang.Object ref = storeUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storeUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URI of frame store
     * </pre>
     *
     * <code>string StoreUri = 1;</code>
     * @return The bytes for storeUri.
     */
    public com.google.protobuf.ByteString
        getStoreUriBytes() {
      java.lang.Object ref = storeUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storeUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URI of frame store
     * </pre>
     *
     * <code>string StoreUri = 1;</code>
     * @param value The storeUri to set.
     * @return This builder for chaining.
     */
    public Builder setStoreUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      storeUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URI of frame store
     * </pre>
     *
     * <code>string StoreUri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStoreUri() {
      
      storeUri_ = getDefaultInstance().getStoreUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URI of frame store
     * </pre>
     *
     * <code>string StoreUri = 1;</code>
     * @param value The bytes for storeUri to set.
     * @return This builder for chaining.
     */
    public Builder setStoreUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      storeUri_ = value;
      onChanged();
      return this;
    }

    private int frameNumber_ ;
    /**
     * <pre>
     *帧号
     * </pre>
     *
     * <code>int32 FrameNumber = 2;</code>
     * @return The frameNumber.
     */
    @java.lang.Override
    public int getFrameNumber() {
      return frameNumber_;
    }
    /**
     * <pre>
     *帧号
     * </pre>
     *
     * <code>int32 FrameNumber = 2;</code>
     * @param value The frameNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFrameNumber(int value) {
      
      frameNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *帧号
     * </pre>
     *
     * <code>int32 FrameNumber = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrameNumber() {
      
      frameNumber_ = 0;
      onChanged();
      return this;
    }

    private double cutTimeMill_ ;
    /**
     * <pre>
     *帧对应时间（ms）
     * </pre>
     *
     * <code>double CutTimeMill = 3;</code>
     * @return The cutTimeMill.
     */
    @java.lang.Override
    public double getCutTimeMill() {
      return cutTimeMill_;
    }
    /**
     * <pre>
     *帧对应时间（ms）
     * </pre>
     *
     * <code>double CutTimeMill = 3;</code>
     * @param value The cutTimeMill to set.
     * @return This builder for chaining.
     */
    public Builder setCutTimeMill(double value) {
      
      cutTimeMill_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *帧对应时间（ms）
     * </pre>
     *
     * <code>double CutTimeMill = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCutTimeMill() {
      
      cutTimeMill_ = 0D;
      onChanged();
      return this;
    }

    private int width_ ;
    /**
     * <pre>
     *图片宽度
     * </pre>
     *
     * <code>int32 Width = 4;</code>
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return width_;
    }
    /**
     * <pre>
     *图片宽度
     * </pre>
     *
     * <code>int32 Width = 4;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(int value) {
      
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *图片宽度
     * </pre>
     *
     * <code>int32 Width = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      
      width_ = 0;
      onChanged();
      return this;
    }

    private int height_ ;
    /**
     * <pre>
     *图片高度
     * </pre>
     *
     * <code>int32 Height = 5;</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }
    /**
     * <pre>
     *图片高度
     * </pre>
     *
     * <code>int32 Height = 5;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *图片高度
     * </pre>
     *
     * <code>int32 Height = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.VodFrameDataForAudit)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.VodFrameDataForAudit)
  private static final com.byteplus.service.vod.model.business.VodFrameDataForAudit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.VodFrameDataForAudit();
  }

  public static com.byteplus.service.vod.model.business.VodFrameDataForAudit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodFrameDataForAudit>
      PARSER = new com.google.protobuf.AbstractParser<VodFrameDataForAudit>() {
    @java.lang.Override
    public VodFrameDataForAudit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodFrameDataForAudit(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodFrameDataForAudit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodFrameDataForAudit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.VodFrameDataForAudit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
