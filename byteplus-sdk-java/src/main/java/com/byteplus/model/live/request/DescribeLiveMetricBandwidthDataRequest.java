package com.byteplus.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveMetricBandwidthDataRequest {
    @JSONField(name = "DomainList")
    private List<String> DomainList;
    @JSONField(name = "ProtocolList")
    private List<String> ProtocolList;
    @JSONField(name = "ISPList")
    private List<String> ISPList;
    @JSONField(name = "IPList")
    private List<String> IPList;
    @JSONField(name = "RegionList")
    private List<Region> RegionList;
    @JSONField(name = "StartTime")
    private String StartTime;
    @JSONField(name = "EndTime")
    private String EndTime;
    @JSONField(name = "Aggregation")
    private int Aggregation;
    @JSONField(name = "ShowDetail")
    private boolean ShowDetail;
    @JSONField(name = "Domain")
    private String Domain;
    @JSONField(name = "App")
    private String App;
    @JSONField(name = "Stream")
    private String Stream;

    @Data
    public static class Region {
        @JSONField(name = "Area")
        private String Area;
        @JSONField(name = "Country")
        private String Country;
        @JSONField(name = "Province")
        private String Province;
    }
}
