package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTrafficDataResResultTrafficDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveTrafficDataResResultTrafficDetailDataListItem  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>下行峰值，单位为 Mbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalDownTraffic")
    private Float totalDownTraffic;

    /**
     * <p>所有时间粒度数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficDataList")
    private List<DescribeLiveTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem> trafficDataList;

    /**
     * <p>上行峰值，单位为 Mbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalUpTraffic")
    private Float totalUpTraffic;

    /**
     * <p>运营商</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISP")
    private String iSP;

    /**
     * <p>推拉流协议</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
