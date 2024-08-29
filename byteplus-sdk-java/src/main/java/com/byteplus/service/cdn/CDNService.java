package com.byteplus.service.cdn;

    import com.byteplus.model.beans.CDN;
    import com.byteplus.service.IBaseService;

    public interface CDNService extends IBaseService {
        CDN.AddCdnDomainResponse addCdnDomain(CDN.AddCdnDomainRequest request) throws Exception;

        CDN.StartCdnDomainResponse startCdnDomain(CDN.StartCdnDomainRequest request) throws Exception;

        CDN.StopCdnDomainResponse stopCdnDomain(CDN.StopCdnDomainRequest request) throws Exception;

        CDN.DeleteCdnDomainResponse deleteCdnDomain(CDN.DeleteCdnDomainRequest request) throws Exception;

        CDN.ListCdnDomainsResponse listCdnDomains(CDN.ListCdnDomainsRequest request) throws Exception;

        CDN.DescribeCdnConfigResponse describeCdnConfig(CDN.DescribeCdnConfigRequest request) throws Exception;

        CDN.UpdateCdnConfigResponse updateCdnConfig(CDN.UpdateCdnConfigRequest request) throws Exception;

        CDN.DescribeCdnDataResponse describeCdnData(CDN.DescribeCdnDataRequest request) throws Exception;

        CDN.DescribeEdgeNrtDataSummaryResponse describeEdgeNrtDataSummary(CDN.DescribeEdgeNrtDataSummaryRequest request) throws Exception;

        CDN.DescribeCdnOriginDataResponse describeCdnOriginData(CDN.DescribeCdnOriginDataRequest request) throws Exception;

        CDN.DescribeOriginNrtDataSummaryResponse describeOriginNrtDataSummary(CDN.DescribeOriginNrtDataSummaryRequest request) throws Exception;

        CDN.DescribeCdnDataDetailResponse describeCdnDataDetail(CDN.DescribeCdnDataDetailRequest request) throws Exception;

        CDN.DescribeDistrictIspDataResponse describeDistrictIspData(CDN.DescribeDistrictIspDataRequest request) throws Exception;

        CDN.DescribeEdgeStatisticalDataResponse describeEdgeStatisticalData(CDN.DescribeEdgeStatisticalDataRequest request) throws Exception;

        CDN.DescribeEdgeTopNrtDataResponse describeEdgeTopNrtData(CDN.DescribeEdgeTopNrtDataRequest request) throws Exception;

        CDN.DescribeOriginTopNrtDataResponse describeOriginTopNrtData(CDN.DescribeOriginTopNrtDataRequest request) throws Exception;

        CDN.DescribeEdgeTopStatusCodeResponse describeEdgeTopStatusCode(CDN.DescribeEdgeTopStatusCodeRequest request) throws Exception;

        CDN.DescribeOriginTopStatusCodeResponse describeOriginTopStatusCode(CDN.DescribeOriginTopStatusCodeRequest request) throws Exception;

        CDN.DescribeEdgeTopStatisticalDataResponse describeEdgeTopStatisticalData(CDN.DescribeEdgeTopStatisticalDataRequest request) throws Exception;

        CDN.DescribeCdnRegionAndIspResponse describeCdnRegionAndIsp(CDN.DescribeCdnRegionAndIspRequest request) throws Exception;

        CDN.DescribeCdnServiceResponse describeCdnService() throws Exception;

        CDN.DescribeAccountingDataResponse describeAccountingData(CDN.DescribeAccountingDataRequest request) throws Exception;

        CDN.SubmitRefreshTaskResponse submitRefreshTask(CDN.SubmitRefreshTaskRequest request) throws Exception;

        CDN.SubmitPreloadTaskResponse submitPreloadTask(CDN.SubmitPreloadTaskRequest request) throws Exception;

        CDN.DescribeContentTasksResponse describeContentTasks(CDN.DescribeContentTasksRequest request) throws Exception;

        CDN.DescribeContentQuotaResponse describeContentQuota() throws Exception;

        CDN.SubmitBlockTaskResponse submitBlockTask(CDN.SubmitBlockTaskRequest request) throws Exception;

        CDN.SubmitUnblockTaskResponse submitUnblockTask(CDN.SubmitUnblockTaskRequest request) throws Exception;

        CDN.DescribeContentBlockTasksResponse describeContentBlockTasks(CDN.DescribeContentBlockTasksRequest request) throws Exception;

        CDN.DescribeCdnAccessLogResponse describeCdnAccessLog(CDN.DescribeCdnAccessLogRequest request) throws Exception;

        CDN.DescribeIPInfoResponse describeIPInfo(CDN.DescribeIPInfoRequest request) throws Exception;

        CDN.DescribeIPListInfoResponse describeIPListInfo(CDN.DescribeIPListInfoRequest request) throws Exception;

        CDN.DescribeCdnUpperIpResponse describeCdnUpperIp(CDN.DescribeCdnUpperIpRequest request) throws Exception;

        CDN.AddCdnCertificateResponse addCdnCertificate(CDN.AddCdnCertificateRequest request) throws Exception;

        CDN.ListCertInfoResponse listCertInfo(CDN.ListCertInfoRequest request) throws Exception;

        CDN.ListCdnCertInfoResponse listCdnCertInfo(CDN.ListCdnCertInfoRequest request) throws Exception;

        CDN.DescribeCertConfigResponse describeCertConfig(CDN.DescribeCertConfigRequest request) throws Exception;

        CDN.BatchDeployCertResponse batchDeployCert(CDN.BatchDeployCertRequest request) throws Exception;

        CDN.DeleteCdnCertificateResponse deleteCdnCertificate(CDN.DeleteCdnCertificateRequest request) throws Exception;

        CDN.DescribeAccountingSummaryResponse describeAccountingSummary(CDN.DescribeAccountingSummaryRequest request) throws Exception;

        CDN.DescribeTemplatesResponse describeTemplates(CDN.DescribeTemplatesRequest request) throws Exception;

        CDN.DescribeServiceTemplateResponse describeServiceTemplate(CDN.DescribeServiceTemplateRequest request) throws Exception;

        CDN.DescribeCipherTemplateResponse describeCipherTemplate(CDN.DescribeCipherTemplateRequest request) throws Exception;

        CDN.CreateCipherTemplateResponse createCipherTemplate(CDN.CreateCipherTemplateRequest request) throws Exception;

        CDN.UpdateServiceTemplateResponse updateServiceTemplate(CDN.UpdateServiceTemplateRequest request) throws Exception;

        CDN.UpdateCipherTemplateResponse updateCipherTemplate(CDN.UpdateCipherTemplateRequest request) throws Exception;

        CDN.DuplicateTemplateResponse duplicateTemplate(CDN.DuplicateTemplateRequest request) throws Exception;

        CDN.LockTemplateResponse lockTemplate(CDN.LockTemplateRequest request) throws Exception;

        CDN.DeleteTemplateResponse deleteTemplate(CDN.DeleteTemplateRequest request) throws Exception;

        CDN.DescribeTemplateDomainsResponse describeTemplateDomains(CDN.DescribeTemplateDomainsRequest request) throws Exception;

        CDN.AddTemplateDomainResponse addTemplateDomain(CDN.AddTemplateDomainRequest request) throws Exception;

        CDN.UpdateTemplateDomainResponse updateTemplateDomain(CDN.UpdateTemplateDomainRequest request) throws Exception;

        CDN.CreateServiceTemplateResponse createServiceTemplate(CDN.CreateServiceTemplateRequest request) throws Exception;

        CDN.DescribeDistrictDataResponse describeDistrictData(CDN.DescribeDistrictDataRequest request) throws Exception;

        CDN.DescribeEdgeDataResponse describeEdgeData(CDN.DescribeEdgeDataRequest request) throws Exception;

        CDN.DescribeDistrictSummaryResponse describeDistrictSummary(CDN.DescribeDistrictSummaryRequest request) throws Exception;

        CDN.DescribeEdgeSummaryResponse describeEdgeSummary(CDN.DescribeEdgeSummaryRequest request) throws Exception;

        CDN.DescribeOriginDataResponse describeOriginData(CDN.DescribeOriginDataRequest request) throws Exception;

        CDN.DescribeOriginSummaryResponse describeOriginSummary(CDN.DescribeOriginSummaryRequest request) throws Exception;

        CDN.DescribeUserDataResponse describeUserData(CDN.DescribeUserDataRequest request) throws Exception;

        CDN.DescribeDistrictRankingResponse describeDistrictRanking(CDN.DescribeDistrictRankingRequest request) throws Exception;

        CDN.DescribeEdgeRankingResponse describeEdgeRanking(CDN.DescribeEdgeRankingRequest request) throws Exception;

        CDN.DescribeOriginRankingResponse describeOriginRanking(CDN.DescribeOriginRankingRequest request) throws Exception;

        CDN.DescribeEdgeStatusCodeRankingResponse describeEdgeStatusCodeRanking(CDN.DescribeEdgeStatusCodeRankingRequest request) throws Exception;

        CDN.DescribeOriginStatusCodeRankingResponse describeOriginStatusCodeRanking(CDN.DescribeOriginStatusCodeRankingRequest request) throws Exception;

        CDN.DescribeStatisticalRankingResponse describeStatisticalRanking(CDN.DescribeStatisticalRankingRequest request) throws Exception;

        CDN.BatchUpdateCdnConfigResponse batchUpdateCdnConfig(CDN.BatchUpdateCdnConfigRequest request) throws Exception;

        CDN.AddCertificateResponse addCertificate(CDN.AddCertificateRequest request) throws Exception;

        CDN.DeleteUsageReportResponse deleteUsageReport(CDN.DeleteUsageReportRequest request) throws Exception;

        CDN.CreateUsageReportResponse createUsageReport(CDN.CreateUsageReportRequest request) throws Exception;

        CDN.ListUsageReportsResponse listUsageReports(CDN.ListUsageReportsRequest request) throws Exception;

}
