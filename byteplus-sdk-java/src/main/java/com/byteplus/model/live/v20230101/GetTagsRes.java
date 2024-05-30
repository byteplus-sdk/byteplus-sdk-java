package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetTagsRes
 */
@lombok.Data
public final class GetTagsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetTagsResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetTagsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
