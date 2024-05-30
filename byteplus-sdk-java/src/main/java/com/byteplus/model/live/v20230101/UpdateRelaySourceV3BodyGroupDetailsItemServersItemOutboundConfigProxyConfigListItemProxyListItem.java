package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRelaySourceV3BodyGroupDetailsItemServersItemOutboundConfigProxyConfigListItemProxyListItem
 */
@lombok.Data
public final class UpdateRelaySourceV3BodyGroupDetailsItemServersItemOutboundConfigProxyConfigListItemProxyListItem  {

    /**
     * <p>代理地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    /**
     * <p>权重</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Weight")
    private String weight;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
