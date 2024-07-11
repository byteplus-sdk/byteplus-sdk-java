package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePlayStatusCodeDataResResultSummaryStatusListItem
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataResResultSummaryStatusListItem  {

    /**
     * <p>状态码，不按分组进行汇总</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusCode")
    private Integer statusCode;

    /**
     * <p>状态码数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>所占请求数量的占比</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Percent")
    private Float percent;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
