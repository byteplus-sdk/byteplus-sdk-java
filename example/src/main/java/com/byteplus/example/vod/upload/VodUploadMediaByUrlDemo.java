// Code generated by protoc-gen-byteplus-sdk
// source: uploadMediaByUrl
// DO NOT EDIT!

package com.byteplus.example.vod.upload;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
public class VodUploadMediaByUrlDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.byteplus.service.vod.model.request.VodUrlUploadRequest.Builder reqBuilder = com.byteplus.service.vod.model.request.VodUrlUploadRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			com.byteplus.service.vod.model.business.VodUrlUploadURLSet.Builder uRLSetsBuilder = com.byteplus.service.vod.model.business.VodUrlUploadURLSet.newBuilder();
			reqBuilder.addURLSets(uRLSetsBuilder);
			
            com.byteplus.service.vod.model.response.VodUrlUploadResponse resp = vodService.uploadMediaByUrl(reqBuilder.build());
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