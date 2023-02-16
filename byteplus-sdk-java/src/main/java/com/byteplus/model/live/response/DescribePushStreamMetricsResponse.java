package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribePushStreamMetricsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribePushStreamMetricsOutput Result;

    @Data
    public static class DescribePushStreamMetricsOutput {
        @JSONField(name = "MetricList")
        private List<MetricList> MetricList;
        @JSONField(name = "Domain")
        private String Domain;
        @JSONField(name = "App")
        private String App;
        @JSONField(name = "Stream")
        private String Stream;
        @JSONField(name = "StartTime")
        private String StartTime;
        @JSONField(name = "EndTime")
        private String EndTime;
        @JSONField(name = "Aggregation")
        private Integer Aggregation;
    }

    @Data
    public static class MetricList {
        @JSONField(name = "Time")
        private String Time;

        @JSONField(name = "Bitrate")
        private double Bitrate;

        @JSONField(name = "Framerate")
        private double Framerate;

        @JSONField(name = "AudioFramerate")
        private double AudioFramerate;

        @JSONField(name = "AudioBitrate")
        private double AudioBitrate;

        @JSONField(name = "AudioPts")
        private Integer AudioPts;

        @JSONField(name = "VideoPts")
        private Integer VideoPts;

        @JSONField(name = "PtsDelta")
        private Integer PtsDelta;

        @JSONField(name = "AudioFrameGap")
        private Integer AudioFrameGap;

        @JSONField(name = "VideoFrameGap")
        private Integer VideoFrameGap;
    }
}
