package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateVhostTagsBody
 */
@lombok.Data
public final class UpdateVhostTagsBody  {

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>标签列表，不填就更新为空</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tags")
    private List<UpdateVhostTagsBodyTagsItem> tags;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
