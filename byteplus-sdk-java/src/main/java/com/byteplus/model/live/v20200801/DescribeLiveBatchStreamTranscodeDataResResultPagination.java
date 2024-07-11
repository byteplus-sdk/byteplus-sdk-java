package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchStreamTranscodeDataResResultPagination
 */
@lombok.Data
public final class DescribeLiveBatchStreamTranscodeDataResResultPagination  {

    /**
     * <p>页数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>总流数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

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
