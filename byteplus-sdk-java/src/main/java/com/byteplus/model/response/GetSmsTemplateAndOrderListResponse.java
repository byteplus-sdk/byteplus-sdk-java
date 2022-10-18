package com.byteplus.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.beans.ShortUrlConfig;
import com.byteplus.model.beans.SmsTemplateInfo;
import lombok.Data;

import java.util.List;

@Data
public class GetSmsTemplateAndOrderListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;
    @Data
    public static class ResultBean {
        @JSONField(name = "List")
        List<SmsTemplateInfo> list;
        @JSONField(name = "Total")
        int total;
    }

}
