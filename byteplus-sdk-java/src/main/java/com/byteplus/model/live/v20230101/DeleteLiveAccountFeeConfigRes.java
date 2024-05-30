package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteLiveAccountFeeConfigRes
 */
@lombok.Data
public final class DeleteLiveAccountFeeConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteLiveAccountFeeConfigResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteLiveAccountFeeConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
