// Code generated by protoc-gen-byteplus-sdk
// source: describeVodPlayedStatisData
// DO NOT EDIT!

package com.byteplus.example.vod.measure;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
public class VodDescribeVodPlayedStatisDataDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.byteplus.service.vod.model.request.DescribeVodPlayedStatisDataRequest.Builder reqBuilder = com.byteplus.service.vod.model.request.DescribeVodPlayedStatisDataRequest.newBuilder();
			reqBuilder.setSpace("your Space");
			reqBuilder.setStartTime("your StartTime");
			reqBuilder.setEndTime("your EndTime");
			reqBuilder.setVidList("your VidList");
			reqBuilder.setOrderType("your OrderType");
			
            com.byteplus.service.vod.model.response.DescribeVodPlayedStatisDataResponse resp = vodService.describeVodPlayedStatisData(reqBuilder.build());
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