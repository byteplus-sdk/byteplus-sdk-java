package com.byteplus.service.translate;

import com.byteplus.helper.Const;
import com.byteplus.model.ApiInfo;
import com.byteplus.model.Credentials;
import com.byteplus.model.ServiceInfo;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TranslateConfig {
    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Host, "open.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new BasicHeader("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "translate"));
                }
            }
    );
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.LangDetect, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.LangDetect));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.TranslateText, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.TranslateText));
                                    add(new BasicNameValuePair("Version", "2020-06-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.TranslateImage, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.TranslateImage));
                                    add(new BasicNameValuePair("Version", "2020-07-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
