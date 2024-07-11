package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveMetricBandwidthDataResResult
 */
@lombok.Data
public final class DescribeLiveMetricBandwidthDataResResult  {

    /**
     * <p>域名列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>所有时间粒度数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDataList")
    private List<DescribeLiveMetricBandwidthDataResResultBandwidthDataListItem> bandwidthDataList;

    /**
     * <p>下行峰值，单位为 Mbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakDownBandwidth")
    private Float peakDownBandwidth;

    /**
     * <p>上行峰值，单位为 Mbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakUpBandwidth")
    private Float peakUpBandwidth;

    /**
     * <p>时间粒度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>结束时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>起始时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>IP 地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IPList")
    private List<String> iPList;

    /**
     * <p>客户端 IP 所属区域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private DescribeLiveMetricBandwidthDataResResultUserRegionList userRegionList;

    /**
     * <p>过滤字段和时间聚合后的数据</p>
     *
     * <p>:::tip</p>
     *
     * <p>请求时，`DomainList`、`ProtocolList`、`IPList` 和 `ISPList` 至少有一个参数传入了多个值时，会返回该参数；否则不返回该参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDetailDataList")
    private List<DescribeLiveMetricBandwidthDataResResultBandwidthDetailDataListItem> bandwidthDetailDataList;

    /**
     * <p>CDN 节点 IP 所属区域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private DescribeLiveMetricBandwidthDataResResultRegionList regionList;

    /**
     * <p>运营商</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>推拉流协议</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>直播流名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
