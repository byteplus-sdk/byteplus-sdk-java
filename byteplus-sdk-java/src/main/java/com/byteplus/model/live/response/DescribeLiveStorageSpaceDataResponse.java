package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveStorageSpaceDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeLiveStorageSpaceDataResponse.DescribeLiveStorageSpaceDataResult Result;

    @Data
    public static class DescribeLiveStorageSpaceDataResult{
        @JSONField(name = "Buckets")
        private List<String> Buckets;

        @JSONField(name = "StartTime")
        private String StartTime;

        @JSONField(name = "EndTime")
        private String EndTime;

        @JSONField(name = "StorageDataList")
        private List<DescribeLiveStorageSpaceDataResponse.StorageData> StorageDataList;

    }

    @Data
    public static class StorageData {

        @JSONField(name = "TimeStamp")
        private String TimeStamp;
        @JSONField(name = "Storage")
        private double Storage;
    }
}
