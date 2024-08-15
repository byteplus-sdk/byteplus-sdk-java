// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_cdn.proto

package com.byteplus.service.vod.model.business;

public interface DomainUsageDataDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.DomainUsageDataDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *域名
   * </pre>
   *
   * <code>string Domain = 1;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   *域名
   * </pre>
   *
   * <code>string Domain = 1;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.CdnUsageDataItem Data = 2;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.CdnUsageDataItem> 
      getDataList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.CdnUsageDataItem Data = 2;</code>
   */
  com.byteplus.service.vod.model.business.CdnUsageDataItem getData(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.CdnUsageDataItem Data = 2;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.CdnUsageDataItem Data = 2;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.CdnUsageDataItemOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.CdnUsageDataItem Data = 2;</code>
   */
  com.byteplus.service.vod.model.business.CdnUsageDataItemOrBuilder getDataOrBuilder(
      int index);
}