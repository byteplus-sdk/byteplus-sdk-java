package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DescribeDomainResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeDomainOutput result;

    @Data
    public static class DescribeDomainOutput{

        @JSONField(name = "DomainList")
        ListDomainDetailResponse.DomainInfo[] domainList;
    }
}
