package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRelaySourceV3BodyGroupDetailsItemServersItemOutboundConfigProxyConfigListItem
 */
@lombok.Data
public final class UpdateRelaySourceV3BodyGroupDetailsItemServersItemOutboundConfigProxyConfigListItem  {

    /**
     * <p>运营商</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISP")
    private String iSP;

    /**
     * <p>机房</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IDC")
    private String iDC;

    /**
     * <p>集群</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cluster")
    private String cluster;

    /**
     * <p>代理列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyList")
    private List<UpdateRelaySourceV3BodyGroupDetailsItemServersItemOutboundConfigProxyConfigListItemProxyListItem> proxyList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
