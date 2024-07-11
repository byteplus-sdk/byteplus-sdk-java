package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveAccessLogResResultPagination
 */
@lombok.Data
public final class DescribeLiveAccessLogResResultPagination  {

    /**
     * <p>当前页码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageCur")
    private Integer pageCur;

    /**
     * <p>日志总个数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

    /**
     * <p>每页的大小</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
