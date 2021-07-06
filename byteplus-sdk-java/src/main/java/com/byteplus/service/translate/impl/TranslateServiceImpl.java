package com.byteplus.service.translate.impl;

import com.alibaba.fastjson.JSON;
import com.byteplus.error.SdkError;
import com.byteplus.helper.Const;
import com.byteplus.model.request.LangDetectRequest;
import com.byteplus.model.request.TranslateImageRequest;
import com.byteplus.model.request.TranslateTextRequest;
import com.byteplus.model.response.LangDetectResponse;
import com.byteplus.model.response.RawResponse;
import com.byteplus.model.response.TranslateImageResponse;
import com.byteplus.model.response.TranslateTextResponse;
import com.byteplus.service.BaseServiceImpl;
import com.byteplus.service.translate.ITranslateService;
import com.byteplus.service.translate.TranslateConfig;


public class TranslateServiceImpl extends BaseServiceImpl implements ITranslateService {

    private TranslateServiceImpl() {
        super(TranslateConfig.serviceInfo, TranslateConfig.apiInfoList);
    }

    public static ITranslateService getInstance() {
        return new TranslateServiceImpl();
    }


    /**
     * @param langDetectRequest LangDetectRequest
     * @return LangDetectResponse
     * @throws Exception the exception
     */
    @Override
    public LangDetectResponse langDetect(LangDetectRequest langDetectRequest) throws Exception {
        RawResponse response = json(Const.LangDetect, null, JSON.toJSONString(langDetectRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LangDetectResponse.class);
    }

    /**
     * @param translateTextRequest TranslateTextRequest
     * @return TranslateTextResponse
     * @throws Exception the exception
     */
    @Override
    public TranslateTextResponse translateText(TranslateTextRequest translateTextRequest) throws Exception {
        RawResponse response = json(Const.TranslateText, null, JSON.toJSONString(translateTextRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), TranslateTextResponse.class);
    }

    /**
     * @param translateImageRequest translateImageRequest
     * @return TranslateImageResponse
     * @throws Exception the exception
     */
    @Override
    public TranslateImageResponse translateImage(TranslateImageRequest translateImageRequest) throws Exception {
        RawResponse response = json(Const.TranslateImage, null, JSON.toJSONString(translateImageRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), TranslateImageResponse.class);
    }
}
