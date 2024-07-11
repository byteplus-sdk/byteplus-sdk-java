package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCDNSnapshotHistoryResResult
 */
@lombok.Data
public final class DescribeCDNSnapshotHistoryResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamInfoList")
    private List<DescribeCDNSnapshotHistoryResResultStreamInfoListItem> streamInfoList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RoughCount")
    private String roughCount;

    /**
     * <p>截图历史列表记录</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeCDNSnapshotHistoryResResultDataItem> data;

    /**
     * <p>分页信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeCDNSnapshotHistoryResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
