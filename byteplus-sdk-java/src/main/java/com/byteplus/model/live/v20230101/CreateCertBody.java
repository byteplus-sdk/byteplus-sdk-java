package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCertBody
 */
@lombok.Data
public final class CreateCertBody  {

    /**
     * <p>证书名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    /**
     * <p>证书链 ID，用于标识整个证书链，包括叶子证书（服务器证书）、中间证书（中间 CA 证书）以及根证书（根 CA 证书）。</p>
     *
     * <p>:::tip</p>
     *
     * <p>使用当前接口更新证书时， ChainID 为必选参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>证书信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rsa")
    private CreateCertBodyRsa rsa;

    /**
     * <p>证书用途，当前仅支持设置为 `https`，表示用于 HTTPS 加密；</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseWay")
    private String useWay;

    /**
     * <p>项目名称，默认值为 `default`，您可以登录[访问控制](https://console.volcengine.com/iam/resourcemanage/project)获取项目名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProjectName")
    private String projectName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
