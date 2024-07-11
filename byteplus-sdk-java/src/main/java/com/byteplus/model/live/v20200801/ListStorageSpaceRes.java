package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListStorageSpaceRes
 */
@lombok.Data
public final class ListStorageSpaceRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListStorageSpaceResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListStorageSpaceResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
