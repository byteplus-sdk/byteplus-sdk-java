package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveLogDataBody
 */
@lombok.Data
public final class DescribeLiveLogDataBody  {

    /**
     * <p>查询的开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>当前仅支持查询最近 31 天的日志数据。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>域名列表，缺省情况下表示当前用户的所有推流域名和拉流域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>日志类型为拉流转推日志（Type=relay）时，该参数无效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>日志类型，支持的类型如下所示。</p>
     *
     * <p>- pull：拉流日志</p>
     *
     * <p>- push：推流日志</p>
     *
     * <p>- source：回源日志</p>
     *
     * <p>- relay：拉流转推日志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>查询数据的页码，默认为 1，表示查询第一页的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，默认为 20，最大值为 1000。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
