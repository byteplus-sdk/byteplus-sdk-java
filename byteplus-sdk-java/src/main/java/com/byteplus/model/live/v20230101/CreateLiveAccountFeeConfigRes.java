package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateLiveAccountFeeConfigRes
 */
@lombok.Data
public final class CreateLiveAccountFeeConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateLiveAccountFeeConfigResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateLiveAccountFeeConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}