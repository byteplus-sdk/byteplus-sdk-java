package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRemoteAuthBodyQueryParamConfig
 */
@lombok.Data
public final class UpdateRemoteAuthBodyQueryParamConfig  {

    /**
     * <p>远程鉴权请求的 URL 或 Header 参数使用用户请求参数还是自定义参数，取值及含义如下所示。</p>
     *
     * <p>- `true`：使用用户请求参数；</p>
     *
     * <p>- `false`：自定义参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseUserParam")
    private Boolean useUserParam;

    /**
     * <p>自定义参数时的参数配置，支持配置常量参数和变量参数总和最多不超过 25 个，提取用户请求参数最多不超过 25 个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Params")
    private List<UpdateRemoteAuthBodyQueryParamConfigParamsItem> params;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
