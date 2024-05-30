package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeDenyConfigV2Res
 */
@lombok.Data
public final class DescribeDenyConfigV2Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeDenyConfigV2ResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeDenyConfigV2ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
