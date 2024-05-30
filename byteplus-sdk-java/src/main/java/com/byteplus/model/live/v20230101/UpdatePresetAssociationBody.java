package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdatePresetAssociationBody
 */
@lombok.Data
public final class UpdatePresetAssociationBody  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>录制类型：push, pull</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordType")
    private String recordType;

    /**
     * <p>模板类型，</p>
     *
     * <p>recor:录制</p>
     *
     * <p>snapshot:密集抽帧</p>
     *
     * <p>transcode:转码</p>
     *
     * <p>avslice:音频切片</p>
     *
     * <p>cdn_snapshot：截图</p>
     *
     * <p>avextractor</p>
     *
     * <p>timeshift：时移</p>
     *
     * <p>audit_snapshot：审核截图</p>
     *
     * <p>data_migration</p>
     *
     * <p>watermark：水印</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetType")
    private String presetType;

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>旧的模板名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetNameOld")
    private String presetNameOld;

    /**
     * <p>录制配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordParams")
    private UpdatePresetAssociationBodyRecordParams recordParams;

    /**
     * <p>时移配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeShiftStruct")
    private UpdatePresetAssociationBodyTimeShiftStruct timeShiftStruct;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
