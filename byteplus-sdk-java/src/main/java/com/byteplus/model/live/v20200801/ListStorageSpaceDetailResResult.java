package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListStorageSpaceDetailResResult
 */
@lombok.Data
public final class ListStorageSpaceDetailResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageSpaceListDetail")
    private List<ListStorageSpaceDetailResResultStorageSpaceListDetailItem> storageSpaceListDetail;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
