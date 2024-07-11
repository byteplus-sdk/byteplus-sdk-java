package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListBucketRes
 */
@lombok.Data
public final class ListBucketRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListBucketResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListBucketResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
