package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostRemoteAuthResResult
 */
@lombok.Data
public final class ListVhostRemoteAuthResResult  {

    /**
     * <p>Vhost 下所有拉流域名的远程鉴权配置信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RemoteAuthConfigList")
    private List<ListVhostRemoteAuthResResultRemoteAuthConfigListItem> remoteAuthConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
