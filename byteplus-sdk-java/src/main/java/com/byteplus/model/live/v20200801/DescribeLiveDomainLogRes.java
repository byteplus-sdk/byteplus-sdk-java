package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveDomainLogRes
 */
@lombok.Data
public final class DescribeLiveDomainLogRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveDomainLogResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveDomainLogResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
