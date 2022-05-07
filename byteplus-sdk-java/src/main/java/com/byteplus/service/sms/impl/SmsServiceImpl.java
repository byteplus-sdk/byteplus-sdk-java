package com.byteplus.service.sms.impl;

import com.alibaba.fastjson.JSON;
import com.byteplus.error.SdkError;
import com.byteplus.helper.Const;
import com.byteplus.model.ServiceInfo;
import com.byteplus.model.request.*;
import com.byteplus.model.response.*;
import com.byteplus.service.BaseServiceImpl;
import com.byteplus.service.sms.SmsConfig;
import com.byteplus.service.sms.SmsService;

import java.util.ArrayList;

public class SmsServiceImpl extends BaseServiceImpl implements SmsService {

    private SmsServiceImpl() {
        super(SmsConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), SmsConfig.apiInfoList);
    }
    private SmsServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, SmsConfig.apiInfoList);
    }

    public static SmsService getInstance() {
        return new SmsServiceImpl();
    }

    public static SmsService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = SmsConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Edit not support region " + region);
        }
        return new SmsServiceImpl(serviceInfo);
    }

    // low-level，需要用户自己定义serviceInfo
    public static SmsService newSmsService(ServiceInfo serviceInfo) throws Exception {
        if (serviceInfo == null) {
            throw new Exception("ServiceInfo is null");
        }
        return new SmsServiceImpl(serviceInfo);
    }

    @Override
    public SmsSendResponse send(SmsSendRequest smsSendRequest) throws Exception {
        RawResponse response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
//        response.toString();
//        System.out.println(response.getData());
        if(response.getCode() == SdkError.EHTTP.getNumber()){
            response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        }
        return getSmsSendResponse(response);
    }

    @Override
    public SmsSendResponse batchSend(SmsBatchSendRequest smsBatchSendRequest) throws Exception {
        RawResponse response = json("SendBatchSms", new ArrayList<>(), JSON.toJSONString(smsBatchSendRequest));
        if(response.getCode() == SdkError.EHTTP.getNumber()){
            response = json("SendBatchSms", new ArrayList<>(), JSON.toJSONString(smsBatchSendRequest));
        }
        return getSmsSendResponse(response);
    }
    @Override
    public SmsSendResponse sendVerifyCode(SmsSendVerifyCodeRequest smsSendVerifyCodeRequest) throws Exception {
        RawResponse response = json("SendSmsVerifyCode", new ArrayList<>(), JSON.toJSONString(smsSendVerifyCodeRequest));
        return getSmsSendResponse(response);
    }

    @Override
    public SmsCheckVerifyCodeResponse checkVerifyCode(SmsCheckVerifyCodeRequest smsCheckVerifyCodeRequest) throws Exception {
        RawResponse response = json("CheckSmsVerifyCode", new ArrayList<>(), JSON.toJSONString(smsCheckVerifyCodeRequest));
        return getSmsCheckResponse(response);
    }

    @Override
    public ConversionResponse conversion(ConversionRequest conversionRequest) throws Exception {
        RawResponse response = json("Conversion", new ArrayList<>(), JSON.toJSONString(conversionRequest));
        return getConversionResponse(response);
    }

    private SmsSendResponse getSmsSendResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        SmsSendResponse res = JSON.parseObject(response.getData(), SmsSendResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }
    private SmsCheckVerifyCodeResponse getSmsCheckResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        SmsCheckVerifyCodeResponse res = JSON.parseObject(response.getData(), SmsCheckVerifyCodeResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private ConversionResponse getConversionResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ConversionResponse res = JSON.parseObject(response.getData(), ConversionResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }
}
