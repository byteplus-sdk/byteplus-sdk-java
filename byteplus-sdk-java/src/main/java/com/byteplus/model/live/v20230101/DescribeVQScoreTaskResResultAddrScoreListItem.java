package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeVQScoreTaskResResultAddrScoreListItem
 */
@lombok.Data
public final class DescribeVQScoreTaskResResultAddrScoreListItem  {

    /**
     * <p>拉流地址类型，1：主拉流地址，2：对比拉流地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AddrType")
    private Integer addrType;

    /**
     * <p>测评得分列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ScoreInfoList")
    private List<DescribeVQScoreTaskResResultAddrScoreListItemScoreInfoListItem> scoreInfoList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
