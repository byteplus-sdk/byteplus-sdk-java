package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

import java.util.ArrayList;

@Data
public class GeneratePushURLResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "PushURLList")
        ArrayList<String> pushURLList;
        @JSONField(name = "PushURLListDetail")
        ArrayList<PushURLItem> PushURLListDetail;
        @JSONField(name = "TsOverSrtURLList")
        ArrayList<String> tsOverSrtURLList;
        @JSONField(name = "RtmpOverSrtURLList")
        ArrayList<String> rtmpOverSrtURLList;
        @JSONField(name = "RtmURLList")
        ArrayList<String> rtmURLList;
    }

    @Data
    public static class PushURLItem {
        @JSONField(name = "URL")
        String url;
        @JSONField(name = "DomainApp")
        String domainApp;
        @JSONField(name = "StreamSign")
        String streamSign;
    }
}
