package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * DescDenseSnapshotPresetDetailRes
 */
@lombok.Data
public final class DescDenseSnapshotPresetDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescDenseSnapshotPresetDetailResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private Map<String, Object> result;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetDetailList")
    private List<DescDenseSnapshotPresetDetailResPresetDetailListItem> presetDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
