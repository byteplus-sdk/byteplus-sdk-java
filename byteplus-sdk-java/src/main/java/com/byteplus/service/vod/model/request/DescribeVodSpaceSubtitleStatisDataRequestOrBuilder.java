// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface DescribeVodSpaceSubtitleStatisDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.DescribeVodSpaceSubtitleStatisDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 空间列表，多个空间用逗号分割
   * </pre>
   *
   * <code>string SpaceList = 1;</code>
   * @return The spaceList.
   */
  java.lang.String getSpaceList();
  /**
   * <pre>
   * 空间列表，多个空间用逗号分割
   * </pre>
   *
   * <code>string SpaceList = 1;</code>
   * @return The bytes for spaceList.
   */
  com.google.protobuf.ByteString
      getSpaceListBytes();

  /**
   * <pre>
   * 查询的起始时间, rfc3339
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <pre>
   * 查询的起始时间, rfc3339
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <pre>
   * 查询的结束时间, rfc3339；查询时间跨度不超过93天
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <pre>
   * 查询的结束时间, rfc3339；查询时间跨度不超过93天
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <pre>
   * 类型：默认全部。ASR(语音转写)，MT(机器翻译)，ES(提取字幕)
   * </pre>
   *
   * <code>string SubtitleType = 4;</code>
   * @return The subtitleType.
   */
  java.lang.String getSubtitleType();
  /**
   * <pre>
   * 类型：默认全部。ASR(语音转写)，MT(机器翻译)，ES(提取字幕)
   * </pre>
   *
   * <code>string SubtitleType = 4;</code>
   * @return The bytes for subtitleType.
   */
  com.google.protobuf.ByteString
      getSubtitleTypeBytes();

  /**
   * <pre>
   * 闲忙时: busy/free，多个值用逗号分割
   * </pre>
   *
   * <code>string TaskStageList = 5;</code>
   * @return The taskStageList.
   */
  java.lang.String getTaskStageList();
  /**
   * <pre>
   * 闲忙时: busy/free，多个值用逗号分割
   * </pre>
   *
   * <code>string TaskStageList = 5;</code>
   * @return The bytes for taskStageList.
   */
  com.google.protobuf.ByteString
      getTaskStageListBytes();

  /**
   * <pre>
   * 聚合的时间粒度，单位秒，默认3600，支持3600和86400
   * </pre>
   *
   * <code>int64 Aggregation = 6;</code>
   * @return The aggregation.
   */
  long getAggregation();

  /**
   * <pre>
   * 展示详细信息的维度，取值：TaskStage、Space，多个值用逗号分割
   * </pre>
   *
   * <code>string DetailFieldList = 7;</code>
   * @return The detailFieldList.
   */
  java.lang.String getDetailFieldList();
  /**
   * <pre>
   * 展示详细信息的维度，取值：TaskStage、Space，多个值用逗号分割
   * </pre>
   *
   * <code>string DetailFieldList = 7;</code>
   * @return The bytes for detailFieldList.
   */
  com.google.protobuf.ByteString
      getDetailFieldListBytes();
}
