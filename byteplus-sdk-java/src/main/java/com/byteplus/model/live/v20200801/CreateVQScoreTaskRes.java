package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateVQScoreTaskRes
 */
@lombok.Data
public final class CreateVQScoreTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateVQScoreTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateVQScoreTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
