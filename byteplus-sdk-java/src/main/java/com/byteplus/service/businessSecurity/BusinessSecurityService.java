package com.byteplus.service.businessSecurity;

import com.byteplus.model.request.RiskDetectionRequest;
import com.byteplus.model.request.AsyncRiskDetectionRequest;

import com.byteplus.model.request.RiskResultRequest;

import com.byteplus.model.response.RiskDetectionResponse;
import com.byteplus.model.response.AsyncRiskDetectionResponse;
import com.byteplus.model.response.RiskResultResponse;

import com.byteplus.service.IBaseService;

/**
 * The interface business security service.
 */
public interface BusinessSecurityService extends IBaseService {
    /**
     * Risk Detection.
     *
     * @param riskDetectionRequest risk detection request
     * @return risk detection response
     * @throws Exception the exception
     */
    RiskDetectionResponse RiskDetection(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Async Risk Detection.
     *
     * @param  asyncRiskDetectionRequest async risk detection request
     * @return async risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncRiskDetection(AsyncRiskDetectionRequest asyncRiskDetectionRequest) throws Exception;

    /**
     * Risk Detection.
     *
     * @param riskResultRequest risk result request
     * @return risk result response
     * @throws Exception the exception
     */
    RiskResultResponse RiskResult(RiskResultRequest riskResultRequest) throws Exception;
}
