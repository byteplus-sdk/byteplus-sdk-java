package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeVhostResResult
 */
@lombok.Data
public final class DescribeVhostResResult  {

    /**
     * <p>vhost详情列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostList")
    private List<DescribeVhostResResultVhostListItem> vhostList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
