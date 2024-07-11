package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveDomainLogResResult
 */
@lombok.Data
public final class DescribeLiveDomainLogResResult  {

    /**
     * <p>日志文件信息列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<DescribeLiveDomainLogResResultListItem> list;

    /**
     * <p>分页数量信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeLiveDomainLogResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
