package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * BindCertBody
 */
@lombok.Data
public final class BindCertBody  {

    /**
     * <p>证书域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertDomain")
    private String certDomain;

    /**
     * <p>需要绑定的证书链 ID，可以通过[查询证书列表](https://www.volcengine.com/docs/6469/81242)接口获取</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>需要绑定证书的域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>是否开启 HTTPS，默认值为 false</p>
     *
     * <p>- false：关闭；</p>
     *
     * <p>- true：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HTTPS")
    private Boolean hTTPS;

    /**
     * <p>视频直播服务的配置空间，由 1 到 60 位数字、字母、下划线及"-"和"."组成</p>
     *
     * <p>:::tip 与 Domain 二选一</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
