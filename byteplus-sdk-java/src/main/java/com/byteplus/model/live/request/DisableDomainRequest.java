package com.byteplus.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DisableDomainRequest {

    @JSONField(name = "Domain")
    String domain;
}
