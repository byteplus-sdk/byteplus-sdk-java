package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRelaySourceRewriteResResultRelaySourceRewriteListRewriteRule
 */
@lombok.Data
public final class DescribeRelaySourceRewriteResResultRelaySourceRewriteListRewriteRule  {

    /**
     * <p>功能开关。- true: 开 - false: 关</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>改写规则列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RewriteRuleList")
    private List<DescribeRelaySourceRewriteResResultRelaySourceRewriteListRewriteRuleRewriteRuleListItem> rewriteRuleList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
