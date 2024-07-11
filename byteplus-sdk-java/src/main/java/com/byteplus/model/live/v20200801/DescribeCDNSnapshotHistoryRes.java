package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCDNSnapshotHistoryRes
 */
@lombok.Data
public final class DescribeCDNSnapshotHistoryRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeCDNSnapshotHistoryResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeCDNSnapshotHistoryResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
