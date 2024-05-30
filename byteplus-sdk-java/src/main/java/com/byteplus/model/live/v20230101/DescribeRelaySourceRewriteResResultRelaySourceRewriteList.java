package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRelaySourceRewriteResResultRelaySourceRewriteList
 */
@lombok.Data
public final class DescribeRelaySourceRewriteResResultRelaySourceRewriteList  {

    /**
     * <p>需要设置黑白名单的拉流域名。域名请在工信部完成备案。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>改写规则</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RewriteRule")
    private DescribeRelaySourceRewriteResResultRelaySourceRewriteListRewriteRule rewriteRule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
