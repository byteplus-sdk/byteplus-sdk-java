package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListStorageSpaceResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListStorageSpaceResponse.ListStorageSpaceResult Result;

    @Data
    public static class ListStorageSpaceResult{
        @JSONField(name = "StorageSpace")
        private List<String> StorageSpace;

        @JSONField(name = "CurPage")
        private int CurPage;

        @JSONField(name = "Total")
        private int Total;
    }
}
