package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListResourcePackageRes
 */
@lombok.Data
public final class ListResourcePackageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListResourcePackageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListResourcePackageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
