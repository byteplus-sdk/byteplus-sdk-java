// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/response/response_vod.proto

package com.byteplus.service.vod.model.response;

public interface VodCommitUploadInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Response.VodCommitUploadInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Byteplus.Vod.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <code>.Byteplus.Vod.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.byteplus.service.vod.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <code>.Byteplus.Vod.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.byteplus.service.vod.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <code>.Byteplus.Vod.Models.Business.VodCommitUploadInfoResult Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodCommitUploadInfoResult Result = 2;</code>
   * @return The result.
   */
  com.byteplus.service.vod.model.business.VodCommitUploadInfoResult getResult();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodCommitUploadInfoResult Result = 2;</code>
   */
  com.byteplus.service.vod.model.business.VodCommitUploadInfoResultOrBuilder getResultOrBuilder();
}
