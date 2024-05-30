package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRelaySourceRewriteResResultRelaySourceRewriteListRewriteRuleRewriteRuleListItem
 */
@lombok.Data
public final class DescribeRelaySourceRewriteResResultRelaySourceRewriteListRewriteRuleRewriteRuleListItem  {

    /**
     * <p>改写后目标path</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TargetPath")
    private String targetPath;

    /**
     * <p>原始path</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriginPath")
    private String originPath;

    /**
     * <p>改写后地址是否包含原始地址的param参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IncludeParams")
    private Boolean includeParams;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
