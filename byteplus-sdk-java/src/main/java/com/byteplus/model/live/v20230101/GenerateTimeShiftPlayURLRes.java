package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GenerateTimeShiftPlayURLRes
 */
@lombok.Data
public final class GenerateTimeShiftPlayURLRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GenerateTimeShiftPlayURLResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GenerateTimeShiftPlayURLResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
