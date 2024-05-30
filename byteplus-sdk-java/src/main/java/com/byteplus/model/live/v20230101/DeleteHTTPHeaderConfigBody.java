package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteHTTPHeaderConfigBody
 */
@lombok.Data
public final class DeleteHTTPHeaderConfigBody  {

    /**
     * <p>The domain name space.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>The domain name.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>The type of HTTP header configurations you want to delete:</p>
     *
     * <p>- `0`: Response headers.</p>
     *
     * <p>- `1`: Request headers.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Phase")
    private Integer phase;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
