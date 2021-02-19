package com.volcengine.service.livesaas.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.request.GetDirectEditResultRequest;
import com.volcengine.model.request.SubmitDirectEditTaskRequest;
import com.volcengine.model.request.SubmitTemplateTaskRequest;
import com.volcengine.model.response.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.livesaas.LivesaasService;
import com.volcengine.service.livesaas.LivesaasConfig;

import java.util.ArrayList;

public class VEditServiceImpl extends BaseServiceImpl implements LivesaasService {

    private VEditServiceImpl() {
        super(LivesaasConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), LivesaasConfig.apiInfoList);
    }

    private VEditServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, LivesaasConfig.apiInfoList);
    }

    public static LivesaasService getInstance() {
        return new VEditServiceImpl();
    }

    public static LivesaasService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = LivesaasConfig.serviceInfoMap.get(region);
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
