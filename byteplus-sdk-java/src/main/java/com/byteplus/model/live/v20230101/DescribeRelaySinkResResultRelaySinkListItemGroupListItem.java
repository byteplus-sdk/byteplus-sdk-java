package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRelaySinkResResultRelaySinkListItemGroupListItem
 */
@lombok.Data
public final class DescribeRelaySinkResResultRelaySinkListItemGroupListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Group")
    private String group;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsThunderRelaySink")
    private Boolean isThunderRelaySink;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsTranscodeRelaySink")
    private Boolean isTranscodeRelaySink;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PassRequestParam")
    private Boolean passRequestParam;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FieldRelaySinkDetailList")
    private List<DescribeRelaySinkResResultRelaySinkListItemGroupListItemFieldRelaySinkDetailListItem> fieldRelaySinkDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
