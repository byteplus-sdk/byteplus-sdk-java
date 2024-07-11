package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveASRDurationDataResResultASRDurationDetailDataItem
 */
@lombok.Data
public final class DescribeLiveASRDurationDataResResultASRDurationDetailDataItem  {

    /**
     * <p>AI 语音转字幕时，语音的语言类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ASRSourceType")
    private String aSRSourceType;

    /**
     * <p>AI 语音转字幕时，字幕的语言类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ASRTargetTypeList")
    private List<String> aSRTargetTypeList;

    /**
     * <p>按语音的语言类型拆分数据后，此类型下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ASRDurationData")
    private List<DescribeLiveASRDurationDataResResultASRDurationDetailDataItemASRDurationDataItem> aSRDurationData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
