package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListAllStreamStateRes
 */
@lombok.Data
public final class ListAllStreamStateRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListAllStreamStateResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListAllStreamStateResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
