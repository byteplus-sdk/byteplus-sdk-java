package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeVQScoreTaskResResult
 */
@lombok.Data
public final class DescribeVQScoreTaskResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MainAddr")
    private String mainAddr;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContrastAddr")
    private String contrastAddr;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private String duration;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalPointNum")
    private String totalPointNum;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MainAverageScore")
    private Float mainAverageScore;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContrastAverageScore")
    private Float contrastAverageScore;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Difference")
    private Float difference;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DifferencePer")
    private Float differencePer;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AddrScoreList")
    private List<DescribeVQScoreTaskResResultAddrScoreListItem> addrScoreList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
