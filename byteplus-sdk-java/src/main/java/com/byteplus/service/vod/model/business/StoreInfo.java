// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_upload.proto

package com.byteplus.service.vod.model.business;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Business.StoreInfo}
 */
public final class StoreInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.StoreInfo)
    StoreInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StoreInfo.newBuilder() to construct.
  private StoreInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StoreInfo() {
    storeUri_ = "";
    auth_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StoreInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StoreInfo(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            auth_ = s;
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
    return com.byteplus.service.vod.model.business.VodUpload.internal_static_Byteplus_Vod_Models_Business_StoreInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodUpload.internal_static_Byteplus_Vod_Models_Business_StoreInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.business.StoreInfo.class, com.byteplus.service.vod.model.business.StoreInfo.Builder.class);
  }

  public static final int STOREURI_FIELD_NUMBER = 1;
  private volatile java.lang.Object storeUri_;
  /**
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

  public static final int AUTH_FIELD_NUMBER = 2;
  private volatile java.lang.Object auth_;
  /**
   * <code>string Auth = 2;</code>
   * @return The auth.
   */
  @java.lang.Override
  public java.lang.String getAuth() {
    java.lang.Object ref = auth_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      auth_ = s;
      return s;
    }
  }
  /**
   * <code>string Auth = 2;</code>
   * @return The bytes for auth.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAuthBytes() {
    java.lang.Object ref = auth_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      auth_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, storeUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(auth_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, auth_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(auth_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, auth_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.StoreInfo)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.StoreInfo other = (com.byteplus.service.vod.model.business.StoreInfo) obj;

    if (!getStoreUri()
        .equals(other.getStoreUri())) return false;
    if (!getAuth()
        .equals(other.getAuth())) return false;
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
    hash = (37 * hash) + AUTH_FIELD_NUMBER;
    hash = (53 * hash) + getAuth().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.StoreInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.StoreInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.StoreInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.StoreInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.StoreInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.StoreInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.StoreInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.StoreInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.StoreInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.StoreInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.StoreInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.StoreInfo parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.business.StoreInfo prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Business.StoreInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.StoreInfo)
      com.byteplus.service.vod.model.business.StoreInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.business.VodUpload.internal_static_Byteplus_Vod_Models_Business_StoreInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodUpload.internal_static_Byteplus_Vod_Models_Business_StoreInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.business.StoreInfo.class, com.byteplus.service.vod.model.business.StoreInfo.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.StoreInfo.newBuilder()
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

      auth_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodUpload.internal_static_Byteplus_Vod_Models_Business_StoreInfo_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.StoreInfo getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.StoreInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.StoreInfo build() {
      com.byteplus.service.vod.model.business.StoreInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.StoreInfo buildPartial() {
      com.byteplus.service.vod.model.business.StoreInfo result = new com.byteplus.service.vod.model.business.StoreInfo(this);
      result.storeUri_ = storeUri_;
      result.auth_ = auth_;
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
      if (other instanceof com.byteplus.service.vod.model.business.StoreInfo) {
        return mergeFrom((com.byteplus.service.vod.model.business.StoreInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.StoreInfo other) {
      if (other == com.byteplus.service.vod.model.business.StoreInfo.getDefaultInstance()) return this;
      if (!other.getStoreUri().isEmpty()) {
        storeUri_ = other.storeUri_;
        onChanged();
      }
      if (!other.getAuth().isEmpty()) {
        auth_ = other.auth_;
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
      com.byteplus.service.vod.model.business.StoreInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.StoreInfo) e.getUnfinishedMessage();
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
     * <code>string StoreUri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStoreUri() {
      
      storeUri_ = getDefaultInstance().getStoreUri();
      onChanged();
      return this;
    }
    /**
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

    private java.lang.Object auth_ = "";
    /**
     * <code>string Auth = 2;</code>
     * @return The auth.
     */
    public java.lang.String getAuth() {
      java.lang.Object ref = auth_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        auth_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Auth = 2;</code>
     * @return The bytes for auth.
     */
    public com.google.protobuf.ByteString
        getAuthBytes() {
      java.lang.Object ref = auth_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        auth_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Auth = 2;</code>
     * @param value The auth to set.
     * @return This builder for chaining.
     */
    public Builder setAuth(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      auth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Auth = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuth() {
      
      auth_ = getDefaultInstance().getAuth();
      onChanged();
      return this;
    }
    /**
     * <code>string Auth = 2;</code>
     * @param value The bytes for auth to set.
     * @return This builder for chaining.
     */
    public Builder setAuthBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      auth_ = value;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.StoreInfo)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.StoreInfo)
  private static final com.byteplus.service.vod.model.business.StoreInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.StoreInfo();
  }

  public static com.byteplus.service.vod.model.business.StoreInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StoreInfo>
      PARSER = new com.google.protobuf.AbstractParser<StoreInfo>() {
    @java.lang.Override
    public StoreInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StoreInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StoreInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StoreInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.StoreInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

