// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_apps_manage.proto

package com.byteplus.service.vod.model.business;

public final class VodAppsManage {
  private VodAppsManage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Byteplus_Vod_Models_Business_VodGetAppInfoResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Byteplus_Vod_Models_Business_VodGetAppInfoResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+byteplus/vod/business/vod_apps_manage." +
      "proto\022\034Byteplus.Vod.Models.Business\"Z\n\023V" +
      "odGetAppInfoResult\022\r\n\005AppId\030\001 \001(\004\022\016\n\006Sch" +
      "eme\030\002 \001(\t\022\021\n\tAppEnName\030\003 \001(\t\022\021\n\tAppCnNam" +
      "e\030\004 \001(\tB\335\001\n\'com.byteplus.service.vod.mod" +
      "el.businessB\rVodAppsManageP\001ZGgithub.com" +
      "/byteplus-sdk/byteplus-sdk-golang/servic" +
      "e/vod/models/business\240\001\001\330\001\001\302\002\000\312\002$Byteplu" +
      "s\\Service\\Vod\\Models\\Business\342\002\'Byteplus" +
      "\\Service\\Vod\\Models\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Byteplus_Vod_Models_Business_VodGetAppInfoResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Byteplus_Vod_Models_Business_VodGetAppInfoResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Byteplus_Vod_Models_Business_VodGetAppInfoResult_descriptor,
        new java.lang.String[] { "AppId", "Scheme", "AppEnName", "AppCnName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
