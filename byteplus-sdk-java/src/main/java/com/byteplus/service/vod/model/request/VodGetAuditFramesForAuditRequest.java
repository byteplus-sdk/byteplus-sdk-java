// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Request.VodGetAuditFramesForAuditRequest}
 */
public final class VodGetAuditFramesForAuditRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Request.VodGetAuditFramesForAuditRequest)
    VodGetAuditFramesForAuditRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetAuditFramesForAuditRequest.newBuilder() to construct.
  private VodGetAuditFramesForAuditRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetAuditFramesForAuditRequest() {
    vid_ = "";
    strategy_ = "";
    minNumberOfFrames_ = "";
    maxNumberOfFrames_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetAuditFramesForAuditRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetAuditFramesForAuditRequest(
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

            strategy_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            minNumberOfFrames_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            maxNumberOfFrames_ = s;
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
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetAuditFramesForAuditRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetAuditFramesForAuditRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest.class, com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest.Builder.class);
  }

  public static final int VID_FIELD_NUMBER = 1;
  private volatile java.lang.Object vid_;
  /**
   * <pre>
   *视频ID
   * </pre>
   *
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
   * <pre>
   *视频ID
   * </pre>
   *
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

  public static final int STRATEGY_FIELD_NUMBER = 2;
  private volatile java.lang.Object strategy_;
  /**
   * <pre>
   *审核帧模板信息中的Strategy，抽帧策略
   * </pre>
   *
   * <code>string Strategy = 2;</code>
   * @return The strategy.
   */
  @java.lang.Override
  public java.lang.String getStrategy() {
    java.lang.Object ref = strategy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      strategy_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *审核帧模板信息中的Strategy，抽帧策略
   * </pre>
   *
   * <code>string Strategy = 2;</code>
   * @return The bytes for strategy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStrategyBytes() {
    java.lang.Object ref = strategy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      strategy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MINNUMBEROFFRAMES_FIELD_NUMBER = 3;
  private volatile java.lang.Object minNumberOfFrames_;
  /**
   * <pre>
   *最小帧数，未设置时以服务配置默认值为准
   * </pre>
   *
   * <code>string MinNumberOfFrames = 3;</code>
   * @return The minNumberOfFrames.
   */
  @java.lang.Override
  public java.lang.String getMinNumberOfFrames() {
    java.lang.Object ref = minNumberOfFrames_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      minNumberOfFrames_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *最小帧数，未设置时以服务配置默认值为准
   * </pre>
   *
   * <code>string MinNumberOfFrames = 3;</code>
   * @return The bytes for minNumberOfFrames.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMinNumberOfFramesBytes() {
    java.lang.Object ref = minNumberOfFrames_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      minNumberOfFrames_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAXNUMBEROFFRAMES_FIELD_NUMBER = 4;
  private volatile java.lang.Object maxNumberOfFrames_;
  /**
   * <pre>
   *最大帧数，未设置时以服务配置默认值为准
   * </pre>
   *
   * <code>string MaxNumberOfFrames = 4;</code>
   * @return The maxNumberOfFrames.
   */
  @java.lang.Override
  public java.lang.String getMaxNumberOfFrames() {
    java.lang.Object ref = maxNumberOfFrames_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      maxNumberOfFrames_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *最大帧数，未设置时以服务配置默认值为准
   * </pre>
   *
   * <code>string MaxNumberOfFrames = 4;</code>
   * @return The bytes for maxNumberOfFrames.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMaxNumberOfFramesBytes() {
    java.lang.Object ref = maxNumberOfFrames_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      maxNumberOfFrames_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(strategy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, strategy_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minNumberOfFrames_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, minNumberOfFrames_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(maxNumberOfFrames_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, maxNumberOfFrames_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(strategy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, strategy_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minNumberOfFrames_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, minNumberOfFrames_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(maxNumberOfFrames_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, maxNumberOfFrames_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest other = (com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest) obj;

    if (!getVid()
        .equals(other.getVid())) return false;
    if (!getStrategy()
        .equals(other.getStrategy())) return false;
    if (!getMinNumberOfFrames()
        .equals(other.getMinNumberOfFrames())) return false;
    if (!getMaxNumberOfFrames()
        .equals(other.getMaxNumberOfFrames())) return false;
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
    hash = (37 * hash) + STRATEGY_FIELD_NUMBER;
    hash = (53 * hash) + getStrategy().hashCode();
    hash = (37 * hash) + MINNUMBEROFFRAMES_FIELD_NUMBER;
    hash = (53 * hash) + getMinNumberOfFrames().hashCode();
    hash = (37 * hash) + MAXNUMBEROFFRAMES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxNumberOfFrames().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Request.VodGetAuditFramesForAuditRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Request.VodGetAuditFramesForAuditRequest)
      com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetAuditFramesForAuditRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetAuditFramesForAuditRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest.class, com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest.newBuilder()
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

      strategy_ = "";

      minNumberOfFrames_ = "";

      maxNumberOfFrames_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetAuditFramesForAuditRequest_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest build() {
      com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest buildPartial() {
      com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest result = new com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest(this);
      result.vid_ = vid_;
      result.strategy_ = strategy_;
      result.minNumberOfFrames_ = minNumberOfFrames_;
      result.maxNumberOfFrames_ = maxNumberOfFrames_;
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
      if (other instanceof com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest) {
        return mergeFrom((com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest other) {
      if (other == com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest.getDefaultInstance()) return this;
      if (!other.getVid().isEmpty()) {
        vid_ = other.vid_;
        onChanged();
      }
      if (!other.getStrategy().isEmpty()) {
        strategy_ = other.strategy_;
        onChanged();
      }
      if (!other.getMinNumberOfFrames().isEmpty()) {
        minNumberOfFrames_ = other.minNumberOfFrames_;
        onChanged();
      }
      if (!other.getMaxNumberOfFrames().isEmpty()) {
        maxNumberOfFrames_ = other.maxNumberOfFrames_;
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
      com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest) e.getUnfinishedMessage();
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
     * <pre>
     *视频ID
     * </pre>
     *
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
     * <pre>
     *视频ID
     * </pre>
     *
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
     * <pre>
     *视频ID
     * </pre>
     *
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
     * <pre>
     *视频ID
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVid() {
      
      vid_ = getDefaultInstance().getVid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频ID
     * </pre>
     *
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

    private java.lang.Object strategy_ = "";
    /**
     * <pre>
     *审核帧模板信息中的Strategy，抽帧策略
     * </pre>
     *
     * <code>string Strategy = 2;</code>
     * @return The strategy.
     */
    public java.lang.String getStrategy() {
      java.lang.Object ref = strategy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        strategy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *审核帧模板信息中的Strategy，抽帧策略
     * </pre>
     *
     * <code>string Strategy = 2;</code>
     * @return The bytes for strategy.
     */
    public com.google.protobuf.ByteString
        getStrategyBytes() {
      java.lang.Object ref = strategy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        strategy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *审核帧模板信息中的Strategy，抽帧策略
     * </pre>
     *
     * <code>string Strategy = 2;</code>
     * @param value The strategy to set.
     * @return This builder for chaining.
     */
    public Builder setStrategy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      strategy_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *审核帧模板信息中的Strategy，抽帧策略
     * </pre>
     *
     * <code>string Strategy = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStrategy() {
      
      strategy_ = getDefaultInstance().getStrategy();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *审核帧模板信息中的Strategy，抽帧策略
     * </pre>
     *
     * <code>string Strategy = 2;</code>
     * @param value The bytes for strategy to set.
     * @return This builder for chaining.
     */
    public Builder setStrategyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      strategy_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object minNumberOfFrames_ = "";
    /**
     * <pre>
     *最小帧数，未设置时以服务配置默认值为准
     * </pre>
     *
     * <code>string MinNumberOfFrames = 3;</code>
     * @return The minNumberOfFrames.
     */
    public java.lang.String getMinNumberOfFrames() {
      java.lang.Object ref = minNumberOfFrames_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        minNumberOfFrames_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *最小帧数，未设置时以服务配置默认值为准
     * </pre>
     *
     * <code>string MinNumberOfFrames = 3;</code>
     * @return The bytes for minNumberOfFrames.
     */
    public com.google.protobuf.ByteString
        getMinNumberOfFramesBytes() {
      java.lang.Object ref = minNumberOfFrames_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        minNumberOfFrames_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *最小帧数，未设置时以服务配置默认值为准
     * </pre>
     *
     * <code>string MinNumberOfFrames = 3;</code>
     * @param value The minNumberOfFrames to set.
     * @return This builder for chaining.
     */
    public Builder setMinNumberOfFrames(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      minNumberOfFrames_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *最小帧数，未设置时以服务配置默认值为准
     * </pre>
     *
     * <code>string MinNumberOfFrames = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinNumberOfFrames() {
      
      minNumberOfFrames_ = getDefaultInstance().getMinNumberOfFrames();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *最小帧数，未设置时以服务配置默认值为准
     * </pre>
     *
     * <code>string MinNumberOfFrames = 3;</code>
     * @param value The bytes for minNumberOfFrames to set.
     * @return This builder for chaining.
     */
    public Builder setMinNumberOfFramesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      minNumberOfFrames_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object maxNumberOfFrames_ = "";
    /**
     * <pre>
     *最大帧数，未设置时以服务配置默认值为准
     * </pre>
     *
     * <code>string MaxNumberOfFrames = 4;</code>
     * @return The maxNumberOfFrames.
     */
    public java.lang.String getMaxNumberOfFrames() {
      java.lang.Object ref = maxNumberOfFrames_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        maxNumberOfFrames_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *最大帧数，未设置时以服务配置默认值为准
     * </pre>
     *
     * <code>string MaxNumberOfFrames = 4;</code>
     * @return The bytes for maxNumberOfFrames.
     */
    public com.google.protobuf.ByteString
        getMaxNumberOfFramesBytes() {
      java.lang.Object ref = maxNumberOfFrames_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        maxNumberOfFrames_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *最大帧数，未设置时以服务配置默认值为准
     * </pre>
     *
     * <code>string MaxNumberOfFrames = 4;</code>
     * @param value The maxNumberOfFrames to set.
     * @return This builder for chaining.
     */
    public Builder setMaxNumberOfFrames(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      maxNumberOfFrames_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *最大帧数，未设置时以服务配置默认值为准
     * </pre>
     *
     * <code>string MaxNumberOfFrames = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxNumberOfFrames() {
      
      maxNumberOfFrames_ = getDefaultInstance().getMaxNumberOfFrames();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *最大帧数，未设置时以服务配置默认值为准
     * </pre>
     *
     * <code>string MaxNumberOfFrames = 4;</code>
     * @param value The bytes for maxNumberOfFrames to set.
     * @return This builder for chaining.
     */
    public Builder setMaxNumberOfFramesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      maxNumberOfFrames_ = value;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Request.VodGetAuditFramesForAuditRequest)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Request.VodGetAuditFramesForAuditRequest)
  private static final com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest();
  }

  public static com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetAuditFramesForAuditRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodGetAuditFramesForAuditRequest>() {
    @java.lang.Override
    public VodGetAuditFramesForAuditRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetAuditFramesForAuditRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetAuditFramesForAuditRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetAuditFramesForAuditRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.request.VodGetAuditFramesForAuditRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

