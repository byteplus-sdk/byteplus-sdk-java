package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveStreamSessionDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata ResponseMetadata;

    @JSONField(name = "Result")
    Result Result;

    @Data
    public static class Result {

        @JSONField(name = "DomainList")
        List<String> DomainList;

        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "App")
        String App;

        @JSONField(name = "Stream")
        String Stream;

        @JSONField(name = "RefererList")
        List<String> RefererList;

        @JSONField(name = "ProtocolList")
        List<String> ProtocolList;

        @JSONField(name = "ISPList")
        List<String> ISPList;

        @JSONField(name = "RegionList")
        List<Region> RegionList;

        @JSONField(name = "StartTime")
        String StartTime;

        @JSONField(name = "EndTime")
        String EndTime;

        @JSONField(name = "Aggregation")
        Integer Aggregation;

        @JSONField(name = "TotalRequest")
        Integer TotalRequest;

        @JSONField(name = "PeakOnlineUser")
        Integer PeakOnlineUser;

        @JSONField(name = "SessionDataList")
        List<SessionData> SessionDataList;

        @JSONField(name = "SessionDetailDataList")
        List<SessionDetailData> SessionDetailDataList;
    }

    @Data
    public static class Region {
        @JSONField(name = "ISPList")
        String Area;

        @JSONField(name = "Country")
        String Country;

        @JSONField(name = "Province")
        String Province;
    }

    @Data
    public static class SessionData {
        @JSONField(name = "TimeStamp")
        String TimeStamp;

        @JSONField(name = "Request")
        Integer Request;

        @JSONField(name = "OnlineUser")
        Integer OnlineUser;

    }

    @Data
    public static class SessionDetailData {
        @JSONField(name = "Domain")
        String Domain;

        @JSONField(name = "Referer")
        String Referer;

        @JSONField(name = "Protocol")
        String Protocol;

        @JSONField(name = "ISP")
        String ISP;

        @JSONField(name = "TotalRequest")
        Integer TotalRequest;

        @JSONField(name = "PeakOnlineUser")
        Integer PeakOnlineUser;

        @JSONField(name = "SessionDataList")
        List<SessionData> SessionDataList;

    }

}


