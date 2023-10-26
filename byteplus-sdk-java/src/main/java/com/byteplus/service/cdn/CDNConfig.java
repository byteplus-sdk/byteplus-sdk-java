package com.byteplus.service.cdn;

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

public class CDNConfig {
    public static ServiceInfo serviceInfo = new ServiceInfo(
            new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 30000);
                    put(Const.SOCKET_TIMEOUT, 30000);
                    put(Const.Host, "open.byteplusapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new BasicHeader("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_AP_SINGAPORE_1, "CDN"));
                }
            }
    );
    
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put("AddCdnDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "AddCdnDomain"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("StartCdnDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "StartCdnDomain"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("StopCdnDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "StopCdnDomain"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DeleteCdnDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteCdnDomain"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("ListCdnDomains", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListCdnDomains"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeCdnConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("UpdateCdnConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateCdnConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeCdnData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeEdgeNrtDataSummary", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeNrtDataSummary"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeCdnOriginData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnOriginData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeOriginNrtDataSummary", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginNrtDataSummary"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeCdnDataDetail", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnDataDetail"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeDistrictIspData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeDistrictIspData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeEdgeStatisticalData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeStatisticalData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeEdgeTopNrtData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeTopNrtData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeOriginTopNrtData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginTopNrtData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeEdgeTopStatusCode", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeTopStatusCode"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeOriginTopStatusCode", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginTopStatusCode"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeEdgeTopStatisticalData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeTopStatisticalData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeCdnRegionAndIsp", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnRegionAndIsp"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeCdnService", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnService"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeAccountingData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeAccountingData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("SubmitRefreshTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "SubmitRefreshTask"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("SubmitPreloadTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "SubmitPreloadTask"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeContentTasks", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeContentTasks"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeContentQuota", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeContentQuota"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("SubmitBlockTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "SubmitBlockTask"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("SubmitUnblockTask", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "SubmitUnblockTask"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeContentBlockTasks", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeContentBlockTasks"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeCdnAccessLog", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnAccessLog"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeIPInfo", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeIPInfo"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeIPListInfo", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeIPListInfo"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeCdnUpperIp", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCdnUpperIp"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("AddCdnCertificate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "AddCdnCertificate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("ListCertInfo", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListCertInfo"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("ListCdnCertInfo", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListCdnCertInfo"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeCertConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCertConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("BatchDeployCert", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "BatchDeployCert"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DeleteCdnCertificate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteCdnCertificate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeAccountingSummary", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeAccountingSummary"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));


        }
    };
}
