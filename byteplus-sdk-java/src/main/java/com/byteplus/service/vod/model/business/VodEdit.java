// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_edit.proto

package com.byteplus.service.vod.model.business;

public final class VodEdit {
  private VodEdit() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Byteplus_Vod_Models_Business_SubmitDirectEditTaskAsyncResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Byteplus_Vod_Models_Business_SubmitDirectEditTaskAsyncResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Byteplus_Vod_Models_Business_GetDirectEditProgress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Byteplus_Vod_Models_Business_GetDirectEditProgress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Byteplus_Vod_Models_Business_GetDirectEditResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Byteplus_Vod_Models_Business_GetDirectEditResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$byteplus/vod/business/vod_edit.proto\022\034" +
      "Byteplus.Vod.Models.Business\"0\n\037SubmitDi" +
      "rectEditTaskAsyncResult\022\r\n\005ReqId\030\001 \001(\t\"\'" +
      "\n\025GetDirectEditProgress\022\016\n\006Result\030\001 \001(\005\"" +
      "\227\001\n\023GetDirectEditResult\022\r\n\005ReqId\030\001 \001(\t\022\021" +
      "\n\tEditParam\030\002 \001(\014\022\020\n\010Priority\030\003 \001(\005\022\023\n\013C" +
      "allbackUri\030\004 \001(\t\022\024\n\014CallbackArgs\030\005 \001(\t\022\016" +
      "\n\006Status\030\006 \001(\t\022\021\n\tOutputVid\030\007 \001(\tB\324\001\n\'co" +
      "m.byteplus.service.vod.model.businessB\007V" +
      "odEditP\001ZGgithub.com/byteplus-sdk/bytepl" +
      "us-sdk-golang/service/vod/models/busines" +
      "s\240\001\001\330\001\001\312\002$Byteplus\\Service\\Vod\\Models\\Bu" +
      "siness\342\002\'Byteplus\\Service\\Vod\\Models\\GPB" +
      "Metadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Byteplus_Vod_Models_Business_SubmitDirectEditTaskAsyncResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Byteplus_Vod_Models_Business_SubmitDirectEditTaskAsyncResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Byteplus_Vod_Models_Business_SubmitDirectEditTaskAsyncResult_descriptor,
        new java.lang.String[] { "ReqId", });
    internal_static_Byteplus_Vod_Models_Business_GetDirectEditProgress_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Byteplus_Vod_Models_Business_GetDirectEditProgress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Byteplus_Vod_Models_Business_GetDirectEditProgress_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_Byteplus_Vod_Models_Business_GetDirectEditResult_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Byteplus_Vod_Models_Business_GetDirectEditResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Byteplus_Vod_Models_Business_GetDirectEditResult_descriptor,
        new java.lang.String[] { "ReqId", "EditParam", "Priority", "CallbackUri", "CallbackArgs", "Status", "OutputVid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
