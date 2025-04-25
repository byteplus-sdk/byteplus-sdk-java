package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateTranscodePresetBatchBody
 */
@lombok.Data
public final class CreateTranscodePresetBatchBody  {

    /**
     * <p>子流转码配置的详细参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<CreateTranscodePresetBatchBodyPresetListItem> presetList;

    /**
     * <p>选择批量创建的 ABR 子流转码配置的协议，取值及含义如下所示。</p>
     *
     * <p>- `hls-abr` ：基于 HLS 协议的 ABR 转码配置。</p>
     *
     * <p>- `dash-abr`：基于 DASH 协议的 ABR 转码配置。</p>
     *
     * <p>- `abr`：同时基于 HLS 和 DASH 协议的 ABR 配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>是否将用户请求的 URL 参数复制到对子流请求 URL。</p>
     *
     * <p>- `true`：是；</p>
     *
     * <p>- `false`：否。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CopyParams")
    private Boolean copyParams;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
