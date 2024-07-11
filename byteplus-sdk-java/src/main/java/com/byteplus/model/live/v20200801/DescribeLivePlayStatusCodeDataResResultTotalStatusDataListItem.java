package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePlayStatusCodeDataResResultTotalStatusDataListItem
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataResResultTotalStatusDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s，例如，`2022-04-13T00:00:00+08:00`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timestamp")
    private String timestamp;

    /**
     * <p>按状态码区分的数据列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SummaryStatusData")
    private List<DescribeLivePlayStatusCodeDataResResultTotalStatusDataListItemSummaryStatusDataItem> summaryStatusData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
