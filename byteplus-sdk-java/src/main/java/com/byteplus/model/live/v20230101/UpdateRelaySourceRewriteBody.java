package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRelaySourceRewriteBody
 */
@lombok.Data
public final class UpdateRelaySourceRewriteBody  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>需要设置黑白名单的拉流域名。域名请在工信部完成备案。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>改写规则</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RewriteRule")
    private UpdateRelaySourceRewriteBodyRewriteRule rewriteRule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
