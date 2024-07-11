package com.byteplus.service.live.v20200801;

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

/**
 * Basic configuration for Live
 */
public class LiveConfig {
    /**
     * Basic service configuration for Live
     */
    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put("cn-north-1", new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.CONNECTION_TIMEOUT, 5000);
                            put(Const.SOCKET_TIMEOUT, 5000);
                            put(Const.Scheme, "https");
                            put(Const.Host, "open.byteplusapi.com");
                            put(Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(Const.Credentials, new Credentials("cn-north-1", "live"));
                        }
                    }
            ));
        }
    };

    /**
     * Basic api configuration for Live
     */
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put("ListStorageSpace", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListStorageSpace"));
                                add(new BasicNameValuePair("Version", "2020-08-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListStorageSpaceDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListStorageSpaceDetail"));
                                add(new BasicNameValuePair("Version", "2020-08-01"));
                            }
                        });
                    }
                }     
            ));
        }
    };
}
