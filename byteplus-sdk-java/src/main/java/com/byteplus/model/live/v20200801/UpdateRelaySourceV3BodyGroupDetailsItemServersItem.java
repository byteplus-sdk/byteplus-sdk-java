package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdateRelaySourceV3BodyGroupDetailsItemServersItem
 */
@lombok.Data
public final class UpdateRelaySourceV3BodyGroupDetailsItemServersItem  {

    /**
     * <p>权重</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Weight")
    private String weight;

    /**
     * <p>回源协议，支持两种回源协议。</p>
     *
     *
     *
     * <p>- rtmp</p>
     *
     * <p>- flv</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceProtocol")
    private String relaySourceProtocol;

    /**
     * <p>回源地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceDomain")
    private String relaySourceDomain;

    /**
     * <p>回源Host</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Host")
    private String host;

    /**
     * <p>自定义回源参数，缺省情况下为空。格式为 `"Key":"Value"`，例如，`"domain":"live.push.net",`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceParams")
    private Map<String, String> relaySourceParams;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutboundConfig")
    private UpdateRelaySourceV3BodyGroupDetailsItemServersItemOutboundConfig outboundConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
