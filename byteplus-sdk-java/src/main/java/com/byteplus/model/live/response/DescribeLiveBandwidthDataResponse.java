package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveBandwidthDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeLiveBandwidthDataOutput Result;

    @Data
    public static class DescribeLiveBandwidthDataOutput {

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

        @JSONField(name = "PeakUpBandwidth")
        private double PeakUpBandwidth;

        @JSONField(name = "PeakDownBandwidth")
        private double PeakDownBandwidth;

        @JSONField(name = "BandwidthDataList")
        private List<BandwidthData> BandwidthDataList;

        @JSONField(name = "BandwidthDetailDataList")
        private List<BandwidthDetailData> BandwidthDetailDataList;
    }

    @Data
    public static class BandwidthData {
        @JSONField(name = "TimeStamp")
        private String TimeStamp;

        @JSONField(name = "UpBandwidth")
        private double UpBandwidth;

        @JSONField(name = "DownBandwidth")
        private double DownBandwidth;
    }

    @Data
    public static class BandwidthDetailData {
        @JSONField(name = "Domain")
        private String Domain;

        @JSONField(name = "Protocol")
        private String Protocol;

        @JSONField(name = "ISP")
        private String ISP;

        @JSONField(name = "PeakUpBandwidth")
        private double PeakUpBandwidth;

        @JSONField(name = "PeakDownBandwidth")
        private double PeakDownBandwidth;

        @JSONField(name = "BandwidthDataList")
        private List<BandwidthData> BandwidthDataList;
    }
}
