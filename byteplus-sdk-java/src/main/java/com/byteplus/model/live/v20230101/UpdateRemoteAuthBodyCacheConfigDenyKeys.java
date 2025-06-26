package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRemoteAuthBodyCacheConfigDenyKeys
 */
@lombok.Data
public final class UpdateRemoteAuthBodyCacheConfigDenyKeys  {

    /**
     * <p>缓存key的类型，包括query, header, vhost, domain, app, stream, client\_ip, request\_uri</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>缓存具体的key</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParamName")
    private String paramName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
