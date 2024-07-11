package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListRegionsRes
 */
@lombok.Data
public final class ListRegionsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListRegionsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListRegionsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
