package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * DescribeRelaySourceV2ResResultRelaySourceConfigItemGroupListItem
 */
@lombok.Data
public final class DescribeRelaySourceV2ResResultRelaySourceConfigItemGroupListItem  {

    /**
     * <p>回源地址数组</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceDomainList")
    private List<String> relaySourceDomainList;

    /**
     * <p>回源参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceParams")
    private Map<String, String> relaySourceParams;

    /**
     * <p>回源协议，目前只支持以下两种：<li>rmtp <li>flv。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceProtocol")
    private String relaySourceProtocol;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
