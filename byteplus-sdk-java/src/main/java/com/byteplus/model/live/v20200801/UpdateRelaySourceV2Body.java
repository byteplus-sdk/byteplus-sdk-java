package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * UpdateRelaySourceV2Body
 */
@lombok.Data
public final class UpdateRelaySourceV2Body  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>回源地址数组。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceDomainList")
    private List<String> relaySourceDomainList;

    /**
     * <p>自定义回源参数，缺省情况下为空。格式为 `"Key":"Value"`，例如，`"domain":"live.push.net",`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceParams")
    private Map<String, String> relaySourceParams;

    /**
     * <p>回源协议，支持两种回源协议。</p>
     *
     * <p>- rtmp</p>
     *
     * <p>- flv</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceProtocol")
    private String relaySourceProtocol;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
