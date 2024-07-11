package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeVQScoreTaskResResultAddrScoreListItem
 */
@lombok.Data
public final class DescribeVQScoreTaskResResultAddrScoreListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AddrType")
    private String addrType;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ScoreInfoList")
    private List<DescribeVQScoreTaskResResultAddrScoreListItemScoreInfoListItem> scoreInfoList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
