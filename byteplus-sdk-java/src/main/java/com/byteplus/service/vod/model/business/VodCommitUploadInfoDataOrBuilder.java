// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_upload.proto

package com.byteplus.service.vod.model.business;

public interface VodCommitUploadInfoDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodCommitUploadInfoData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <code>string PosterUri = 2;</code>
   * @return The posterUri.
   */
  java.lang.String getPosterUri();
  /**
   * <code>string PosterUri = 2;</code>
   * @return The bytes for posterUri.
   */
  com.google.protobuf.ByteString
      getPosterUriBytes();

  /**
   * <code>.Byteplus.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
   * @return Whether the sourceInfo field is set.
   */
  boolean hasSourceInfo();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
   * @return The sourceInfo.
   */
  com.byteplus.service.vod.model.business.VodSourceInfo getSourceInfo();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodSourceInfo SourceInfo = 3;</code>
   */
  com.byteplus.service.vod.model.business.VodSourceInfoOrBuilder getSourceInfoOrBuilder();

  /**
   * <code>string Mid = 4;</code>
   * @return The mid.
   */
  java.lang.String getMid();
  /**
   * <code>string Mid = 4;</code>
   * @return The bytes for mid.
   */
  com.google.protobuf.ByteString
      getMidBytes();
}
