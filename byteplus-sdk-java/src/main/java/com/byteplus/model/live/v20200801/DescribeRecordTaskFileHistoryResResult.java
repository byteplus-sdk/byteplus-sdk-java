package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRecordTaskFileHistoryResResult
 */
@lombok.Data
public final class DescribeRecordTaskFileHistoryResResult  {

    /**
     * <p>录制文件列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeRecordTaskFileHistoryResResultDataItem> data;

    /**
     * <p>分页信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeRecordTaskFileHistoryResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
