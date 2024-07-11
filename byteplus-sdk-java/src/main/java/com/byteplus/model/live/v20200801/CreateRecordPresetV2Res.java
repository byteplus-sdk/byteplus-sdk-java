package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * CreateRecordPresetV2Res
 */
@lombok.Data
public final class CreateRecordPresetV2Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateRecordPresetV2ResResponseMetadata responseMetadata;

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
