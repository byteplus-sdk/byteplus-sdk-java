// Code generated by protoc-gen-byteplus-sdk
// source: commitUploadInfo
// DO NOT EDIT!

package com.byteplus.example.vod.upload;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
public class VodCommitUploadInfoDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.byteplus.service.vod.model.request.VodCommitUploadInfoRequest.Builder reqBuilder = com.byteplus.service.vod.model.request.VodCommitUploadInfoRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setSessionKey("your SessionKey");
			reqBuilder.setCallbackArgs("your CallbackArgs");
			reqBuilder.setFunctions("your Functions");
			reqBuilder.setVodUploadSource("your VodUploadSource");
			
            com.byteplus.service.vod.model.response.VodCommitUploadInfoResponse resp = vodService.commitUploadInfo(reqBuilder.build());
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