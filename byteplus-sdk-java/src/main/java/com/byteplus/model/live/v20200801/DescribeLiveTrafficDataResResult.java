package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTrafficDataResResult
 */
@lombok.Data
public final class DescribeLiveTrafficDataResResult  {

    /**
     * <p>时间粒度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>所有时间粒度数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficDataList")
    private List<DescribeLiveTrafficDataResResultTrafficDataListItem> trafficDataList;

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
     * <p>域名列表，代表所查询的域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

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
    private List<DescribeLiveTrafficDataResResultRegionListItem> regionList;

    /**
     * <p>客户端 IP 所属区域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveTrafficDataResResultUserRegionListItem> userRegionList;

    /**
     * <p>过滤字段和时间聚合后的数据</p>
     *
     * <p>:::tip</p>
     *
     * <p>请求时，`DomainList`、`ProtocolList` 和 `ISPList` 至少有一个参数传入了多个值时，会返回该参数；否则不返回该参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficDetailDataList")
    private List<DescribeLiveTrafficDataResResultTrafficDetailDataListItem> trafficDetailDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
