// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Request.VodSubmitBlockTasksRequest}
 */
public final class VodSubmitBlockTasksRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Request.VodSubmitBlockTasksRequest)
    VodSubmitBlockTasksRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodSubmitBlockTasksRequest.newBuilder() to construct.
  private VodSubmitBlockTasksRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodSubmitBlockTasksRequest() {
    fileUrls_ = "";
    operation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodSubmitBlockTasksRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodSubmitBlockTasksRequest(
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

            fileUrls_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            operation_ = s;
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
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodSubmitBlockTasksRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodSubmitBlockTasksRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest.class, com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest.Builder.class);
  }

  public static final int FILEURLS_FIELD_NUMBER = 1;
  private volatile java.lang.Object fileUrls_;
  /**
   * <pre>
   *媒体Url列表：
   *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
   *用&#92;n分隔。 每次最多可提交 100 条。
   * </pre>
   *
   * <code>string FileUrls = 1;</code>
   * @return The fileUrls.
   */
  @java.lang.Override
  public java.lang.String getFileUrls() {
    java.lang.Object ref = fileUrls_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileUrls_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *媒体Url列表：
   *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
   *用&#92;n分隔。 每次最多可提交 100 条。
   * </pre>
   *
   * <code>string FileUrls = 1;</code>
   * @return The bytes for fileUrls.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileUrlsBytes() {
    java.lang.Object ref = fileUrls_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileUrls_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object operation_;
  /**
   * <pre>
   * forbid：禁播，recover：解禁。
   * </pre>
   *
   * <code>string Operation = 2;</code>
   * @return The operation.
   */
  @java.lang.Override
  public java.lang.String getOperation() {
    java.lang.Object ref = operation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * forbid：禁播，recover：解禁。
   * </pre>
   *
   * <code>string Operation = 2;</code>
   * @return The bytes for operation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOperationBytes() {
    java.lang.Object ref = operation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operation_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileUrls_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fileUrls_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, operation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileUrls_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fileUrls_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, operation_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest other = (com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest) obj;

    if (!getFileUrls()
        .equals(other.getFileUrls())) return false;
    if (!getOperation()
        .equals(other.getOperation())) return false;
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
    hash = (37 * hash) + FILEURLS_FIELD_NUMBER;
    hash = (53 * hash) + getFileUrls().hashCode();
    hash = (37 * hash) + OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + getOperation().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Request.VodSubmitBlockTasksRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Request.VodSubmitBlockTasksRequest)
      com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodSubmitBlockTasksRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodSubmitBlockTasksRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest.class, com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest.newBuilder()
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
      fileUrls_ = "";

      operation_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodSubmitBlockTasksRequest_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest build() {
      com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest buildPartial() {
      com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest result = new com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest(this);
      result.fileUrls_ = fileUrls_;
      result.operation_ = operation_;
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
      if (other instanceof com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest) {
        return mergeFrom((com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest other) {
      if (other == com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest.getDefaultInstance()) return this;
      if (!other.getFileUrls().isEmpty()) {
        fileUrls_ = other.fileUrls_;
        onChanged();
      }
      if (!other.getOperation().isEmpty()) {
        operation_ = other.operation_;
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
      com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fileUrls_ = "";
    /**
     * <pre>
     *媒体Url列表：
     *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
     *用&#92;n分隔。 每次最多可提交 100 条。
     * </pre>
     *
     * <code>string FileUrls = 1;</code>
     * @return The fileUrls.
     */
    public java.lang.String getFileUrls() {
      java.lang.Object ref = fileUrls_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileUrls_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *媒体Url列表：
     *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
     *用&#92;n分隔。 每次最多可提交 100 条。
     * </pre>
     *
     * <code>string FileUrls = 1;</code>
     * @return The bytes for fileUrls.
     */
    public com.google.protobuf.ByteString
        getFileUrlsBytes() {
      java.lang.Object ref = fileUrls_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileUrls_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *媒体Url列表：
     *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
     *用&#92;n分隔。 每次最多可提交 100 条。
     * </pre>
     *
     * <code>string FileUrls = 1;</code>
     * @param value The fileUrls to set.
     * @return This builder for chaining.
     */
    public Builder setFileUrls(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileUrls_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *媒体Url列表：
     *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
     *用&#92;n分隔。 每次最多可提交 100 条。
     * </pre>
     *
     * <code>string FileUrls = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileUrls() {
      
      fileUrls_ = getDefaultInstance().getFileUrls();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *媒体Url列表：
     *指定一个或多个内容 URL，内容 URL 以 http:// 或 https:// 开头。多个内容 URL
     *用&#92;n分隔。 每次最多可提交 100 条。
     * </pre>
     *
     * <code>string FileUrls = 1;</code>
     * @param value The bytes for fileUrls to set.
     * @return This builder for chaining.
     */
    public Builder setFileUrlsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileUrls_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object operation_ = "";
    /**
     * <pre>
     * forbid：禁播，recover：解禁。
     * </pre>
     *
     * <code>string Operation = 2;</code>
     * @return The operation.
     */
    public java.lang.String getOperation() {
      java.lang.Object ref = operation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * forbid：禁播，recover：解禁。
     * </pre>
     *
     * <code>string Operation = 2;</code>
     * @return The bytes for operation.
     */
    public com.google.protobuf.ByteString
        getOperationBytes() {
      java.lang.Object ref = operation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * forbid：禁播，recover：解禁。
     * </pre>
     *
     * <code>string Operation = 2;</code>
     * @param value The operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      operation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * forbid：禁播，recover：解禁。
     * </pre>
     *
     * <code>string Operation = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperation() {
      
      operation_ = getDefaultInstance().getOperation();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * forbid：禁播，recover：解禁。
     * </pre>
     *
     * <code>string Operation = 2;</code>
     * @param value The bytes for operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      operation_ = value;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Request.VodSubmitBlockTasksRequest)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Request.VodSubmitBlockTasksRequest)
  private static final com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest();
  }

  public static com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodSubmitBlockTasksRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodSubmitBlockTasksRequest>() {
    @java.lang.Override
    public VodSubmitBlockTasksRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodSubmitBlockTasksRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodSubmitBlockTasksRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodSubmitBlockTasksRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
