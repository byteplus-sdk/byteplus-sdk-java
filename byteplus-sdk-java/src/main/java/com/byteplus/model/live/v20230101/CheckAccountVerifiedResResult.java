package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CheckAccountVerifiedResResult
 */
@lombok.Data
public final class CheckAccountVerifiedResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsVerified")
    private Boolean isVerified;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
