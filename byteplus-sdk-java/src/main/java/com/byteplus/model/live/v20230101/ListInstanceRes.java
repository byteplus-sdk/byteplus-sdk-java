package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListInstanceRes
 */
@lombok.Data
public final class ListInstanceRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListInstanceResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListInstanceResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
