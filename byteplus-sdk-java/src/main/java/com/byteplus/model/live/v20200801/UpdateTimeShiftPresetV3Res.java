package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdateTimeShiftPresetV3Res
 */
@lombok.Data
public final class UpdateTimeShiftPresetV3Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateTimeShiftPresetV3ResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private Map<String, Object> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
