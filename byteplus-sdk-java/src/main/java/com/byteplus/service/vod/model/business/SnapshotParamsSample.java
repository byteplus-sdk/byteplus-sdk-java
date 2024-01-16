// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_workflow.proto

package com.byteplus.service.vod.model.business;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Business.SnapshotParamsSample}
 */
public final class SnapshotParamsSample extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.SnapshotParamsSample)
    SnapshotParamsSampleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SnapshotParamsSample.newBuilder() to construct.
  private SnapshotParamsSample(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SnapshotParamsSample() {
    format_ = "";
    storeUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    indexUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SnapshotParamsSample();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SnapshotParamsSample(
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
            java.lang.String s = input.readStringRequireUtf8();

            format_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              storeUris_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            storeUris_.add(s);
            break;
          }
          case 24: {

            width_ = input.readInt32();
            break;
          }
          case 32: {

            height_ = input.readInt32();
            break;
          }
          case 45: {

            interval_ = input.readFloat();
            break;
          }
          case 48: {

            captureNum_ = input.readInt32();
            break;
          }
          case 61: {

            duration_ = input.readFloat();
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            indexUri_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        storeUris_ = storeUris_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.byteplus.service.vod.model.business.VodWorkflow.internal_static_Byteplus_Vod_Models_Business_SnapshotParamsSample_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodWorkflow.internal_static_Byteplus_Vod_Models_Business_SnapshotParamsSample_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.business.SnapshotParamsSample.class, com.byteplus.service.vod.model.business.SnapshotParamsSample.Builder.class);
  }

  public static final int FORMAT_FIELD_NUMBER = 1;
  private volatile java.lang.Object format_;
  /**
   * <code>string Format = 1;</code>
   * @return The format.
   */
  @java.lang.Override
  public java.lang.String getFormat() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      format_ = s;
      return s;
    }
  }
  /**
   * <code>string Format = 1;</code>
   * @return The bytes for format.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFormatBytes() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      format_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STOREURIS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList storeUris_;
  /**
   * <code>repeated string StoreUris = 2;</code>
   * @return A list containing the storeUris.
   */
  public com.google.protobuf.ProtocolStringList
      getStoreUrisList() {
    return storeUris_;
  }
  /**
   * <code>repeated string StoreUris = 2;</code>
   * @return The count of storeUris.
   */
  public int getStoreUrisCount() {
    return storeUris_.size();
  }
  /**
   * <code>repeated string StoreUris = 2;</code>
   * @param index The index of the element to return.
   * @return The storeUris at the given index.
   */
  public java.lang.String getStoreUris(int index) {
    return storeUris_.get(index);
  }
  /**
   * <code>repeated string StoreUris = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the storeUris at the given index.
   */
  public com.google.protobuf.ByteString
      getStoreUrisBytes(int index) {
    return storeUris_.getByteString(index);
  }

  public static final int WIDTH_FIELD_NUMBER = 3;
  private int width_;
  /**
   * <code>int32 Width = 3;</code>
   * @return The width.
   */
  @java.lang.Override
  public int getWidth() {
    return width_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 4;
  private int height_;
  /**
   * <code>int32 Height = 4;</code>
   * @return The height.
   */
  @java.lang.Override
  public int getHeight() {
    return height_;
  }

  public static final int INTERVAL_FIELD_NUMBER = 5;
  private float interval_;
  /**
   * <code>float Interval = 5;</code>
   * @return The interval.
   */
  @java.lang.Override
  public float getInterval() {
    return interval_;
  }

  public static final int CAPTURENUM_FIELD_NUMBER = 6;
  private int captureNum_;
  /**
   * <code>int32 CaptureNum = 6;</code>
   * @return The captureNum.
   */
  @java.lang.Override
  public int getCaptureNum() {
    return captureNum_;
  }

  public static final int DURATION_FIELD_NUMBER = 7;
  private float duration_;
  /**
   * <code>float Duration = 7;</code>
   * @return The duration.
   */
  @java.lang.Override
  public float getDuration() {
    return duration_;
  }

  public static final int INDEXURI_FIELD_NUMBER = 8;
  private volatile java.lang.Object indexUri_;
  /**
   * <code>string IndexUri = 8;</code>
   * @return The indexUri.
   */
  @java.lang.Override
  public java.lang.String getIndexUri() {
    java.lang.Object ref = indexUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      indexUri_ = s;
      return s;
    }
  }
  /**
   * <code>string IndexUri = 8;</code>
   * @return The bytes for indexUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIndexUriBytes() {
    java.lang.Object ref = indexUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      indexUri_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(format_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, format_);
    }
    for (int i = 0; i < storeUris_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, storeUris_.getRaw(i));
    }
    if (width_ != 0) {
      output.writeInt32(3, width_);
    }
    if (height_ != 0) {
      output.writeInt32(4, height_);
    }
    if (java.lang.Float.floatToRawIntBits(interval_) != 0) {
      output.writeFloat(5, interval_);
    }
    if (captureNum_ != 0) {
      output.writeInt32(6, captureNum_);
    }
    if (java.lang.Float.floatToRawIntBits(duration_) != 0) {
      output.writeFloat(7, duration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(indexUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, indexUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(format_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, format_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < storeUris_.size(); i++) {
        dataSize += computeStringSizeNoTag(storeUris_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStoreUrisList().size();
    }
    if (width_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, width_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, height_);
    }
    if (java.lang.Float.floatToRawIntBits(interval_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, interval_);
    }
    if (captureNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, captureNum_);
    }
    if (java.lang.Float.floatToRawIntBits(duration_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(7, duration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(indexUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, indexUri_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.SnapshotParamsSample)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.SnapshotParamsSample other = (com.byteplus.service.vod.model.business.SnapshotParamsSample) obj;

    if (!getFormat()
        .equals(other.getFormat())) return false;
    if (!getStoreUrisList()
        .equals(other.getStoreUrisList())) return false;
    if (getWidth()
        != other.getWidth()) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (java.lang.Float.floatToIntBits(getInterval())
        != java.lang.Float.floatToIntBits(
            other.getInterval())) return false;
    if (getCaptureNum()
        != other.getCaptureNum()) return false;
    if (java.lang.Float.floatToIntBits(getDuration())
        != java.lang.Float.floatToIntBits(
            other.getDuration())) return false;
    if (!getIndexUri()
        .equals(other.getIndexUri())) return false;
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
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + getFormat().hashCode();
    if (getStoreUrisCount() > 0) {
      hash = (37 * hash) + STOREURIS_FIELD_NUMBER;
      hash = (53 * hash) + getStoreUrisList().hashCode();
    }
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getWidth();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    hash = (37 * hash) + INTERVAL_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getInterval());
    hash = (37 * hash) + CAPTURENUM_FIELD_NUMBER;
    hash = (53 * hash) + getCaptureNum();
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDuration());
    hash = (37 * hash) + INDEXURI_FIELD_NUMBER;
    hash = (53 * hash) + getIndexUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.SnapshotParamsSample parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.SnapshotParamsSample parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.SnapshotParamsSample parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.SnapshotParamsSample parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.SnapshotParamsSample parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.SnapshotParamsSample parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.SnapshotParamsSample parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.SnapshotParamsSample parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.SnapshotParamsSample parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.SnapshotParamsSample parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.SnapshotParamsSample parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.SnapshotParamsSample parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.business.SnapshotParamsSample prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Business.SnapshotParamsSample}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.SnapshotParamsSample)
      com.byteplus.service.vod.model.business.SnapshotParamsSampleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.business.VodWorkflow.internal_static_Byteplus_Vod_Models_Business_SnapshotParamsSample_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodWorkflow.internal_static_Byteplus_Vod_Models_Business_SnapshotParamsSample_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.business.SnapshotParamsSample.class, com.byteplus.service.vod.model.business.SnapshotParamsSample.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.SnapshotParamsSample.newBuilder()
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
      format_ = "";

      storeUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      width_ = 0;

      height_ = 0;

      interval_ = 0F;

      captureNum_ = 0;

      duration_ = 0F;

      indexUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodWorkflow.internal_static_Byteplus_Vod_Models_Business_SnapshotParamsSample_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.SnapshotParamsSample getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.SnapshotParamsSample.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.SnapshotParamsSample build() {
      com.byteplus.service.vod.model.business.SnapshotParamsSample result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.SnapshotParamsSample buildPartial() {
      com.byteplus.service.vod.model.business.SnapshotParamsSample result = new com.byteplus.service.vod.model.business.SnapshotParamsSample(this);
      int from_bitField0_ = bitField0_;
      result.format_ = format_;
      if (((bitField0_ & 0x00000001) != 0)) {
        storeUris_ = storeUris_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.storeUris_ = storeUris_;
      result.width_ = width_;
      result.height_ = height_;
      result.interval_ = interval_;
      result.captureNum_ = captureNum_;
      result.duration_ = duration_;
      result.indexUri_ = indexUri_;
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
      if (other instanceof com.byteplus.service.vod.model.business.SnapshotParamsSample) {
        return mergeFrom((com.byteplus.service.vod.model.business.SnapshotParamsSample)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.SnapshotParamsSample other) {
      if (other == com.byteplus.service.vod.model.business.SnapshotParamsSample.getDefaultInstance()) return this;
      if (!other.getFormat().isEmpty()) {
        format_ = other.format_;
        onChanged();
      }
      if (!other.storeUris_.isEmpty()) {
        if (storeUris_.isEmpty()) {
          storeUris_ = other.storeUris_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStoreUrisIsMutable();
          storeUris_.addAll(other.storeUris_);
        }
        onChanged();
      }
      if (other.getWidth() != 0) {
        setWidth(other.getWidth());
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
      }
      if (other.getInterval() != 0F) {
        setInterval(other.getInterval());
      }
      if (other.getCaptureNum() != 0) {
        setCaptureNum(other.getCaptureNum());
      }
      if (other.getDuration() != 0F) {
        setDuration(other.getDuration());
      }
      if (!other.getIndexUri().isEmpty()) {
        indexUri_ = other.indexUri_;
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
      com.byteplus.service.vod.model.business.SnapshotParamsSample parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.SnapshotParamsSample) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object format_ = "";
    /**
     * <code>string Format = 1;</code>
     * @return The format.
     */
    public java.lang.String getFormat() {
      java.lang.Object ref = format_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        format_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Format = 1;</code>
     * @return The bytes for format.
     */
    public com.google.protobuf.ByteString
        getFormatBytes() {
      java.lang.Object ref = format_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        format_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Format = 1;</code>
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      format_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Format = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFormat() {
      
      format_ = getDefaultInstance().getFormat();
      onChanged();
      return this;
    }
    /**
     * <code>string Format = 1;</code>
     * @param value The bytes for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      format_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList storeUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStoreUrisIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        storeUris_ = new com.google.protobuf.LazyStringArrayList(storeUris_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string StoreUris = 2;</code>
     * @return A list containing the storeUris.
     */
    public com.google.protobuf.ProtocolStringList
        getStoreUrisList() {
      return storeUris_.getUnmodifiableView();
    }
    /**
     * <code>repeated string StoreUris = 2;</code>
     * @return The count of storeUris.
     */
    public int getStoreUrisCount() {
      return storeUris_.size();
    }
    /**
     * <code>repeated string StoreUris = 2;</code>
     * @param index The index of the element to return.
     * @return The storeUris at the given index.
     */
    public java.lang.String getStoreUris(int index) {
      return storeUris_.get(index);
    }
    /**
     * <code>repeated string StoreUris = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the storeUris at the given index.
     */
    public com.google.protobuf.ByteString
        getStoreUrisBytes(int index) {
      return storeUris_.getByteString(index);
    }
    /**
     * <code>repeated string StoreUris = 2;</code>
     * @param index The index to set the value at.
     * @param value The storeUris to set.
     * @return This builder for chaining.
     */
    public Builder setStoreUris(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStoreUrisIsMutable();
      storeUris_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string StoreUris = 2;</code>
     * @param value The storeUris to add.
     * @return This builder for chaining.
     */
    public Builder addStoreUris(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStoreUrisIsMutable();
      storeUris_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string StoreUris = 2;</code>
     * @param values The storeUris to add.
     * @return This builder for chaining.
     */
    public Builder addAllStoreUris(
        java.lang.Iterable<java.lang.String> values) {
      ensureStoreUrisIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, storeUris_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string StoreUris = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStoreUris() {
      storeUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string StoreUris = 2;</code>
     * @param value The bytes of the storeUris to add.
     * @return This builder for chaining.
     */
    public Builder addStoreUrisBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureStoreUrisIsMutable();
      storeUris_.add(value);
      onChanged();
      return this;
    }

    private int width_ ;
    /**
     * <code>int32 Width = 3;</code>
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return width_;
    }
    /**
     * <code>int32 Width = 3;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(int value) {
      
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 Width = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      
      width_ = 0;
      onChanged();
      return this;
    }

    private int height_ ;
    /**
     * <code>int32 Height = 4;</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }
    /**
     * <code>int32 Height = 4;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 Height = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0;
      onChanged();
      return this;
    }

    private float interval_ ;
    /**
     * <code>float Interval = 5;</code>
     * @return The interval.
     */
    @java.lang.Override
    public float getInterval() {
      return interval_;
    }
    /**
     * <code>float Interval = 5;</code>
     * @param value The interval to set.
     * @return This builder for chaining.
     */
    public Builder setInterval(float value) {
      
      interval_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float Interval = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearInterval() {
      
      interval_ = 0F;
      onChanged();
      return this;
    }

    private int captureNum_ ;
    /**
     * <code>int32 CaptureNum = 6;</code>
     * @return The captureNum.
     */
    @java.lang.Override
    public int getCaptureNum() {
      return captureNum_;
    }
    /**
     * <code>int32 CaptureNum = 6;</code>
     * @param value The captureNum to set.
     * @return This builder for chaining.
     */
    public Builder setCaptureNum(int value) {
      
      captureNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 CaptureNum = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCaptureNum() {
      
      captureNum_ = 0;
      onChanged();
      return this;
    }

    private float duration_ ;
    /**
     * <code>float Duration = 7;</code>
     * @return The duration.
     */
    @java.lang.Override
    public float getDuration() {
      return duration_;
    }
    /**
     * <code>float Duration = 7;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(float value) {
      
      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float Duration = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      
      duration_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object indexUri_ = "";
    /**
     * <code>string IndexUri = 8;</code>
     * @return The indexUri.
     */
    public java.lang.String getIndexUri() {
      java.lang.Object ref = indexUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        indexUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string IndexUri = 8;</code>
     * @return The bytes for indexUri.
     */
    public com.google.protobuf.ByteString
        getIndexUriBytes() {
      java.lang.Object ref = indexUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        indexUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string IndexUri = 8;</code>
     * @param value The indexUri to set.
     * @return This builder for chaining.
     */
    public Builder setIndexUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      indexUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string IndexUri = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearIndexUri() {
      
      indexUri_ = getDefaultInstance().getIndexUri();
      onChanged();
      return this;
    }
    /**
     * <code>string IndexUri = 8;</code>
     * @param value The bytes for indexUri to set.
     * @return This builder for chaining.
     */
    public Builder setIndexUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      indexUri_ = value;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.SnapshotParamsSample)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.SnapshotParamsSample)
  private static final com.byteplus.service.vod.model.business.SnapshotParamsSample DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.SnapshotParamsSample();
  }

  public static com.byteplus.service.vod.model.business.SnapshotParamsSample getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SnapshotParamsSample>
      PARSER = new com.google.protobuf.AbstractParser<SnapshotParamsSample>() {
    @java.lang.Override
    public SnapshotParamsSample parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SnapshotParamsSample(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SnapshotParamsSample> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SnapshotParamsSample> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.SnapshotParamsSample getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

