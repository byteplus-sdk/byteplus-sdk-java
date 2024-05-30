package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRelaySinkResResult
 */
@lombok.Data
public final class DescribeRelaySinkResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySinkList")
    private List<DescribeRelaySinkResResultRelaySinkListItem> relaySinkList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
