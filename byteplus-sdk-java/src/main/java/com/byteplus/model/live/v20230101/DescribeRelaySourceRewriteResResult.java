package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRelaySourceRewriteResResult
 */
@lombok.Data
public final class DescribeRelaySourceRewriteResResult  {

    /**
     * <p>回源改写列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceRewriteList")
    private DescribeRelaySourceRewriteResResultRelaySourceRewriteList relaySourceRewriteList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
