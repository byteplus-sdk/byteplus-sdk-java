package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeVQScoreTaskResResult
 */
@lombok.Data
public final class DescribeVQScoreTaskResResult  {

    /**
     * <p>主拉流地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MainAddr")
    private String mainAddr;

    /**
     * <p>对比拉流地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContrastAddr")
    private String contrastAddr;

    /**
     * <p>测评运行时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>计算取值点数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalPointNum")
    private Integer totalPointNum;

    /**
     * <p>计算主拉流地址平均得分</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MainAverageScore")
    private Float mainAverageScore;

    /**
     * <p>计算对比拉流地址的画质平均得分</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContrastAverageScore")
    private Float contrastAverageScore;

    /**
     * <p>主评分与对比评分的差值，（主地址评分平均值-对比地址评分平均值）绝对值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Difference")
    private Float difference;

    /**
     * <p>主评分与对比评分的差值百分比，主评分与对比评分的差值/min(主地址评分平均值,对比地址评分平均值)*100</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DifferencePer")
    private Float differencePer;

    /**
     * <p>拉流地址测评得分详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AddrScoreList")
    private List<DescribeVQScoreTaskResResultAddrScoreListItem> addrScoreList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
