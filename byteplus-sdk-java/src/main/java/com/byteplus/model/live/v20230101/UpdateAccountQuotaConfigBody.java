package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateAccountQuotaConfigBody
 */
@lombok.Data
public final class UpdateAccountQuotaConfigBody  {

    /**
     * <p>账号下vhost数量限制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostLimit")
    private Integer vhostLimit;

    /**
     * <p>vhost 下 domain 数量限制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainLimit")
    private Integer domainLimit;

    /**
     * <p>vhost 下 app 数量限制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppLimit")
    private Integer appLimit;

    /**
     * <p>vhost + app 下 strem 数量限制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamLimit")
    private Integer streamLimit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
