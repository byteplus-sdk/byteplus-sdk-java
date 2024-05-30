package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeAppIDParamsAvailableResResult
 */
@lombok.Data
public final class DescribeAppIDParamsAvailableResResult  {

    /**
     * <p>false:该名称不可用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CheckAppEnName")
    private Boolean checkAppEnName;

    /**
     * <p>false:该名称不可用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CheckAppCnName")
    private Boolean checkAppCnName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
