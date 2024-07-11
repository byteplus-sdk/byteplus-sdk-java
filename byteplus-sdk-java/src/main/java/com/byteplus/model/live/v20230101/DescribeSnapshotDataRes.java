package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeSnapshotDataRes
 */
@lombok.Data
public final class DescribeSnapshotDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeSnapshotDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeSnapshotDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
