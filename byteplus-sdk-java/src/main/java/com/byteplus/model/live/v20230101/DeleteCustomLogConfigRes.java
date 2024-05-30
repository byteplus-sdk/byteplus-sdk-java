package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteCustomLogConfigRes
 */
@lombok.Data
public final class DeleteCustomLogConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteCustomLogConfigResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteCustomLogConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
