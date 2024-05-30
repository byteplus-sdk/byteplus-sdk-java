package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveAccountFeeTypeResResult
 */
@lombok.Data
public final class DescribeLiveAccountFeeTypeResResult  {

    /**
     * <p>计费类型，traffic流量计费，bandwidth带宽计费</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FeeType")
    private String feeType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
