// Code generated by protoc-gen-byteplus-sdk
// source: addCallbackSubscription
// DO NOT EDIT!

package com.byteplus.example.vod.callback;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
public class VodAddCallbackSubscriptionDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.byteplus.service.vod.model.request.VodAddCallbackSubscriptionRequest.Builder reqBuilder = com.byteplus.service.vod.model.request.VodAddCallbackSubscriptionRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setUrl("your Url");
			reqBuilder.setContentType("your ContentType");
			
            com.byteplus.service.vod.model.response.VodAddCallbackSubscriptionResponse resp = vodService.addCallbackSubscription(reqBuilder.build());
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