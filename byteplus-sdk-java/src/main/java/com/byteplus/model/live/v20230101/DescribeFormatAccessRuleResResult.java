package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeFormatAccessRuleResResult
 */
@lombok.Data
public final class DescribeFormatAccessRuleResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccessRuleLists")
    private List<DescribeFormatAccessRuleResResultAccessRuleListsItem> accessRuleLists;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
