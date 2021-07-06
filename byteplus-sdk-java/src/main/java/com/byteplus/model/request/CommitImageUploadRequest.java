package com.byteplus.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.beans.Functions;
import com.byteplus.model.beans.ImageOption;
import lombok.Data;

import java.util.List;

@Data
public class CommitImageUploadRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "SessionKey")
    String sessionKey;
    @JSONField(name = "Functions")
    List<Functions> functions;
    @JSONField(name = "OptionInfos")
    List<ImageOption> optionInfos;
}
