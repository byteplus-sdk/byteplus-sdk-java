package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeVQScoreTaskResResultAddrScoreListItemScoreInfoListItem
 */
@lombok.Data
public final class DescribeVQScoreTaskResResultAddrScoreListItemScoreInfoListItem  {

    /**
     * <p>测评取值时间点</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PointTime")
    private String pointTime;

    /**
     * <p>测评得分</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Score")
    private Float score;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
