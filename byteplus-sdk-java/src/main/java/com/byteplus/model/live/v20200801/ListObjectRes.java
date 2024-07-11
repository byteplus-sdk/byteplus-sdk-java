package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListObjectRes
 */
@lombok.Data
public final class ListObjectRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListObjectResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListObjectResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
