// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Request.VodGetDrmLicenseRequest}
 */
public final class VodGetDrmLicenseRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Request.VodGetDrmLicenseRequest)
    VodGetDrmLicenseRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetDrmLicenseRequest.newBuilder() to construct.
  private VodGetDrmLicenseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetDrmLicenseRequest() {
    vid_ = "";
    kid_ = "";
    thirdPartyDrmType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetDrmLicenseRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetDrmLicenseRequest(
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

            vid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            kid_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            thirdPartyDrmType_ = s;
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
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetDrmLicenseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetDrmLicenseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest.class, com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest.Builder.class);
  }

  public static final int VID_FIELD_NUMBER = 1;
  private volatile java.lang.Object vid_;
  /**
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  @java.lang.Override
  public java.lang.String getVid() {
    java.lang.Object ref = vid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vid_ = s;
      return s;
    }
  }
  /**
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVidBytes() {
    java.lang.Object ref = vid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KID_FIELD_NUMBER = 2;
  private volatile java.lang.Object kid_;
  /**
   * <code>string Kid = 2;</code>
   * @return The kid.
   */
  @java.lang.Override
  public java.lang.String getKid() {
    java.lang.Object ref = kid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kid_ = s;
      return s;
    }
  }
  /**
   * <code>string Kid = 2;</code>
   * @return The bytes for kid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKidBytes() {
    java.lang.Object ref = kid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int THIRDPARTYDRMTYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object thirdPartyDrmType_;
  /**
   * <pre>
   *  int64 Persistent = 4;
   *  int64 LicenseDuration = 5;
   * </pre>
   *
   * <code>string ThirdPartyDrmType = 3;</code>
   * @return The thirdPartyDrmType.
   */
  @java.lang.Override
  public java.lang.String getThirdPartyDrmType() {
    java.lang.Object ref = thirdPartyDrmType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      thirdPartyDrmType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *  int64 Persistent = 4;
   *  int64 LicenseDuration = 5;
   * </pre>
   *
   * <code>string ThirdPartyDrmType = 3;</code>
   * @return The bytes for thirdPartyDrmType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getThirdPartyDrmTypeBytes() {
    java.lang.Object ref = thirdPartyDrmType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      thirdPartyDrmType_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(thirdPartyDrmType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, thirdPartyDrmType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(thirdPartyDrmType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, thirdPartyDrmType_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest other = (com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest) obj;

    if (!getVid()
        .equals(other.getVid())) return false;
    if (!getKid()
        .equals(other.getKid())) return false;
    if (!getThirdPartyDrmType()
        .equals(other.getThirdPartyDrmType())) return false;
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
    hash = (37 * hash) + VID_FIELD_NUMBER;
    hash = (53 * hash) + getVid().hashCode();
    hash = (37 * hash) + KID_FIELD_NUMBER;
    hash = (53 * hash) + getKid().hashCode();
    hash = (37 * hash) + THIRDPARTYDRMTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getThirdPartyDrmType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Request.VodGetDrmLicenseRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Request.VodGetDrmLicenseRequest)
      com.byteplus.service.vod.model.request.VodGetDrmLicenseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetDrmLicenseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetDrmLicenseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest.class, com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest.newBuilder()
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
      vid_ = "";

      kid_ = "";

      thirdPartyDrmType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetDrmLicenseRequest_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest build() {
      com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest buildPartial() {
      com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest result = new com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest(this);
      result.vid_ = vid_;
      result.kid_ = kid_;
      result.thirdPartyDrmType_ = thirdPartyDrmType_;
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
      if (other instanceof com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest) {
        return mergeFrom((com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest other) {
      if (other == com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest.getDefaultInstance()) return this;
      if (!other.getVid().isEmpty()) {
        vid_ = other.vid_;
        onChanged();
      }
      if (!other.getKid().isEmpty()) {
        kid_ = other.kid_;
        onChanged();
      }
      if (!other.getThirdPartyDrmType().isEmpty()) {
        thirdPartyDrmType_ = other.thirdPartyDrmType_;
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
      com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vid_ = "";
    /**
     * <code>string Vid = 1;</code>
     * @return The vid.
     */
    public java.lang.String getVid() {
      java.lang.Object ref = vid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Vid = 1;</code>
     * @return The bytes for vid.
     */
    public com.google.protobuf.ByteString
        getVidBytes() {
      java.lang.Object ref = vid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Vid = 1;</code>
     * @param value The vid to set.
     * @return This builder for chaining.
     */
    public Builder setVid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Vid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVid() {
      
      vid_ = getDefaultInstance().getVid();
      onChanged();
      return this;
    }
    /**
     * <code>string Vid = 1;</code>
     * @param value The bytes for vid to set.
     * @return This builder for chaining.
     */
    public Builder setVidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object kid_ = "";
    /**
     * <code>string Kid = 2;</code>
     * @return The kid.
     */
    public java.lang.String getKid() {
      java.lang.Object ref = kid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Kid = 2;</code>
     * @return The bytes for kid.
     */
    public com.google.protobuf.ByteString
        getKidBytes() {
      java.lang.Object ref = kid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Kid = 2;</code>
     * @param value The kid to set.
     * @return This builder for chaining.
     */
    public Builder setKid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Kid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKid() {
      
      kid_ = getDefaultInstance().getKid();
      onChanged();
      return this;
    }
    /**
     * <code>string Kid = 2;</code>
     * @param value The bytes for kid to set.
     * @return This builder for chaining.
     */
    public Builder setKidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object thirdPartyDrmType_ = "";
    /**
     * <pre>
     *  int64 Persistent = 4;
     *  int64 LicenseDuration = 5;
     * </pre>
     *
     * <code>string ThirdPartyDrmType = 3;</code>
     * @return The thirdPartyDrmType.
     */
    public java.lang.String getThirdPartyDrmType() {
      java.lang.Object ref = thirdPartyDrmType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        thirdPartyDrmType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *  int64 Persistent = 4;
     *  int64 LicenseDuration = 5;
     * </pre>
     *
     * <code>string ThirdPartyDrmType = 3;</code>
     * @return The bytes for thirdPartyDrmType.
     */
    public com.google.protobuf.ByteString
        getThirdPartyDrmTypeBytes() {
      java.lang.Object ref = thirdPartyDrmType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        thirdPartyDrmType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *  int64 Persistent = 4;
     *  int64 LicenseDuration = 5;
     * </pre>
     *
     * <code>string ThirdPartyDrmType = 3;</code>
     * @param value The thirdPartyDrmType to set.
     * @return This builder for chaining.
     */
    public Builder setThirdPartyDrmType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      thirdPartyDrmType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *  int64 Persistent = 4;
     *  int64 LicenseDuration = 5;
     * </pre>
     *
     * <code>string ThirdPartyDrmType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearThirdPartyDrmType() {
      
      thirdPartyDrmType_ = getDefaultInstance().getThirdPartyDrmType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *  int64 Persistent = 4;
     *  int64 LicenseDuration = 5;
     * </pre>
     *
     * <code>string ThirdPartyDrmType = 3;</code>
     * @param value The bytes for thirdPartyDrmType to set.
     * @return This builder for chaining.
     */
    public Builder setThirdPartyDrmTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      thirdPartyDrmType_ = value;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Request.VodGetDrmLicenseRequest)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Request.VodGetDrmLicenseRequest)
  private static final com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest();
  }

  public static com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetDrmLicenseRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodGetDrmLicenseRequest>() {
    @java.lang.Override
    public VodGetDrmLicenseRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetDrmLicenseRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetDrmLicenseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetDrmLicenseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

