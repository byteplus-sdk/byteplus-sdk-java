package com.byteplus.service.gameProtect.impl;

import com.alibaba.fastjson.JSON;
import com.byteplus.error.SdkError;
import com.byteplus.helper.Const;
import com.byteplus.helper.Utils;
import com.byteplus.model.request.GameProtectRiskResultRequest;
import com.byteplus.model.response.GameProtectRiskReusltResponse;
import com.byteplus.model.response.RawResponse;
import com.byteplus.service.BaseServiceImpl;
import com.byteplus.service.gameProtect.GameProtectConfig;
import com.byteplus.service.gameProtect.GameProtectService;

public class GameProtectServiceImpl extends BaseServiceImpl implements GameProtectService {
    private GameProtectServiceImpl() {super(GameProtectConfig.serviceInfo, GameProtectConfig.apiInfoList);}

    public static GameProtectService getInstance() {return new GameProtectServiceImpl();}

    @Override
    public GameProtectRiskReusltResponse RiskResult(GameProtectRiskResultRequest gameProtectRiskResultRequest) throws Exception {
        gameProtectRiskResultRequest.setService("anti_plugin");
        RawResponse response = query(Const.GameProtect, Utils.mapToPairList(Utils.paramsToMap(gameProtectRiskResultRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GameProtectRiskReusltResponse.class);
    }

}
