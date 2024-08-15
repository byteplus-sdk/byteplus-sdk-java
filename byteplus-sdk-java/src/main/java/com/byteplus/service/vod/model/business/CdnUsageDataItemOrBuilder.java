// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_cdn.proto

package com.byteplus.service.vod.model.business;

public interface CdnUsageDataItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.CdnUsageDataItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 时间戳
   * </pre>
   *
   * <code>int64 Time = 1;</code>
   * @return The time.
   */
  long getTime();

  /**
   * <pre>
   * 国家/地区
   * </pre>
   *
   * <code>string Area = 2;</code>
   * @return The area.
   */
  java.lang.String getArea();
  /**
   * <pre>
   * 国家/地区
   * </pre>
   *
   * <code>string Area = 2;</code>
   * @return The bytes for area.
   */
  com.google.protobuf.ByteString
      getAreaBytes();

  /**
   * <pre>
   * 流量，单位：Byte
   * </pre>
   *
   * <code>int64 Flow = 3;</code>
   * @return The flow.
   */
  long getFlow();

  /**
   * <pre>
   * http流量，单位： Byte
   * </pre>
   *
   * <code>int64 HttpFlow = 4;</code>
   * @return The httpFlow.
   */
  long getHttpFlow();

  /**
   * <pre>
   * https流量，单位： Byte
   * </pre>
   *
   * <code>int64 HttpsFlow = 5;</code>
   * @return The httpsFlow.
   */
  long getHttpsFlow();

  /**
   * <pre>
   * 请求数
   * </pre>
   *
   * <code>int64 Conn = 6;</code>
   * @return The conn.
   */
  long getConn();

  /**
   * <pre>
   * http请求数
   * </pre>
   *
   * <code>int64 HttpConn = 7;</code>
   * @return The httpConn.
   */
  long getHttpConn();

  /**
   * <pre>
   * https请求数
   * </pre>
   *
   * <code>int64 HttpsConn = 8;</code>
   * @return The httpsConn.
   */
  long getHttpsConn();
}