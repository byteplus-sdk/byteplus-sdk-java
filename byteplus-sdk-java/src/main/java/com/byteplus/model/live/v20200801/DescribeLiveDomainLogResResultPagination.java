package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveDomainLogResResultPagination
 */
@lombok.Data
public final class DescribeLiveDomainLogResResultPagination  {

    /**
     * <p>当前所在分页</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageCur")
    private Integer pageCur;

    /**
     * <p>每页显示信息条数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>信息总条数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
