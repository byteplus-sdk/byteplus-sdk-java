package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribePullToPushDataDetailResResultPagination
 */
@lombok.Data
public final class DescribePullToPushDataDetailResResultPagination  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
