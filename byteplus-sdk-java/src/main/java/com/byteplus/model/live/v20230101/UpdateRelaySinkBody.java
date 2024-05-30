package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRelaySinkBody
 */
@lombok.Data
public final class UpdateRelaySinkBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Group")
    private String group;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsThunderRelaySink")
    private Boolean isThunderRelaySink;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsTranscodeRelaySink")
    private Boolean isTranscodeRelaySink;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PassRequestParam")
    private Boolean passRequestParam;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySinkDetailList")
    private List<UpdateRelaySinkBodyRelaySinkDetailListItem> relaySinkDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
