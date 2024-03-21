package com.byteplus.service.livesaas.impl;

import com.alibaba.fastjson.JSON;
import com.byteplus.error.SdkError;
import com.byteplus.helper.Const;
import com.byteplus.helper.Utils;
import com.byteplus.model.ServiceInfo;
import com.byteplus.model.livesaas.*;
import com.byteplus.model.response.RawResponse;
import com.byteplus.model.response.ResponseMetadata;
import com.byteplus.service.BaseServiceImpl;
import com.byteplus.service.live.LiveConfig;
import com.byteplus.service.livesaas.LiveSaaSConfig;
import com.byteplus.service.livesaas.LiveSaaSService;
import org.apache.http.HttpHost;

import java.util.ArrayList;

import static com.byteplus.service.livesaas.Const.*;


public class LiveSaaSServiceImpl extends BaseServiceImpl implements LiveSaaSService {

    private LiveSaaSServiceImpl() {
        super(LiveSaaSConfig.serviceInfoMap.get(Const.REGION_AP_SINGAPORE_1), LiveSaaSConfig.apiInfoList);
    }

    private LiveSaaSServiceImpl(HttpHost proxy) {
        super(LiveSaaSConfig.serviceInfoMap.get(Const.REGION_AP_SINGAPORE_1), LiveSaaSConfig.apiInfoList);
    }

    private LiveSaaSServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, LiveSaaSConfig.apiInfoList);
    }

    public static LiveSaaSService getInstance() {
        return new LiveSaaSServiceImpl();
    }

    public static LiveSaaSService getInstance(HttpHost proxy) {
        return new LiveSaaSServiceImpl(proxy);
    }

    public static LiveSaaSService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = LiveConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Live not support region " + region);
        }
        return new LiveSaaSServiceImpl(serviceInfo);
    }

    public CreateActivityAPIV2Response CreateActivityAPIV2(CreateActivityAPIV2Request request) throws Exception {
        RawResponse response = json(ActionCreateActivityAPIV2, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CreateActivityAPIV2Response res = JSON.parseObject(response.getData(), CreateActivityAPIV2Response.class);

        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    public ListActivityAPIResponse ListActivityAPI(ListActivityAPIRequest request) throws Exception {
        RawResponse response = json(ActionListActivityAPI, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListActivityAPIResponse res = JSON.parseObject(response.getData(), ListActivityAPIResponse.class);

        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    public UpdateActivityBasicConfigAPIResponse UpdateActivityBasicConfigAPI(UpdateActivityBasicConfigAPIRequest request) throws Exception {
        RawResponse response = json(ActionUpdateActivityBasicConfigAPI, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateActivityBasicConfigAPIResponse res = JSON.parseObject(response.getData(), UpdateActivityBasicConfigAPIResponse.class);

        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    public GetTemporaryLoginTokenAPIResponse GetTemporaryLoginTokenAPI(GetTemporaryLoginTokenAPIRequest request) throws Exception {
        RawResponse response = query(ActionGetTemporaryLoginTokenAPI, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetTemporaryLoginTokenAPIResponse res = JSON.parseObject(response.getData(), GetTemporaryLoginTokenAPIResponse.class);

        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    public GetSDKTokenAPIResponse GetSDKTokenAPI(GetSDKTokenAPIRequest request) throws Exception {
        RawResponse response = json(ActionGetSDKTokenAPI, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSDKTokenAPIResponse res = JSON.parseObject(response.getData(), GetSDKTokenAPIResponse.class);

        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }
}