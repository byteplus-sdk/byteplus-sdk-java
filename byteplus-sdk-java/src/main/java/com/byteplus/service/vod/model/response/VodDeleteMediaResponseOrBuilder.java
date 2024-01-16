// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/response/response_vod.proto

package com.byteplus.service.vod.model.response;

public interface VodDeleteMediaResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Response.VodDeleteMediaResponse)
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
   * <code>.Byteplus.Vod.Models.Business.VodDeleteMediaData Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.VodDeleteMediaData Result = 2;</code>
   * @return The result.
   */
  com.byteplus.service.vod.model.business.VodDeleteMediaData getResult();
  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.VodDeleteMediaData Result = 2;</code>
   */
  com.byteplus.service.vod.model.business.VodDeleteMediaDataOrBuilder getResultOrBuilder();
}
