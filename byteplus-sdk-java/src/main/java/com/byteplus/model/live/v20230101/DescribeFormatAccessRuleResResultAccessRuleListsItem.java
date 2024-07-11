package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeFormatAccessRuleResResultAccessRuleListsItem
 */
@lombok.Data
public final class DescribeFormatAccessRuleResResultAccessRuleListsItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FormatAccessRule")
    private DescribeFormatAccessRuleResResultAccessRuleListsItemFormatAccessRule formatAccessRule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
