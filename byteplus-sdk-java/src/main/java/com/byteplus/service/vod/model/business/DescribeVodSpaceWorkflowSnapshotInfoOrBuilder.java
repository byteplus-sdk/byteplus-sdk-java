// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_measure.proto

package com.byteplus.service.vod.model.business;

public interface DescribeVodSpaceWorkflowSnapshotInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowSnapshotInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string TemplateType = 1;</code>
   * @return The templateType.
   */
  java.lang.String getTemplateType();
  /**
   * <code>string TemplateType = 1;</code>
   * @return The bytes for templateType.
   */
  com.google.protobuf.ByteString
      getTemplateTypeBytes();

  /**
   * <code>int64 Number = 2;</code>
   * @return The number.
   */
  long getNumber();

  /**
   * <code>bool IsLowPriority = 3;</code>
   * @return The isLowPriority.
   */
  boolean getIsLowPriority();
}
