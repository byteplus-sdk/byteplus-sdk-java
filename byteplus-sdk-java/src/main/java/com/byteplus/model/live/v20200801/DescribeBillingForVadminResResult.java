package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeBillingForVadminResResult
 */
@lombok.Data
public final class DescribeBillingForVadminResResult  {

    /**
     * <p>地区列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CountryList")
    private List<DescribeBillingForVadminResResultCountryListItem> countryList;

    /**
     * <p>isp列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<DescribeBillingForVadminResResultISPListItem> iSPList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
