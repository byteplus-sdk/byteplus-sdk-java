package com.byteplus.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateTranscodePresetRequest {

    @JSONField(name = "Preset")
    String Preset;
    @JSONField(name = "Vhost")
    String Vhost;
    @JSONField(name = "App")
    String App;
    @JSONField(name = "Status")
    Long Status;
    @JSONField(name = "SuffixName")
    String SuffixName;
    @JSONField(name = "VideoBitrate")
    Long VideoBitrate;
    @JSONField(name = "Vcodec")
    String Vcodec;
    @JSONField(name = "AudioBitrate")
    Long AudioBitrate;
    @JSONField(name = "Acodec")
    String Acodec;
    @JSONField(name = "FPS")
    Long FPS;
    @JSONField(name = "GOP")
    Long GOP;
    @JSONField(name = "Width")
    Long Width;
    @JSONField(name = "Height")
    Long Height;
    @JSONField(name = "AutoTrans")
    Long AutoTrans;
    @JSONField(name = "As")
    String As;
    @JSONField(name = "ShortSide")
    Long ShortSide;
    @JSONField(name = "LongSide")
    Long LongSide;
    @JSONField(name = "Kind")
    Long PresetKind; //form Kind. json PresetKind
    @JSONField(name = "PresetType")
    Integer PresetType;
}
