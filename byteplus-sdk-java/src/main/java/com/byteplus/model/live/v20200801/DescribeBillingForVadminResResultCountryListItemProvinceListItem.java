package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeBillingForVadminResResultCountryListItemProvinceListItem
 */
@lombok.Data
public final class DescribeBillingForVadminResResultCountryListItemProvinceListItem  {

    /**
     * <p>省份编码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>省份中文名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NameZh")
    private String nameZh;

    /**
     * <p>省份英文名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NameEn")
    private String nameEn;

    /**
     * <p>城市列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CityList")
    private List<DescribeBillingForVadminResResultCountryListItemProvinceListItemCityListItem> cityList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
