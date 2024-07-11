package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeDomainRes
 */
@lombok.Data
public final class DescribeDomainRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeDomainResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeDomainResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
