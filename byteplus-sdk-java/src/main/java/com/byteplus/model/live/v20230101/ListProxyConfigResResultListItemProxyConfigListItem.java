package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListProxyConfigResResultListItemProxyConfigListItem
 */
@lombok.Data
public final class ListProxyConfigResResultListItemProxyConfigListItem  {

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
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyList")
    private List<ListProxyConfigResResultListItemProxyConfigListItemProxyListItem> proxyList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
