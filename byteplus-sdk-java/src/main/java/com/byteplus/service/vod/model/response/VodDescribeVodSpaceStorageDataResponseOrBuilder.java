// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/response/response_vod.proto

package com.byteplus.service.vod.model.response;

public interface VodDescribeVodSpaceStorageDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Response.VodDescribeVodSpaceStorageDataResponse)
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
   * <code>.Byteplus.Vod.Models.Business.VodDescribeVodSpaceStorageDataResult Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodDescribeVodSpaceStorageDataResult Result = 2;</code>
   * @return The result.
   */
  com.byteplus.service.vod.model.business.VodDescribeVodSpaceStorageDataResult getResult();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodDescribeVodSpaceStorageDataResult Result = 2;</code>
   */
  com.byteplus.service.vod.model.business.VodDescribeVodSpaceStorageDataResultOrBuilder getResultOrBuilder();
}
