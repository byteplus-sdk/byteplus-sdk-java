package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveENMetricBandwidthDataResResultBandwidthDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveENMetricBandwidthDataResResultBandwidthDetailDataListItem  {

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

    /**
     * <p>按维度进行数据拆分后，当前维度的上行峰值带宽，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakUpBandwidth")
    private Float peakUpBandwidth;

    /**
     * <p>按维度进行数据拆分后，当前维度的下行峰值带宽，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakDownBandwidth")
    private Float peakDownBandwidth;

    /**
     * <p>按维度进行数据拆分后，当前维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDataList")
    private List<DescribeLiveENMetricBandwidthDataResResultBandwidthDetailDataListItemBandwidthDataListItem> bandwidthDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
