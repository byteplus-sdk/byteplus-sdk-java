package com.byteplus.service.sms;

import com.byteplus.helper.Const;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHost;


@Data
public class SmsServiceInfoConfig {
    /**
     * 可以设置/不设置默认5000
     */
    private int connectionTimeout;
    /**
     * 可以设置/不设置默认5000
     */
    private int socketTimeout;
    /**
     * 可以设置/不设置默认https
     */
    private String scheme;

    /**
     * 可以设置/不设置默认sms.volcengineapi.com
     */
    private String host;

    /**
     * 必须设置
     */
    private String accessKey;

    /**
     * 必须设置
     */
    private String secretAccessKey;

    /**
     * 可以设置/不设置，默认cn-north-1
     */
    private String region;

    /**
     * 可以设置/不设置
     */
    private HttpHost proxy;

    public SmsServiceInfoConfig() {

    }

    public SmsServiceInfoConfig(String ak, String sk) {
        this.setAccessKey(ak)
                .setSecretAccessKey(sk)
                .setHost("sms.byteplusapi.com")
                .setRegion(Const.REGION_AP_SINGAPORE_1)
                .setScheme(Const.HTTPS)
                .setConnectionTimeout(5000)
                .setSocketTimeout(5000);
    }

    public SmsServiceInfoConfig setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
        return this;
    }

    public SmsServiceInfoConfig setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
        return this;
    }


    public SmsServiceInfoConfig setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }


    public SmsServiceInfoConfig setHost(String host) {
        this.host = host;
        return this;
    }


    public SmsServiceInfoConfig setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }


    public SmsServiceInfoConfig setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    public SmsServiceInfoConfig setRegion(String region) {
        this.region = region;
        return this;
    }

    public SmsServiceInfoConfig setProxy(HttpHost proxy) {
        this.proxy = proxy;
        return this;
    }
}
