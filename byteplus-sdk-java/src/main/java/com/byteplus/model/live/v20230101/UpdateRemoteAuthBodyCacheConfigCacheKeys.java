package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRemoteAuthBodyCacheConfigCacheKeys
 */
@lombok.Data
public final class UpdateRemoteAuthBodyCacheConfigCacheKeys  {

    /**
     * <p>生成缓存 Key 使用的参数的类型，取值及含义如下所示。</p>
     *
     * <p>- `query`：用户拉流请求 URL 参数；</p>
     *
     * <p>- `header`：用户拉流请求 Header 参数；</p>
     *
     * <p>- `vhost`：使用用户拉流域名所属的 vhost 值作为参数；</p>
     *
     * <p>- `domain`：使用用户拉流域名值作为参数；</p>
     *
     * <p>- `app`：使用用户拉流请求中的 AppName 值作为参数；</p>
     *
     * <p>- `stream`：使用用户拉流请求中的 StreamName 值作为参数；</p>
     *
     * <p>- `client_ip`：使用拉流用户客户端的 IP 地址作为参数；</p>
     *
     * <p>- `request_uri`：使用拉流请求地址的 URI 做为参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>参数名，当参数类型为 query 或 Header 时生效且必填，表示指定拉流请求中的参数名对应的参数值作为生成缓存 Key 的参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParamName")
    private String paramName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
