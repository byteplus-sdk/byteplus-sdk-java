package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeSDKDetailResResult
 */
@lombok.Data
public final class DescribeSDKDetailResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SDKDetail")
    private DescribeSDKDetailResResultSDKDetail sDKDetail;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
