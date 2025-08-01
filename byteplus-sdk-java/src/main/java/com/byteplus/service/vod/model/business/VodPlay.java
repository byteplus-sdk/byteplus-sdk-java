// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_play.proto

package com.byteplus.service.vod.model.business;

public final class VodPlay {
  private VodPlay() {}
  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
            (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
          internal_static_Byteplus_Vod_Models_Business_VodGetOriginalPlayInfoResult_descriptor;
  static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_Byteplus_Vod_Models_Business_VodGetOriginalPlayInfoResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
          internal_static_Byteplus_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_descriptor;
  static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_Byteplus_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
          internal_static_Byteplus_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_descriptor;
  static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_Byteplus_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
          internal_static_Byteplus_Vod_Models_Business_VodGetHlsDecryptionKeyResult_descriptor;
  static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_Byteplus_Vod_Models_Business_VodGetHlsDecryptionKeyResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
          internal_static_Byteplus_Vod_Models_Business_VodPlayInfoWithLiveTimeShiftScene_descriptor;
  static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_Byteplus_Vod_Models_Business_VodPlayInfoWithLiveTimeShiftScene_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
          internal_static_Byteplus_Vod_Models_Business_VodGetPlayInfoWithLiveTimeShiftSceneResult_descriptor;
  static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_Byteplus_Vod_Models_Business_VodGetPlayInfoWithLiveTimeShiftSceneResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
          internal_static_Byteplus_Vod_Models_Business_VodCreateHlsDecryptionKeyResult_descriptor;
  static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_Byteplus_Vod_Models_Business_VodCreateHlsDecryptionKeyResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
          descriptor;
  static {
    java.lang.String[] descriptorData = {
            "\n$byteplus/vod/business/vod_play.proto\022\034" +
                    "Byteplus.Vod.Models.Business\"\330\001\n\034VodGetO" +
                    "riginalPlayInfoResult\022\020\n\010FileType\030\001 \001(\t\022" +
                    "\020\n\010Duration\030\002 \001(\002\022\014\n\004Size\030\003 \001(\001\022\016\n\006Heigh" +
                    "t\030\004 \001(\005\022\r\n\005Width\030\005 \001(\005\022\016\n\006Format\030\006 \001(\t\022\r" +
                    "\n\005Codec\030\007 \001(\t\022\017\n\007Bitrate\030\010 \001(\005\022\013\n\003Md5\030\t " +
                    "\001(\t\022\023\n\013MainPlayUrl\030\n \001(\t\022\025\n\rBackupPlayUr" +
                    "l\030\013 \001(\t\"H\n\031VodPrivateDrmPlayAuthInfo\022\022\n\n" +
                    "PlayAuthId\030\001 \001(\t\022\027\n\017PlayAuthContent\030\002 \001(" +
                    "\t\"s\n\036VodGetPrivateDrmPlayAuthResult\022Q\n\020P" +
                    "layAuthInfoList\030\001 \003(\01327.Byteplus.Vod.Mod" +
                    "els.Business.VodPrivateDrmPlayAuthInfo\"1" +
                    "\n\034VodGetHlsDecryptionKeyResult\022\021\n\tSecret" +
                    "Key\030\001 \001(\t\"t\n!VodPlayInfoWithLiveTimeShif" +
                    "tScene\022\020\n\010StoreUri\030\001 \001(\t\022\023\n\013MainPlayUrl\030" +
                    "\002 \001(\t\022\025\n\rBackupPlayUrl\030\003 \001(\t\022\021\n\tUrlExpir" +
                    "e\030\004 \001(\001\"\203\001\n*VodGetPlayInfoWithLiveTimeSh" +
                    "iftSceneResult\022U\n\014PlayInfoList\030\001 \003(\0132?.B" +
                    "yteplus.Vod.Models.Business.VodPlayInfoW" +
                    "ithLiveTimeShiftScene\"e\n\037VodCreateHlsDec" +
                    "ryptionKeyResult\022\021\n\tSecretKey\030\001 \001(\t\022\n\n\002A" +
                    "k\030\002 \001(\t\022\020\n\010IsBase64\030\003 \001(\010\022\021\n\tKeyFormat\030\004" +
                    " \001(\tB\327\001\n\'com.byteplus.service.vod.model." +
                    "businessB\007VodPlayP\001ZGgithub.com/byteplus" +
                    "-sdk/byteplus-sdk-golang/service/vod/mod" +
                    "els/business\240\001\001\330\001\001\302\002\000\312\002$Byteplus\\Service" +
                    "\\Vod\\Models\\Business\342\002\'Byteplus\\Service\\" +
                    "Vod\\Models\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
            .internalBuildGeneratedFileFrom(descriptorData,
                    new com.google.protobuf.Descriptors.FileDescriptor[] {
                    });
    internal_static_Byteplus_Vod_Models_Business_VodGetOriginalPlayInfoResult_descriptor =
            getDescriptor().getMessageTypes().get(0);
    internal_static_Byteplus_Vod_Models_Business_VodGetOriginalPlayInfoResult_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_Byteplus_Vod_Models_Business_VodGetOriginalPlayInfoResult_descriptor,
            new java.lang.String[] { "FileType", "Duration", "Size", "Height", "Width", "Format", "Codec", "Bitrate", "Md5", "MainPlayUrl", "BackupPlayUrl", });
    internal_static_Byteplus_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_descriptor =
            getDescriptor().getMessageTypes().get(1);
    internal_static_Byteplus_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_Byteplus_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_descriptor,
            new java.lang.String[] { "PlayAuthId", "PlayAuthContent", });
    internal_static_Byteplus_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_descriptor =
            getDescriptor().getMessageTypes().get(2);
    internal_static_Byteplus_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_Byteplus_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_descriptor,
            new java.lang.String[] { "PlayAuthInfoList", });
    internal_static_Byteplus_Vod_Models_Business_VodGetHlsDecryptionKeyResult_descriptor =
            getDescriptor().getMessageTypes().get(3);
    internal_static_Byteplus_Vod_Models_Business_VodGetHlsDecryptionKeyResult_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_Byteplus_Vod_Models_Business_VodGetHlsDecryptionKeyResult_descriptor,
            new java.lang.String[] { "SecretKey", });
    internal_static_Byteplus_Vod_Models_Business_VodPlayInfoWithLiveTimeShiftScene_descriptor =
            getDescriptor().getMessageTypes().get(4);
    internal_static_Byteplus_Vod_Models_Business_VodPlayInfoWithLiveTimeShiftScene_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_Byteplus_Vod_Models_Business_VodPlayInfoWithLiveTimeShiftScene_descriptor,
            new java.lang.String[] { "StoreUri", "MainPlayUrl", "BackupPlayUrl", "UrlExpire", });
    internal_static_Byteplus_Vod_Models_Business_VodGetPlayInfoWithLiveTimeShiftSceneResult_descriptor =
            getDescriptor().getMessageTypes().get(5);
    internal_static_Byteplus_Vod_Models_Business_VodGetPlayInfoWithLiveTimeShiftSceneResult_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_Byteplus_Vod_Models_Business_VodGetPlayInfoWithLiveTimeShiftSceneResult_descriptor,
            new java.lang.String[] { "PlayInfoList", });
    internal_static_Byteplus_Vod_Models_Business_VodCreateHlsDecryptionKeyResult_descriptor =
            getDescriptor().getMessageTypes().get(6);
    internal_static_Byteplus_Vod_Models_Business_VodCreateHlsDecryptionKeyResult_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_Byteplus_Vod_Models_Business_VodCreateHlsDecryptionKeyResult_descriptor,
            new java.lang.String[] { "SecretKey", "Ak", "IsBase64", "KeyFormat", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
