package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeBillingForAdminResResultActivityBillingActivityItem
 */
@lombok.Data
public final class DescribeBillingForAdminResResultActivityBillingActivityItem  {

    /**
     * <p>日期</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Date")
    private String date;

    /**
     * <p>条目列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FeeDetailList")
    private List<DescribeBillingForAdminResResultActivityBillingActivityItemFeeDetailListItem> feeDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
