package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeVQScoreTaskBody
 */
@lombok.Data
public final class DescribeVQScoreTaskBody  {

    /**
     * <p>测评任务ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
