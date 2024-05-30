package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCertBindInfoRes
 */
@lombok.Data
public final class ListCertBindInfoRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListCertBindInfoResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListCertBindInfoResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
