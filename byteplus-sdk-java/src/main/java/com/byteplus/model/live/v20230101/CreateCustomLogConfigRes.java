package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCustomLogConfigRes
 */
@lombok.Data
public final class CreateCustomLogConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateCustomLogConfigResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateCustomLogConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
