package com.byteplus.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetAdvertisementDataAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAdvertisementDataAPIResultBean result;

    @Data
    public static class GetAdvertisementDataAPIResultBean {
        @JSONField(name = "ActivityId")
        Long activityId;
        @JSONField(name = "AccountClicks")
        ClicksData accountClicks;
        @JSONField(name = "AdvertisingClicks")
        ClicksData advertisingClicks;
        @JSONField(name = "AdInfo")
        List<AdInfo> adInfo;
    }

    @Data
    public static class ClicksData {
        @JSONField(name = "PV")
        Long pv;
        @JSONField(name = "UV")
        Long uv;
    }

    @Data
    public static class AdInfo {
        @JSONField(name = "AdType")
        Integer adType;
        @JSONField(name = "Content")
        String content;
        @JSONField(name = "Link")
        String link;
        @JSONField(name = "PV")
        Long pv;
        @JSONField(name = "UV")
        Long uv;
    }
}
