package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveTrafficDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeLiveTrafficDataOutput Result;

    @Data
    public static class DescribeLiveTrafficDataOutput {
        @JSONField(name = "DomainList")
        private List<String> DomainList;

        @JSONField(name = "ProtocolList")
        private List<String> ProtocolList;

        @JSONField(name = "ISPList")
        private List<String> ISPList;

        @JSONField(name = "RegionList")
        private List<String> RegionList;

        @JSONField(name = "StartTime")
        private String StartTime;

        @JSONField(name = "EndTime")
        private String EndTime;

        @JSONField(name = "Aggregation")
        private int Aggregation;

        @JSONField(name = "TotalUpTraffic")
        private double TotalUpTraffic;

        @JSONField(name = "TotalDownTraffic")
        private double TotalDownTraffic;

        @JSONField(name = "TrafficDataList")
        private List<TrafficData> TrafficDataList;
    }

    @Data
    public static class TrafficData {
        @JSONField(name = "TimeStamp")
        private String TimeStamp;

        @JSONField(name = "UpTraffic")
        private double UpTraffic;

        @JSONField(name = "DownTraffic")
        private double DownTraffic;
    }

    @Data
    public static class TrafficDetailDataList {
        @JSONField(name = "Domain")
        private String Domain;

        @JSONField(name = "Protocol")
        private String Protocol;

        @JSONField(name = "ISP")
        private String ISP;

        @JSONField(name = "TotalUpTraffic")
        private double TotalUpTraffic;

        @JSONField(name = "TotalDownTraffic")
        private double TotalDownTraffic;

        @JSONField(name = "TrafficDataList")
        private List<TrafficData> TrafficDataList;
    }
}
