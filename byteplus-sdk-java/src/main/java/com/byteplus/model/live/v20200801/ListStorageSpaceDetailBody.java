package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListStorageSpaceDetailBody
 */
@lombok.Data
public final class ListStorageSpaceDetailBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageSpaceList")
    private List<String> storageSpaceList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
