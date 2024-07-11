package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRelaySourceV3BodyGroupDetailsItemServersItemOutboundConfig
 */
@lombok.Data
public final class UpdateRelaySourceV3BodyGroupDetailsItemServersItemOutboundConfig  {

    /**
     * <p>代理模式，0：固定模式，1: 回源模式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyMode")
    private String proxyMode;

    /**
     * <p>代理配置列表，不传默认不使用代理</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyConfigList")
    private List<UpdateRelaySourceV3BodyGroupDetailsItemServersItemOutboundConfigProxyConfigListItem> proxyConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
