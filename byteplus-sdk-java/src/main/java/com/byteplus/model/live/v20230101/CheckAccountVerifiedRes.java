package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CheckAccountVerifiedRes
 */
@lombok.Data
public final class CheckAccountVerifiedRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CheckAccountVerifiedResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CheckAccountVerifiedResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
