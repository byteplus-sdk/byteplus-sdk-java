package com.byteplus.model.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListActivityAPIResponseResult result;

    @Data
    static class ListActivityAPIResponseResult {
        @JSONField(name = "PageNo")
        Integer pageNo;

        @JSONField(name = "PageItemCount")
        Integer pageItemCount;

        @JSONField(name = "TotalItemCount")
        Integer totalItemCount;

        @JSONField(name = "Activities")
        List<ListActivityAPIResponseResultActivities> activities;

        @Data
        static class ListActivityAPIResponseResultActivities {
            @JSONField(name = "Id")
            Long id;

            @JSONField(name = "Name")
            String name;

            @JSONField(name = "Status")
            Integer status;

            @JSONField(name = "CoverImage")
            String coverImage;

            @JSONField(name = "CreateTime")
            Integer createTime;

            @JSONField(name = "ViewUrl")
            String viewUrl;

            @JSONField(name = "LiveTime")
            Integer liveTime;

            @JSONField(name = "StreamStartTime")
            Integer streamStartTime;

            @JSONField(name = "IsLockPreview")
            Integer isLockPreview;

            @JSONField(name = "SiteTags")
            List<ListActivityAPIResponseResultActivitiesActTag> siteTags;

            @JSONField(name = "TextSiteTags")
            List<ListActivityAPIResponseResultActivitiesTextActTag> textSiteTags;

            @JSONField(name = "OnlineStatus")
            Integer onlineStatus;

            static class ListActivityAPIResponseResultActivitiesActTag {
                @JSONField(name = "Name")
                String name;
                @JSONField(name = "Value")
                String value;
                @JSONField(name = "Index")
                Integer index;
                @JSONField(name = "DbIndex")
                Integer dbIndex;
                @JSONField(name = "Show")
                Integer show;
            }

            static class ListActivityAPIResponseResultActivitiesTextActTag {
                @JSONField(name = "Name")
                String name;
                @JSONField(name = "Value")
                String value;
                @JSONField(name = "Index")
                Integer index;
                @JSONField(name = "DbIndex")
                Integer dbIndex;
                @JSONField(name = "Show")
                Integer show;
            }
        }
    }
}
