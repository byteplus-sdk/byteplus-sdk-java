package com.byteplus.example.rtc.impl;

import com.alibaba.fastjson.JSON;
import com.byteplus.error.SdkError;
import com.byteplus.example.rtc.RtcConfig;
import com.byteplus.example.rtc.RtcService;
import com.byteplus.example.rtc.model.*;
import com.byteplus.helper.Const;
import com.byteplus.helper.Utils;
import com.byteplus.model.response.RawResponse;
import com.byteplus.service.BaseServiceImpl;

public class RtcServiceImpl extends BaseServiceImpl implements RtcService {
    private RtcServiceImpl() { super(RtcConfig.serviceInfo, RtcConfig.apiInfoList); }

    private static final RtcServiceImpl rtcServiceImplInstance = new RtcServiceImpl();

    public static RtcService getInstance() {
        return rtcServiceImplInstance;
    }
    
    
    @Override
    public StartRecordResponse startRecord(StartRecordRequest startRecordRequest) throws Exception {
        RawResponse response = json("StartRecord", null, JSON.toJSONString(startRecordRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), StartRecordResponse.class);
    }

    @Override
    public GetRecordTaskResponse getRecordTask(GetRecordTaskRequest getRecordTaskRequest) throws Exception {
        RawResponse response = query("GetRecordTask", Utils.mapToPairList(Utils.paramsToMap(getRecordTaskRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetRecordTaskResponse.class);
    }
}