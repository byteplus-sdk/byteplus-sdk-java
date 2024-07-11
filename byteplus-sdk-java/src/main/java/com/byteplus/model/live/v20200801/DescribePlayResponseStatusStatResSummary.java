package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribePlayResponseStatusStatResSummary
 */
@lombok.Data
public final class DescribePlayResponseStatusStatResSummary  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalStatusStatList")
    private List<DescribePlayResponseStatusStatResSummaryTotalStatusStatListItem> totalStatusStatList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
