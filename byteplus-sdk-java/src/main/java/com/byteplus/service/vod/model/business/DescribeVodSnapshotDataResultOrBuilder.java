// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_measure.proto

package com.byteplus.service.vod.model.business;

public interface DescribeVodSnapshotDataResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.DescribeVodSnapshotDataResult)
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
   *类型：默认全部。Poster（静态图）、Sample（采样截图）、Dynpost（动图）、Animated（反复循环图）、AIDynpost（AI动图）、Sprite（雪碧图）
   * </pre>
   *
   * <code>string SnapshotType = 4;</code>
   * @return The snapshotType.
   */
  java.lang.String getSnapshotType();
  /**
   * <pre>
   *类型：默认全部。Poster（静态图）、Sample（采样截图）、Dynpost（动图）、Animated（反复循环图）、AIDynpost（AI动图）、Sprite（雪碧图）
   * </pre>
   *
   * <code>string SnapshotType = 4;</code>
   * @return The bytes for snapshotType.
   */
  com.google.protobuf.ByteString
      getSnapshotTypeBytes();

  /**
   * <pre>
   * 闲忙时: busy/free
   * </pre>
   *
   * <code>repeated string TaskStageList = 5;</code>
   * @return A list containing the taskStageList.
   */
  java.util.List<java.lang.String>
      getTaskStageListList();
  /**
   * <pre>
   * 闲忙时: busy/free
   * </pre>
   *
   * <code>repeated string TaskStageList = 5;</code>
   * @return The count of taskStageList.
   */
  int getTaskStageListCount();
  /**
   * <pre>
   * 闲忙时: busy/free
   * </pre>
   *
   * <code>repeated string TaskStageList = 5;</code>
   * @param index The index of the element to return.
   * @return The taskStageList at the given index.
   */
  java.lang.String getTaskStageList(int index);
  /**
   * <pre>
   * 闲忙时: busy/free
   * </pre>
   *
   * <code>repeated string TaskStageList = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the taskStageList at the given index.
   */
  com.google.protobuf.ByteString
      getTaskStageListBytes(int index);

  /**
   * <pre>
   *聚合的时间粒度，单位秒，默认3600，支持3600和86400
   * </pre>
   *
   * <code>int64 Aggregation = 6;</code>
   * @return The aggregation.
   */
  long getAggregation();

  /**
   * <pre>
   * 展示详细信息的维度，取值：TaskStage、Space
   * </pre>
   *
   * <code>repeated string DetailFieldList = 7;</code>
   * @return A list containing the detailFieldList.
   */
  java.util.List<java.lang.String>
      getDetailFieldListList();
  /**
   * <pre>
   * 展示详细信息的维度，取值：TaskStage、Space
   * </pre>
   *
   * <code>repeated string DetailFieldList = 7;</code>
   * @return The count of detailFieldList.
   */
  int getDetailFieldListCount();
  /**
   * <pre>
   * 展示详细信息的维度，取值：TaskStage、Space
   * </pre>
   *
   * <code>repeated string DetailFieldList = 7;</code>
   * @param index The index of the element to return.
   * @return The detailFieldList at the given index.
   */
  java.lang.String getDetailFieldList(int index);
  /**
   * <pre>
   * 展示详细信息的维度，取值：TaskStage、Space
   * </pre>
   *
   * <code>repeated string DetailFieldList = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the detailFieldList at the given index.
   */
  com.google.protobuf.ByteString
      getDetailFieldListBytes(int index);

  /**
   * <code>int64 TotalSnapshotData = 8;</code>
   * @return The totalSnapshotData.
   */
  long getTotalSnapshotData();

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSnapshotDataItem SnapshotDataList = 9;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.DescribeVodSnapshotDataItem> 
      getSnapshotDataListList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSnapshotDataItem SnapshotDataList = 9;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodSnapshotDataItem getSnapshotDataList(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSnapshotDataItem SnapshotDataList = 9;</code>
   */
  int getSnapshotDataListCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSnapshotDataItem SnapshotDataList = 9;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.DescribeVodSnapshotDataItemOrBuilder> 
      getSnapshotDataListOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSnapshotDataItem SnapshotDataList = 9;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodSnapshotDataItemOrBuilder getSnapshotDataListOrBuilder(
      int index);

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSnapshotDataDetail SnapshotDetailDataList = 10;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.DescribeVodSnapshotDataDetail> 
      getSnapshotDetailDataListList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSnapshotDataDetail SnapshotDetailDataList = 10;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodSnapshotDataDetail getSnapshotDetailDataList(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSnapshotDataDetail SnapshotDetailDataList = 10;</code>
   */
  int getSnapshotDetailDataListCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSnapshotDataDetail SnapshotDetailDataList = 10;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.DescribeVodSnapshotDataDetailOrBuilder> 
      getSnapshotDetailDataListOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSnapshotDataDetail SnapshotDetailDataList = 10;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodSnapshotDataDetailOrBuilder getSnapshotDetailDataListOrBuilder(
      int index);
}