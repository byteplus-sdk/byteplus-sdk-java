package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * EnableHTTPHeaderConfigBody
 */
@lombok.Data
public final class EnableHTTPHeaderConfigBody  {

    /**
     * <p>The domain name space.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>The type of HTTP header to be enabled or disabled:</p>
     *
     * <p>- `0`: In the response sent from an edge server to a client</p>
     *
     * <p>- `1`: In the request sent to a third-party origin server during an origin-pull task.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Phase")
    private Integer phase;

    /**
     * <p>Whether to enable the configuration.</p>
     *
     * <p>- `true`: Enable</p>
     *
     * <p>- `false`: Disable</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>The domain name.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
