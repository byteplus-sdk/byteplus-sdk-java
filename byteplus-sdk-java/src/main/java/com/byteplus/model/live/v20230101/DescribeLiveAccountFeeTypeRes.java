package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveAccountFeeTypeRes
 */
@lombok.Data
public final class DescribeLiveAccountFeeTypeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveAccountFeeTypeResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveAccountFeeTypeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
