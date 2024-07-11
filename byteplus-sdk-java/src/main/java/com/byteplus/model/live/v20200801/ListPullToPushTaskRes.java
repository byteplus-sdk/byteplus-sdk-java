package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListPullToPushTaskRes
 */
@lombok.Data
public final class ListPullToPushTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListPullToPushTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListPullToPushTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
