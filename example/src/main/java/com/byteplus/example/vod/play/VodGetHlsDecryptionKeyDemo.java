// Code generated by protoc-gen-byteplus-sdk
// source: getHlsDecryptionKey
// DO NOT EDIT!

package com.byteplus.example.vod.play;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
public class VodGetHlsDecryptionKeyDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.byteplus.service.vod.model.request.VodGetHlsDecryptionKeyRequest.Builder reqBuilder = com.byteplus.service.vod.model.request.VodGetHlsDecryptionKeyRequest.newBuilder();
			reqBuilder.setDrmAuthToken("your DrmAuthToken");
			reqBuilder.setAk("your Ak");
			reqBuilder.setSource("your Source");
			
            com.byteplus.service.vod.model.response.VodGetHlsDecryptionKeyResponse resp = vodService.getHlsDecryptionKey(reqBuilder.build());
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