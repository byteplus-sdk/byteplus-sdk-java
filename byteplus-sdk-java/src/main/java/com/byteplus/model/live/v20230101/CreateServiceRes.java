package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateServiceRes
 */
@lombok.Data
public final class CreateServiceRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateServiceResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
