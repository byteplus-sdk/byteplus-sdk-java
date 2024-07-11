package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListSDKInfoBody
 */
@lombok.Data
public final class ListSDKInfoBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SDKVersion")
    private Integer sDKVersion;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
