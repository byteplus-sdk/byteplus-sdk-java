package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * UnbindCertBody
 */
@lombok.Data
public final class UnbindCertBody  {

    /**
     * <p>需要解绑证书的域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>视频直播服务的配置空间，由 1 到 60 位数字、字母、下划线及"-"和"."组成。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `Vhost` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
