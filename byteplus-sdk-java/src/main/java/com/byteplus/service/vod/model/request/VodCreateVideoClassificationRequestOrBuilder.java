// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface VodCreateVideoClassificationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.VodCreateVideoClassificationRequest)
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
   * <code>int32 Level = 2;</code>
   * @return The level.
   */
  int getLevel();

  /**
   * <code>int64 ParentId = 3;</code>
   * @return The parentId.
   */
  long getParentId();

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
}