package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVQScoreTaskRes
 */
@lombok.Data
public final class ListVQScoreTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVQScoreTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVQScoreTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
