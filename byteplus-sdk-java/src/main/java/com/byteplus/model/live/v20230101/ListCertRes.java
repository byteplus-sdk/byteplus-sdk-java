package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCertRes
 */
@lombok.Data
public final class ListCertRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListCertResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListCertResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
