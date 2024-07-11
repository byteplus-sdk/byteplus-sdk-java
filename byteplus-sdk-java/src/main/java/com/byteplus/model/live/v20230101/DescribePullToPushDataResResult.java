package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribePullToPushDataResResult
 */
@lombok.Data
public final class DescribePullToPushDataResResult  {

    /**
     * <p>各时间片详细数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<DescribePullToPushDataResResultListItem> list;

    /**
     * <p>拉流转推时长汇总信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Summary")
    private DescribePullToPushDataResResultSummary summary;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
