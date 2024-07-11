package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateTimeShiftPresetV3Body
 */
@lombok.Data
public final class UpdateTimeShiftPresetV3Body  {

    /**
     * <p>域名空间名称，您可以调用[ListTimeShiftPresetV2](https://www.volcengine.com/docs/6469/1126883) 接口，获取待更新时移配置的 `Vhost` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，您可以调用[ListTimeShiftPresetV2](https://www.volcengine.com/docs/6469/1126883) 接口，获取待更新时移配置的 `App` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>开启时移的流名称，默认为空表示更新 App 级别的时移配置，不为空时表示更新 Stream 级别的时移配置。您可以调用[ListTimeShiftPresetV2](https://www.volcengine.com/docs/6469/1126883) 接口，获取待更新时移配置的 `Stream` 取值并进行更新。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>最大时移时长，即允许用户回看的最长时间，单位为秒，支持的取值如下所示。</p>
     *
     *
     *
     * <p>- `86400`：1 天；</p>
     *
     * <p>- `259200`：3 天；</p>
     *
     * <p>- `604800`：7 天；</p>
     *
     * <p>- `1296000`：15 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxShiftTime")
    private Integer maxShiftTime;

    /**
     * <p>用于多码率时移的参数，为json字符串</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MasterFormat")
    private String masterFormat;

    /**
     * <p>0表示不需要 1表示需要</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NeedTranscode")
    private Integer needTranscode;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordObject")
    private String recordObject;

    /**
     * <p>nss配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NssConfig")
    private String nssConfig;

    /**
     * <p>操作类型，不填默认更新关联，only_preset: 只更新模板配置，associate: 更新模板和关联</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OperationType")
    private String operationType;

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
