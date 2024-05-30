package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeServiceResResultLimitConfig
 */
@lombok.Data
public final class DescribeServiceResResultLimitConfig  {

    /**
     * <p>账号下vhost的数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostLimit")
    private Integer vhostLimit;

    /**
     * <p>vhost下domain的数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainLimit")
    private Integer domainLimit;

    /**
     * <p>app数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppLimit")
    private Integer appLimit;

    /**
     * <p>stream数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamLimit")
    private Integer streamLimit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
