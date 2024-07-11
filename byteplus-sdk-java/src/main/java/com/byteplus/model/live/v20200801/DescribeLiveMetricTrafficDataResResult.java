package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveMetricTrafficDataResResult
 */
@lombok.Data
public final class DescribeLiveMetricTrafficDataResResult  {

    /**
     * <p>域名列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>直播流名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>推拉流协议</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>运营商</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>CDN 节点 IP 所属区域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLiveMetricTrafficDataResResultRegionListItem> regionList;

    /**
     * <p>客户端 IP 所属区域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveMetricTrafficDataResResultUserRegionListItem> userRegionList;

    /**
     * <p>IP 地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IPList")
    private List<String> iPList;

    /**
     * <p>起始时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>结束时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>时间粒度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

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
     * <p>所有时间粒度数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficDataList")
    private List<DescribeLiveMetricTrafficDataResResultTrafficDataListItem> trafficDataList;

    /**
     * <p>过滤字段和时间聚合后的数据</p>
     *
     * <p>:::tip</p>
     *
     * <p>请求时，`DomainList`、`ProtocolList`、`IPList` 和 `ISPList` 至少有一个参数传入了多个值时，会返回该参数；否则不返回该参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficDetailDataList")
    private List<DescribeLiveMetricTrafficDataResResultTrafficDetailDataListItem> trafficDetailDataList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private Object responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
