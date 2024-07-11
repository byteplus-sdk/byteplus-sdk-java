package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeTranscodeDataBody
 */
@lombok.Data
public final class DescribeTranscodeDataBody  {

    /**
     * <p>时间粒度，单位为 s，当前仅支持天粒度，默认值为 86400。单次查询时间跨度为 93d，历史查询时间范围为 93d</p>
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
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Resolution")
    private String resolution;

    /**
     * <p>查询的起始时间，RFC3339 格式的 UTC 时间，精度为 s，例如：2022-04-01T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VCodec")
    private String vCodec;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
