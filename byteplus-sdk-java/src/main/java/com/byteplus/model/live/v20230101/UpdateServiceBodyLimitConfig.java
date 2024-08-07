package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateServiceBodyLimitConfig
 */
@lombok.Data
public final class UpdateServiceBodyLimitConfig  {

    /**
     * <p>账号下的vhost限制数目，-1表示无限制，0表示使用默认配置数目</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostLimit")
    private Integer vhostLimit;

    /**
     * <p>账号vhost下的domain限制数目</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainLimit")
    private Integer domainLimit;

    /**
     * <p>账号下app限制数目</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppLimit")
    private Integer appLimit;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PostProcessLimits")
    private List<UpdateServiceBodyLimitConfigPostProcessLimitsItem> postProcessLimits;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SteamLimit")
    private Integer steamLimit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
