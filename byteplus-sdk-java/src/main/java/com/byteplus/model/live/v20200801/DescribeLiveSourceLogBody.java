package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveSourceLogBody
 */
@lombok.Data
public final class DescribeLiveSourceLogBody  {

    /**
     * <p>域名，缺省情况下表示获取所有域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domains")
    private List<String> domains;

    /**
     * <p>页数，默认为 1</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Page")
    private Integer page;

    /**
     * <p>每页的文件个数，默认 20</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Integer size;

    /**
     * <p>查询的结束时间，默认值为当前时刻，支持查询 93 天之内的数据。RFC3339 格式的 UTC 时间，精度为 s，例如，2022-04-01T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询的起始时间，默认值为 24 小时前，支持查询 93 天之内的数据。RFC3339 格式的 UTC 时间，精度为 s，例如，2022-04-01T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
