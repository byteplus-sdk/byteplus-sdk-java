// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_cdn.proto

package com.byteplus.service.vod.model.business;

public interface VodListCdnAccessLogResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodListCdnAccessLogResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodCdnAccessLogInfo Logs = 1;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.VodCdnAccessLogInfo> 
      getLogsList();
  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodCdnAccessLogInfo Logs = 1;</code>
   */
  com.byteplus.service.vod.model.business.VodCdnAccessLogInfo getLogs(int index);
  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodCdnAccessLogInfo Logs = 1;</code>
   */
  int getLogsCount();
  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodCdnAccessLogInfo Logs = 1;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.VodCdnAccessLogInfoOrBuilder> 
      getLogsOrBuilderList();
  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodCdnAccessLogInfo Logs = 1;</code>
   */
  com.byteplus.service.vod.model.business.VodCdnAccessLogInfoOrBuilder getLogsOrBuilder(
      int index);
}