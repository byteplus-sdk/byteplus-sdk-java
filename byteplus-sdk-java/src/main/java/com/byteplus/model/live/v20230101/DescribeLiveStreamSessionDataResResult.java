package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamSessionDataResResult
 */
@lombok.Data
public final class DescribeLiveStreamSessionDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

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
     * <p>- `HTTP-FLV`：基于 HTTP 协议的推拉流协议，使用 FLV 格式传输视频格式。</p>
     *
     * <p>- `HTTP-HLS`：基于 HTTP 协议的推拉流协议，使用 TS 格式传输视频格式。</p>
     *
     * <p>- `RTMP`：Real Time Message Protocol，实时信息传输协议。</p>
     *
     * <p>- `RTM`：Real Time Media，超低延时直播协议。</p>
     *
     * <p>- `SRT`：Secure Reliable Transport，安全可靠传输协议。</p>
     *
     * <p>- `QUIC`：Quick UDP Internet Connections，一种基于 UDP 的全新的低延时互联网传输协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>提供网络接入服务的运营商标识符，标识符与运营商的对应关系如下。</p>
     *
     * <p>- `unicom`：联通；</p>
     *
     * <p>- `railcom`：铁通；</p>
     *
     * <p>- `telecom`：电信；</p>
     *
     * <p>- `mobile`：移动；</p>
     *
     * <p>- `cernet`：教育网；</p>
     *
     * <p>- `tianwei`：天威；</p>
     *
     * <p>- `alibaba`：阿里巴巴；</p>
     *
     * <p>- `tencent`：腾讯；</p>
     *
     * <p>- `drpeng`：鹏博士；</p>
     *
     * <p>- `btvn`：广电；</p>
     *
     * <p>- `huashu`：华数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>拉流请求的 Referer 信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RefererList")
    private List<String> refererList;

    /**
     * <p>CDN 节点 IP 所属的区域列表，缺省情况下表示所有区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLiveStreamSessionDataResResultRegionListItem> regionList;

    /**
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>数据聚合的时间粒度，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，维度说明如下所示。</p>
     *
     * <p>- `Domain`：域名；</p>
     *
     * <p>- `ISP`：运营商；</p>
     *
     * <p>- `Protocol`：推拉流协议；</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>查询时间范围内的请求数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalRequest")
    private Integer totalRequest;

    /**
     * <p>查询时间范围内的在线人数峰值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakOnlineUser")
    private Integer peakOnlineUser;

    /**
     * <p>所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionDataList")
    private List<DescribeLiveStreamSessionDataResResultSessionDataListItem> sessionDataList;

    /**
     * <p>按维度拆分的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionDetailDataList")
    private List<DescribeLiveStreamSessionDataResResultSessionDetailDataListItem> sessionDetailDataList;

    /**
     * <p>在指定时间范围内，所有域名和协议的总边缘请求命中率。用于评估边缘请求缓存机制在减少源服务器负载方面的有效性。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalHitRate")
    private Double totalHitRate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
