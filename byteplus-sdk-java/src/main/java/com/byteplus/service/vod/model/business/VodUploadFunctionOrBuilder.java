// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_upload.proto

package com.byteplus.service.vod.model.business;

public interface VodUploadFunctionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodUploadFunction)
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
   * <code>.Byteplus.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
   * @return The input.
   */
  com.byteplus.service.vod.model.business.VodUploadFunctionInput getInput();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodUploadFunctionInput Input = 2;</code>
   */
  com.byteplus.service.vod.model.business.VodUploadFunctionInputOrBuilder getInputOrBuilder();
}
