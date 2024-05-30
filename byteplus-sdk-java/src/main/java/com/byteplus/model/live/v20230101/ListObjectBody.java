package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListObjectBody
 */
@lombok.Data
public final class ListObjectBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BucketName")
    private String bucketName;

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
    @com.alibaba.fastjson.annotation.JSONField(name = "Prefix")
    private String prefix;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
