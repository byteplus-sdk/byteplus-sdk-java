package com.byteplus.service.live.v20230101;

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
            put("DeleteTranscodePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteTranscodePreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateTranscodePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateTranscodePreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListCommonTransPresetDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListCommonTransPresetDetail"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVhostTransCodePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVhostTransCodePreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateTranscodePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateTranscodePreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateWatermarkPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateWatermarkPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateWatermarkPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateWatermarkPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteWatermarkPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteWatermarkPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListWatermarkPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListWatermarkPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVhostWatermarkPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVhostWatermarkPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteRecordPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteRecordPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateRecordPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateRecordPresetV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeRecordTaskFileHistory", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeRecordTaskFileHistory"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVhostRecordPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVhostRecordPresetV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateRecordPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateRecordPresetV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteSnapshotPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteSnapshotPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateSnapshotPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateSnapshotPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeCDNSnapshotHistory", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeCDNSnapshotHistory"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVhostSnapshotPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVhostSnapshotPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateSnapshotPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateSnapshotPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteTimeShiftPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteTimeShiftPresetV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateTimeShiftPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateTimeShiftPresetV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateTimeShiftPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateTimeShiftPresetV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListTimeShiftPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListTimeShiftPresetV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteCallback", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteCallback"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeCallback", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeCallback"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateCallback", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateCallback"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteCert", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteCert"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeCertDetailSecretV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeCertDetailSecretV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListCertV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListCertV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateCert", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateCert"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("BindCert", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BindCert"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UnbindCert", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UnbindCert"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteDomain", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteDomain"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("EnableDomain", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "EnableDomain"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateDomainV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateDomainV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateDomainVhost", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateDomainVhost"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeDomain", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeDomain"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListDomainDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListDomainDetail"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DisableDomain", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DisableDomain"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateLiveVideoQualityAnalysisTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateLiveVideoQualityAnalysisTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteLiveVideoQualityAnalysisTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteLiveVideoQualityAnalysisTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetLiveVideoQualityAnalysisTaskDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetLiveVideoQualityAnalysisTaskDetail"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListLiveVideoQualityAnalysisTasks", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListLiveVideoQualityAnalysisTasks"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("StopPullToPushTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "StopPullToPushTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreatePullToPushTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreatePullToPushTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreatePullToPushGroup", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreatePullToPushGroup"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeletePullToPushTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeletePullToPushTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeletePullToPushGroup", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeletePullToPushGroup"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ContinuePullToPushTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ContinuePullToPushTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdatePullToPushTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdatePullToPushTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListPullToPushGroup", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListPullToPushGroup"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListPullToPushTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListPullToPushTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListPullToPushTaskV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListPullToPushTaskV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("RelaunchPullToPushTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RelaunchPullToPushTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteRelaySourceRewrite", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteRelaySourceRewrite"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteRelaySourceV3", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteRelaySourceV3"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateRelaySourceRewrite", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateRelaySourceRewrite"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeRelaySourceRewrite", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeRelaySourceRewrite"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeRelaySourceV3", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeRelaySourceV3"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateRelaySourceV3", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateRelaySourceV3"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("KillStream", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "KillStream"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeClosedStreamInfoByPage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeClosedStreamInfoByPage"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveStreamInfoByPage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveStreamInfoByPage"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveStreamState", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveStreamState"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeForbiddenStreamInfoByPage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeForbiddenStreamInfoByPage"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ForbidStream", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ForbidStream"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ResumeStream", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ResumeStream"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("GeneratePlayURL", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GeneratePlayURL"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("GeneratePushURL", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GeneratePushURL"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveTopPlayData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveTopPlayData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveRegionData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveRegionData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveSourceStreamMetrics", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveSourceStreamMetrics"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLivePushStreamMetrics", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLivePushStreamMetrics"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveCallbackData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveCallbackData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveStreamSessionData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveStreamSessionData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLivePlayStatusCodeData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLivePlayStatusCodeData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveBatchPushStreamMetrics", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveBatchPushStreamMetrics"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveBatchStreamTranscodeData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveBatchStreamTranscodeData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLivePushStreamInfoData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLivePushStreamInfoData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveTranscodeInfoData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveTranscodeInfoData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveSourceBandwidthData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveSourceBandwidthData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveSourceTrafficData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveSourceTrafficData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveMetricBandwidthData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveMetricBandwidthData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveMetricTrafficData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveMetricTrafficData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveEdgeStatData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveEdgeStatData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveISPData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveISPData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveP95PeakBandwidthData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveP95PeakBandwidthData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveASRDurationData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveASRDurationData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLivePullToPushBandwidthData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLivePullToPushBandwidthData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLivePullToPushData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLivePullToPushData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveBandwidthData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveBandwidthData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveRecordData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveRecordData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveSnapshotData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveSnapshotData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveTrafficData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveTrafficData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveTranscodeData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveTranscodeData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveStorageSpaceData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveStorageSpaceData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveLogData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveLogData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteReferer", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteReferer"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeReferer", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeReferer"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeAuth", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeAuth"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateReferer", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateReferer"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateAuthKey", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateAuthKey"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteHLSConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteHLSConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateHLSConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateHLSConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeHLSConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeHLSConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteHTTPHeaderConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteHTTPHeaderConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("EnableHTTPHeaderConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "EnableHTTPHeaderConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeHTTPHeaderConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeHTTPHeaderConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateHTTPHeaderConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateHTTPHeaderConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateEncryptDRM", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateEncryptDRM"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateEncryptHLS", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateEncryptHLS"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetHLSEncryptDataKey", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetHLSEncryptDataKey"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeEncryptHLS", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeEncryptHLS"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLicenseDRM", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLicenseDRM"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeCertDRM", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeCertDRM"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeEncryptDRM", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeEncryptDRM"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("BindEncryptDRM", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "BindEncryptDRM"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UnBindEncryptDRM", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UnBindEncryptDRM"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListBindEncryptDRM", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListBindEncryptDRM"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateTranscodePresetBatch", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateTranscodePresetBatch"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteTranscodePresetBatch", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteTranscodePresetBatch"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteIPAccessRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteIPAccessRule"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteRegionAccessRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteRegionAccessRule"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateIPAccessRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateIPAccessRule"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateRegionAccessRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateRegionAccessRule"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeIPAccessRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeIPAccessRule"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeRegionAccessRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeRegionAccessRule"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteCMAFConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteCMAFConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateCMAFConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateCMAFConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeCMAFConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeCMAFConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteLatencyConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteLatencyConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLatencyConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLatencyConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateLatencyConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateLatencyConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateCloudMixTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateCloudMixTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateCloudMixTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateCloudMixTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetCloudMixTaskDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetCloudMixTaskDetail"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListCloudMixTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListCloudMixTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteCloudMixTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteCloudMixTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteClusterRateLimit", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteClusterRateLimit"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeClusterRateLimit", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeClusterRateLimit"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateClusterRateLimit", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateClusterRateLimit"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteUserAgentAccessRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteUserAgentAccessRule"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeUserAgentAccessRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeUserAgentAccessRule"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateUserAgentAccessRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateUserAgentAccessRule"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteFormatAccessRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteFormatAccessRule"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeFormatAccessRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeFormatAccessRule"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateFormatAccessRule", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateFormatAccessRule"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteSubtitleTranscodePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteSubtitleTranscodePreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateSubtitleTranscodePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateSubtitleTranscodePreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVhostSubtitleTranscodePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVhostSubtitleTranscodePreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateSubtitleTranscodePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateSubtitleTranscodePreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateCarouselTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateCarouselTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteCarouselTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteCarouselTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateCarouselTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateCarouselTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetCarouselDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetCarouselDetail"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListCarouselTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListCarouselTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteRemoteAuth", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteRemoteAuth"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeRemoteAuth", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeRemoteAuth"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVhostRemoteAuth", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVhostRemoteAuth"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateRemoteAuth", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateRemoteAuth"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
        }
    };
}
