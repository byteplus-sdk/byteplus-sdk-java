package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdatePresetAssociationBodyRecordParams
 */
@lombok.Data
public final class UpdatePresetAssociationBodyRecordParams  {

    /**
     * <p>转码流录制，1表示录制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeRecord")
    private Integer transcodeRecord;

    /**
     * <p>默认开启转推</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelayEnable")
    private Boolean relayEnable;

    /**
     * <p>源流录制，1表示录制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriginRecord")
    private Integer originRecord;

    /**
     * <p>转码流录制后缀</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeSuffixList")
    private List<String> transcodeSuffixList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
