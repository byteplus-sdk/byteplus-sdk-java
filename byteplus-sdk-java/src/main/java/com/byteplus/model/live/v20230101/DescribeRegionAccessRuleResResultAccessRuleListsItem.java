package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRegionAccessRuleResResultAccessRuleListsItem
 */
@lombok.Data
public final class DescribeRegionAccessRuleResResultAccessRuleListsItem  {

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
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionAccessRule")
    private DescribeRegionAccessRuleResResultAccessRuleListsItemRegionAccessRule regionAccessRule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
