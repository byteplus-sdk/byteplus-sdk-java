package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCDNSnapshotHistoryResResultPagination
 */
@lombok.Data
public final class DescribeCDNSnapshotHistoryResResultPagination  {

    /**
     * <p>当前页</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageCur")
    private Integer pageCur;

    /**
     * <p>数据总量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

    /**
     * <p>当前页的数据量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageTotal")
    private Integer pageTotal;

    /**
     * <p>当前页的大小</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
