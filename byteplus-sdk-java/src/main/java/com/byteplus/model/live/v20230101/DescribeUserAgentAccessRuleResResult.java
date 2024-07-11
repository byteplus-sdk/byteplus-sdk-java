package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeUserAgentAccessRuleResResult
 */
@lombok.Data
public final class DescribeUserAgentAccessRuleResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserAgentList")
    private List<DescribeUserAgentAccessRuleResResultUserAgentListItem> userAgentList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
