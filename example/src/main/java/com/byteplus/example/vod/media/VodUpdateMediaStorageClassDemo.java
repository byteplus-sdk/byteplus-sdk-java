// Code generated by protoc-gen-byteplus-sdk
// source: updateMediaStorageClass
// DO NOT EDIT!

package com.byteplus.example.vod.media;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
public class VodUpdateMediaStorageClassDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.byteplus.service.vod.model.request.VodUpdateMediaStorageClassRequest.Builder reqBuilder = com.byteplus.service.vod.model.request.VodUpdateMediaStorageClassRequest.newBuilder();
			reqBuilder.setVids("your Vids");
			reqBuilder.setStorageClass("your StorageClass");
			reqBuilder.setCallbackArgs("your CallbackArgs");
			reqBuilder.setFileIds("your FileIds");
			
            com.byteplus.service.vod.model.response.VodUpdateMediaStorageClassResponse resp = vodService.updateMediaStorageClass(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}