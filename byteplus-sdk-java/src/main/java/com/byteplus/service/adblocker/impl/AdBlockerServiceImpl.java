package com.byteplus.service.adblocker.impl;

import com.alibaba.fastjson.JSON;
import com.byteplus.error.SdkError;
import com.byteplus.helper.Const;
import com.byteplus.model.request.AdBlockerRequest;
import com.byteplus.model.response.AdBlockerResponse;
import com.byteplus.model.response.RawResponse;
import com.byteplus.service.BaseServiceImpl;
import com.byteplus.service.adblocker.AdBlockerConfig;
import com.byteplus.service.adblocker.AdBlockerService;

import java.util.ArrayList;

public class AdBlockerServiceImpl extends BaseServiceImpl implements AdBlockerService {
    private AdBlockerServiceImpl() {
        super(AdBlockerConfig.serviceInfo, AdBlockerConfig.apiInfoList);
    }

    public static AdBlockerService getInstance() {
        return new AdBlockerServiceImpl();
    }

    @Override
    public AdBlockerResponse AdBlock(AdBlockerRequest adBlockerRequest) throws Exception {
        RawResponse response = json(Const.AdBlock, new ArrayList<>(), JSON.toJSONString(adBlockerRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }


        return JSON.parseObject(response.getData(), AdBlockerResponse.class);
    }
}
