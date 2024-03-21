package com.byteplus.model.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;


@Data
public class ListActivityAPIRequest {
    @JSONField(name = "PageNo")
    Integer pageNo;

    @JSONField(name = "PageItemCount")
    Integer pageItemCount;

    @JSONField(name = "Name")
    String name;

    @JSONField(name = "Status")
    Integer status;

    @JSONField(name = "LiveTime")
    Long liveTime;

    @JSONField(name = "IsLockPreview")
    Integer isLockPreview;

    @JSONField(name = "SiteTagNews")
    List<ListActivityAPIRequestTag> siteTagNews;

    static class ListActivityAPIRequestTag {
        @JSONField(name = "Value")
        Integer value;

        @JSONField(name = "Name")
        Integer name;

        @JSONField(name = "Index")
        String index;
    }
}
