// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_measure.proto

package com.byteplus.service.vod.model.business;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataDetail}
 */
public final class DescribeVodSpaceAIStatisDataDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataDetail)
    DescribeVodSpaceAIStatisDataDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DescribeVodSpaceAIStatisDataDetail.newBuilder() to construct.
  private DescribeVodSpaceAIStatisDataDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DescribeVodSpaceAIStatisDataDetail() {
    space_ = "";
    taskStage_ = "";
    aiUsageDataList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DescribeVodSpaceAIStatisDataDetail();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DescribeVodSpaceAIStatisDataDetail(
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

            space_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            taskStage_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              aiUsageDataList_ = new java.util.ArrayList<com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem>();
              mutable_bitField0_ |= 0x00000001;
            }
            aiUsageDataList_.add(
                input.readMessage(com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.parser(), extensionRegistry));
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
        aiUsageDataList_ = java.util.Collections.unmodifiableList(aiUsageDataList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.byteplus.service.vod.model.business.VodMeasure.internal_static_Byteplus_Vod_Models_Business_DescribeVodSpaceAIStatisDataDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodMeasure.internal_static_Byteplus_Vod_Models_Business_DescribeVodSpaceAIStatisDataDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail.class, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail.Builder.class);
  }

  public static final int SPACE_FIELD_NUMBER = 1;
  private volatile java.lang.Object space_;
  /**
   * <code>string Space = 1;</code>
   * @return The space.
   */
  @java.lang.Override
  public java.lang.String getSpace() {
    java.lang.Object ref = space_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      space_ = s;
      return s;
    }
  }
  /**
   * <code>string Space = 1;</code>
   * @return The bytes for space.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpaceBytes() {
    java.lang.Object ref = space_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      space_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TASKSTAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object taskStage_;
  /**
   * <code>string TaskStage = 2;</code>
   * @return The taskStage.
   */
  @java.lang.Override
  public java.lang.String getTaskStage() {
    java.lang.Object ref = taskStage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskStage_ = s;
      return s;
    }
  }
  /**
   * <code>string TaskStage = 2;</code>
   * @return The bytes for taskStage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTaskStageBytes() {
    java.lang.Object ref = taskStage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskStage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AIUSAGEDATALIST_FIELD_NUMBER = 3;
  private java.util.List<com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem> aiUsageDataList_;
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem> getAiUsageDataListList() {
    return aiUsageDataList_;
  }
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItemOrBuilder> 
      getAiUsageDataListOrBuilderList() {
    return aiUsageDataList_;
  }
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
   */
  @java.lang.Override
  public int getAiUsageDataListCount() {
    return aiUsageDataList_.size();
  }
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem getAiUsageDataList(int index) {
    return aiUsageDataList_.get(index);
  }
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItemOrBuilder getAiUsageDataListOrBuilder(
      int index) {
    return aiUsageDataList_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(space_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, space_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskStage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, taskStage_);
    }
    for (int i = 0; i < aiUsageDataList_.size(); i++) {
      output.writeMessage(3, aiUsageDataList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(space_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, space_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskStage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, taskStage_);
    }
    for (int i = 0; i < aiUsageDataList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, aiUsageDataList_.get(i));
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail other = (com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail) obj;

    if (!getSpace()
        .equals(other.getSpace())) return false;
    if (!getTaskStage()
        .equals(other.getTaskStage())) return false;
    if (!getAiUsageDataListList()
        .equals(other.getAiUsageDataListList())) return false;
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
    hash = (37 * hash) + SPACE_FIELD_NUMBER;
    hash = (53 * hash) + getSpace().hashCode();
    hash = (37 * hash) + TASKSTAGE_FIELD_NUMBER;
    hash = (53 * hash) + getTaskStage().hashCode();
    if (getAiUsageDataListCount() > 0) {
      hash = (37 * hash) + AIUSAGEDATALIST_FIELD_NUMBER;
      hash = (53 * hash) + getAiUsageDataListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataDetail)
      com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.business.VodMeasure.internal_static_Byteplus_Vod_Models_Business_DescribeVodSpaceAIStatisDataDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodMeasure.internal_static_Byteplus_Vod_Models_Business_DescribeVodSpaceAIStatisDataDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail.class, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail.newBuilder()
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
        getAiUsageDataListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      space_ = "";

      taskStage_ = "";

      if (aiUsageDataListBuilder_ == null) {
        aiUsageDataList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        aiUsageDataListBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodMeasure.internal_static_Byteplus_Vod_Models_Business_DescribeVodSpaceAIStatisDataDetail_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail build() {
      com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail buildPartial() {
      com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail result = new com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail(this);
      int from_bitField0_ = bitField0_;
      result.space_ = space_;
      result.taskStage_ = taskStage_;
      if (aiUsageDataListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          aiUsageDataList_ = java.util.Collections.unmodifiableList(aiUsageDataList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.aiUsageDataList_ = aiUsageDataList_;
      } else {
        result.aiUsageDataList_ = aiUsageDataListBuilder_.build();
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
      if (other instanceof com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail) {
        return mergeFrom((com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail other) {
      if (other == com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail.getDefaultInstance()) return this;
      if (!other.getSpace().isEmpty()) {
        space_ = other.space_;
        onChanged();
      }
      if (!other.getTaskStage().isEmpty()) {
        taskStage_ = other.taskStage_;
        onChanged();
      }
      if (aiUsageDataListBuilder_ == null) {
        if (!other.aiUsageDataList_.isEmpty()) {
          if (aiUsageDataList_.isEmpty()) {
            aiUsageDataList_ = other.aiUsageDataList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAiUsageDataListIsMutable();
            aiUsageDataList_.addAll(other.aiUsageDataList_);
          }
          onChanged();
        }
      } else {
        if (!other.aiUsageDataList_.isEmpty()) {
          if (aiUsageDataListBuilder_.isEmpty()) {
            aiUsageDataListBuilder_.dispose();
            aiUsageDataListBuilder_ = null;
            aiUsageDataList_ = other.aiUsageDataList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            aiUsageDataListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAiUsageDataListFieldBuilder() : null;
          } else {
            aiUsageDataListBuilder_.addAllMessages(other.aiUsageDataList_);
          }
        }
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
      com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object space_ = "";
    /**
     * <code>string Space = 1;</code>
     * @return The space.
     */
    public java.lang.String getSpace() {
      java.lang.Object ref = space_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        space_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Space = 1;</code>
     * @return The bytes for space.
     */
    public com.google.protobuf.ByteString
        getSpaceBytes() {
      java.lang.Object ref = space_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        space_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Space = 1;</code>
     * @param value The space to set.
     * @return This builder for chaining.
     */
    public Builder setSpace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      space_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Space = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpace() {
      
      space_ = getDefaultInstance().getSpace();
      onChanged();
      return this;
    }
    /**
     * <code>string Space = 1;</code>
     * @param value The bytes for space to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      space_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object taskStage_ = "";
    /**
     * <code>string TaskStage = 2;</code>
     * @return The taskStage.
     */
    public java.lang.String getTaskStage() {
      java.lang.Object ref = taskStage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskStage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string TaskStage = 2;</code>
     * @return The bytes for taskStage.
     */
    public com.google.protobuf.ByteString
        getTaskStageBytes() {
      java.lang.Object ref = taskStage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskStage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string TaskStage = 2;</code>
     * @param value The taskStage to set.
     * @return This builder for chaining.
     */
    public Builder setTaskStage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      taskStage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string TaskStage = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskStage() {
      
      taskStage_ = getDefaultInstance().getTaskStage();
      onChanged();
      return this;
    }
    /**
     * <code>string TaskStage = 2;</code>
     * @param value The bytes for taskStage to set.
     * @return This builder for chaining.
     */
    public Builder setTaskStageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      taskStage_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem> aiUsageDataList_ =
      java.util.Collections.emptyList();
    private void ensureAiUsageDataListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        aiUsageDataList_ = new java.util.ArrayList<com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem>(aiUsageDataList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.Builder, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItemOrBuilder> aiUsageDataListBuilder_;

    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public java.util.List<com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem> getAiUsageDataListList() {
      if (aiUsageDataListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(aiUsageDataList_);
      } else {
        return aiUsageDataListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public int getAiUsageDataListCount() {
      if (aiUsageDataListBuilder_ == null) {
        return aiUsageDataList_.size();
      } else {
        return aiUsageDataListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem getAiUsageDataList(int index) {
      if (aiUsageDataListBuilder_ == null) {
        return aiUsageDataList_.get(index);
      } else {
        return aiUsageDataListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public Builder setAiUsageDataList(
        int index, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem value) {
      if (aiUsageDataListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAiUsageDataListIsMutable();
        aiUsageDataList_.set(index, value);
        onChanged();
      } else {
        aiUsageDataListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public Builder setAiUsageDataList(
        int index, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.Builder builderForValue) {
      if (aiUsageDataListBuilder_ == null) {
        ensureAiUsageDataListIsMutable();
        aiUsageDataList_.set(index, builderForValue.build());
        onChanged();
      } else {
        aiUsageDataListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public Builder addAiUsageDataList(com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem value) {
      if (aiUsageDataListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAiUsageDataListIsMutable();
        aiUsageDataList_.add(value);
        onChanged();
      } else {
        aiUsageDataListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public Builder addAiUsageDataList(
        int index, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem value) {
      if (aiUsageDataListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAiUsageDataListIsMutable();
        aiUsageDataList_.add(index, value);
        onChanged();
      } else {
        aiUsageDataListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public Builder addAiUsageDataList(
        com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.Builder builderForValue) {
      if (aiUsageDataListBuilder_ == null) {
        ensureAiUsageDataListIsMutable();
        aiUsageDataList_.add(builderForValue.build());
        onChanged();
      } else {
        aiUsageDataListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public Builder addAiUsageDataList(
        int index, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.Builder builderForValue) {
      if (aiUsageDataListBuilder_ == null) {
        ensureAiUsageDataListIsMutable();
        aiUsageDataList_.add(index, builderForValue.build());
        onChanged();
      } else {
        aiUsageDataListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public Builder addAllAiUsageDataList(
        java.lang.Iterable<? extends com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem> values) {
      if (aiUsageDataListBuilder_ == null) {
        ensureAiUsageDataListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aiUsageDataList_);
        onChanged();
      } else {
        aiUsageDataListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public Builder clearAiUsageDataList() {
      if (aiUsageDataListBuilder_ == null) {
        aiUsageDataList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        aiUsageDataListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public Builder removeAiUsageDataList(int index) {
      if (aiUsageDataListBuilder_ == null) {
        ensureAiUsageDataListIsMutable();
        aiUsageDataList_.remove(index);
        onChanged();
      } else {
        aiUsageDataListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.Builder getAiUsageDataListBuilder(
        int index) {
      return getAiUsageDataListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItemOrBuilder getAiUsageDataListOrBuilder(
        int index) {
      if (aiUsageDataListBuilder_ == null) {
        return aiUsageDataList_.get(index);  } else {
        return aiUsageDataListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public java.util.List<? extends com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItemOrBuilder> 
         getAiUsageDataListOrBuilderList() {
      if (aiUsageDataListBuilder_ != null) {
        return aiUsageDataListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(aiUsageDataList_);
      }
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.Builder addAiUsageDataListBuilder() {
      return getAiUsageDataListFieldBuilder().addBuilder(
          com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.getDefaultInstance());
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.Builder addAiUsageDataListBuilder(
        int index) {
      return getAiUsageDataListFieldBuilder().addBuilder(
          index, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.getDefaultInstance());
    }
    /**
     * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
     */
    public java.util.List<com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.Builder> 
         getAiUsageDataListBuilderList() {
      return getAiUsageDataListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.Builder, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItemOrBuilder> 
        getAiUsageDataListFieldBuilder() {
      if (aiUsageDataListBuilder_ == null) {
        aiUsageDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem.Builder, com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItemOrBuilder>(
                aiUsageDataList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        aiUsageDataList_ = null;
      }
      return aiUsageDataListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataDetail)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataDetail)
  private static final com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail();
  }

  public static com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeVodSpaceAIStatisDataDetail>
      PARSER = new com.google.protobuf.AbstractParser<DescribeVodSpaceAIStatisDataDetail>() {
    @java.lang.Override
    public DescribeVodSpaceAIStatisDataDetail parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DescribeVodSpaceAIStatisDataDetail(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DescribeVodSpaceAIStatisDataDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeVodSpaceAIStatisDataDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
