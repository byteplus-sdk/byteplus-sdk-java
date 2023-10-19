package com.byteplus.example.live;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.live.request.*;
import com.byteplus.model.live.response.*;
import com.byteplus.service.live.LiveService;
import com.byteplus.service.live.impl.LiveServiceImpl;


/**
 * 统计分析相关的demo
 */
public class LiveAnalysisDemo {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        describePushStreamMetricsDemo(liveService);
        describeLiveMetricBandwidthDataDemo(liveService);
        describeLiveMetricTrafficDataDemo(liveService);
    }

    public static void describePushStreamMetricsDemo(LiveService liveService) {

        String jsonStr = "{\n" +
                "    \"Domain\": \"example.com\",\n" +
                "    \"App\": \"example_app\",\n" +
                "    \"Stream\": \"example_stream\",\n" +
                "    \"StartTime\": \"2021-08-16T00:00:00Z\",\n" +
                "    \"EndTime\": \"2021-08-16T00:01:59Z\",\n" +
                "    \"Aggregation\": 30\n" +
                "}";
        DescribePushStreamMetricsRequest request = JSON.parseObject(jsonStr, DescribePushStreamMetricsRequest.class);
        try {
            DescribePushStreamMetricsResponse response = liveService.describePushStreamMetrics(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    public static void describeLiveMetricTrafficDataDemo(LiveService liveService) {

        String jsonStr = "{\n" +
                "    \"DomainList\": [\"example.com\"],\n" +
                "    \"ProtocolList\": [\"HTTP-FLV\", \"RTMP\"],\n" +
                "    \"ISPList\": [\"telecom\"],\n" +
                "    \"IPList\": [\"123.123.123.000\"],\n" +
                "    \"RegionList\": [\n" +
                "        {\n" +
                "            \"Area\": \"CN\",\n" +
                "            \"Country\": \"CN\",\n" +
                "            \"Province\": \"beijing\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"StartTime\": \"2021-04-13T00:00:00+08:00\",\n" +
                "    \"EndTime\": \"2021-04-14T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 300,\n" +
                "    \"ShowDetail\": true\n" +
                "}";
        DescribeLiveMetricTrafficDataRequest request = JSON.parseObject(jsonStr, DescribeLiveMetricTrafficDataRequest.class);
        try {
            DescribeLiveMetricTrafficDataResponse response = liveService.describeLiveMetricTrafficData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void describeLiveMetricBandwidthDataDemo(LiveService liveService) {
        String jsonStr = "{\n" +
                "    \"DomainList\": [\"example.com\"],\n" +
                "    \"ProtocolList\": [\"HTTP-FLV\", \"RTMP\"],\n" +
                "    \"ISPList\": [\"telecom\"],\n" +
                "    \"IPList\": [\"123.123.123.000\"],\n" +
                "    \"RegionList\": [\n" +
                "        {\n" +
                "            \"Area\": \"CN\",\n" +
                "            \"Country\": \"CN\",\n" +
                "            \"Province\": \"beijing\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"StartTime\": \"2021-04-13T00:00:00+08:00\",\n" +
                "    \"EndTime\": \"2021-04-14T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 300,\n" +
                "    \"ShowDetail\": true\n" +
                "}";
        DescribeLiveMetricBandwidthDataRequest request = JSON.parseObject(jsonStr, DescribeLiveMetricBandwidthDataRequest.class);
        try {
            DescribeLiveMetricBandwidthDataResponse response = liveService.describeLiveMetricBandwidthData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
