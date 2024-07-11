package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStorageSpaceDataRes
 */
@lombok.Data
public final class DescribeLiveStorageSpaceDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveStorageSpaceDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveStorageSpaceDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
