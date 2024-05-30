package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeEncryptDRMResResult
 */
@lombok.Data
public final class DescribeEncryptDRMResResult  {

    /**
     * <p>drm配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DRMItem")
    private DescribeEncryptDRMResResultDRMItem dRMItem;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
