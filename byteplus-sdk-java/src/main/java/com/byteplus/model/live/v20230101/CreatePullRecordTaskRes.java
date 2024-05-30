package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreatePullRecordTaskRes
 */
@lombok.Data
public final class CreatePullRecordTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreatePullRecordTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreatePullRecordTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
