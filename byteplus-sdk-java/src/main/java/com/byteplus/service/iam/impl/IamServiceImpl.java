package com.byteplus.service.iam.impl;

import com.alibaba.fastjson.JSON;
import com.byteplus.error.SdkError;
import com.byteplus.helper.Const;
import com.byteplus.helper.Utils;
import com.byteplus.model.request.ListUsersRequest;
import com.byteplus.model.response.ListUsersResponse;
import com.byteplus.model.response.RawResponse;
import com.byteplus.service.BaseServiceImpl;
import com.byteplus.service.iam.IIamService;
import com.byteplus.service.iam.IamConfig;


public class IamServiceImpl extends BaseServiceImpl implements IIamService {

    private IamServiceImpl() {
        super(IamConfig.serviceInfo, IamConfig.apiInfoList);
    }

    public static IIamService getInstance() {
        return new IamServiceImpl();
    }

    @Override
    public ListUsersResponse listUsers(ListUsersRequest listUsersRequest) throws Exception {
        RawResponse response = query(Const.ListUsers, Utils.mapToPairList(Utils.paramsToMap(listUsersRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListUsersResponse.class);
    }
}