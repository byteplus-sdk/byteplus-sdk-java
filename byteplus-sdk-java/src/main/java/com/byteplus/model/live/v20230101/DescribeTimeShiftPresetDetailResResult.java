package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeTimeShiftPresetDetailResResult
 */
@lombok.Data
public final class DescribeTimeShiftPresetDetailResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetDetailList")
    private List<DescribeTimeShiftPresetDetailResResultPresetDetailListItem> presetDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
