package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribePresetAssociationResResult
 */
@lombok.Data
public final class DescribePresetAssociationResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<DescribePresetAssociationResResultListItem> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
