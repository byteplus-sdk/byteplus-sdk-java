package com.byteplus.service.livesaas;

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

import static com.byteplus.service.livesaas.Const.*;

public class LiveSaaSConfig {

    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_AP_SINGAPORE_1, new ServiceInfo(
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
                            put(Const.Credentials, new Credentials(Const.REGION_AP_SINGAPORE_1, "livesaas"));
                        }
                    }
            ));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(ActionCreateActivityAPIV2, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, HttpMethodPost);
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", ActionCreateActivityAPIV2));
                                    add(new BasicNameValuePair("Version", Version20200601));
                                }
                            });
                        }
                    }
            ));
            put(ActionListActivityAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, HttpMethodPost);
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", ActionListActivityAPI));
                                    add(new BasicNameValuePair("Version", Version20200601));
                                }
                            });
                        }
                    }
            ));
            put(ActionUpdateActivityBasicConfigAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, HttpMethodPost);
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", ActionUpdateActivityBasicConfigAPI));
                                    add(new BasicNameValuePair("Version", Version20200601));
                                }
                            });
                        }
                    }
            ));
            put(ActionGetTemporaryLoginTokenAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, HttpMethodGet);
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", ActionGetTemporaryLoginTokenAPI));
                                    add(new BasicNameValuePair("Version", Version20200601));
                                }
                            });
                        }
                    }
            ));
            put(ActionGetSDKTokenAPI, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, HttpMethodPost);
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", ActionGetSDKTokenAPI));
                                    add(new BasicNameValuePair("Version", Version20200601));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
