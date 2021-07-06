package com.byteplus.service.businessSecurity.impl;

import com.alibaba.fastjson.JSON;
import com.byteplus.error.SdkError;
import com.byteplus.helper.Const;
import com.byteplus.helper.Utils;
import com.byteplus.model.request.AsyncRiskDetectionRequest;
import com.byteplus.model.request.RiskDetectionRequest;
import com.byteplus.model.request.RiskResultRequest;
import com.byteplus.model.response.*;
import com.byteplus.service.BaseServiceImpl;
import com.byteplus.service.businessSecurity.BusinessSecurityConfig;
import com.byteplus.service.businessSecurity.BusinessSecurityService;

import java.util.ArrayList;

public class BusinessSecurityServiceImpl extends BaseServiceImpl implements BusinessSecurityService {
    private BusinessSecurityServiceImpl() {
        super(BusinessSecurityConfig.serviceInfo, BusinessSecurityConfig.apiInfoList);
    }

    public static BusinessSecurityService getInstance() {
        return new BusinessSecurityServiceImpl();
    }

    @Override
    public RiskDetectionResponse RiskDetection(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.RiskDetection, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }


        return JSON.parseObject(response.getData(), RiskDetectionResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse AsyncRiskDetection(AsyncRiskDetectionRequest asyncRiskDetectionRequest) throws Exception {
        RawResponse response = json(Const.AsyncRiskDetection, new ArrayList<>(), JSON.toJSONString(asyncRiskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public RiskResultResponse RiskResult(RiskResultRequest riskResultRequest) throws Exception {
        RawResponse response = query(Const.RiskResult, Utils.mapToPairList(Utils.paramsToMap(riskResultRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), RiskResultResponse.class);
    }
}
