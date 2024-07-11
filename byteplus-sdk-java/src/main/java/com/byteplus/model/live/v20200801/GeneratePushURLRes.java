package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * GeneratePushURLRes
 */
@lombok.Data
public final class GeneratePushURLRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GeneratePushURLResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GeneratePushURLResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
