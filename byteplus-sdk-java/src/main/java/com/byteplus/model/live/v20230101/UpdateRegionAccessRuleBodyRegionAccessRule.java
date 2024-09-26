package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRegionAccessRuleBodyRegionAccessRule
 */
@lombok.Data
public final class UpdateRegionAccessRuleBodyRegionAccessRule  {

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
     * <p>限制国家列表，传入使用国家代码，遵循iso-3166</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CountryList")
    private List<String> countryList;

    /**
     * <p>限制省份列表，目前仅支持中国香港地区、中国澳门地区和中国台湾地区。分别对应代码为HK, MO, TW</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProvinceList")
    private List<String> provinceList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
