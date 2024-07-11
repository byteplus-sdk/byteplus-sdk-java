package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingForVadminResResultCountryListItemProvinceListItemCityListItem
 */
@lombok.Data
public final class DescribeBillingForVadminResResultCountryListItemProvinceListItemCityListItem  {

    /**
     * <p>城市编码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>城市中文名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NameZh")
    private String nameZh;

    /**
     * <p>城市英文名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NameEn")
    private String nameEn;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
