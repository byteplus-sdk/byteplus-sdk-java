package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListReferenceTypesRes
 */
@lombok.Data
public final class ListReferenceTypesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListReferenceTypesResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListReferenceTypesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
