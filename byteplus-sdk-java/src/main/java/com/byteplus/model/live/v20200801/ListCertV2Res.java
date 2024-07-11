package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListCertV2Res
 */
@lombok.Data
public final class ListCertV2Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListCertV2ResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListCertV2ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
