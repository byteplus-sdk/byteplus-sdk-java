package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItemServersItem
 */
@lombok.Data
public final class DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItemServersItem  {

    /**
     * <p>权重</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Weight")
    private String weight;

    /**
     * <p>回源协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceProtocol")
    private String relaySourceProtocol;

    /**
     * <p>回源地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceDomain")
    private String relaySourceDomain;

    /**
     * <p>回源Host</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Host")
    private String host;

    /**
     * <p>自定义回源参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceParams")
    private Map<String, String> relaySourceParams;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutboundConfig")
    private DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItemServersItemOutboundConfig outboundConfig;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private String updateTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
