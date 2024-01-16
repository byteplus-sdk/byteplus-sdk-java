// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_workflow.proto

package com.byteplus.service.vod.model.business;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Business.Quality}
 */
public final class Quality extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.Quality)
    QualityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Quality.newBuilder() to construct.
  private Quality(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Quality() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Quality();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Quality(
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
            com.byteplus.service.vod.model.business.VisualQuality.Builder subBuilder = null;
            if (visual_ != null) {
              subBuilder = visual_.toBuilder();
            }
            visual_ = input.readMessage(com.byteplus.service.vod.model.business.VisualQuality.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(visual_);
              visual_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.byteplus.service.vod.model.business.VolumeInfo.Builder subBuilder = null;
            if (volumeInfo_ != null) {
              subBuilder = volumeInfo_.toBuilder();
            }
            volumeInfo_ = input.readMessage(com.byteplus.service.vod.model.business.VolumeInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(volumeInfo_);
              volumeInfo_ = subBuilder.buildPartial();
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
    return com.byteplus.service.vod.model.business.VodWorkflow.internal_static_Byteplus_Vod_Models_Business_Quality_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodWorkflow.internal_static_Byteplus_Vod_Models_Business_Quality_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.business.Quality.class, com.byteplus.service.vod.model.business.Quality.Builder.class);
  }

  public static final int VISUAL_FIELD_NUMBER = 1;
  private com.byteplus.service.vod.model.business.VisualQuality visual_;
  /**
   * <pre>
   * 片源检测参数
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.VisualQuality Visual = 1;</code>
   * @return Whether the visual field is set.
   */
  @java.lang.Override
  public boolean hasVisual() {
    return visual_ != null;
  }
  /**
   * <pre>
   * 片源检测参数
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.VisualQuality Visual = 1;</code>
   * @return The visual.
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.VisualQuality getVisual() {
    return visual_ == null ? com.byteplus.service.vod.model.business.VisualQuality.getDefaultInstance() : visual_;
  }
  /**
   * <pre>
   * 片源检测参数
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.VisualQuality Visual = 1;</code>
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.VisualQualityOrBuilder getVisualOrBuilder() {
    return getVisual();
  }

  public static final int VOLUMEINFO_FIELD_NUMBER = 2;
  private com.byteplus.service.vod.model.business.VolumeInfo volumeInfo_;
  /**
   * <pre>
   * 音量
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.VolumeInfo VolumeInfo = 2;</code>
   * @return Whether the volumeInfo field is set.
   */
  @java.lang.Override
  public boolean hasVolumeInfo() {
    return volumeInfo_ != null;
  }
  /**
   * <pre>
   * 音量
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.VolumeInfo VolumeInfo = 2;</code>
   * @return The volumeInfo.
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.VolumeInfo getVolumeInfo() {
    return volumeInfo_ == null ? com.byteplus.service.vod.model.business.VolumeInfo.getDefaultInstance() : volumeInfo_;
  }
  /**
   * <pre>
   * 音量
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.VolumeInfo VolumeInfo = 2;</code>
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.VolumeInfoOrBuilder getVolumeInfoOrBuilder() {
    return getVolumeInfo();
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
    if (visual_ != null) {
      output.writeMessage(1, getVisual());
    }
    if (volumeInfo_ != null) {
      output.writeMessage(2, getVolumeInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (visual_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVisual());
    }
    if (volumeInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVolumeInfo());
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.Quality)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.Quality other = (com.byteplus.service.vod.model.business.Quality) obj;

    if (hasVisual() != other.hasVisual()) return false;
    if (hasVisual()) {
      if (!getVisual()
          .equals(other.getVisual())) return false;
    }
    if (hasVolumeInfo() != other.hasVolumeInfo()) return false;
    if (hasVolumeInfo()) {
      if (!getVolumeInfo()
          .equals(other.getVolumeInfo())) return false;
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
    if (hasVisual()) {
      hash = (37 * hash) + VISUAL_FIELD_NUMBER;
      hash = (53 * hash) + getVisual().hashCode();
    }
    if (hasVolumeInfo()) {
      hash = (37 * hash) + VOLUMEINFO_FIELD_NUMBER;
      hash = (53 * hash) + getVolumeInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.Quality parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.Quality parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.Quality parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.Quality parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.Quality parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.Quality parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.Quality parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.Quality parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.Quality parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.Quality parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.Quality parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.Quality parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.business.Quality prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Business.Quality}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.Quality)
      com.byteplus.service.vod.model.business.QualityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.business.VodWorkflow.internal_static_Byteplus_Vod_Models_Business_Quality_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodWorkflow.internal_static_Byteplus_Vod_Models_Business_Quality_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.business.Quality.class, com.byteplus.service.vod.model.business.Quality.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.Quality.newBuilder()
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
      if (visualBuilder_ == null) {
        visual_ = null;
      } else {
        visual_ = null;
        visualBuilder_ = null;
      }
      if (volumeInfoBuilder_ == null) {
        volumeInfo_ = null;
      } else {
        volumeInfo_ = null;
        volumeInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodWorkflow.internal_static_Byteplus_Vod_Models_Business_Quality_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.Quality getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.Quality.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.Quality build() {
      com.byteplus.service.vod.model.business.Quality result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.Quality buildPartial() {
      com.byteplus.service.vod.model.business.Quality result = new com.byteplus.service.vod.model.business.Quality(this);
      if (visualBuilder_ == null) {
        result.visual_ = visual_;
      } else {
        result.visual_ = visualBuilder_.build();
      }
      if (volumeInfoBuilder_ == null) {
        result.volumeInfo_ = volumeInfo_;
      } else {
        result.volumeInfo_ = volumeInfoBuilder_.build();
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
      if (other instanceof com.byteplus.service.vod.model.business.Quality) {
        return mergeFrom((com.byteplus.service.vod.model.business.Quality)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.Quality other) {
      if (other == com.byteplus.service.vod.model.business.Quality.getDefaultInstance()) return this;
      if (other.hasVisual()) {
        mergeVisual(other.getVisual());
      }
      if (other.hasVolumeInfo()) {
        mergeVolumeInfo(other.getVolumeInfo());
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
      com.byteplus.service.vod.model.business.Quality parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.Quality) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.byteplus.service.vod.model.business.VisualQuality visual_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.byteplus.service.vod.model.business.VisualQuality, com.byteplus.service.vod.model.business.VisualQuality.Builder, com.byteplus.service.vod.model.business.VisualQualityOrBuilder> visualBuilder_;
    /**
     * <pre>
     * 片源检测参数
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VisualQuality Visual = 1;</code>
     * @return Whether the visual field is set.
     */
    public boolean hasVisual() {
      return visualBuilder_ != null || visual_ != null;
    }
    /**
     * <pre>
     * 片源检测参数
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VisualQuality Visual = 1;</code>
     * @return The visual.
     */
    public com.byteplus.service.vod.model.business.VisualQuality getVisual() {
      if (visualBuilder_ == null) {
        return visual_ == null ? com.byteplus.service.vod.model.business.VisualQuality.getDefaultInstance() : visual_;
      } else {
        return visualBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 片源检测参数
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VisualQuality Visual = 1;</code>
     */
    public Builder setVisual(com.byteplus.service.vod.model.business.VisualQuality value) {
      if (visualBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        visual_ = value;
        onChanged();
      } else {
        visualBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 片源检测参数
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VisualQuality Visual = 1;</code>
     */
    public Builder setVisual(
        com.byteplus.service.vod.model.business.VisualQuality.Builder builderForValue) {
      if (visualBuilder_ == null) {
        visual_ = builderForValue.build();
        onChanged();
      } else {
        visualBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 片源检测参数
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VisualQuality Visual = 1;</code>
     */
    public Builder mergeVisual(com.byteplus.service.vod.model.business.VisualQuality value) {
      if (visualBuilder_ == null) {
        if (visual_ != null) {
          visual_ =
            com.byteplus.service.vod.model.business.VisualQuality.newBuilder(visual_).mergeFrom(value).buildPartial();
        } else {
          visual_ = value;
        }
        onChanged();
      } else {
        visualBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 片源检测参数
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VisualQuality Visual = 1;</code>
     */
    public Builder clearVisual() {
      if (visualBuilder_ == null) {
        visual_ = null;
        onChanged();
      } else {
        visual_ = null;
        visualBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 片源检测参数
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VisualQuality Visual = 1;</code>
     */
    public com.byteplus.service.vod.model.business.VisualQuality.Builder getVisualBuilder() {
      
      onChanged();
      return getVisualFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 片源检测参数
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VisualQuality Visual = 1;</code>
     */
    public com.byteplus.service.vod.model.business.VisualQualityOrBuilder getVisualOrBuilder() {
      if (visualBuilder_ != null) {
        return visualBuilder_.getMessageOrBuilder();
      } else {
        return visual_ == null ?
            com.byteplus.service.vod.model.business.VisualQuality.getDefaultInstance() : visual_;
      }
    }
    /**
     * <pre>
     * 片源检测参数
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VisualQuality Visual = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.byteplus.service.vod.model.business.VisualQuality, com.byteplus.service.vod.model.business.VisualQuality.Builder, com.byteplus.service.vod.model.business.VisualQualityOrBuilder> 
        getVisualFieldBuilder() {
      if (visualBuilder_ == null) {
        visualBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.byteplus.service.vod.model.business.VisualQuality, com.byteplus.service.vod.model.business.VisualQuality.Builder, com.byteplus.service.vod.model.business.VisualQualityOrBuilder>(
                getVisual(),
                getParentForChildren(),
                isClean());
        visual_ = null;
      }
      return visualBuilder_;
    }

    private com.byteplus.service.vod.model.business.VolumeInfo volumeInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.byteplus.service.vod.model.business.VolumeInfo, com.byteplus.service.vod.model.business.VolumeInfo.Builder, com.byteplus.service.vod.model.business.VolumeInfoOrBuilder> volumeInfoBuilder_;
    /**
     * <pre>
     * 音量
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VolumeInfo VolumeInfo = 2;</code>
     * @return Whether the volumeInfo field is set.
     */
    public boolean hasVolumeInfo() {
      return volumeInfoBuilder_ != null || volumeInfo_ != null;
    }
    /**
     * <pre>
     * 音量
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VolumeInfo VolumeInfo = 2;</code>
     * @return The volumeInfo.
     */
    public com.byteplus.service.vod.model.business.VolumeInfo getVolumeInfo() {
      if (volumeInfoBuilder_ == null) {
        return volumeInfo_ == null ? com.byteplus.service.vod.model.business.VolumeInfo.getDefaultInstance() : volumeInfo_;
      } else {
        return volumeInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 音量
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VolumeInfo VolumeInfo = 2;</code>
     */
    public Builder setVolumeInfo(com.byteplus.service.vod.model.business.VolumeInfo value) {
      if (volumeInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        volumeInfo_ = value;
        onChanged();
      } else {
        volumeInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 音量
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VolumeInfo VolumeInfo = 2;</code>
     */
    public Builder setVolumeInfo(
        com.byteplus.service.vod.model.business.VolumeInfo.Builder builderForValue) {
      if (volumeInfoBuilder_ == null) {
        volumeInfo_ = builderForValue.build();
        onChanged();
      } else {
        volumeInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 音量
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VolumeInfo VolumeInfo = 2;</code>
     */
    public Builder mergeVolumeInfo(com.byteplus.service.vod.model.business.VolumeInfo value) {
      if (volumeInfoBuilder_ == null) {
        if (volumeInfo_ != null) {
          volumeInfo_ =
            com.byteplus.service.vod.model.business.VolumeInfo.newBuilder(volumeInfo_).mergeFrom(value).buildPartial();
        } else {
          volumeInfo_ = value;
        }
        onChanged();
      } else {
        volumeInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 音量
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VolumeInfo VolumeInfo = 2;</code>
     */
    public Builder clearVolumeInfo() {
      if (volumeInfoBuilder_ == null) {
        volumeInfo_ = null;
        onChanged();
      } else {
        volumeInfo_ = null;
        volumeInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 音量
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VolumeInfo VolumeInfo = 2;</code>
     */
    public com.byteplus.service.vod.model.business.VolumeInfo.Builder getVolumeInfoBuilder() {
      
      onChanged();
      return getVolumeInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 音量
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VolumeInfo VolumeInfo = 2;</code>
     */
    public com.byteplus.service.vod.model.business.VolumeInfoOrBuilder getVolumeInfoOrBuilder() {
      if (volumeInfoBuilder_ != null) {
        return volumeInfoBuilder_.getMessageOrBuilder();
      } else {
        return volumeInfo_ == null ?
            com.byteplus.service.vod.model.business.VolumeInfo.getDefaultInstance() : volumeInfo_;
      }
    }
    /**
     * <pre>
     * 音量
     * </pre>
     *
     * <code>.Byteplus.Vod.Models.Business.VolumeInfo VolumeInfo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.byteplus.service.vod.model.business.VolumeInfo, com.byteplus.service.vod.model.business.VolumeInfo.Builder, com.byteplus.service.vod.model.business.VolumeInfoOrBuilder> 
        getVolumeInfoFieldBuilder() {
      if (volumeInfoBuilder_ == null) {
        volumeInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.byteplus.service.vod.model.business.VolumeInfo, com.byteplus.service.vod.model.business.VolumeInfo.Builder, com.byteplus.service.vod.model.business.VolumeInfoOrBuilder>(
                getVolumeInfo(),
                getParentForChildren(),
                isClean());
        volumeInfo_ = null;
      }
      return volumeInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.Quality)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.Quality)
  private static final com.byteplus.service.vod.model.business.Quality DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.Quality();
  }

  public static com.byteplus.service.vod.model.business.Quality getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Quality>
      PARSER = new com.google.protobuf.AbstractParser<Quality>() {
    @java.lang.Override
    public Quality parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Quality(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Quality> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Quality> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.Quality getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

