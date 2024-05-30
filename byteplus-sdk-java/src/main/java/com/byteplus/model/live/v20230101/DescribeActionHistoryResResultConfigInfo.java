package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeActionHistoryResResultConfigInfo
 */
@lombok.Data
public final class DescribeActionHistoryResResultConfigInfo  {

    /**
     * <p>配置进度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigProgess")
    private Float configProgess;

    /**
     * <p>配置机器数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>配置失败的数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailureCount")
    private Integer failureCount;

    /**
     * <p>配置时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProcessTime")
    private String processTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
