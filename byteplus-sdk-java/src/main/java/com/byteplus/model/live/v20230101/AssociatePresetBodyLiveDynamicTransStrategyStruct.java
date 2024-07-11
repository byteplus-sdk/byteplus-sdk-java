package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * AssociatePresetBodyLiveDynamicTransStrategyStruct
 */
@lombok.Data
public final class AssociatePresetBodyLiveDynamicTransStrategyStruct  {

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>转码后缀</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Suffix")
    private String suffix;

    /**
     * <p>地区</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>模版触发形式</p>
     *
     * <p>SourceTypeInnerDispatch: 内部查询dispatch触发 （默认该策略）</p>
     *
     * <p>SourceTypePCU: 由上层提供在线人数数据触发</p>
     *
     * <p>SourceTypePredict: 由预测数值触发</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceType")
    private String sourceType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
