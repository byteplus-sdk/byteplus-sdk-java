package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTXMetricTrafficDataBody
 */
@lombok.Data
public final class DescribeLiveTXMetricTrafficDataBody  {

    /**
     * <p>域名列表，缺省情况表示查询所有域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询开始时间，格式YYYY-MM-DD HH:MM:SS，北京时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询结束时间，格式YYYY-MM-DD HH:MM:SS，北京时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>是否为计费流量，默认false</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Fee")
    private Boolean fee;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
