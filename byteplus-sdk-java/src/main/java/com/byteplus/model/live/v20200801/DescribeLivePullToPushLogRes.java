package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePullToPushLogRes
 */
@lombok.Data
public final class DescribeLivePullToPushLogRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLivePullToPushLogResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLivePullToPushLogResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
