package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveAccessLogResResult
 */
@lombok.Data
public final class DescribeLiveAccessLogResResult  {

    /**
     * <p>返回的日志文件列表信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<DescribeLiveAccessLogResResultListItem> list;

    /**
     * <p>返回的分页相关信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeLiveAccessLogResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
