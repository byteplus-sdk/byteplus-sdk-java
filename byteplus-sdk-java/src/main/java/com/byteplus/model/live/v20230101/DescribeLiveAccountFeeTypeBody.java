package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveAccountFeeTypeBody
 */
@lombok.Data
public final class DescribeLiveAccountFeeTypeBody  {

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountId")
    private String accountId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
