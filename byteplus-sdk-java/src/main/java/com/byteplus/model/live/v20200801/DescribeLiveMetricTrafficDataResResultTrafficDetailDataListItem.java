package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveMetricTrafficDataResResultTrafficDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveMetricTrafficDataResResultTrafficDetailDataListItem  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>推拉流协议</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    /**
     * <p>运营商</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISP")
    private String iSP;

    /**
     * <p>IP 地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IP")
    private String iP;

    /**
     * <p>上行总流量，单位为 GB</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalUpTraffic")
    private Float totalUpTraffic;

    /**
     * <p>下行总流量，单位为 GB</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalDownTraffic")
    private Float totalDownTraffic;

    /**
     * <p>时间粒度数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficDataList")
    private List<DescribeLiveMetricTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem> trafficDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
