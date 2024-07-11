package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateAndBindCertRes
 */
@lombok.Data
public final class CreateAndBindCertRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateAndBindCertResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateAndBindCertResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
