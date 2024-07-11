package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeDenyConfigRes
 */
@lombok.Data
public final class DescribeDenyConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeDenyConfigResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeDenyConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
