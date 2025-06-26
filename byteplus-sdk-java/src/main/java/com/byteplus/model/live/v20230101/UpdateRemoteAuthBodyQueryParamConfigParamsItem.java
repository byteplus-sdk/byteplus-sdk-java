package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRemoteAuthBodyQueryParamConfigParamsItem
 */
@lombok.Data
public final class UpdateRemoteAuthBodyQueryParamConfigParamsItem  {

    /**
     * <p>参数类型，可以传入const_string,header,query,vhost,domain,app,stream,client\_ip,server\_ip,request\_uri</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>原query/header/body/变量的参数名，长度在100字符内，type为header、query、const_string时必传</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParamName")
    private String paramName;

    /**
     * <p>鉴权请求中的query/header/body名，长度在100字符内，当不传入ToName时，新的参数名默认为原参数名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ToName")
    private String toName;

    /**
     * <p>仅type=const_string时传入，常量的值，长度在100字符内</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
