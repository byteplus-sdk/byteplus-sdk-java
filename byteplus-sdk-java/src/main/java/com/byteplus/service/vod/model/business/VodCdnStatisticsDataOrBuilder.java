// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_cdn.proto

package com.byteplus.service.vod.model.business;

public interface VodCdnStatisticsDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodCdnStatisticsData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string Name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string Metric = 2;</code>
   * @return The metric.
   */
  java.lang.String getMetric();
  /**
   * <code>string Metric = 2;</code>
   * @return The bytes for metric.
   */
  com.google.protobuf.ByteString
      getMetricBytes();

  /**
   * <code>string DataType = 3;</code>
   * @return The dataType.
   */
  java.lang.String getDataType();
  /**
   * <code>string DataType = 3;</code>
   * @return The bytes for dataType.
   */
  com.google.protobuf.ByteString
      getDataTypeBytes();

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodPoint Points = 4;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.VodPoint> 
      getPointsList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodPoint Points = 4;</code>
   */
  com.byteplus.service.vod.model.business.VodPoint getPoints(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodPoint Points = 4;</code>
   */
  int getPointsCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodPoint Points = 4;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.VodPointOrBuilder> 
      getPointsOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodPoint Points = 4;</code>
   */
  com.byteplus.service.vod.model.business.VodPointOrBuilder getPointsOrBuilder(
      int index);
}