// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/response/response_vod.proto

package com.byteplus.service.vod.model.response;

public interface VodListSpaceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Response.VodListSpaceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *响应通用信息
   * </pre>
   *
   * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <pre>
   *响应通用信息
   * </pre>
   *
   * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.byteplus.service.base.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <pre>
   *响应通用信息
   * </pre>
   *
   * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.byteplus.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodSpaceInfo Result = 2;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.VodSpaceInfo> 
      getResultList();
  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodSpaceInfo Result = 2;</code>
   */
  com.byteplus.service.vod.model.business.VodSpaceInfo getResult(int index);
  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodSpaceInfo Result = 2;</code>
   */
  int getResultCount();
  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodSpaceInfo Result = 2;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.VodSpaceInfoOrBuilder> 
      getResultOrBuilderList();
  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodSpaceInfo Result = 2;</code>
   */
  com.byteplus.service.vod.model.business.VodSpaceInfoOrBuilder getResultOrBuilder(
      int index);
}
