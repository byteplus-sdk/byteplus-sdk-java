package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CheckCustomLogConfigRes
 */
@lombok.Data
public final class CheckCustomLogConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CheckCustomLogConfigResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CheckCustomLogConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
