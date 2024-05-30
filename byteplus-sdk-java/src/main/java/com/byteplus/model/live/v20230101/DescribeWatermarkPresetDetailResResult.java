package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeWatermarkPresetDetailResResult
 */
@lombok.Data
public final class DescribeWatermarkPresetDetailResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetDetailList")
    private List<DescribeWatermarkPresetDetailResResultPresetDetailListItem> presetDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
