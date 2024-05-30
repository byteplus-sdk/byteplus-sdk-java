package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeTimeShiftPresetDetailBody
 */
@lombok.Data
public final class DescribeTimeShiftPresetDetailBody  {

    /**
     * <p>模板名称列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<String> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
