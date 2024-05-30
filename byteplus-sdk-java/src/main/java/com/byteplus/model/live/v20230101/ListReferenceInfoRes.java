package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListReferenceInfoRes
 */
@lombok.Data
public final class ListReferenceInfoRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListReferenceInfoResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListReferenceInfoResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
