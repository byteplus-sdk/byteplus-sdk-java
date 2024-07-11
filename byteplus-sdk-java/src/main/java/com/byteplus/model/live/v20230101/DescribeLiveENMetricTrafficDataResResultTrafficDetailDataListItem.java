package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveENMetricTrafficDataResResultTrafficDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveENMetricTrafficDataResResultTrafficDetailDataListItem  {

    /**
     * <p>按维度进行数据拆分后，当前维度的上行总流量，单位为 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalUpTraffic")
    private Float totalUpTraffic;

    /**
     * <p>按维度进行数据拆分后，当前维度的下行总流量，单位为 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalDownTraffic")
    private Float totalDownTraffic;

    /**
     * <p>按维度进行数据拆分后，当前维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficDataList")
    private List<DescribeLiveENMetricTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem> trafficDataList;

    /**
     * <p>按CDN节点大区进行数据聚合时的大区信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Area")
    private String area;

    /**
     * <p>按CDN节点国家维度进行数据聚合时的国家信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>按CDN节点省份进行数据聚合时的省份信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    /**
     * <p>按客户端IP大区进行数据聚合时的大区信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserArea")
    private String userArea;

    /**
     * <p>按客户端IP国家进行数据聚合的国家信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserCountry")
    private String userCountry;

    /**
     * <p>按客户端IP省份进行数据聚合时的省份信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserProvince")
    private String userProvince;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
