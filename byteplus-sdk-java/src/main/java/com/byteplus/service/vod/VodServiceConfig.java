package com.byteplus.service.vod;


//import com.byteplus.helper.Const;
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

public class VodServiceConfig {

    public static Map<String, ServiceInfo> ServiceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(com.byteplus.helper.Const.REGION_AP_SINGAPORE_1, new ServiceInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.CONNECTION_TIMEOUT, 5000);
                            put(com.byteplus.helper.Const.SOCKET_TIMEOUT, 5000);
                            put(com.byteplus.helper.Const.Scheme, "https");
                            put(com.byteplus.helper.Const.Host, "vod.byteplusapi.com");
                            put(com.byteplus.helper.Const.Header, new ArrayList<Header>() {
                                {
                                    add(new BasicHeader("Accept", "application/json"));
                                }
                            });
                            put(com.byteplus.helper.Const.Credentials, new Credentials(com.byteplus.helper.Const.REGION_AP_SINGAPORE_1, "vod"));
                        }
                    }
            ));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            // **********************************************************************
            // 播放
            // **********************************************************************
            put(Const.GetPlayInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetPlayInfo));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetPrivateDrmPlayAuth, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetPrivateDrmPlayAuth));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetPlayInfoWithLiveTimeShiftScene, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetPlayInfoWithLiveTimeShiftScene));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetHlsDecryptionKey, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetHlsDecryptionKey));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));

            // **********************************************************************
            // 上传
            // **********************************************************************
            put(Const.UploadMediaByUrl, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UploadMediaByUrl));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.QueryUploadTaskInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.QueryUploadTaskInfo));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ApplyUploadInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ApplyUploadInfo));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CommitUploadInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CommitUploadInfo));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                            put(com.byteplus.helper.Const.CONNECTION_TIMEOUT, 30000);
                            put(com.byteplus.helper.Const.SOCKET_TIMEOUT, 30000);
                        }
                    }
            ));

            // **********************************************************************
            // 媒资
            // **********************************************************************
            put(Const.CreatePlaylist, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "POST");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreatePlaylist));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetPlaylists, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetPlaylists));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdatePlaylist, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "POST");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdatePlaylist));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeletePlaylist, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeletePlaylist));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateMediaInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateMediaInfo));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateMediaPublishStatus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateMediaPublishStatus));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateMediaStorageClass, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateMediaStorageClass));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetMediaInfos, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetMediaInfos));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetRecommendedPoster, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetRecommendedPoster));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteMedia, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteMedia));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteTranscodes, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteTranscodes));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetMediaList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetMediaList));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetSubtitleInfoList, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetSubtitleInfoList));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateSubtitleStatus, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateSubtitleStatus));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateSubtitleInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateSubtitleInfo));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateVideoClassification, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateVideoClassification));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateVideoClassification, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateVideoClassification));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DeleteVideoClassification, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DeleteVideoClassification));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListVideoClassifications, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListVideoClassifications));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListSnapshots, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListSnapshots));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));

            // **********************************************************************
            // 转码
            // **********************************************************************
            put(Const.StartWorkflow, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "POST");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.StartWorkflow));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.RetrieveTranscodeResult, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.RetrieveTranscodeResult));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetWorkflowExecution, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetWorkflowExecution));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));

            // **********************************************************************
            // 视频编辑
            // **********************************************************************


            // **********************************************************************
            // 空间管理
            // **********************************************************************
            put(Const.CreateSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateSpace));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListSpace, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListSpace));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetSpaceDetail, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetSpaceDetail));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
//            put(Const.UpdateSpace, new ApiInfo(
//                    new HashMap<String, Object>() {
//                        {
//                            put(com.byteplus.helper.Const.Method, "GET");
//                            put(com.byteplus.helper.Const.Path, "/");
//                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
//                                {
//                                    add(new BasicNameValuePair("Action", Const.UpdateSpace));
//                                    add(new BasicNameValuePair("Version", "2021-01-01"));
//                                }
//                            });
//                        }
//                    }
//            ));
            put(Const.UpdateSpaceUploadConfig, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateSpaceUploadConfig));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodSpaceStorageData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSpaceStorageData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            // **********************************************************************
            // 分发加速管理
            // **********************************************************************
            put(Const.ListDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListDomain));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateCdnRefreshTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateCdnRefreshTask));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.CreateCdnPreloadTask, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateCdnPreloadTask));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnTasks, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListCdnTasks));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnAccessLog, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListCdnAccessLog));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnTopAccessUrl, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListCdnTopAccessUrl));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));

                                }
                            });
                        }
                    }
            ));
//            put(Const.ListCdnTopAccess, new ApiInfo(
//                    new HashMap<String, Object>() {
//                        {
//                            put(com.byteplus.helper.Const.Method, "GET");
//                            put(com.byteplus.helper.Const.Path, "/");
//                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
//                                {
//                                    add(new BasicNameValuePair("Action", Const.ListCdnTopAccess));
//                                    add(new BasicNameValuePair("Version", "2023-07-01"));
//
//                                }
//                            });
//                        }
//                    }
//            ));
            put(Const.DescribeVodDomainBandwidthData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodDomainBandwidthData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodDomainTrafficData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodDomainTrafficData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnUsageData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListCdnUsageData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnStatusData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListCdnStatusData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeIpInfo, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeIpInfo));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.ListCdnPvData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.ListCdnPvData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.CreateDomain, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.CreateDomain));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));

                                }
                            });
                        }
                    }
            ));
            put(Const.UpdateDomainExpire, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.UpdateDomainExpire));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));

                                }
                            });
                        }
                    }
            ));
//            put(Const.AddOrUpdateCertificate, new ApiInfo(
//                    new HashMap<String, Object>() {
//                        {
//                            put(com.byteplus.helper.Const.Method, "POST");
//                            put(com.byteplus.helper.Const.Path, "/");
//                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
//                                {
//                                    add(new BasicNameValuePair("Action", Const.AddOrUpdateCertificate));
//                                    add(new BasicNameValuePair("Version", "2023-07-01"));
//                                }
//                            });
//                        }
//                    }
//            ));
            // **********************************************************************
            // 回调管理
            // **********************************************************************
            put(Const.AddCallbackSubscription, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.AddCallbackSubscription));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.SetCallbackEvent, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SetCallbackEvent));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            // **********************************************************************
            // 计量计费
            // **********************************************************************
            put(Const.DescribeVodSpaceTranscodeData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSpaceTranscodeData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodSnapshotData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSnapshotData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodMostPlayedStatisData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodMostPlayedStatisData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodPlayedStatisData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodPlayedStatisData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodRealtimeMediaData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodRealtimeMediaData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodEnhanceImageData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodEnhanceImageData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.DescribeVodSpaceSubtitleStatisData, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.DescribeVodSpaceSubtitleStatisData));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            // **********************************************************************
            // 商业drm
            // **********************************************************************
            put(Const.GetDrmLicense, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "POST");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetDrmLicense));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
            put(Const.GetFairPlayCert, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(com.byteplus.helper.Const.Method, "GET");
                            put(com.byteplus.helper.Const.Path, "/");
                            put(com.byteplus.helper.Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.GetFairPlayCert));
                                    add(new BasicNameValuePair("Version", "2023-01-01"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
