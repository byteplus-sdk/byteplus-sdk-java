// Code generated by protoc-gen-byteplus-sdk
// source: listCdnPvData
// DO NOT EDIT!

package com.byteplus.example.vod.cdn;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
public class VodListCdnPvDataDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.byteplus.service.vod.model.request.VodListCdnPvDataRequest.Builder reqBuilder = com.byteplus.service.vod.model.request.VodListCdnPvDataRequest.newBuilder();
			reqBuilder.setDomains("your Domains");
			reqBuilder.setInterval("your Interval");
			reqBuilder.setStartTimestamp(0);
			reqBuilder.setEndTimestamp(0);
			reqBuilder.setDataType("your DataType");
			reqBuilder.setNeedDetail(false);
			
            com.byteplus.service.vod.model.response.VodCdnStatisticsCommonResponse resp = vodService.listCdnPvData(reqBuilder.build());
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