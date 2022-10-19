package com.byteplus.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetSubAccountListRequest {
    @JSONField(name = "SubAccount")
    String subAccount;

    @JSONField(name = "PageIndex")
    int pageIndex;

    @JSONField(name = "PageSize")
    int pageSize;
}
