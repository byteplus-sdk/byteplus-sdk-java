// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_measure.proto

package com.byteplus.service.vod.model.business;

public interface DescribeVodSpaceWorkflowDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string RunId = 1;</code>
   * @return The runId.
   */
  java.lang.String getRunId();
  /**
   * <code>string RunId = 1;</code>
   * @return The bytes for runId.
   */
  com.google.protobuf.ByteString
      getRunIdBytes();

  /**
   * <code>string Vid = 2;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <code>string Vid = 2;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <code>string TemplateId = 3;</code>
   * @return The templateId.
   */
  java.lang.String getTemplateId();
  /**
   * <code>string TemplateId = 3;</code>
   * @return The bytes for templateId.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes();

  /**
   * <code>string SpaceName = 4;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <code>string SpaceName = 4;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <code>string Status = 5;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string Status = 5;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>string StartTime = 6;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <code>string StartTime = 6;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <code>string EndTime = 7;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <code>string EndTime = 7;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <code>.Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowTranscodeInfo TranscodeInfo = 8;</code>
   * @return Whether the transcodeInfo field is set.
   */
  boolean hasTranscodeInfo();
  /**
   * <code>.Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowTranscodeInfo TranscodeInfo = 8;</code>
   * @return The transcodeInfo.
   */
  com.byteplus.service.vod.model.business.DescribeVodSpaceWorkflowTranscodeInfo getTranscodeInfo();
  /**
   * <code>.Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowTranscodeInfo TranscodeInfo = 8;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodSpaceWorkflowTranscodeInfoOrBuilder getTranscodeInfoOrBuilder();

  /**
   * <code>.Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowSnapshotInfo SnapshotInfo = 9;</code>
   * @return Whether the snapshotInfo field is set.
   */
  boolean hasSnapshotInfo();
  /**
   * <code>.Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowSnapshotInfo SnapshotInfo = 9;</code>
   * @return The snapshotInfo.
   */
  com.byteplus.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfo getSnapshotInfo();
  /**
   * <code>.Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowSnapshotInfo SnapshotInfo = 9;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodSpaceWorkflowSnapshotInfoOrBuilder getSnapshotInfoOrBuilder();

  /**
   * <code>.Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowEnhanceExecInfo EnhanceExecInfo = 10;</code>
   * @return Whether the enhanceExecInfo field is set.
   */
  boolean hasEnhanceExecInfo();
  /**
   * <code>.Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowEnhanceExecInfo EnhanceExecInfo = 10;</code>
   * @return The enhanceExecInfo.
   */
  com.byteplus.service.vod.model.business.DescribeVodSpaceWorkflowEnhanceExecInfo getEnhanceExecInfo();
  /**
   * <code>.Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowEnhanceExecInfo EnhanceExecInfo = 10;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodSpaceWorkflowEnhanceExecInfoOrBuilder getEnhanceExecInfoOrBuilder();

  /**
   * <code>.Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowVideoAIInfo VideoAIInfo = 11;</code>
   * @return Whether the videoAIInfo field is set.
   */
  boolean hasVideoAIInfo();
  /**
   * <code>.Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowVideoAIInfo VideoAIInfo = 11;</code>
   * @return The videoAIInfo.
   */
  com.byteplus.service.vod.model.business.DescribeVodSpaceWorkflowVideoAIInfo getVideoAIInfo();
  /**
   * <code>.Byteplus.Vod.Models.Business.DescribeVodSpaceWorkflowVideoAIInfo VideoAIInfo = 11;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodSpaceWorkflowVideoAIInfoOrBuilder getVideoAIInfoOrBuilder();
}
