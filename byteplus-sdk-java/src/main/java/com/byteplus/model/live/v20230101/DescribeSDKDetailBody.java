package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeSDKDetailBody
 */
@lombok.Data
public final class DescribeSDKDetailBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
