// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_measure.proto

package com.byteplus.service.vod.model.business;

public interface DescribeVodSpaceAIStatisDataDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Space = 1;</code>
   * @return The space.
   */
  java.lang.String getSpace();
  /**
   * <code>string Space = 1;</code>
   * @return The bytes for space.
   */
  com.google.protobuf.ByteString
      getSpaceBytes();

  /**
   * <code>string TaskStage = 2;</code>
   * @return The taskStage.
   */
  java.lang.String getTaskStage();
  /**
   * <code>string TaskStage = 2;</code>
   * @return The bytes for taskStage.
   */
  com.google.protobuf.ByteString
      getTaskStageBytes();

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem> 
      getAiUsageDataListList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItem getAiUsageDataList(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
   */
  int getAiUsageDataListCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItemOrBuilder> 
      getAiUsageDataListOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceAIStatisDataItem AiUsageDataList = 3;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodSpaceAIStatisDataItemOrBuilder getAiUsageDataListOrBuilder(
      int index);
}
