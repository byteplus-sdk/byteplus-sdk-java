// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_media.proto

package com.byteplus.service.vod.model.business;

public interface VodMediaBasicInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodMediaBasicInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *空间名
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   *空间名
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 2;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 2;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   *视频名称
   * </pre>
   *
   * <code>string Title = 3;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   *视频名称
   * </pre>
   *
   * <code>string Title = 3;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   *视频描述
   * </pre>
   *
   * <code>string Description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   *视频描述
   * </pre>
   *
   * <code>string Description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   *封面图对象地址
   * </pre>
   *
   * <code>string PosterUri = 5;</code>
   * @return The posterUri.
   */
  java.lang.String getPosterUri();
  /**
   * <pre>
   *封面图对象地址
   * </pre>
   *
   * <code>string PosterUri = 5;</code>
   * @return The bytes for posterUri.
   */
  com.google.protobuf.ByteString
      getPosterUriBytes();

  /**
   * <pre>
   *发布状态
   * </pre>
   *
   * <code>string PublishStatus = 6;</code>
   * @return The publishStatus.
   */
  java.lang.String getPublishStatus();
  /**
   * <pre>
   *发布状态
   * </pre>
   *
   * <code>string PublishStatus = 6;</code>
   * @return The bytes for publishStatus.
   */
  com.google.protobuf.ByteString
      getPublishStatusBytes();

  /**
   * <pre>
   *标签列表
   * </pre>
   *
   * <code>repeated string Tags = 7;</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <pre>
   *标签列表
   * </pre>
   *
   * <code>repeated string Tags = 7;</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <pre>
   *标签列表
   * </pre>
   *
   * <code>repeated string Tags = 7;</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <pre>
   *标签列表
   * </pre>
   *
   * <code>repeated string Tags = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <pre>
   *创建时间
   * </pre>
   *
   * <code>string CreateTime = 8;</code>
   * @return The createTime.
   */
  java.lang.String getCreateTime();
  /**
   * <pre>
   *创建时间
   * </pre>
   *
   * <code>string CreateTime = 8;</code>
   * @return The bytes for createTime.
   */
  com.google.protobuf.ByteString
      getCreateTimeBytes();

  /**
   * <pre>
   *分类串
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.VodClassification Classification = 9;</code>
   * @return Whether the classification field is set.
   */
  boolean hasClassification();
  /**
   * <pre>
   *分类串
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.VodClassification Classification = 9;</code>
   * @return The classification.
   */
  com.byteplus.service.vod.model.business.VodClassification getClassification();
  /**
   * <pre>
   *分类串
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.VodClassification Classification = 9;</code>
   */
  com.byteplus.service.vod.model.business.VodClassificationOrBuilder getClassificationOrBuilder();

  /**
   * <pre>
   * Tos存储类型:STANDARD, ARCHIVE
   * </pre>
   *
   * <code>string TosStorageClass = 10;</code>
   * @return The tosStorageClass.
   */
  java.lang.String getTosStorageClass();
  /**
   * <pre>
   * Tos存储类型:STANDARD, ARCHIVE
   * </pre>
   *
   * <code>string TosStorageClass = 10;</code>
   * @return The bytes for tosStorageClass.
   */
  com.google.protobuf.ByteString
      getTosStorageClassBytes();

  /**
   * <pre>
   * 音视频来源
   * </pre>
   *
   * <code>string VodUploadSource = 11;</code>
   * @return The vodUploadSource.
   */
  java.lang.String getVodUploadSource();
  /**
   * <pre>
   * 音视频来源
   * </pre>
   *
   * <code>string VodUploadSource = 11;</code>
   * @return The bytes for vodUploadSource.
   */
  com.google.protobuf.ByteString
      getVodUploadSourceBytes();
}
