package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeBillingForVadminResResultCountryListItem
 */
@lombok.Data
public final class DescribeBillingForVadminResResultCountryListItem  {

    /**
     * <p>国家编码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>国家中文名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NameZh")
    private String nameZh;

    /**
     * <p>国家英文名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NameEn")
    private String nameEn;

    /**
     * <p>省份列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProvinceList")
    private List<DescribeBillingForVadminResResultCountryListItemProvinceListItem> provinceList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
