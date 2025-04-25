package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteTranscodePresetBatchBody
 */
@lombok.Data
public final class DeleteTranscodePresetBatchBody  {

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
     * <p>待删除的 ABR 子流转码配置信息，您可以使用[查询转码配置列表](https://www.volcengine.com/docs/6469/1126853)查看待删除的 ABR 类型的转码配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<DeleteTranscodePresetBatchBodyPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
