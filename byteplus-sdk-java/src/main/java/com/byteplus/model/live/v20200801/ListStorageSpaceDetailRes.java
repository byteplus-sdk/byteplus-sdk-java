package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListStorageSpaceDetailRes
 */
@lombok.Data
public final class ListStorageSpaceDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListStorageSpaceDetailResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListStorageSpaceDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
