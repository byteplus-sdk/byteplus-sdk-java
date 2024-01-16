// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/response/response_vod.proto

package com.byteplus.service.vod.model.response;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Response.VodGetWorkflowExecutionStatusResponse}
 */
public final class VodGetWorkflowExecutionStatusResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Response.VodGetWorkflowExecutionStatusResponse)
    VodGetWorkflowExecutionStatusResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetWorkflowExecutionStatusResponse.newBuilder() to construct.
  private VodGetWorkflowExecutionStatusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetWorkflowExecutionStatusResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetWorkflowExecutionStatusResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetWorkflowExecutionStatusResponse(
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
            com.byteplus.service.base.model.base.ResponseMetadata.Builder subBuilder = null;
            if (responseMetadata_ != null) {
              subBuilder = responseMetadata_.toBuilder();
            }
            responseMetadata_ = input.readMessage(com.byteplus.service.base.model.base.ResponseMetadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(responseMetadata_);
              responseMetadata_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.byteplus.service.vod.model.business.WorkflowExecution.Builder subBuilder = null;
            if (result_ != null) {
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(com.byteplus.service.vod.model.business.WorkflowExecution.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
            }

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
    return com.byteplus.service.vod.model.response.VodResponse.internal_static_Byteplus_Vod_Models_Response_VodGetWorkflowExecutionStatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.response.VodResponse.internal_static_Byteplus_Vod_Models_Response_VodGetWorkflowExecutionStatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse.class, com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse.Builder.class);
  }

  public static final int RESPONSEMETADATA_FIELD_NUMBER = 1;
  private com.byteplus.service.base.model.base.ResponseMetadata responseMetadata_;
  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  @java.lang.Override
  public boolean hasResponseMetadata() {
    return responseMetadata_ != null;
  }
  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  @java.lang.Override
  public com.byteplus.service.base.model.base.ResponseMetadata getResponseMetadata() {
    return responseMetadata_ == null ? com.byteplus.service.base.model.base.ResponseMetadata.getDefaultInstance() : responseMetadata_;
  }
  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  @java.lang.Override
  public com.byteplus.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder() {
    return getResponseMetadata();
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private com.byteplus.service.vod.model.business.WorkflowExecution result_;
  /**
   * <pre>
   * 响应结果
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.WorkflowExecution Result = 2;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <pre>
   * 响应结果
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.WorkflowExecution Result = 2;</code>
   * @return The result.
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.WorkflowExecution getResult() {
    return result_ == null ? com.byteplus.service.vod.model.business.WorkflowExecution.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * 响应结果
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.WorkflowExecution Result = 2;</code>
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.WorkflowExecutionOrBuilder getResultOrBuilder() {
    return getResult();
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
    if (responseMetadata_ != null) {
      output.writeMessage(1, getResponseMetadata());
    }
    if (result_ != null) {
      output.writeMessage(2, getResult());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResponseMetadata());
    }
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResult());
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
    if (!(obj instanceof com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse other = (com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse) obj;

    if (hasResponseMetadata() != other.hasResponseMetadata()) return false;
    if (hasResponseMetadata()) {
      if (!getResponseMetadata()
          .equals(other.getResponseMetadata())) return false;
    }
    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
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
    if (hasResponseMetadata()) {
      hash = (37 * hash) + RESPONSEMETADATA_FIELD_NUMBER;
      hash = (53 * hash) + getResponseMetadata().hashCode();
    }
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Response.VodGetWorkflowExecutionStatusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Response.VodGetWorkflowExecutionStatusResponse)
      com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.response.VodResponse.internal_static_Byteplus_Vod_Models_Response_VodGetWorkflowExecutionStatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.response.VodResponse.internal_static_Byteplus_Vod_Models_Response_VodGetWorkflowExecutionStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse.class, com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse.newBuilder()
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
      if (responseMetadataBuilder_ == null) {
        responseMetadata_ = null;
      } else {
        responseMetadata_ = null;
        responseMetadataBuilder_ = null;
      }
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.response.VodResponse.internal_static_Byteplus_Vod_Models_Response_VodGetWorkflowExecutionStatusResponse_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse build() {
      com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse buildPartial() {
      com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse result = new com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse(this);
      if (responseMetadataBuilder_ == null) {
        result.responseMetadata_ = responseMetadata_;
      } else {
        result.responseMetadata_ = responseMetadataBuilder_.build();
      }
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
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
      if (other instanceof com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse) {
        return mergeFrom((com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse other) {
      if (other == com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse.getDefaultInstance()) return this;
      if (other.hasResponseMetadata()) {
        mergeResponseMetadata(other.getResponseMetadata());
      }
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
      com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.byteplus.service.base.model.base.ResponseMetadata responseMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.byteplus.service.base.model.base.ResponseMetadata, com.byteplus.service.base.model.base.ResponseMetadata.Builder, com.byteplus.service.base.model.base.ResponseMetadataOrBuilder> responseMetadataBuilder_;
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     * @return Whether the responseMetadata field is set.
     */
    public boolean hasResponseMetadata() {
      return responseMetadataBuilder_ != null || responseMetadata_ != null;
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     * @return The responseMetadata.
     */
    public com.byteplus.service.base.model.base.ResponseMetadata getResponseMetadata() {
      if (responseMetadataBuilder_ == null) {
        return responseMetadata_ == null ? com.byteplus.service.base.model.base.ResponseMetadata.getDefaultInstance() : responseMetadata_;
      } else {
        return responseMetadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public Builder setResponseMetadata(com.byteplus.service.base.model.base.ResponseMetadata value) {
      if (responseMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        responseMetadata_ = value;
        onChanged();
      } else {
        responseMetadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public Builder setResponseMetadata(
        com.byteplus.service.base.model.base.ResponseMetadata.Builder builderForValue) {
      if (responseMetadataBuilder_ == null) {
        responseMetadata_ = builderForValue.build();
        onChanged();
      } else {
        responseMetadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public Builder mergeResponseMetadata(com.byteplus.service.base.model.base.ResponseMetadata value) {
      if (responseMetadataBuilder_ == null) {
        if (responseMetadata_ != null) {
          responseMetadata_ =
            com.byteplus.service.base.model.base.ResponseMetadata.newBuilder(responseMetadata_).mergeFrom(value).buildPartial();
        } else {
          responseMetadata_ = value;
        }
        onChanged();
      } else {
        responseMetadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public Builder clearResponseMetadata() {
      if (responseMetadataBuilder_ == null) {
        responseMetadata_ = null;
        onChanged();
      } else {
        responseMetadata_ = null;
        responseMetadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public com.byteplus.service.base.model.base.ResponseMetadata.Builder getResponseMetadataBuilder() {
      
      onChanged();
      return getResponseMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public com.byteplus.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder() {
      if (responseMetadataBuilder_ != null) {
        return responseMetadataBuilder_.getMessageOrBuilder();
      } else {
        return responseMetadata_ == null ?
            com.byteplus.service.base.model.base.ResponseMetadata.getDefaultInstance() : responseMetadata_;
      }
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.byteplus.service.base.model.base.ResponseMetadata, com.byteplus.service.base.model.base.ResponseMetadata.Builder, com.byteplus.service.base.model.base.ResponseMetadataOrBuilder> 
        getResponseMetadataFieldBuilder() {
      if (responseMetadataBuilder_ == null) {
        responseMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.byteplus.service.base.model.base.ResponseMetadata, com.byteplus.service.base.model.base.ResponseMetadata.Builder, com.byteplus.service.base.model.base.ResponseMetadataOrBuilder>(
                getResponseMetadata(),
                getParentForChildren(),
                isClean());
        responseMetadata_ = null;
      }
      return responseMetadataBuilder_;
    }

    private com.byteplus.service.vod.model.business.WorkflowExecution result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.byteplus.service.vod.model.business.WorkflowExecution, com.byteplus.service.vod.model.business.WorkflowExecution.Builder, com.byteplus.service.vod.model.business.WorkflowExecutionOrBuilder> resultBuilder_;
    /**
     * <pre>
     * 响应结果
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.WorkflowExecution Result = 2;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <pre>
     * 响应结果
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.WorkflowExecution Result = 2;</code>
     * @return The result.
     */
    public com.byteplus.service.vod.model.business.WorkflowExecution getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.byteplus.service.vod.model.business.WorkflowExecution.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 响应结果
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.WorkflowExecution Result = 2;</code>
     */
    public Builder setResult(com.byteplus.service.vod.model.business.WorkflowExecution value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 响应结果
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.WorkflowExecution Result = 2;</code>
     */
    public Builder setResult(
        com.byteplus.service.vod.model.business.WorkflowExecution.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 响应结果
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.WorkflowExecution Result = 2;</code>
     */
    public Builder mergeResult(com.byteplus.service.vod.model.business.WorkflowExecution value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            com.byteplus.service.vod.model.business.WorkflowExecution.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 响应结果
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.WorkflowExecution Result = 2;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 响应结果
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.WorkflowExecution Result = 2;</code>
     */
    public com.byteplus.service.vod.model.business.WorkflowExecution.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 响应结果
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.WorkflowExecution Result = 2;</code>
     */
    public com.byteplus.service.vod.model.business.WorkflowExecutionOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.byteplus.service.vod.model.business.WorkflowExecution.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * 响应结果
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.WorkflowExecution Result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.byteplus.service.vod.model.business.WorkflowExecution, com.byteplus.service.vod.model.business.WorkflowExecution.Builder, com.byteplus.service.vod.model.business.WorkflowExecutionOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.byteplus.service.vod.model.business.WorkflowExecution, com.byteplus.service.vod.model.business.WorkflowExecution.Builder, com.byteplus.service.vod.model.business.WorkflowExecutionOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Response.VodGetWorkflowExecutionStatusResponse)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Response.VodGetWorkflowExecutionStatusResponse)
  private static final com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse();
  }

  public static com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetWorkflowExecutionStatusResponse>
      PARSER = new com.google.protobuf.AbstractParser<VodGetWorkflowExecutionStatusResponse>() {
    @java.lang.Override
    public VodGetWorkflowExecutionStatusResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetWorkflowExecutionStatusResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetWorkflowExecutionStatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetWorkflowExecutionStatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

