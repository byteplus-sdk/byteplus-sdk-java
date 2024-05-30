package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdatePresetAssociationBodyTimeShiftStruct
 */
@lombok.Data
public final class UpdatePresetAssociationBodyTimeShiftStruct  {

    /**
     * <p>时移的类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeShiftType")
    private Integer timeShiftType;

    /**
     * <p>是否需要转码流时移</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NeedTranscode")
    private Integer needTranscode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
