package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribePresetAssociationRes
 */
@lombok.Data
public final class DescribePresetAssociationRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribePresetAssociationResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribePresetAssociationResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
