package com.byteplus.service.vedit.impl;

import com.alibaba.fastjson.JSON;
import com.byteplus.error.SdkError;
import com.byteplus.helper.Const;
import com.byteplus.model.ServiceInfo;
import com.byteplus.model.request.*;
import com.byteplus.model.response.*;
import com.byteplus.service.BaseServiceImpl;
import com.byteplus.service.vedit.IVEditService;
import com.byteplus.service.vedit.VEditConfig;

import java.util.*;

public class VEditServiceImpl extends BaseServiceImpl implements IVEditService {

    private VEditServiceImpl() {
        super(VEditConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), VEditConfig.apiInfoList);
    }

    private VEditServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, VEditConfig.apiInfoList);
    }

    public static IVEditService getInstance() {
        return new VEditServiceImpl();
    }

    public static IVEditService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = VEditConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Edit not support region " + region);
        }
        return new VEditServiceImpl(serviceInfo);
    }

    @Override
    public SubmitDirectEditTaskAsyncResponse submitDirectEditTaskAsync(SubmitDirectEditTaskRequest submitDirectEditTaskRequest) throws Exception {
        RawResponse response = json("SubmitDirectEditTaskAsync", new ArrayList<>(), JSON.toJSONString(submitDirectEditTaskRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        SubmitDirectEditTaskAsyncResponse res = JSON.parseObject(response.getData(), SubmitDirectEditTaskAsyncResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("edit");
        return res;
    }

    @Override
    public SubmitTemplateTaskAsyncResponse submitTemplateTaskAsync(SubmitTemplateTaskRequest submitTemplateTaskRequest) throws Exception {
        RawResponse response = json("SubmitTemplateTaskAsync", new ArrayList<>(), JSON.toJSONString(submitTemplateTaskRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        SubmitTemplateTaskAsyncResponse res = JSON.parseObject(response.getData(), SubmitTemplateTaskAsyncResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("edit");
        return res;
    }

    @Override
    public GetDirectEditResultResponse getDirectEditResult(GetDirectEditResultRequest getDirectEditResultRequest) throws Exception {
        RawResponse response = json("GetDirectEditResult", new ArrayList<>(), JSON.toJSONString(getDirectEditResultRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetDirectEditResultResponse res = JSON.parseObject(response.getData(), GetDirectEditResultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("edit");
        return res;
    }
}
