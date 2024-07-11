package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveENMetricBandwidthDataResResult
 */
@lombok.Data
public final class DescribeLiveENMetricBandwidthDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>推拉流协议，协议说明如下。</p>
     *
     * <p>- HTTP-FLV：基于 HTTP 协议的推拉流协议，使用 FLV 格式传输视频格式。</p>
     *
     * <p>- HTTP-HLS：基于 HTTP 协议的推拉流协议，使用 TS 格式传输视频格式。</p>
     *
     * <p>- RTMP：Real Time Message Protocol，实时信息传输协议。</p>
     *
     * <p>- RTM：Real Time Media，超低延时直播协议。</p>
     *
     * <p>- SRT：Secure Reliable Transport，安全可靠传输协议。</p>
     *
     * <p>- QUIC：Quick UDP Internet Connections，一种基于 UDP 的全新的低延时互联网传输协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>提供网络接入服务的运营商标识符，标识符与运营商的对应关系如下。</p>
     *
     * <p>- unicom：联通；</p>
     *
     * <p>- railcom：铁通；</p>
     *
     * <p>- telecom：电信；</p>
     *
     * <p>- mobile：移动；</p>
     *
     * <p>- cernet：教育网；</p>
     *
     * <p>- tianwei：天威；</p>
     *
     * <p>- alibaba：阿里巴巴；</p>
     *
     * <p>- tencent：腾讯；</p>
     *
     * <p>- drpeng：鹏博士；</p>
     *
     * <p>- btvn：广电；</p>
     *
     * <p>- huashu：华数；</p>
     *
     * <p>- other：其他。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>CDN 节点 IP 所属区域列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLiveENMetricBandwidthDataResResultRegionListItem> regionList;

    /**
     * <p>客户端 IP 所属区域列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveENMetricBandwidthDataResResultUserRegionListItem> userRegionList;

    /**
     * <p>查询的开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>聚合的时间粒度，单位为秒。</p>
     *
     *
     *
     * <p>- 60：1 分钟；</p>
     *
     * <p>- 300：5 分钟；</p>
     *
     * <p>- 3600：1 小时。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，维度说明如下所示。</p>
     *
     * <p>- Area：CDN节点所在大区；</p>
     *
     * <p>- Country：CDN节点所在国家；</p>
     *
     * <p>- Province：CDN节点所在省份；</p>
     *
     * <p>- UserArea：客户端IP所在大区；</p>
     *
     * <p>- UserCountry：客户端IP所在国家；</p>
     *
     * <p>- UserProvince：客户端IP所在省份。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>查询时间范围内的上行峰值，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakUpBandwidth")
    private Float peakUpBandwidth;

    /**
     * <p>查询时间范围内的下行峰值，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakDownBandwidth")
    private Float peakDownBandwidth;

    /**
     * <p>所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDataList")
    private List<DescribeLiveENMetricBandwidthDataResResultBandwidthDataListItem> bandwidthDataList;

    /**
     * <p>按维度拆分后的数据。</p>
     *
     * <p>:::tip</p>
     *
     * <p>请求时，`DetailField`中至少有一个参数传入时，会返回该参数；否则不返回该参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDetailDataList")
    private List<DescribeLiveENMetricBandwidthDataResResultBandwidthDetailDataListItem> bandwidthDetailDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
