// Code generated by protoc-gen-byteplus-sdk
// source: describeVodSpaceSubtitleStatisData
// DO NOT EDIT!

package com.byteplus.example.vod.measure;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
public class VodDescribeVodSpaceSubtitleStatisDataDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.byteplus.service.vod.model.request.DescribeVodSpaceSubtitleStatisDataRequest.Builder reqBuilder = com.byteplus.service.vod.model.request.DescribeVodSpaceSubtitleStatisDataRequest.newBuilder();
			reqBuilder.setSpaceList("your SpaceList");
			reqBuilder.setStartTime("your StartTime");
			reqBuilder.setEndTime("your EndTime");
			reqBuilder.setSubtitleType("your SubtitleType");
			reqBuilder.setTaskStageList("your TaskStageList");
			reqBuilder.setAggregation(0);
			reqBuilder.setDetailFieldList("your DetailFieldList");
			
            com.byteplus.service.vod.model.response.DescribeVodSpaceSubtitleStatisDataResponse resp = vodService.describeVodSpaceSubtitleStatisData(reqBuilder.build());
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