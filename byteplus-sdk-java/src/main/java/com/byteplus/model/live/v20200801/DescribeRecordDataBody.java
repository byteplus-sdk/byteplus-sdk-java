package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRecordDataBody
 */
@lombok.Data
public final class DescribeRecordDataBody  {

    /**
     * <p>时间粒度，单位为 s。默认值为 300。支持如下时间粒度。</p>
     *
     * <p>- 300：支持单次查询时间跨度为 31 天，历史查询时间范围为 93 天；</p>
     *
     * <p>- 3600：支持单次查询时间跨度为 93 天，历史查询时间范围为 93 天；</p>
     *
     * <p>- 86400：支持单次查询时间跨度为 366 天，历史查询时间范围为 366 天；</p>
     *
     * <p>- 2592000：代表按自然月聚合，天数为 28 天～31 天不等。支持单次查询时间跨度为 1 年，历史查询时间范围为 2 年。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>域名列表，缺省情况表示该用户的所有域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为 s，例如：2022-04-02T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询的起始时间，RFC3339 格式的 UTC 时间，精度为 s，例如：2022-04-01T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
