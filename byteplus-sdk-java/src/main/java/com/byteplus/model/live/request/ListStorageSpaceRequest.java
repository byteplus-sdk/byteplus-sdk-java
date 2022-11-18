package com.byteplus.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListStorageSpaceRequest {
    @JSONField(name = "PageSize")
    private Integer PageSize;

    @JSONField(name = "PageNum")
    private Integer PageNum;
}
