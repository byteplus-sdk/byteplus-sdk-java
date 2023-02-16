package com.byteplus.example.live;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.live.request.*;
import com.byteplus.model.live.response.*;
import com.byteplus.service.live.LiveService;
import com.byteplus.service.live.impl.LiveServiceImpl;

public class LiveStorageSpaceDemo {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        listStorageSpaceDemo(liveService);
        describeLiveStorageSpaceDataDemo(liveService);
    }

    public static void listStorageSpaceDemo(LiveService liveService) {
        String jsonStr = "{\n" +
                "    \"PageSize\": 10,\n" +
                "    \"PageNum\": 1\n" +
                "}";
        ListStorageSpaceRequest request = JSON.parseObject(jsonStr, ListStorageSpaceRequest.class);
        try {
            ListStorageSpaceResponse response = liveService.listStorageSpace(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void describeLiveStorageSpaceDataDemo(LiveService liveService) {
        String jsonStr = "{\n" +
                "    \"Buckets\": [\"Buckets1\"],\n" +
                "    \"StartTime\": \"2022-07-13T00:00:00+08:00\",\n" +
                "    \"EndTime\": \"2022-07-14T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 86400,\n" +
                "}";
        DescribeLiveStorageSpaceDataRequest request = JSON.parseObject(jsonStr, DescribeLiveStorageSpaceDataRequest.class);
        try {
            DescribeLiveStorageSpaceDataResponse response = liveService.describeLiveStorageSpaceData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
