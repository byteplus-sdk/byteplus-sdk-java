// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Request.VodGetAutomaticSpeechRecognitionForAuditRequest}
 */
public final class VodGetAutomaticSpeechRecognitionForAuditRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Request.VodGetAutomaticSpeechRecognitionForAuditRequest)
    VodGetAutomaticSpeechRecognitionForAuditRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetAutomaticSpeechRecognitionForAuditRequest.newBuilder() to construct.
  private VodGetAutomaticSpeechRecognitionForAuditRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetAutomaticSpeechRecognitionForAuditRequest() {
    vid_ = "";
    strategy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetAutomaticSpeechRecognitionForAuditRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetAutomaticSpeechRecognitionForAuditRequest(
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
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetAutomaticSpeechRecognitionForAuditRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetAutomaticSpeechRecognitionForAuditRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest.class, com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest.Builder.class);
  }

  public static final int VID_FIELD_NUMBER = 1;
  private volatile java.lang.Object vid_;
  /**
   * <pre>
   * Vid
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
   * Vid
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
   * 语音转文字模板中的Strategy
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
   * 语音转文字模板中的Strategy
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest other = (com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest) obj;

    if (!getVid()
        .equals(other.getVid())) return false;
    if (!getStrategy()
        .equals(other.getStrategy())) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Request.VodGetAutomaticSpeechRecognitionForAuditRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Request.VodGetAutomaticSpeechRecognitionForAuditRequest)
      com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetAutomaticSpeechRecognitionForAuditRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetAutomaticSpeechRecognitionForAuditRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest.class, com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest.newBuilder()
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

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodGetAutomaticSpeechRecognitionForAuditRequest_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest build() {
      com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest buildPartial() {
      com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest result = new com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest(this);
      result.vid_ = vid_;
      result.strategy_ = strategy_;
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
      if (other instanceof com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest) {
        return mergeFrom((com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest other) {
      if (other == com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest.getDefaultInstance()) return this;
      if (!other.getVid().isEmpty()) {
        vid_ = other.vid_;
        onChanged();
      }
      if (!other.getStrategy().isEmpty()) {
        strategy_ = other.strategy_;
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
      com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest) e.getUnfinishedMessage();
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
     * Vid
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
     * Vid
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
     * Vid
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
     * Vid
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
     * Vid
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
     * 语音转文字模板中的Strategy
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
     * 语音转文字模板中的Strategy
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
     * 语音转文字模板中的Strategy
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
     * 语音转文字模板中的Strategy
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
     * 语音转文字模板中的Strategy
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Request.VodGetAutomaticSpeechRecognitionForAuditRequest)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Request.VodGetAutomaticSpeechRecognitionForAuditRequest)
  private static final com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest();
  }

  public static com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetAutomaticSpeechRecognitionForAuditRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodGetAutomaticSpeechRecognitionForAuditRequest>() {
    @java.lang.Override
    public VodGetAutomaticSpeechRecognitionForAuditRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetAutomaticSpeechRecognitionForAuditRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetAutomaticSpeechRecognitionForAuditRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetAutomaticSpeechRecognitionForAuditRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.request.VodGetAutomaticSpeechRecognitionForAuditRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

