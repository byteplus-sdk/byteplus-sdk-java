package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * UpdateDenyConfigV2Res
 */
@lombok.Data
public final class UpdateDenyConfigV2Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateDenyConfigV2ResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private Object result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
