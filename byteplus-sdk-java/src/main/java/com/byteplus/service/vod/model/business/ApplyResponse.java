// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_upload.proto

package com.byteplus.service.vod.model.business;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Business.ApplyResponse}
 */
public final class ApplyResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.ApplyResponse)
    ApplyResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApplyResponse.newBuilder() to construct.
  private ApplyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApplyResponse() {
    sDKParam_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApplyResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ApplyResponse(
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
            com.byteplus.service.vod.model.business.UploadAddress.Builder subBuilder = null;
            if (uploadAddress_ != null) {
              subBuilder = uploadAddress_.toBuilder();
            }
            uploadAddress_ = input.readMessage(com.byteplus.service.vod.model.business.UploadAddress.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(uploadAddress_);
              uploadAddress_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.byteplus.service.vod.model.business.FlushUploadResult.Builder subBuilder = null;
            if (flushUploadResult_ != null) {
              subBuilder = flushUploadResult_.toBuilder();
            }
            flushUploadResult_ = input.readMessage(com.byteplus.service.vod.model.business.FlushUploadResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(flushUploadResult_);
              flushUploadResult_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            sDKParam_ = s;
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
    return com.byteplus.service.vod.model.business.VodUpload.internal_static_Byteplus_Vod_Models_Business_ApplyResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodUpload.internal_static_Byteplus_Vod_Models_Business_ApplyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.business.ApplyResponse.class, com.byteplus.service.vod.model.business.ApplyResponse.Builder.class);
  }

  public static final int UPLOADADDRESS_FIELD_NUMBER = 1;
  private com.byteplus.service.vod.model.business.UploadAddress uploadAddress_;
  /**
   * <code>.Byteplus.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
   * @return Whether the uploadAddress field is set.
   */
  @java.lang.Override
  public boolean hasUploadAddress() {
    return uploadAddress_ != null;
  }
  /**
   * <code>.Byteplus.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
   * @return The uploadAddress.
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.UploadAddress getUploadAddress() {
    return uploadAddress_ == null ? com.byteplus.service.vod.model.business.UploadAddress.getDefaultInstance() : uploadAddress_;
  }
  /**
   * <code>.Byteplus.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.UploadAddressOrBuilder getUploadAddressOrBuilder() {
    return getUploadAddress();
  }

  public static final int FLUSHUPLOADRESULT_FIELD_NUMBER = 2;
  private com.byteplus.service.vod.model.business.FlushUploadResult flushUploadResult_;
  /**
   * <code>.Byteplus.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
   * @return Whether the flushUploadResult field is set.
   */
  @java.lang.Override
  public boolean hasFlushUploadResult() {
    return flushUploadResult_ != null;
  }
  /**
   * <code>.Byteplus.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
   * @return The flushUploadResult.
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.FlushUploadResult getFlushUploadResult() {
    return flushUploadResult_ == null ? com.byteplus.service.vod.model.business.FlushUploadResult.getDefaultInstance() : flushUploadResult_;
  }
  /**
   * <code>.Byteplus.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.FlushUploadResultOrBuilder getFlushUploadResultOrBuilder() {
    return getFlushUploadResult();
  }

  public static final int SDKPARAM_FIELD_NUMBER = 3;
  private volatile java.lang.Object sDKParam_;
  /**
   * <code>string SDKParam = 3;</code>
   * @return The sDKParam.
   */
  @java.lang.Override
  public java.lang.String getSDKParam() {
    java.lang.Object ref = sDKParam_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sDKParam_ = s;
      return s;
    }
  }
  /**
   * <code>string SDKParam = 3;</code>
   * @return The bytes for sDKParam.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSDKParamBytes() {
    java.lang.Object ref = sDKParam_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sDKParam_ = b;
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
    if (uploadAddress_ != null) {
      output.writeMessage(1, getUploadAddress());
    }
    if (flushUploadResult_ != null) {
      output.writeMessage(2, getFlushUploadResult());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sDKParam_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sDKParam_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uploadAddress_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUploadAddress());
    }
    if (flushUploadResult_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFlushUploadResult());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sDKParam_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sDKParam_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.ApplyResponse)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.ApplyResponse other = (com.byteplus.service.vod.model.business.ApplyResponse) obj;

    if (hasUploadAddress() != other.hasUploadAddress()) return false;
    if (hasUploadAddress()) {
      if (!getUploadAddress()
          .equals(other.getUploadAddress())) return false;
    }
    if (hasFlushUploadResult() != other.hasFlushUploadResult()) return false;
    if (hasFlushUploadResult()) {
      if (!getFlushUploadResult()
          .equals(other.getFlushUploadResult())) return false;
    }
    if (!getSDKParam()
        .equals(other.getSDKParam())) return false;
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
    if (hasUploadAddress()) {
      hash = (37 * hash) + UPLOADADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getUploadAddress().hashCode();
    }
    if (hasFlushUploadResult()) {
      hash = (37 * hash) + FLUSHUPLOADRESULT_FIELD_NUMBER;
      hash = (53 * hash) + getFlushUploadResult().hashCode();
    }
    hash = (37 * hash) + SDKPARAM_FIELD_NUMBER;
    hash = (53 * hash) + getSDKParam().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.ApplyResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.ApplyResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.ApplyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.ApplyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.ApplyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.ApplyResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.ApplyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.ApplyResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.ApplyResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.ApplyResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.ApplyResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.ApplyResponse parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.business.ApplyResponse prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Business.ApplyResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.ApplyResponse)
      com.byteplus.service.vod.model.business.ApplyResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.business.VodUpload.internal_static_Byteplus_Vod_Models_Business_ApplyResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodUpload.internal_static_Byteplus_Vod_Models_Business_ApplyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.business.ApplyResponse.class, com.byteplus.service.vod.model.business.ApplyResponse.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.ApplyResponse.newBuilder()
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
      if (uploadAddressBuilder_ == null) {
        uploadAddress_ = null;
      } else {
        uploadAddress_ = null;
        uploadAddressBuilder_ = null;
      }
      if (flushUploadResultBuilder_ == null) {
        flushUploadResult_ = null;
      } else {
        flushUploadResult_ = null;
        flushUploadResultBuilder_ = null;
      }
      sDKParam_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodUpload.internal_static_Byteplus_Vod_Models_Business_ApplyResponse_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.ApplyResponse getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.ApplyResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.ApplyResponse build() {
      com.byteplus.service.vod.model.business.ApplyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.ApplyResponse buildPartial() {
      com.byteplus.service.vod.model.business.ApplyResponse result = new com.byteplus.service.vod.model.business.ApplyResponse(this);
      if (uploadAddressBuilder_ == null) {
        result.uploadAddress_ = uploadAddress_;
      } else {
        result.uploadAddress_ = uploadAddressBuilder_.build();
      }
      if (flushUploadResultBuilder_ == null) {
        result.flushUploadResult_ = flushUploadResult_;
      } else {
        result.flushUploadResult_ = flushUploadResultBuilder_.build();
      }
      result.sDKParam_ = sDKParam_;
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
      if (other instanceof com.byteplus.service.vod.model.business.ApplyResponse) {
        return mergeFrom((com.byteplus.service.vod.model.business.ApplyResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.ApplyResponse other) {
      if (other == com.byteplus.service.vod.model.business.ApplyResponse.getDefaultInstance()) return this;
      if (other.hasUploadAddress()) {
        mergeUploadAddress(other.getUploadAddress());
      }
      if (other.hasFlushUploadResult()) {
        mergeFlushUploadResult(other.getFlushUploadResult());
      }
      if (!other.getSDKParam().isEmpty()) {
        sDKParam_ = other.sDKParam_;
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
      com.byteplus.service.vod.model.business.ApplyResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.ApplyResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.byteplus.service.vod.model.business.UploadAddress uploadAddress_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.byteplus.service.vod.model.business.UploadAddress, com.byteplus.service.vod.model.business.UploadAddress.Builder, com.byteplus.service.vod.model.business.UploadAddressOrBuilder> uploadAddressBuilder_;
    /**
     * <code>.Byteplus.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
     * @return Whether the uploadAddress field is set.
     */
    public boolean hasUploadAddress() {
      return uploadAddressBuilder_ != null || uploadAddress_ != null;
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
     * @return The uploadAddress.
     */
    public com.byteplus.service.vod.model.business.UploadAddress getUploadAddress() {
      if (uploadAddressBuilder_ == null) {
        return uploadAddress_ == null ? com.byteplus.service.vod.model.business.UploadAddress.getDefaultInstance() : uploadAddress_;
      } else {
        return uploadAddressBuilder_.getMessage();
      }
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
     */
    public Builder setUploadAddress(com.byteplus.service.vod.model.business.UploadAddress value) {
      if (uploadAddressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        uploadAddress_ = value;
        onChanged();
      } else {
        uploadAddressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
     */
    public Builder setUploadAddress(
        com.byteplus.service.vod.model.business.UploadAddress.Builder builderForValue) {
      if (uploadAddressBuilder_ == null) {
        uploadAddress_ = builderForValue.build();
        onChanged();
      } else {
        uploadAddressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
     */
    public Builder mergeUploadAddress(com.byteplus.service.vod.model.business.UploadAddress value) {
      if (uploadAddressBuilder_ == null) {
        if (uploadAddress_ != null) {
          uploadAddress_ =
            com.byteplus.service.vod.model.business.UploadAddress.newBuilder(uploadAddress_).mergeFrom(value).buildPartial();
        } else {
          uploadAddress_ = value;
        }
        onChanged();
      } else {
        uploadAddressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
     */
    public Builder clearUploadAddress() {
      if (uploadAddressBuilder_ == null) {
        uploadAddress_ = null;
        onChanged();
      } else {
        uploadAddress_ = null;
        uploadAddressBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
     */
    public com.byteplus.service.vod.model.business.UploadAddress.Builder getUploadAddressBuilder() {
      
      onChanged();
      return getUploadAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
     */
    public com.byteplus.service.vod.model.business.UploadAddressOrBuilder getUploadAddressOrBuilder() {
      if (uploadAddressBuilder_ != null) {
        return uploadAddressBuilder_.getMessageOrBuilder();
      } else {
        return uploadAddress_ == null ?
            com.byteplus.service.vod.model.business.UploadAddress.getDefaultInstance() : uploadAddress_;
      }
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.UploadAddress UploadAddress = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.byteplus.service.vod.model.business.UploadAddress, com.byteplus.service.vod.model.business.UploadAddress.Builder, com.byteplus.service.vod.model.business.UploadAddressOrBuilder> 
        getUploadAddressFieldBuilder() {
      if (uploadAddressBuilder_ == null) {
        uploadAddressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.byteplus.service.vod.model.business.UploadAddress, com.byteplus.service.vod.model.business.UploadAddress.Builder, com.byteplus.service.vod.model.business.UploadAddressOrBuilder>(
                getUploadAddress(),
                getParentForChildren(),
                isClean());
        uploadAddress_ = null;
      }
      return uploadAddressBuilder_;
    }

    private com.byteplus.service.vod.model.business.FlushUploadResult flushUploadResult_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.byteplus.service.vod.model.business.FlushUploadResult, com.byteplus.service.vod.model.business.FlushUploadResult.Builder, com.byteplus.service.vod.model.business.FlushUploadResultOrBuilder> flushUploadResultBuilder_;
    /**
     * <code>.Byteplus.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
     * @return Whether the flushUploadResult field is set.
     */
    public boolean hasFlushUploadResult() {
      return flushUploadResultBuilder_ != null || flushUploadResult_ != null;
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
     * @return The flushUploadResult.
     */
    public com.byteplus.service.vod.model.business.FlushUploadResult getFlushUploadResult() {
      if (flushUploadResultBuilder_ == null) {
        return flushUploadResult_ == null ? com.byteplus.service.vod.model.business.FlushUploadResult.getDefaultInstance() : flushUploadResult_;
      } else {
        return flushUploadResultBuilder_.getMessage();
      }
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
     */
    public Builder setFlushUploadResult(com.byteplus.service.vod.model.business.FlushUploadResult value) {
      if (flushUploadResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        flushUploadResult_ = value;
        onChanged();
      } else {
        flushUploadResultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
     */
    public Builder setFlushUploadResult(
        com.byteplus.service.vod.model.business.FlushUploadResult.Builder builderForValue) {
      if (flushUploadResultBuilder_ == null) {
        flushUploadResult_ = builderForValue.build();
        onChanged();
      } else {
        flushUploadResultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
     */
    public Builder mergeFlushUploadResult(com.byteplus.service.vod.model.business.FlushUploadResult value) {
      if (flushUploadResultBuilder_ == null) {
        if (flushUploadResult_ != null) {
          flushUploadResult_ =
            com.byteplus.service.vod.model.business.FlushUploadResult.newBuilder(flushUploadResult_).mergeFrom(value).buildPartial();
        } else {
          flushUploadResult_ = value;
        }
        onChanged();
      } else {
        flushUploadResultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
     */
    public Builder clearFlushUploadResult() {
      if (flushUploadResultBuilder_ == null) {
        flushUploadResult_ = null;
        onChanged();
      } else {
        flushUploadResult_ = null;
        flushUploadResultBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
     */
    public com.byteplus.service.vod.model.business.FlushUploadResult.Builder getFlushUploadResultBuilder() {
      
      onChanged();
      return getFlushUploadResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
     */
    public com.byteplus.service.vod.model.business.FlushUploadResultOrBuilder getFlushUploadResultOrBuilder() {
      if (flushUploadResultBuilder_ != null) {
        return flushUploadResultBuilder_.getMessageOrBuilder();
      } else {
        return flushUploadResult_ == null ?
            com.byteplus.service.vod.model.business.FlushUploadResult.getDefaultInstance() : flushUploadResult_;
      }
    }
    /**
     * <code>.Byteplus.Vod.Models.Business.FlushUploadResult FlushUploadResult = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.byteplus.service.vod.model.business.FlushUploadResult, com.byteplus.service.vod.model.business.FlushUploadResult.Builder, com.byteplus.service.vod.model.business.FlushUploadResultOrBuilder> 
        getFlushUploadResultFieldBuilder() {
      if (flushUploadResultBuilder_ == null) {
        flushUploadResultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.byteplus.service.vod.model.business.FlushUploadResult, com.byteplus.service.vod.model.business.FlushUploadResult.Builder, com.byteplus.service.vod.model.business.FlushUploadResultOrBuilder>(
                getFlushUploadResult(),
                getParentForChildren(),
                isClean());
        flushUploadResult_ = null;
      }
      return flushUploadResultBuilder_;
    }

    private java.lang.Object sDKParam_ = "";
    /**
     * <code>string SDKParam = 3;</code>
     * @return The sDKParam.
     */
    public java.lang.String getSDKParam() {
      java.lang.Object ref = sDKParam_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sDKParam_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string SDKParam = 3;</code>
     * @return The bytes for sDKParam.
     */
    public com.google.protobuf.ByteString
        getSDKParamBytes() {
      java.lang.Object ref = sDKParam_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sDKParam_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string SDKParam = 3;</code>
     * @param value The sDKParam to set.
     * @return This builder for chaining.
     */
    public Builder setSDKParam(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sDKParam_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string SDKParam = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSDKParam() {
      
      sDKParam_ = getDefaultInstance().getSDKParam();
      onChanged();
      return this;
    }
    /**
     * <code>string SDKParam = 3;</code>
     * @param value The bytes for sDKParam to set.
     * @return This builder for chaining.
     */
    public Builder setSDKParamBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sDKParam_ = value;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.ApplyResponse)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.ApplyResponse)
  private static final com.byteplus.service.vod.model.business.ApplyResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.ApplyResponse();
  }

  public static com.byteplus.service.vod.model.business.ApplyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplyResponse>
      PARSER = new com.google.protobuf.AbstractParser<ApplyResponse>() {
    @java.lang.Override
    public ApplyResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApplyResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApplyResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplyResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.ApplyResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

