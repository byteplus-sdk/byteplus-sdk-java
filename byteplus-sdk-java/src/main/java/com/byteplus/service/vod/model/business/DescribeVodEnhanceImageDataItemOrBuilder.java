// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_measure.proto

package com.byteplus.service.vod.model.business;

public interface DescribeVodEnhanceImageDataItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.DescribeVodEnhanceImageDataItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Time = 1;</code>
   * @return The time.
   */
  java.lang.String getTime();
  /**
   * <code>string Time = 1;</code>
   * @return The bytes for time.
   */
  com.google.protobuf.ByteString
      getTimeBytes();

  /**
   * <code>int64 SR = 2;</code>
   * @return The sR.
   */
  long getSR();

  /**
   * <code>int64 VFI = 3;</code>
   * @return The vFI.
   */
  long getVFI();

  /**
   * <code>int64 SDREnhance = 4;</code>
   * @return The sDREnhance.
   */
  long getSDREnhance();

  /**
   * <code>int64 SDR2HDR = 5;</code>
   * @return The sDR2HDR.
   */
  long getSDR2HDR();

  /**
   * <code>int64 AudioDenose = 6;</code>
   * @return The audioDenose.
   */
  long getAudioDenose();
}
