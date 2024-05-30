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
            put("DeleteCommonTransPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteCommonTransPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteTranscodePresetPatchByAdmin", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteTranscodePresetPatchByAdmin"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("AddCommonTransPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "AddCommonTransPreset"));
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
            put("DescribeTranscodePresetDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeTranscodePresetDetail"));
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
            put("CreateTranscodePresetPatchByAdmin", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateTranscodePresetPatchByAdmin"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteWatermarkPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteWatermarkPresetV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateWatermarkPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateWatermarkPresetV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeWatermarkPresetDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeWatermarkPresetDetail"));
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
            put("CreateWatermarkPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateWatermarkPresetV2"));
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
            put("StopPullRecordTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "StopPullRecordTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreatePullRecordTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreatePullRecordTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteRecordHistory", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteRecordHistory"));
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
            put("ListPullRecordTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListPullRecordTask"));
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
            put("ListVideoClassifications", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVideoClassifications"));
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
            put("UpdateSnapshotPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateSnapshotPresetV2"));
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
            put("ListVhostSnapshotPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVhostSnapshotPresetV2"));
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
            put("CreateSnapshotPresetV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateSnapshotPresetV2"));
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
            put("DeleteTimeShiftPresetV3", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteTimeShiftPresetV3"));
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
            put("UpdateTimeShiftPresetV3", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateTimeShiftPresetV3"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeTimeShiftPresetDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeTimeShiftPresetDetail"));
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
            put("CreateTimeShiftPresetV3", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateTimeShiftPresetV3"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("GenerateTimeShiftPlayURL", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GenerateTimeShiftPlayURL"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVhostDomainDetailByUserID", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVhostDomainDetailByUserID"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateVhostTags", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateVhostTags"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVhostDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVhostDetail"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVhostDetailByAdmin", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVhostDetailByAdmin"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeVhost", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeVhost"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetTags", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetTags"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListProjects", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListProjects"));
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
            put("DeleteAuth", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteAuth"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("EnableAuth", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "EnableAuth"));
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
            put("DisableAuth", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DisableAuth"));
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
            put("UpdateCert", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateCert"));
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
            put("DescribeCertDetailV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeCertDetailV2"));
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
            put("ListObject", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListObject"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ManagerPullPushDomainBind", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ManagerPullPushDomainBind"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeCertDetailSecret", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeCertDetailSecret"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeDomainVerify", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeDomainVerify"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateVerifyContent", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateVerifyContent"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVqosDimensionValues", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVqosDimensionValues"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListCert", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListCert"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListCertBindInfo", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListCertBindInfo"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveFreeTimeInterval", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveFreeTimeInterval"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("VerifyDomainOwner", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "VerifyDomainOwner"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ValidateCert", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ValidateCert"));
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
            put("DeleteDomainV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteDomainV2"));
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
            put("RejectDomain", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RejectDomain"));
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
            put("UpdateDomain", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateDomain"));
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
            put("CreateDomain", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateDomain"));
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
            put("CreateVQScoreTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateVQScoreTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeVQScoreTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeVQScoreTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVQScoreTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVQScoreTask"));
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
            put("RestartPullToPushTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "RestartPullToPushTask"));
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
            put("DeleteDenyConfigV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteDenyConfigV2"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeDenyConfigV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeDenyConfigV2"));
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
            put("DeleteRelaySourceV4", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteRelaySourceV4"));
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
            put("UpdateRelaySourceV4", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateRelaySourceV4"));
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
            put("ListRelaySourceV4", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListRelaySourceV4"));
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
            put("CreateRelaySourceV4", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateRelaySourceV4"));
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
            put("UpdateSDKLicense", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateSDKLicense"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateApp", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateApp"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteSDK", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteSDK"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateApp", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateApp"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateSDK", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateSDK"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeSDKDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeSDKDetail"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeSDKParamsAvailable", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeSDKParamsAvailable"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeAppIDParamsAvailable", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeAppIDParamsAvailable"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateSDK", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateSDK"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListSDK", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListSDK"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListSDKAdmin", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListSDKAdmin"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetApps", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetApps"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateService", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateService"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListServices", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListServices"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeService", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeService"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateActivityBilling", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateActivityBilling"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateBilling", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateBilling"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListInstance", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListInstance"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeBillingForAdmin", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeBillingForAdmin"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeBilling", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeBilling"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeBillingMonthAvailable", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeBillingMonthAvailable"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListResourcePackage", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListResourcePackage"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("TerminateInstance", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "TerminateInstance"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteStreamQuotaConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteStreamQuotaConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateStreamQuotaConfigPatch", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateStreamQuotaConfigPatch"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeStreamQuotaConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeStreamQuotaConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateStreamQuotaConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateStreamQuotaConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVqosMetricsDimensions", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVqosMetricsDimensions"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetVqosRawData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetVqosRawData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("StopPullCDNSnapshotTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "StopPullCDNSnapshotTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreatePullCDNSnapshotTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreatePullCDNSnapshotTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetPullCDNSnapshotTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetPullCDNSnapshotTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListPullCDNSnapshotTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListPullCDNSnapshotTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("GetPullRecordTask", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "GetPullRecordTask"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteSnapshotAuditPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteSnapshotAuditPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateSnapshotAuditPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateSnapshotAuditPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeSnapshotAuditPresetDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeSnapshotAuditPresetDetail"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVhostSnapshotAuditPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVhostSnapshotAuditPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateSnapshotAuditPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateSnapshotAuditPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeIpInfo", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeIpInfo"));
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
            put("DescribeLiveBatchSourceStreamMetrics", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveBatchSourceStreamMetrics"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveBatchSourceStreamAvgMetrics", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveBatchSourceStreamAvgMetrics"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveBatchOnlineStreamMetrics", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveBatchOnlineStreamMetrics"));
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
            put("DescribeLiveBatchPushStreamAvgMetrics", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveBatchPushStreamAvgMetrics"));
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
            put("DescribeLiveStreamCountData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveStreamCountData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLivePushStreamCountData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLivePushStreamCountData"));
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
            put("DescribeLiveBatchStreamTrafficData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveBatchStreamTrafficData"));
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
            put("DescribeLiveAuditData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveAuditData"));
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
            put("DescribeLiveTimeShiftData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveTimeShiftData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeActionHistory", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeActionHistory"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListActionHistory", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListActionHistory"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteDenseSnapshotPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteDenseSnapshotPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateDenseSnapshotPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateDenseSnapshotPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListVhostDenseSnapshotPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListVhostDenseSnapshotPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescDenseSnapshotPresetDetail", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescDenseSnapshotPresetDetail"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateDenseSnapshotPreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateDenseSnapshotPreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveCustomizedLogData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveCustomizedLogData"));
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
            put("AssociatePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "AssociatePreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DisAssociatePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DisAssociatePreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdatePresetAssociation", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdatePresetAssociation"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribePresetAssociation", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribePresetAssociation"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateTicket", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateTicket"));
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
            put("DescribeDenyConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeDenyConfig"));
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
            put("UpdateDenyConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateDenyConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateDenyConfigV2", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateDenyConfigV2"));
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
            put("DeleteRelaySink", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteRelaySink"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateRelaySink", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateRelaySink"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeRelaySink", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeRelaySink"));
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
            put("DeleteHeaderConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteHeaderConfig"));
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
            put("UpdateHeaderConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateHeaderConfig"));
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
            put("DescribeHeaderConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeHeaderConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListHeaderEnum", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListHeaderEnum"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteNSSRewriteConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteNSSRewriteConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateNSSRewriteConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateNSSRewriteConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeNSSRewriteConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeNSSRewriteConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveActivityBandwidthData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveActivityBandwidthData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateLiveAccountFeeConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateLiveAccountFeeConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteLiveAccountFeeConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteLiveAccountFeeConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveAccountFeeConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveAccountFeeConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveStreamUsageData", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveStreamUsageData"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveFeeConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveFeeConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeLiveAccountFeeType", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeLiveAccountFeeType"));
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
            put("DescribeContentKey", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeContentKey"));
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
            put("CreateCustomLogConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateCustomLogConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteCustomLogConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteCustomLogConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeCustomLogConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeCustomLogConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CheckCustomLogConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CheckCustomLogConfig"));
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
            put("AssociateRefConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "AssociateRefConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DisassociateRefConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DisassociateRefConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeRefConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeRefConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListReferenceNames", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListReferenceNames"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListReferenceTypes", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "GET");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListReferenceTypes"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListReferenceInfo", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListReferenceInfo"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("CreateAvSlicePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateAvSlicePreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteAvSlicePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteAvSlicePreset"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateAvSlicePreset", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateAvSlicePreset"));
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
            put("CreateProxyConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "CreateProxyConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteProxyConfigAssociation", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteProxyConfigAssociation"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DeleteProxyConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DeleteProxyConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateProxyConfigAssociation", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateProxyConfigAssociation"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("UpdateProxyConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "UpdateProxyConfig"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("DescribeProxyConfigAssociation", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "DescribeProxyConfigAssociation"));
                                add(new BasicNameValuePair("Version", "2023-01-01"));
                            }
                        });
                    }
                }     
            ));
            put("ListProxyConfig", new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", "ListProxyConfig"));
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
        }
    };
}
