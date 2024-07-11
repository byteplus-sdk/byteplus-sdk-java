package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCDNTrafficDataResResult
 */
@lombok.Data
public final class DescribeCDNTrafficDataResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficTotalData")
    private List<DescribeCDNTrafficDataResResultTrafficTotalDataItem> trafficTotalData;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficDetailDataList")
    private List<DescribeCDNTrafficDataResResultTrafficDetailDataListItem> trafficDetailDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
