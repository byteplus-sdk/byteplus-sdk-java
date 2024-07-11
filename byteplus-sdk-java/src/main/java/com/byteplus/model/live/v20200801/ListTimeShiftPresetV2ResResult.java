package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListTimeShiftPresetV2ResResult
 */
@lombok.Data
public final class ListTimeShiftPresetV2ResResult  {

    /**
     * <p>模板列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListTimeShiftPresetV2ResResultListItem> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
