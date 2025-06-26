package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostRemoteAuthRes
 */
@lombok.Data
public final class ListVhostRemoteAuthRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVhostRemoteAuthResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVhostRemoteAuthResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
