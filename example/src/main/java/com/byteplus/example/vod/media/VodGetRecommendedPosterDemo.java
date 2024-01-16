// Code generated by protoc-gen-byteplus-sdk
// source: getRecommendedPoster
// DO NOT EDIT!

package com.byteplus.example.vod.media;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
public class VodGetRecommendedPosterDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.byteplus.service.vod.model.request.VodGetRecommendedPosterRequest.Builder reqBuilder = com.byteplus.service.vod.model.request.VodGetRecommendedPosterRequest.newBuilder();
			reqBuilder.setVids("your Vids");
			
            com.byteplus.service.vod.model.response.VodGetRecommendedPosterResponse resp = vodService.getRecommendedPoster(reqBuilder.build());
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