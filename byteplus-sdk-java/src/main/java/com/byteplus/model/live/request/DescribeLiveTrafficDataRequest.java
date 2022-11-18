package com.byteplus.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.live.Region;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveTrafficDataRequest {
    @JSONField(name = "DomainList")
    private List<String> DomainList;

    @JSONField(name = "StartTime")
    private String StartTime;

    @JSONField(name = "EndTime")
    private String EndTime;

    @JSONField(name = "Aggregation")
    private int Aggregation;

    @JSONField(name = "ProtocolList")
    private List<String> ProtocolList;

    @JSONField(name = "ISPList")
    private List<String> ISPList;

    @JSONField(name = "RegionList")
    private List<Region> RegionList;

    @JSONField(name = "ShowDetail")
    private boolean ShowDetail;
}
