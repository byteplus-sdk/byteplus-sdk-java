package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListReferenceNamesRes
 */
@lombok.Data
public final class ListReferenceNamesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListReferenceNamesResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListReferenceNamesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
