package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRegionAccessRuleResResult
 */
@lombok.Data
public final class DescribeRegionAccessRuleResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccessRuleLists")
    private List<DescribeRegionAccessRuleResResultAccessRuleListsItem> accessRuleLists;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
