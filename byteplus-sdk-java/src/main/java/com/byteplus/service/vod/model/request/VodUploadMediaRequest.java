// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Request.VodUploadMediaRequest}
 */
public final class VodUploadMediaRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Request.VodUploadMediaRequest)
    VodUploadMediaRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodUploadMediaRequest.newBuilder() to construct.
  private VodUploadMediaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodUploadMediaRequest() {
    spaceName_ = "";
    filePath_ = "";
    callbackArgs_ = "";
    functions_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodUploadMediaRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodUploadMediaRequest(
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

            spaceName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            filePath_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            callbackArgs_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            functions_ = s;
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
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodUploadMediaRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodUploadMediaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.request.VodUploadMediaRequest.class, com.byteplus.service.vod.model.request.VodUploadMediaRequest.Builder.class);
  }

  public static final int SPACENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceName_;
  /**
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  @java.lang.Override
  public java.lang.String getSpaceName() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spaceName_ = s;
      return s;
    }
  }
  /**
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpaceNameBytes() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spaceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILEPATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object filePath_;
  /**
   * <code>string FilePath = 2;</code>
   * @return The filePath.
   */
  @java.lang.Override
  public java.lang.String getFilePath() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filePath_ = s;
      return s;
    }
  }
  /**
   * <code>string FilePath = 2;</code>
   * @return The bytes for filePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilePathBytes() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CALLBACKARGS_FIELD_NUMBER = 3;
  private volatile java.lang.Object callbackArgs_;
  /**
   * <code>string CallbackArgs = 3;</code>
   * @return The callbackArgs.
   */
  @java.lang.Override
  public java.lang.String getCallbackArgs() {
    java.lang.Object ref = callbackArgs_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      callbackArgs_ = s;
      return s;
    }
  }
  /**
   * <code>string CallbackArgs = 3;</code>
   * @return The bytes for callbackArgs.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCallbackArgsBytes() {
    java.lang.Object ref = callbackArgs_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      callbackArgs_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FUNCTIONS_FIELD_NUMBER = 4;
  private volatile java.lang.Object functions_;
  /**
   * <code>string Functions = 4;</code>
   * @return The functions.
   */
  @java.lang.Override
  public java.lang.String getFunctions() {
    java.lang.Object ref = functions_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      functions_ = s;
      return s;
    }
  }
  /**
   * <code>string Functions = 4;</code>
   * @return The bytes for functions.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFunctionsBytes() {
    java.lang.Object ref = functions_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      functions_ = b;
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
    if (!getSpaceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spaceName_);
    }
    if (!getFilePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filePath_);
    }
    if (!getCallbackArgsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, callbackArgs_);
    }
    if (!getFunctionsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, functions_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSpaceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spaceName_);
    }
    if (!getFilePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filePath_);
    }
    if (!getCallbackArgsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, callbackArgs_);
    }
    if (!getFunctionsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, functions_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.request.VodUploadMediaRequest)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.request.VodUploadMediaRequest other = (com.byteplus.service.vod.model.request.VodUploadMediaRequest) obj;

    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (!getFilePath()
        .equals(other.getFilePath())) return false;
    if (!getCallbackArgs()
        .equals(other.getCallbackArgs())) return false;
    if (!getFunctions()
        .equals(other.getFunctions())) return false;
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
    hash = (37 * hash) + SPACENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceName().hashCode();
    hash = (37 * hash) + FILEPATH_FIELD_NUMBER;
    hash = (53 * hash) + getFilePath().hashCode();
    hash = (37 * hash) + CALLBACKARGS_FIELD_NUMBER;
    hash = (53 * hash) + getCallbackArgs().hashCode();
    hash = (37 * hash) + FUNCTIONS_FIELD_NUMBER;
    hash = (53 * hash) + getFunctions().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.request.VodUploadMediaRequest prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Request.VodUploadMediaRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Request.VodUploadMediaRequest)
      com.byteplus.service.vod.model.request.VodUploadMediaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodUploadMediaRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodUploadMediaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.request.VodUploadMediaRequest.class, com.byteplus.service.vod.model.request.VodUploadMediaRequest.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.request.VodUploadMediaRequest.newBuilder()
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
      spaceName_ = "";

      filePath_ = "";

      callbackArgs_ = "";

      functions_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodUploadMediaRequest_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodUploadMediaRequest getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.request.VodUploadMediaRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodUploadMediaRequest build() {
      com.byteplus.service.vod.model.request.VodUploadMediaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodUploadMediaRequest buildPartial() {
      com.byteplus.service.vod.model.request.VodUploadMediaRequest result = new com.byteplus.service.vod.model.request.VodUploadMediaRequest(this);
      result.spaceName_ = spaceName_;
      result.filePath_ = filePath_;
      result.callbackArgs_ = callbackArgs_;
      result.functions_ = functions_;
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
      if (other instanceof com.byteplus.service.vod.model.request.VodUploadMediaRequest) {
        return mergeFrom((com.byteplus.service.vod.model.request.VodUploadMediaRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.request.VodUploadMediaRequest other) {
      if (other == com.byteplus.service.vod.model.request.VodUploadMediaRequest.getDefaultInstance()) return this;
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (!other.getFilePath().isEmpty()) {
        filePath_ = other.filePath_;
        onChanged();
      }
      if (!other.getCallbackArgs().isEmpty()) {
        callbackArgs_ = other.callbackArgs_;
        onChanged();
      }
      if (!other.getFunctions().isEmpty()) {
        functions_ = other.functions_;
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
      com.byteplus.service.vod.model.request.VodUploadMediaRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.request.VodUploadMediaRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object spaceName_ = "";
    /**
     * <code>string SpaceName = 1;</code>
     * @return The spaceName.
     */
    public java.lang.String getSpaceName() {
      java.lang.Object ref = spaceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spaceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string SpaceName = 1;</code>
     * @return The bytes for spaceName.
     */
    public com.google.protobuf.ByteString
        getSpaceNameBytes() {
      java.lang.Object ref = spaceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spaceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string SpaceName = 1;</code>
     * @param value The spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spaceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string SpaceName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceName() {
      
      spaceName_ = getDefaultInstance().getSpaceName();
      onChanged();
      return this;
    }
    /**
     * <code>string SpaceName = 1;</code>
     * @param value The bytes for spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spaceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filePath_ = "";
    /**
     * <code>string FilePath = 2;</code>
     * @return The filePath.
     */
    public java.lang.String getFilePath() {
      java.lang.Object ref = filePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string FilePath = 2;</code>
     * @return The bytes for filePath.
     */
    public com.google.protobuf.ByteString
        getFilePathBytes() {
      java.lang.Object ref = filePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string FilePath = 2;</code>
     * @param value The filePath to set.
     * @return This builder for chaining.
     */
    public Builder setFilePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string FilePath = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilePath() {
      
      filePath_ = getDefaultInstance().getFilePath();
      onChanged();
      return this;
    }
    /**
     * <code>string FilePath = 2;</code>
     * @param value The bytes for filePath to set.
     * @return This builder for chaining.
     */
    public Builder setFilePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filePath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object callbackArgs_ = "";
    /**
     * <code>string CallbackArgs = 3;</code>
     * @return The callbackArgs.
     */
    public java.lang.String getCallbackArgs() {
      java.lang.Object ref = callbackArgs_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callbackArgs_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CallbackArgs = 3;</code>
     * @return The bytes for callbackArgs.
     */
    public com.google.protobuf.ByteString
        getCallbackArgsBytes() {
      java.lang.Object ref = callbackArgs_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callbackArgs_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CallbackArgs = 3;</code>
     * @param value The callbackArgs to set.
     * @return This builder for chaining.
     */
    public Builder setCallbackArgs(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callbackArgs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CallbackArgs = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCallbackArgs() {
      
      callbackArgs_ = getDefaultInstance().getCallbackArgs();
      onChanged();
      return this;
    }
    /**
     * <code>string CallbackArgs = 3;</code>
     * @param value The bytes for callbackArgs to set.
     * @return This builder for chaining.
     */
    public Builder setCallbackArgsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      callbackArgs_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object functions_ = "";
    /**
     * <code>string Functions = 4;</code>
     * @return The functions.
     */
    public java.lang.String getFunctions() {
      java.lang.Object ref = functions_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        functions_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Functions = 4;</code>
     * @return The bytes for functions.
     */
    public com.google.protobuf.ByteString
        getFunctionsBytes() {
      java.lang.Object ref = functions_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        functions_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Functions = 4;</code>
     * @param value The functions to set.
     * @return This builder for chaining.
     */
    public Builder setFunctions(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      functions_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Functions = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFunctions() {
      
      functions_ = getDefaultInstance().getFunctions();
      onChanged();
      return this;
    }
    /**
     * <code>string Functions = 4;</code>
     * @param value The bytes for functions to set.
     * @return This builder for chaining.
     */
    public Builder setFunctionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      functions_ = value;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Request.VodUploadMediaRequest)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Request.VodUploadMediaRequest)
  private static final com.byteplus.service.vod.model.request.VodUploadMediaRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.request.VodUploadMediaRequest();
  }

  public static com.byteplus.service.vod.model.request.VodUploadMediaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodUploadMediaRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodUploadMediaRequest>() {
    @java.lang.Override
    public VodUploadMediaRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodUploadMediaRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodUploadMediaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodUploadMediaRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.request.VodUploadMediaRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

