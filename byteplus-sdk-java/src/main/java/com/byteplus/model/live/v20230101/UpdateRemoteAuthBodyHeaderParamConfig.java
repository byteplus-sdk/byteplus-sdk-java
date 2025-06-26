package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRemoteAuthBodyHeaderParamConfig
 */
@lombok.Data
public final class UpdateRemoteAuthBodyHeaderParamConfig  {

    /**
     * <p>远程鉴权请求的 Header 参数使用用户请求 Header 参数还是自定义 Header 参数，取值及含义如下所示。</p>
     *
     * <p>- `true`：使用用户请求 Header 参数；</p>
     *
     * <p>- `false`：自定义请求 Header 参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseUserParam")
    private Boolean useUserParam;

    /**
     * <p>自定义鉴权请求的 Header 参数时的参数配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Params")
    private List<UpdateRemoteAuthBodyHeaderParamConfigParamsItem> params;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
