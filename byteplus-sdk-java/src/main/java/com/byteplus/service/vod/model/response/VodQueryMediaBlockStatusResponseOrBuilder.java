// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/response/response_vod.proto

package com.byteplus.service.vod.model.response;

public interface VodQueryMediaBlockStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Response.VodQueryMediaBlockStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.byteplus.service.base.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <code>.Byteplus.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.byteplus.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <code>.Byteplus.Vod.Models.Business.VodQueryMediaBlockStatusResult Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodQueryMediaBlockStatusResult Result = 2;</code>
   * @return The result.
   */
  com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult getResult();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodQueryMediaBlockStatusResult Result = 2;</code>
   */
  com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResultOrBuilder getResultOrBuilder();
}
