package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribePullToPushBandwidthDataBody
 */
@lombok.Data
public final class DescribePullToPushBandwidthDataBody  {

    /**
     * <p>推流域名列表，缺省情况表示当前账号下的所有域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的起始时间，起始时间应早于当前时间，RFC3339 格式的 UTC 时间，精度为 s，例如，`2022-04-13T00:00:00+08:00`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，结束时间需晚于起始时间 `StartTime`，RFC3339 格式的 UTC 时间，精度为 s，例如，`2022-04-14T00:00:00+08:00`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>时间粒度，单位为 s，默认值为 300。</p>
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
     * <p>推流地址类型。缺省情况下表示查询Third。支持 2 种取值。</p>
     *
     * <p>- Live：非第三方；</p>
     *
     * <p>- Third：第三方。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstAddrTypeList")
    private List<String> dstAddrTypeList;

    /**
     * <p>是否展示过滤字段和时间聚合后的详细数据，默认值为 false。</p>
     *
     * <p>- false：不展示；</p>
     *
     * <p>- true：展示。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ShowDetail")
    private Boolean showDetail;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
