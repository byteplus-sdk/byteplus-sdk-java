package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeSDKParamsAvailableResResult
 */
@lombok.Data
public final class DescribeSDKParamsAvailableResResult  {

    /**
     * <p>false: 当前bundleID已存在,不可用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CheckBundleID")
    private Boolean checkBundleID;

    /**
     * <p>false: 当前packageName已存在,不可用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CheckPackageName")
    private Boolean checkPackageName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
