// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Request.VodGetDirectEditResultRequest}
 */
public final class VodGetDirectEditResultRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Request.VodGetDirectEditResultRequest)
    VodGetDirectEditResultRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetDirectEditResultRequest.newBuilder() to construct.
  private VodGetDirectEditResultRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetDirectEditResultRequest() {
    reqIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetDirectEditResultRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetDirectEditResultRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              reqIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            reqIds_.add(s);
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
        reqIds_ = reqIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetDirectEditResultRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetDirectEditResultRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest.class, com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest.Builder.class);
  }

  public static final int REQIDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList reqIds_;
  /**
   * <code>repeated string ReqIds = 1;</code>
   * @return A list containing the reqIds.
   */
  public com.google.protobuf.ProtocolStringList
      getReqIdsList() {
    return reqIds_;
  }
  /**
   * <code>repeated string ReqIds = 1;</code>
   * @return The count of reqIds.
   */
  public int getReqIdsCount() {
    return reqIds_.size();
  }
  /**
   * <code>repeated string ReqIds = 1;</code>
   * @param index The index of the element to return.
   * @return The reqIds at the given index.
   */
  public java.lang.String getReqIds(int index) {
    return reqIds_.get(index);
  }
  /**
   * <code>repeated string ReqIds = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the reqIds at the given index.
   */
  public com.google.protobuf.ByteString
      getReqIdsBytes(int index) {
    return reqIds_.getByteString(index);
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
    for (int i = 0; i < reqIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reqIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < reqIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(reqIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getReqIdsList().size();
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
    if (!(obj instanceof com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest other = (com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest) obj;

    if (!getReqIdsList()
        .equals(other.getReqIdsList())) return false;
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
    if (getReqIdsCount() > 0) {
      hash = (37 * hash) + REQIDS_FIELD_NUMBER;
      hash = (53 * hash) + getReqIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Request.VodGetDirectEditResultRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Request.VodGetDirectEditResultRequest)
      com.byteplus.service.vod.model.request.VodGetDirectEditResultRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetDirectEditResultRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetDirectEditResultRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest.class, com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest.newBuilder()
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
      reqIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetDirectEditResultRequest_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest build() {
      com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest buildPartial() {
      com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest result = new com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        reqIds_ = reqIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.reqIds_ = reqIds_;
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
      if (other instanceof com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest) {
        return mergeFrom((com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest other) {
      if (other == com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest.getDefaultInstance()) return this;
      if (!other.reqIds_.isEmpty()) {
        if (reqIds_.isEmpty()) {
          reqIds_ = other.reqIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureReqIdsIsMutable();
          reqIds_.addAll(other.reqIds_);
        }
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
      com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList reqIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureReqIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        reqIds_ = new com.google.protobuf.LazyStringArrayList(reqIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string ReqIds = 1;</code>
     * @return A list containing the reqIds.
     */
    public com.google.protobuf.ProtocolStringList
        getReqIdsList() {
      return reqIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string ReqIds = 1;</code>
     * @return The count of reqIds.
     */
    public int getReqIdsCount() {
      return reqIds_.size();
    }
    /**
     * <code>repeated string ReqIds = 1;</code>
     * @param index The index of the element to return.
     * @return The reqIds at the given index.
     */
    public java.lang.String getReqIds(int index) {
      return reqIds_.get(index);
    }
    /**
     * <code>repeated string ReqIds = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the reqIds at the given index.
     */
    public com.google.protobuf.ByteString
        getReqIdsBytes(int index) {
      return reqIds_.getByteString(index);
    }
    /**
     * <code>repeated string ReqIds = 1;</code>
     * @param index The index to set the value at.
     * @param value The reqIds to set.
     * @return This builder for chaining.
     */
    public Builder setReqIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureReqIdsIsMutable();
      reqIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ReqIds = 1;</code>
     * @param value The reqIds to add.
     * @return This builder for chaining.
     */
    public Builder addReqIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureReqIdsIsMutable();
      reqIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ReqIds = 1;</code>
     * @param values The reqIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllReqIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureReqIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, reqIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ReqIds = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReqIds() {
      reqIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ReqIds = 1;</code>
     * @param value The bytes of the reqIds to add.
     * @return This builder for chaining.
     */
    public Builder addReqIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureReqIdsIsMutable();
      reqIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Request.VodGetDirectEditResultRequest)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Request.VodGetDirectEditResultRequest)
  private static final com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest();
  }

  public static com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetDirectEditResultRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodGetDirectEditResultRequest>() {
    @java.lang.Override
    public VodGetDirectEditResultRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetDirectEditResultRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetDirectEditResultRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetDirectEditResultRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

