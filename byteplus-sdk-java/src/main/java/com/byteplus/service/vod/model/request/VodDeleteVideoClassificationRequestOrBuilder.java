// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface VodDeleteVideoClassificationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.VodDeleteVideoClassificationRequest)
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
}
