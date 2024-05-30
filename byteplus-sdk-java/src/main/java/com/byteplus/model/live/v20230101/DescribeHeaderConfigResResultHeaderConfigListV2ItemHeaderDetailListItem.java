package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeHeaderConfigResResultHeaderConfigListV2ItemHeaderDetailListItem
 */
@lombok.Data
public final class DescribeHeaderConfigResResultHeaderConfigListV2ItemHeaderDetailListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderType")
    private String headerType;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderDetailList")
    private List<DescribeHeaderConfigResResultHeaderConfigListV2ItemHeaderDetailListItemHeaderDetailListItem> headerDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
