package com.byteplus.service.cdn.impl;

import com.alibaba.fastjson.JSON;
import com.byteplus.error.SdkError;
import com.byteplus.helper.Utils;
import com.byteplus.model.beans.CDN;
import com.byteplus.model.response.RawResponse;
import com.byteplus.service.BaseServiceImpl;
import com.byteplus.service.cdn.CDNConfig;
import com.byteplus.service.cdn.CDNService;


public class CDNServiceImpl extends BaseServiceImpl implements CDNService {

    private CDNServiceImpl() {
        super(CDNConfig.serviceInfo, CDNConfig.apiInfoList);
    }

    public static CDNService getInstance() {
        return new CDNServiceImpl();
    }

    @Override
    public CDN.AddCdnDomainResponse addCdnDomain(CDN.AddCdnDomainRequest request) throws Exception {
        RawResponse response = json("AddCdnDomain", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.AddCdnDomainResponse.class);
    }

    @Override
    public CDN.StartCdnDomainResponse startCdnDomain(CDN.StartCdnDomainRequest request) throws Exception {
        RawResponse response = json("StartCdnDomain", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.StartCdnDomainResponse.class);
    }

    @Override
    public CDN.StopCdnDomainResponse stopCdnDomain(CDN.StopCdnDomainRequest request) throws Exception {
        RawResponse response = json("StopCdnDomain", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.StopCdnDomainResponse.class);
    }

    @Override
    public CDN.DeleteCdnDomainResponse deleteCdnDomain(CDN.DeleteCdnDomainRequest request) throws Exception {
        RawResponse response = json("DeleteCdnDomain", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DeleteCdnDomainResponse.class);
    }

    @Override
    public CDN.ListCdnDomainsResponse listCdnDomains(CDN.ListCdnDomainsRequest request) throws Exception {
        RawResponse response = json("ListCdnDomains", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.ListCdnDomainsResponse.class);
    }

    @Override
    public CDN.DescribeCdnConfigResponse describeCdnConfig(CDN.DescribeCdnConfigRequest request) throws Exception {
        RawResponse response = json("DescribeCdnConfig", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnConfigResponse.class);
    }

    @Override
    public CDN.UpdateCdnConfigResponse updateCdnConfig(CDN.UpdateCdnConfigRequest request) throws Exception {
        RawResponse response = json("UpdateCdnConfig", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.UpdateCdnConfigResponse.class);
    }

    @Override
    public CDN.DescribeCdnDataResponse describeCdnData(CDN.DescribeCdnDataRequest request) throws Exception {
        RawResponse response = json("DescribeCdnData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeNrtDataSummaryResponse describeEdgeNrtDataSummary(CDN.DescribeEdgeNrtDataSummaryRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeNrtDataSummary", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeNrtDataSummaryResponse.class);
    }

    @Override
    public CDN.DescribeCdnOriginDataResponse describeCdnOriginData(CDN.DescribeCdnOriginDataRequest request) throws Exception {
        RawResponse response = json("DescribeCdnOriginData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnOriginDataResponse.class);
    }

    @Override
    public CDN.DescribeOriginNrtDataSummaryResponse describeOriginNrtDataSummary(CDN.DescribeOriginNrtDataSummaryRequest request) throws Exception {
        RawResponse response = json("DescribeOriginNrtDataSummary", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginNrtDataSummaryResponse.class);
    }

    @Override
    public CDN.DescribeCdnDataDetailResponse describeCdnDataDetail(CDN.DescribeCdnDataDetailRequest request) throws Exception {
        RawResponse response = json("DescribeCdnDataDetail", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnDataDetailResponse.class);
    }

    @Override
    public CDN.DescribeDistrictIspDataResponse describeDistrictIspData(CDN.DescribeDistrictIspDataRequest request) throws Exception {
        RawResponse response = json("DescribeDistrictIspData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeDistrictIspDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeStatisticalDataResponse describeEdgeStatisticalData(CDN.DescribeEdgeStatisticalDataRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeStatisticalData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeStatisticalDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeTopNrtDataResponse describeEdgeTopNrtData(CDN.DescribeEdgeTopNrtDataRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeTopNrtData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeTopNrtDataResponse.class);
    }

    @Override
    public CDN.DescribeOriginTopNrtDataResponse describeOriginTopNrtData(CDN.DescribeOriginTopNrtDataRequest request) throws Exception {
        RawResponse response = json("DescribeOriginTopNrtData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginTopNrtDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeTopStatusCodeResponse describeEdgeTopStatusCode(CDN.DescribeEdgeTopStatusCodeRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeTopStatusCode", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeTopStatusCodeResponse.class);
    }

    @Override
    public CDN.DescribeOriginTopStatusCodeResponse describeOriginTopStatusCode(CDN.DescribeOriginTopStatusCodeRequest request) throws Exception {
        RawResponse response = json("DescribeOriginTopStatusCode", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginTopStatusCodeResponse.class);
    }

    @Override
    public CDN.DescribeEdgeTopStatisticalDataResponse describeEdgeTopStatisticalData(CDN.DescribeEdgeTopStatisticalDataRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeTopStatisticalData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeTopStatisticalDataResponse.class);
    }

    @Override
    public CDN.DescribeCdnRegionAndIspResponse describeCdnRegionAndIsp(CDN.DescribeCdnRegionAndIspRequest request) throws Exception {
        RawResponse response = json("DescribeCdnRegionAndIsp", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnRegionAndIspResponse.class);
    }

    @Override
    public CDN.DescribeCdnServiceResponse describeCdnService() throws Exception {
        RawResponse response = json("DescribeCdnService", null, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnServiceResponse.class);
    }

    @Override
    public CDN.DescribeAccountingDataResponse describeAccountingData(CDN.DescribeAccountingDataRequest request) throws Exception {
        RawResponse response = json("DescribeAccountingData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeAccountingDataResponse.class);
    }

    @Override
    public CDN.SubmitRefreshTaskResponse submitRefreshTask(CDN.SubmitRefreshTaskRequest request) throws Exception {
        RawResponse response = json("SubmitRefreshTask", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.SubmitRefreshTaskResponse.class);
    }

    @Override
    public CDN.SubmitPreloadTaskResponse submitPreloadTask(CDN.SubmitPreloadTaskRequest request) throws Exception {
        RawResponse response = json("SubmitPreloadTask", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.SubmitPreloadTaskResponse.class);
    }

    @Override
    public CDN.DescribeContentTasksResponse describeContentTasks(CDN.DescribeContentTasksRequest request) throws Exception {
        RawResponse response = json("DescribeContentTasks", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeContentTasksResponse.class);
    }

    @Override
    public CDN.DescribeContentQuotaResponse describeContentQuota() throws Exception {
        RawResponse response = json("DescribeContentQuota", null, "");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeContentQuotaResponse.class);
    }

    @Override
    public CDN.SubmitBlockTaskResponse submitBlockTask(CDN.SubmitBlockTaskRequest request) throws Exception {
        RawResponse response = json("SubmitBlockTask", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.SubmitBlockTaskResponse.class);
    }

    @Override
    public CDN.SubmitUnblockTaskResponse submitUnblockTask(CDN.SubmitUnblockTaskRequest request) throws Exception {
        RawResponse response = json("SubmitUnblockTask", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.SubmitUnblockTaskResponse.class);
    }

    @Override
    public CDN.DescribeContentBlockTasksResponse describeContentBlockTasks(CDN.DescribeContentBlockTasksRequest request) throws Exception {
        RawResponse response = json("DescribeContentBlockTasks", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeContentBlockTasksResponse.class);
    }

    @Override
    public CDN.DescribeCdnAccessLogResponse describeCdnAccessLog(CDN.DescribeCdnAccessLogRequest request) throws Exception {
        RawResponse response = json("DescribeCdnAccessLog", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnAccessLogResponse.class);
    }

    @Override
    public CDN.DescribeIPInfoResponse describeIPInfo(CDN.DescribeIPInfoRequest request) throws Exception {
        RawResponse response = json("DescribeIPInfo", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeIPInfoResponse.class);
    }

    @Override
    public CDN.DescribeIPListInfoResponse describeIPListInfo(CDN.DescribeIPListInfoRequest request) throws Exception {
        RawResponse response = json("DescribeIPListInfo", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeIPListInfoResponse.class);
    }

    @Override
    public CDN.DescribeCdnUpperIpResponse describeCdnUpperIp(CDN.DescribeCdnUpperIpRequest request) throws Exception {
        RawResponse response = json("DescribeCdnUpperIp", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCdnUpperIpResponse.class);
    }

    @Override
    public CDN.AddCdnCertificateResponse addCdnCertificate(CDN.AddCdnCertificateRequest request) throws Exception {
        RawResponse response = json("AddCdnCertificate", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.AddCdnCertificateResponse.class);
    }

    @Override
    public CDN.ListCertInfoResponse listCertInfo(CDN.ListCertInfoRequest request) throws Exception {
        RawResponse response = json("ListCertInfo", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.ListCertInfoResponse.class);
    }

    @Override
    public CDN.ListCdnCertInfoResponse listCdnCertInfo(CDN.ListCdnCertInfoRequest request) throws Exception {
        RawResponse response = json("ListCdnCertInfo", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.ListCdnCertInfoResponse.class);
    }

    @Override
    public CDN.DescribeCertConfigResponse describeCertConfig(CDN.DescribeCertConfigRequest request) throws Exception {
        RawResponse response = json("DescribeCertConfig", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCertConfigResponse.class);
    }

    @Override
    public CDN.BatchDeployCertResponse batchDeployCert(CDN.BatchDeployCertRequest request) throws Exception {
        RawResponse response = json("BatchDeployCert", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.BatchDeployCertResponse.class);
    }

    @Override
    public CDN.DeleteCdnCertificateResponse deleteCdnCertificate(CDN.DeleteCdnCertificateRequest request) throws Exception {
        RawResponse response = json("DeleteCdnCertificate", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DeleteCdnCertificateResponse.class);
    }

    @Override
    public CDN.DescribeAccountingSummaryResponse describeAccountingSummary(CDN.DescribeAccountingSummaryRequest request) throws Exception {
        RawResponse response = json("DescribeAccountingSummary", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeAccountingSummaryResponse.class);
    }

    @Override
    public CDN.DescribeTemplatesResponse describeTemplates(CDN.DescribeTemplatesRequest request) throws Exception {
        RawResponse response = json("DescribeTemplates", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeTemplatesResponse.class);
    }

    @Override
    public CDN.DescribeServiceTemplateResponse describeServiceTemplate(CDN.DescribeServiceTemplateRequest request) throws Exception {
        RawResponse response = json("DescribeServiceTemplate", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeServiceTemplateResponse.class);
    }

    @Override
    public CDN.DescribeCipherTemplateResponse describeCipherTemplate(CDN.DescribeCipherTemplateRequest request) throws Exception {
        RawResponse response = json("DescribeCipherTemplate", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeCipherTemplateResponse.class);
    }

    @Override
    public CDN.CreateCipherTemplateResponse createCipherTemplate(CDN.CreateCipherTemplateRequest request) throws Exception {
        RawResponse response = json("CreateCipherTemplate", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.CreateCipherTemplateResponse.class);
    }

    @Override
    public CDN.UpdateServiceTemplateResponse updateServiceTemplate(CDN.UpdateServiceTemplateRequest request) throws Exception {
        RawResponse response = json("UpdateServiceTemplate", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.UpdateServiceTemplateResponse.class);
    }

    @Override
    public CDN.UpdateCipherTemplateResponse updateCipherTemplate(CDN.UpdateCipherTemplateRequest request) throws Exception {
        RawResponse response = json("UpdateCipherTemplate", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.UpdateCipherTemplateResponse.class);
    }

    @Override
    public CDN.DuplicateTemplateResponse duplicateTemplate(CDN.DuplicateTemplateRequest request) throws Exception {
        RawResponse response = json("DuplicateTemplate", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DuplicateTemplateResponse.class);
    }

    @Override
    public CDN.LockTemplateResponse lockTemplate(CDN.LockTemplateRequest request) throws Exception {
        RawResponse response = json("LockTemplate", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.LockTemplateResponse.class);
    }

    @Override
    public CDN.DeleteTemplateResponse deleteTemplate(CDN.DeleteTemplateRequest request) throws Exception {
        RawResponse response = json("DeleteTemplate", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DeleteTemplateResponse.class);
    }

    @Override
    public CDN.DescribeTemplateDomainsResponse describeTemplateDomains(CDN.DescribeTemplateDomainsRequest request) throws Exception {
        RawResponse response = json("DescribeTemplateDomains", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeTemplateDomainsResponse.class);
    }

    @Override
    public CDN.AddTemplateDomainResponse addTemplateDomain(CDN.AddTemplateDomainRequest request) throws Exception {
        RawResponse response = json("AddTemplateDomain", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.AddTemplateDomainResponse.class);
    }

    @Override
    public CDN.UpdateTemplateDomainResponse updateTemplateDomain(CDN.UpdateTemplateDomainRequest request) throws Exception {
        RawResponse response = json("UpdateTemplateDomain", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.UpdateTemplateDomainResponse.class);
    }

    @Override
    public CDN.CreateServiceTemplateResponse createServiceTemplate(CDN.CreateServiceTemplateRequest request) throws Exception {
        RawResponse response = json("CreateServiceTemplate", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.CreateServiceTemplateResponse.class);
    }

    @Override
    public CDN.DescribeDistrictDataResponse describeDistrictData(CDN.DescribeDistrictDataRequest request) throws Exception {
        RawResponse response = json("DescribeDistrictData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeDistrictDataResponse.class);
    }

    @Override
    public CDN.DescribeEdgeDataResponse describeEdgeData(CDN.DescribeEdgeDataRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeDataResponse.class);
    }

    @Override
    public CDN.DescribeDistrictSummaryResponse describeDistrictSummary(CDN.DescribeDistrictSummaryRequest request) throws Exception {
        RawResponse response = json("DescribeDistrictSummary", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeDistrictSummaryResponse.class);
    }

    @Override
    public CDN.DescribeEdgeSummaryResponse describeEdgeSummary(CDN.DescribeEdgeSummaryRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeSummary", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeSummaryResponse.class);
    }

    @Override
    public CDN.DescribeOriginDataResponse describeOriginData(CDN.DescribeOriginDataRequest request) throws Exception {
        RawResponse response = json("DescribeOriginData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginDataResponse.class);
    }

    @Override
    public CDN.DescribeOriginSummaryResponse describeOriginSummary(CDN.DescribeOriginSummaryRequest request) throws Exception {
        RawResponse response = json("DescribeOriginSummary", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginSummaryResponse.class);
    }

    @Override
    public CDN.DescribeUserDataResponse describeUserData(CDN.DescribeUserDataRequest request) throws Exception {
        RawResponse response = json("DescribeUserData", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeUserDataResponse.class);
    }

    @Override
    public CDN.DescribeDistrictRankingResponse describeDistrictRanking(CDN.DescribeDistrictRankingRequest request) throws Exception {
        RawResponse response = json("DescribeDistrictRanking", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeDistrictRankingResponse.class);
    }

    @Override
    public CDN.DescribeEdgeRankingResponse describeEdgeRanking(CDN.DescribeEdgeRankingRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeRanking", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeRankingResponse.class);
    }

    @Override
    public CDN.DescribeOriginRankingResponse describeOriginRanking(CDN.DescribeOriginRankingRequest request) throws Exception {
        RawResponse response = json("DescribeOriginRanking", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginRankingResponse.class);
    }

    @Override
    public CDN.DescribeEdgeStatusCodeRankingResponse describeEdgeStatusCodeRanking(CDN.DescribeEdgeStatusCodeRankingRequest request) throws Exception {
        RawResponse response = json("DescribeEdgeStatusCodeRanking", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeEdgeStatusCodeRankingResponse.class);
    }

    @Override
    public CDN.DescribeOriginStatusCodeRankingResponse describeOriginStatusCodeRanking(CDN.DescribeOriginStatusCodeRankingRequest request) throws Exception {
        RawResponse response = json("DescribeOriginStatusCodeRanking", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeOriginStatusCodeRankingResponse.class);
    }

    @Override
    public CDN.DescribeStatisticalRankingResponse describeStatisticalRanking(CDN.DescribeStatisticalRankingRequest request) throws Exception {
        RawResponse response = json("DescribeStatisticalRanking", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DescribeStatisticalRankingResponse.class);
    }

    @Override
    public CDN.BatchUpdateCdnConfigResponse batchUpdateCdnConfig(CDN.BatchUpdateCdnConfigRequest request) throws Exception {
        RawResponse response = json("BatchUpdateCdnConfig", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.BatchUpdateCdnConfigResponse.class);
    }

    @Override
    public CDN.AddCertificateResponse addCertificate(CDN.AddCertificateRequest request) throws Exception {
        RawResponse response = json("AddCertificate", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.AddCertificateResponse.class);
    }

    @Override
    public CDN.DeleteUsageReportResponse deleteUsageReport(CDN.DeleteUsageReportRequest request) throws Exception {
        RawResponse response = json("DeleteUsageReport", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.DeleteUsageReportResponse.class);
    }

    @Override
    public CDN.CreateUsageReportResponse createUsageReport(CDN.CreateUsageReportRequest request) throws Exception {
        RawResponse response = json("CreateUsageReport", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.CreateUsageReportResponse.class);
    }

    @Override
    public CDN.ListUsageReportsResponse listUsageReports(CDN.ListUsageReportsRequest request) throws Exception {
        RawResponse response = json("ListUsageReports", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CDN.ListUsageReportsResponse.class);
    }
}
