package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeForbiddenStreamInfoByPageRes
 */
@lombok.Data
public final class DescribeForbiddenStreamInfoByPageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeForbiddenStreamInfoByPageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeForbiddenStreamInfoByPageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
