package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLatencyConfigResResultLatencyConfigListItem
 */
@lombok.Data
public final class DescribeLatencyConfigResResultLatencyConfigListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>单位ms</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GopCacheSize")
    private String gopCacheSize;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private String updateTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
