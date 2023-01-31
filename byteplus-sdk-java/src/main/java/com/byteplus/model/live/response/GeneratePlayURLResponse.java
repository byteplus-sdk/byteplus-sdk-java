package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

import java.util.ArrayList;
@Data
public class GeneratePlayURLResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "URLList")
        ArrayList<URLList> urlList;
    }

    @Data
    public static class URLList {
        @JSONField(name = "URL")
        String url;
        @JSONField(name = "Type")
        String type;
        @JSONField(name = "CDN")
        String cdn;
        @JSONField(name = "Protocol")
        String protocol;
    }
}
