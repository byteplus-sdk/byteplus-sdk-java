package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribePlayResponseStatusStatResStatusStatListItem
 */
@lombok.Data
public final class DescribePlayResponseStatusStatResStatusStatListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusDataList")
    private List<DescribePlayResponseStatusStatResStatusStatListItemStatusDataListItem> statusDataList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Time")
    private String time;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
