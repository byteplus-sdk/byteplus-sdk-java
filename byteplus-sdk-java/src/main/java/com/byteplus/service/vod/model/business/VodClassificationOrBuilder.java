// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_media.proto

package com.byteplus.service.vod.model.business;

public interface VodClassificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodClassification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <code>int64 ClassificationId = 2;</code>
   * @return The classificationId.
   */
  long getClassificationId();

  /**
   * <code>int32 Level = 3;</code>
   * @return The level.
   */
  int getLevel();

  /**
   * <code>string Classification = 4;</code>
   * @return The classification.
   */
  java.lang.String getClassification();
  /**
   * <code>string Classification = 4;</code>
   * @return The bytes for classification.
   */
  com.google.protobuf.ByteString
      getClassificationBytes();

  /**
   * <code>int64 ParentClassificationId = 5;</code>
   * @return The parentClassificationId.
   */
  long getParentClassificationId();

  /**
   * <code>.Byteplus.Vod.Models.Business.VodClassification SubClassification = 6;</code>
   * @return Whether the subClassification field is set.
   */
  boolean hasSubClassification();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodClassification SubClassification = 6;</code>
   * @return The subClassification.
   */
  com.byteplus.service.vod.model.business.VodClassification getSubClassification();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodClassification SubClassification = 6;</code>
   */
  com.byteplus.service.vod.model.business.VodClassificationOrBuilder getSubClassificationOrBuilder();

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodClassification SubClassificationTrees = 7;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.VodClassification> 
      getSubClassificationTreesList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodClassification SubClassificationTrees = 7;</code>
   */
  com.byteplus.service.vod.model.business.VodClassification getSubClassificationTrees(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodClassification SubClassificationTrees = 7;</code>
   */
  int getSubClassificationTreesCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodClassification SubClassificationTrees = 7;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.VodClassificationOrBuilder> 
      getSubClassificationTreesOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodClassification SubClassificationTrees = 7;</code>
   */
  com.byteplus.service.vod.model.business.VodClassificationOrBuilder getSubClassificationTreesOrBuilder(
      int index);

  /**
   * <code>string CreatedAt = 8;</code>
   * @return The createdAt.
   */
  java.lang.String getCreatedAt();
  /**
   * <code>string CreatedAt = 8;</code>
   * @return The bytes for createdAt.
   */
  com.google.protobuf.ByteString
      getCreatedAtBytes();
}
