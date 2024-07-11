package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribePlayResponseStatusStatRes
 */
@lombok.Data
public final class DescribePlayResponseStatusStatRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusStatList")
    private List<DescribePlayResponseStatusStatResStatusStatListItem> statusStatList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Summary")
    private DescribePlayResponseStatusStatResSummary summary;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
