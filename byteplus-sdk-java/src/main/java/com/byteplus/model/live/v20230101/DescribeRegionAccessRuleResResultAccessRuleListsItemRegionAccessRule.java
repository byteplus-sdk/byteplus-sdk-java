package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRegionAccessRuleResResultAccessRuleListsItemRegionAccessRule
 */
@lombok.Data
public final class DescribeRegionAccessRuleResResultAccessRuleListsItemRegionAccessRule  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private String enable;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CountryList")
    private List<String> countryList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProvinceList")
    private List<String> provinceList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
