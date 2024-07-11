package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListServicesRes
 */
@lombok.Data
public final class ListServicesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListServicesResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListServicesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
