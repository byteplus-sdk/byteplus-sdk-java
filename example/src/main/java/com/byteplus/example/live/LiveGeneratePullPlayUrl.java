package com.byteplus.example.live;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.live.request.DescribeLiveStorageSpaceDataRequest;
import com.byteplus.model.live.request.GeneratePlayURLRequest;
import com.byteplus.model.live.request.GeneratePushURLRequest;
import com.byteplus.model.live.request.ListStorageSpaceRequest;
import com.byteplus.model.live.response.DescribeLiveStorageSpaceDataResponse;
import com.byteplus.model.live.response.GeneratePlayURLResponse;
import com.byteplus.model.live.response.GeneratePushURLResponse;
import com.byteplus.model.live.response.ListStorageSpaceResponse;
import com.byteplus.service.live.LiveService;
import com.byteplus.service.live.impl.LiveServiceImpl;

public class LiveGeneratePullPlayUrl {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        generatePushUrl(liveService);
        generatePlayUrl(liveService);
    }
    public static void generatePushUrl(LiveService liveService) {
        String jsonStr = "{\n" +
                "    \"Vhost\":\"example.org\",\n" +
                "    \"Domain\":\"example.org\",\n" +
                "    \"App\":\"live\",\n" +
                "    \"Stream\":\"test1\",\n" +
                "    \"ValidDuration\":3600,\n" +
                "    \"ExpiredTime\":\"2023-02-06T06:27:06+00:00\"\n" +
                "}";
        GeneratePushURLRequest request = JSON.parseObject(jsonStr, GeneratePushURLRequest.class);
        try {
            GeneratePushURLResponse response = liveService.generatePushURL(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void generatePlayUrl(LiveService liveService) {
        String jsonStr = "{\n" +
                "    \"Vhost\":\"example.org\",\n" +
                "    \"Domain\":\"example.org\",\n" +
                "    \"App\":\"live\",\n" +
                "    \"Stream\":\"test1\",\n" +
                "    \"ValidDuration\":3600,\n" +
                "    \"ExpiredTime\":\"2023-01-30T07:08:30+00:00\"\n" +
                "}";
        GeneratePlayURLRequest request = JSON.parseObject(jsonStr, GeneratePlayURLRequest.class);
        try {
            GeneratePlayURLResponse response = liveService.generatePlayURL(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
