package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateTranscodePresetPatchByAdminBody
 */
@lombok.Data
public final class CreateTranscodePresetPatchByAdminBody  {

    /**
     * <p>逻辑的的处理类型，create：单纯创建模板，不关联app/vhost，associate：创建模板的同时关联app/vhost</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>配置的类型，不填默认为全量配置</p>
     *
     * <p>- simple：精简配置，后端会默认填充字段</p>
     *
     * <p>- full：全量配置，后端不会做修改</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigType")
    private String configType;

    /**
     * <p>模板配置列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<CreateTranscodePresetPatchByAdminBodyPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
