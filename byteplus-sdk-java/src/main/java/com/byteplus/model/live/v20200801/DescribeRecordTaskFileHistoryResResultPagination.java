package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRecordTaskFileHistoryResResultPagination
 */
@lombok.Data
public final class DescribeRecordTaskFileHistoryResResultPagination  {

    /**
     * <p>当前页</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageCur")
    private Integer pageCur;

    /**
     * <p>当前页的大小</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>当前页的数据量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageTotal")
    private Integer pageTotal;

    /**
     * <p>数据总量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
