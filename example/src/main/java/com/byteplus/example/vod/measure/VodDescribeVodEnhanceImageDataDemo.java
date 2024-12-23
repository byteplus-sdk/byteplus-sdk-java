// Code generated by protoc-gen-byteplus-sdk
// source: describeVodEnhanceImageData
// DO NOT EDIT!

package com.byteplus.example.vod.measure;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
public class VodDescribeVodEnhanceImageDataDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.byteplus.service.vod.model.request.DescribeVodEnhanceImageDataRequest.Builder reqBuilder = com.byteplus.service.vod.model.request.DescribeVodEnhanceImageDataRequest.newBuilder();
			reqBuilder.setSpaceList("your SpaceList");
			reqBuilder.setStartTime("your StartTime");
			reqBuilder.setEndTime("your EndTime");
			reqBuilder.setTaskTypeList("your TaskTypeList");
			reqBuilder.setTaskStageList("your TaskStageList");
			reqBuilder.setAggregation(0);
			reqBuilder.setRegionList("your RegionList");
			
            com.byteplus.service.vod.model.response.DescribeVodEnhanceImageDataResponse resp = vodService.describeVodEnhanceImageData(reqBuilder.build());
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