package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItemServersItemOutboundConfig
 */
@lombok.Data
public final class DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItemServersItemOutboundConfig  {

    /**
     * <p>代理模式，0：固定模式，1: 回源模式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyMode")
    private String proxyMode;

    /**
     * <p>代理配置列表，不传默认不使用代理</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyConfigList")
    private List<DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItemServersItemOutboundConfigProxyConfigListItem> proxyConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
