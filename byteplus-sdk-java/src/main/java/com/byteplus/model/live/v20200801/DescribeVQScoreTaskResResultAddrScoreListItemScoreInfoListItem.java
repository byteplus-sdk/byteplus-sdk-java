package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeVQScoreTaskResResultAddrScoreListItemScoreInfoListItem
 */
@lombok.Data
public final class DescribeVQScoreTaskResResultAddrScoreListItemScoreInfoListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PointTime")
    private String pointTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Score")
    private Float score;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
