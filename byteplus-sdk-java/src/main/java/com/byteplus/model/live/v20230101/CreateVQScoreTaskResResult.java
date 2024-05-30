package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateVQScoreTaskResResult
 */
@lombok.Data
public final class CreateVQScoreTaskResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
