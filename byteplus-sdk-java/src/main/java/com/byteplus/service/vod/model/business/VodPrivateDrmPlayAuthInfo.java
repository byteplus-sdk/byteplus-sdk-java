// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_play.proto

package com.byteplus.service.vod.model.business;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Business.VodPrivateDrmPlayAuthInfo}
 */
public final class VodPrivateDrmPlayAuthInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.VodPrivateDrmPlayAuthInfo)
    VodPrivateDrmPlayAuthInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodPrivateDrmPlayAuthInfo.newBuilder() to construct.
  private VodPrivateDrmPlayAuthInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodPrivateDrmPlayAuthInfo() {
    playAuthId_ = "";
    playAuthContent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodPrivateDrmPlayAuthInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodPrivateDrmPlayAuthInfo(
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

            playAuthId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            playAuthContent_ = s;
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
    return com.byteplus.service.vod.model.business.VodPlay.internal_static_Byteplus_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodPlay.internal_static_Byteplus_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo.class, com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo.Builder.class);
  }

  public static final int PLAYAUTHID_FIELD_NUMBER = 1;
  private volatile java.lang.Object playAuthId_;
  /**
   * <pre>
   * 播放许可id
   * </pre>
   *
   * <code>string PlayAuthId = 1;</code>
   * @return The playAuthId.
   */
  @java.lang.Override
  public java.lang.String getPlayAuthId() {
    java.lang.Object ref = playAuthId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      playAuthId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 播放许可id
   * </pre>
   *
   * <code>string PlayAuthId = 1;</code>
   * @return The bytes for playAuthId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlayAuthIdBytes() {
    java.lang.Object ref = playAuthId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      playAuthId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAYAUTHCONTENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object playAuthContent_;
  /**
   * <pre>
   * 播放许可内容
   * </pre>
   *
   * <code>string PlayAuthContent = 2;</code>
   * @return The playAuthContent.
   */
  @java.lang.Override
  public java.lang.String getPlayAuthContent() {
    java.lang.Object ref = playAuthContent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      playAuthContent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 播放许可内容
   * </pre>
   *
   * <code>string PlayAuthContent = 2;</code>
   * @return The bytes for playAuthContent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlayAuthContentBytes() {
    java.lang.Object ref = playAuthContent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      playAuthContent_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(playAuthId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, playAuthId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(playAuthContent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, playAuthContent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(playAuthId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, playAuthId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(playAuthContent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, playAuthContent_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo other = (com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo) obj;

    if (!getPlayAuthId()
        .equals(other.getPlayAuthId())) return false;
    if (!getPlayAuthContent()
        .equals(other.getPlayAuthContent())) return false;
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
    hash = (37 * hash) + PLAYAUTHID_FIELD_NUMBER;
    hash = (53 * hash) + getPlayAuthId().hashCode();
    hash = (37 * hash) + PLAYAUTHCONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getPlayAuthContent().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Business.VodPrivateDrmPlayAuthInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.VodPrivateDrmPlayAuthInfo)
      com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.business.VodPlay.internal_static_Byteplus_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodPlay.internal_static_Byteplus_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo.class, com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo.newBuilder()
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
      playAuthId_ = "";

      playAuthContent_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodPlay.internal_static_Byteplus_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo build() {
      com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo buildPartial() {
      com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo result = new com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo(this);
      result.playAuthId_ = playAuthId_;
      result.playAuthContent_ = playAuthContent_;
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
      if (other instanceof com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo) {
        return mergeFrom((com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo other) {
      if (other == com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo.getDefaultInstance()) return this;
      if (!other.getPlayAuthId().isEmpty()) {
        playAuthId_ = other.playAuthId_;
        onChanged();
      }
      if (!other.getPlayAuthContent().isEmpty()) {
        playAuthContent_ = other.playAuthContent_;
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
      com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object playAuthId_ = "";
    /**
     * <pre>
     * 播放许可id
     * </pre>
     *
     * <code>string PlayAuthId = 1;</code>
     * @return The playAuthId.
     */
    public java.lang.String getPlayAuthId() {
      java.lang.Object ref = playAuthId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        playAuthId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 播放许可id
     * </pre>
     *
     * <code>string PlayAuthId = 1;</code>
     * @return The bytes for playAuthId.
     */
    public com.google.protobuf.ByteString
        getPlayAuthIdBytes() {
      java.lang.Object ref = playAuthId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        playAuthId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 播放许可id
     * </pre>
     *
     * <code>string PlayAuthId = 1;</code>
     * @param value The playAuthId to set.
     * @return This builder for chaining.
     */
    public Builder setPlayAuthId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      playAuthId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 播放许可id
     * </pre>
     *
     * <code>string PlayAuthId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayAuthId() {
      
      playAuthId_ = getDefaultInstance().getPlayAuthId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 播放许可id
     * </pre>
     *
     * <code>string PlayAuthId = 1;</code>
     * @param value The bytes for playAuthId to set.
     * @return This builder for chaining.
     */
    public Builder setPlayAuthIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      playAuthId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object playAuthContent_ = "";
    /**
     * <pre>
     * 播放许可内容
     * </pre>
     *
     * <code>string PlayAuthContent = 2;</code>
     * @return The playAuthContent.
     */
    public java.lang.String getPlayAuthContent() {
      java.lang.Object ref = playAuthContent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        playAuthContent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 播放许可内容
     * </pre>
     *
     * <code>string PlayAuthContent = 2;</code>
     * @return The bytes for playAuthContent.
     */
    public com.google.protobuf.ByteString
        getPlayAuthContentBytes() {
      java.lang.Object ref = playAuthContent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        playAuthContent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 播放许可内容
     * </pre>
     *
     * <code>string PlayAuthContent = 2;</code>
     * @param value The playAuthContent to set.
     * @return This builder for chaining.
     */
    public Builder setPlayAuthContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      playAuthContent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 播放许可内容
     * </pre>
     *
     * <code>string PlayAuthContent = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayAuthContent() {
      
      playAuthContent_ = getDefaultInstance().getPlayAuthContent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 播放许可内容
     * </pre>
     *
     * <code>string PlayAuthContent = 2;</code>
     * @param value The bytes for playAuthContent to set.
     * @return This builder for chaining.
     */
    public Builder setPlayAuthContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      playAuthContent_ = value;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.VodPrivateDrmPlayAuthInfo)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.VodPrivateDrmPlayAuthInfo)
  private static final com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo();
  }

  public static com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodPrivateDrmPlayAuthInfo>
      PARSER = new com.google.protobuf.AbstractParser<VodPrivateDrmPlayAuthInfo>() {
    @java.lang.Override
    public VodPrivateDrmPlayAuthInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodPrivateDrmPlayAuthInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodPrivateDrmPlayAuthInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodPrivateDrmPlayAuthInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.VodPrivateDrmPlayAuthInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

