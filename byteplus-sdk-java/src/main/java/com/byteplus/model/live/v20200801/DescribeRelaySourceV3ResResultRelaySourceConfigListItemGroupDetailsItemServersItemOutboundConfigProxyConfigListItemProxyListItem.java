package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItemServersItemOutboundConfigProxyConfigListItemProxyListItem
 */
@lombok.Data
public final class DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItemServersItemOutboundConfigProxyConfigListItemProxyListItem  {

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
