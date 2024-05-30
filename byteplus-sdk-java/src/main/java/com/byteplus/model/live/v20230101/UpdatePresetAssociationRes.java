package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdatePresetAssociationRes
 */
@lombok.Data
public final class UpdatePresetAssociationRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdatePresetAssociationResResponseMetadata responseMetadata;

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
