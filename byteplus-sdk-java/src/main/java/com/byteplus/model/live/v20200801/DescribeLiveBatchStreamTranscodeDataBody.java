package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveBatchStreamTranscodeDataBody
 */
@lombok.Data
public final class DescribeLiveBatchStreamTranscodeDataBody  {

    /**
     * <p>域名列表。缺省情况下，表示当前账号下的所有域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的起始时间，支持查询最近 93 天内的数据。RFC3339 格式的 UTC 时间，精度为 s，例如，2022-04-01T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，支持查询最近 93 天内的数据。RFC3339 格式的 UTC 时间，精度为 s，例如，2022-04-02T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>分页查询页码，默认值为 1，即查询第一页的信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>单个分页中，查询的流数量。默认值为 1000，取值范围为 [100,1000]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
