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

            put("DescribeTemplates", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeTemplates"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeServiceTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeServiceTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeCipherTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeCipherTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("CreateCipherTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CreateCipherTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("UpdateServiceTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateServiceTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("UpdateCipherTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateCipherTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DuplicateTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DuplicateTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("LockTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "LockTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DeleteTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeTemplateDomains", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeTemplateDomains"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("AddTemplateDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "AddTemplateDomain"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("UpdateTemplateDomain", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateTemplateDomain"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("CreateServiceTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CreateServiceTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeDistrictData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeDistrictData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeEdgeData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeDistrictSummary", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeDistrictSummary"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeEdgeSummary", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeSummary"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeOriginData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeOriginSummary", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginSummary"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeUserData", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeUserData"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeDistrictRanking", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeDistrictRanking"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeEdgeRanking", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeRanking"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeOriginRanking", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginRanking"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeEdgeStatusCodeRanking", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeEdgeStatusCodeRanking"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeOriginStatusCodeRanking", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeOriginStatusCodeRanking"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeStatisticalRanking", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeStatisticalRanking"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("BatchUpdateCdnConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "BatchUpdateCdnConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("AddCertificate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "AddCertificate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DeleteUsageReport", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteUsageReport"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("CreateUsageReport", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CreateUsageReport"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("ListUsageReports", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListUsageReports"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeSharedConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeSharedConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("ListSharedConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ListSharedConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DeleteSharedConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DeleteSharedConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("UpdateSharedConfig", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateSharedConfig"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("TagResources", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "TagResources"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("UntagResources", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UntagResources"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("ReleaseTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "ReleaseTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("CreateRuleEngineTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "CreateRuleEngineTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("UpdateRuleEngineTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "UpdateRuleEngineTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));

            put("DescribeRuleEngineTemplate", new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", "DescribeRuleEngineTemplate"));
                                    add(new BasicNameValuePair("Version", "2021-03-01"));
                                }
                            });
                        }
                    }
            ));


        }
    };
}
