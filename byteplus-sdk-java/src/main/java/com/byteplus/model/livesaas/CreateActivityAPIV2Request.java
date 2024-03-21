package com.byteplus.model.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;


@Data
public class CreateActivityAPIV2Request {
    @JSONField(name = "Name")
    String name;

    @JSONField(name = "LiveTime")
    Long liveTime;

    @JSONField(name = "LiveMode")
    Integer liveMode;

    @JSONField(name = "ViewUrlPath")
    String viewUrlPath;

    @JSONField(name = "CoverImage")
    String coverImage;

    @JSONField(name = "VerticalCoverImage")
    String verticalCoverImage;

    @JSONField(name = "OldId")
    Long oldId;

    @JSONField(name = "CopyStream")
    Boolean copyStream;

    @JSONField(name = "TemplateId")
    Long templateId;

    @JSONField(name = "SiteTags")
    List<CreateActivityAPIV2RequestActTag> siteTags;

    @JSONField(name = "TextSiteTags")
    List<CreateActivityAPIV2RequestTextActTag> textSiteTags;

    @Data
    static class CreateActivityAPIV2RequestActTag {
        @JSONField(name = "Value")
        String value;

        @JSONField(name = "Index")
        Long index;
    }

    @Data
    static class CreateActivityAPIV2RequestTextActTag {
        @JSONField(name = "Value")
        String value;

        @JSONField(name = "Index")
        Long index;
    }
}
