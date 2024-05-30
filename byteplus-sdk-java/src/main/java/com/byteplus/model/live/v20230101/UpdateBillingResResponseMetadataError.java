package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateBillingResResponseMetadataError
 */
@lombok.Data
public final class UpdateBillingResResponseMetadataError  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
