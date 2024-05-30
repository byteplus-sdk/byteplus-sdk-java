package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateLatencyConfigBody
 */
@lombok.Data
public final class UpdateLatencyConfigBody  {

    /**
     * <p>与Vhost二选一</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>单位毫秒，大于等于0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GopCacheSize")
    private Integer gopCacheSize;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
