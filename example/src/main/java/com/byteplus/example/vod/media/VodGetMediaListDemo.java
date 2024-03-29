// Code generated by protoc-gen-byteplus-sdk
// source: getMediaList
// DO NOT EDIT!

package com.byteplus.example.vod.media;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
public class VodGetMediaListDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.byteplus.service.vod.model.request.VodGetMediaListRequest.Builder reqBuilder = com.byteplus.service.vod.model.request.VodGetMediaListRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setVid("your Vid");
			reqBuilder.setStatus("your Status");
			reqBuilder.setOrder("your Order");
			reqBuilder.setTags("your Tags");
			reqBuilder.setStartTime("your StartTime");
			reqBuilder.setEndTime("your EndTime");
			reqBuilder.setOffset("your Offset");
			reqBuilder.setPageSize("your PageSize");
			reqBuilder.setClassificationIds("your ClassificationIds");
			reqBuilder.setTosStorageClasses("your TosStorageClasses");
			reqBuilder.setVodUploadSources("your VodUploadSources");
			
            com.byteplus.service.vod.model.response.VodGetMediaListResponse resp = vodService.getMediaList(reqBuilder.build());
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