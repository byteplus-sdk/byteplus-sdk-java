package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTrafficDataBody
 */
@lombok.Data
public final class DescribeLiveTrafficDataBody  {

    /**
     * <p>时间粒度，单位为 s，默认值为 300。支持如下时间粒度。</p>
     *
     * <p>- 300：支持单次查询时间跨度为 31 天，历史查询时间范围为 93 天；</p>
     *
     * <p>- 3600：支持单次查询时间跨度为 93 天，历史查询时间范围为 93 天；</p>
     *
     * <p>- 86400：支持单次查询时间跨度为 366 天，历史查询时间范围为 366 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>域名列表，缺省情况表示该用户的所有域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为 s，例如：2021-04-14T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询的起始时间，RFC3339 格式的 UTC 时间，精度为 s，例如：2021-04-13T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>推拉流协议，缺省情况下表示所有协议类型。支持的协议如下所示。</p>
     *
     *
     *
     * <p>- HTTP-FLV</p>
     *
     * <p>- HTTP-HLS</p>
     *
     * <p>- RTMP</p>
     *
     * <p>- RTM</p>
     *
     * <p>- SRT</p>
     *
     * <p>- QUIC</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>如果设置推拉流协议为 QUIC，不能同时传其他协议。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>运营商，缺省情况下，表示查询所有运营商，支持的运营商如下所示。</p>
     *
     * <p> - unicom：联通；</p>
     *
     * <p> - railcom：铁通；</p>
     *
     * <p> - telecom：电信；</p>
     *
     * <p> - mobile：移动；</p>
     *
     * <p> - cernet：教育网；</p>
     *
     * <p> - tianwei：天威；</p>
     *
     * <p> - alibaba：阿里巴巴；</p>
     *
     * <p> - tencent：腾讯；</p>
     *
     * <p> - drpeng：鹏博士；</p>
     *
     * <p> - btvn：广电；</p>
     *
     * <p> - huashu：华数；</p>
     *
     * <p> - other：其他。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>CDN 节点 IP 所属区域的列表。缺省情况下表示所有区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLiveTrafficDataBodyRegionListItem> regionList;

    /**
     * <p>是否返回更详细的数据，默认为 false。</p>
     *
     *
     *
     * <p>- true：返回每个过滤字段对应的用量数据；</p>
     *
     * <p>- false：不返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ShowDetail")
    private Boolean showDetail;

    /**
     * <p>客户端 IP 所属区域的列表，缺省情况下表示所有区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLiveTrafficDataBodyUserRegionListItem> userRegionList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
