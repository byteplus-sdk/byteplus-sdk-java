// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_measure.proto

package com.byteplus.service.vod.model.business;

public interface DescribeVodRealtimeMediaDataResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 空间列表
   * </pre>
   *
   * <code>repeated string SpaceList = 1;</code>
   * @return A list containing the spaceList.
   */
  java.util.List<java.lang.String>
      getSpaceListList();
  /**
   * <pre>
   * 空间列表
   * </pre>
   *
   * <code>repeated string SpaceList = 1;</code>
   * @return The count of spaceList.
   */
  int getSpaceListCount();
  /**
   * <pre>
   * 空间列表
   * </pre>
   *
   * <code>repeated string SpaceList = 1;</code>
   * @param index The index of the element to return.
   * @return The spaceList at the given index.
   */
  java.lang.String getSpaceList(int index);
  /**
   * <pre>
   * 空间列表
   * </pre>
   *
   * <code>repeated string SpaceList = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the spaceList at the given index.
   */
  com.google.protobuf.ByteString
      getSpaceListBytes(int index);

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
   * 实时处理类型。默认为全选。Snapshot（实时截图）、Metadata（实时获取音视频信息）
   * </pre>
   *
   * <code>string ProcessType = 4;</code>
   * @return The processType.
   */
  java.lang.String getProcessType();
  /**
   * <pre>
   * 实时处理类型。默认为全选。Snapshot（实时截图）、Metadata（实时获取音视频信息）
   * </pre>
   *
   * <code>string ProcessType = 4;</code>
   * @return The bytes for processType.
   */
  com.google.protobuf.ByteString
      getProcessTypeBytes();

  /**
   * <pre>
   *聚合的时间粒度，单位秒，默认3600，支持3600和86400
   * </pre>
   *
   * <code>int64 Aggregation = 5;</code>
   * @return The aggregation.
   */
  long getAggregation();

  /**
   * <pre>
   * 展示详细信息的维度，取值：Space
   * </pre>
   *
   * <code>repeated string DetailFieldList = 6;</code>
   * @return A list containing the detailFieldList.
   */
  java.util.List<java.lang.String>
      getDetailFieldListList();
  /**
   * <pre>
   * 展示详细信息的维度，取值：Space
   * </pre>
   *
   * <code>repeated string DetailFieldList = 6;</code>
   * @return The count of detailFieldList.
   */
  int getDetailFieldListCount();
  /**
   * <pre>
   * 展示详细信息的维度，取值：Space
   * </pre>
   *
   * <code>repeated string DetailFieldList = 6;</code>
   * @param index The index of the element to return.
   * @return The detailFieldList at the given index.
   */
  java.lang.String getDetailFieldList(int index);
  /**
   * <pre>
   * 展示详细信息的维度，取值：Space
   * </pre>
   *
   * <code>repeated string DetailFieldList = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the detailFieldList at the given index.
   */
  com.google.protobuf.ByteString
      getDetailFieldListBytes(int index);

  /**
   * <code>int64 TotalRealtimeMediaData = 7;</code>
   * @return The totalRealtimeMediaData.
   */
  long getTotalRealtimeMediaData();

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataItem RealtimeMediaDataList = 8;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.DescribeVodRealtimeMediaDataItem> 
      getRealtimeMediaDataListList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataItem RealtimeMediaDataList = 8;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodRealtimeMediaDataItem getRealtimeMediaDataList(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataItem RealtimeMediaDataList = 8;</code>
   */
  int getRealtimeMediaDataListCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataItem RealtimeMediaDataList = 8;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.DescribeVodRealtimeMediaDataItemOrBuilder> 
      getRealtimeMediaDataListOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataItem RealtimeMediaDataList = 8;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodRealtimeMediaDataItemOrBuilder getRealtimeMediaDataListOrBuilder(
      int index);

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataDetail RealtimeMediaDetailDataList = 9;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.DescribeVodRealtimeMediaDataDetail> 
      getRealtimeMediaDetailDataListList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataDetail RealtimeMediaDetailDataList = 9;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodRealtimeMediaDataDetail getRealtimeMediaDetailDataList(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataDetail RealtimeMediaDetailDataList = 9;</code>
   */
  int getRealtimeMediaDetailDataListCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataDetail RealtimeMediaDetailDataList = 9;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.DescribeVodRealtimeMediaDataDetailOrBuilder> 
      getRealtimeMediaDetailDataListOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataDetail RealtimeMediaDetailDataList = 9;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodRealtimeMediaDataDetailOrBuilder getRealtimeMediaDetailDataListOrBuilder(
      int index);
}