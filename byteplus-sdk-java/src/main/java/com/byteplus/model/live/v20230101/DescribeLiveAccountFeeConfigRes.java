package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveAccountFeeConfigRes
 */
@lombok.Data
public final class DescribeLiveAccountFeeConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveAccountFeeConfigResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveAccountFeeConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
