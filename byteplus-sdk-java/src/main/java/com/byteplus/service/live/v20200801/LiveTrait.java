package com.byteplus.service.live.v20200801;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.helper.Const;
import com.byteplus.helper.Utils;
import com.byteplus.model.ServiceInfo;
import com.byteplus.model.response.RawResponse;
import com.byteplus.model.response.ResponseMetadata;
import com.alibaba.fastjson.JSON;
import com.byteplus.model.live.v20200801.*;
import com.byteplus.service.BaseServiceImpl;
import lombok.Data;
import org.apache.http.HttpHost;

/**
 * Live Trait
 */
public class LiveTrait extends BaseServiceImpl {
    protected LiveTrait() {
        super(LiveConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), LiveConfig.apiInfoList);
    }

    protected LiveTrait(ServiceInfo serviceInfo) {
        super(serviceInfo, LiveConfig.apiInfoList);
    }
    
    protected LiveTrait(HttpHost proxy) {
        super(LiveConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), proxy, LiveConfig.apiInfoList);
    }

    @Data
    static public class ResponseModel {
        @JSONField(name = "ResponseMetadata")
        private ResponseMetadata responseMetadata;
    }

    private <T> T parseRawResponse(RawResponse rawResponse, Class<T> type) throws Exception {
        Exception ex = (rawResponse.getException());
        if (ex != null) {
            throw ex;
        }
        byte[] data = rawResponse.getData();
        if (data == null) {
            throw new Exception("null response body got, rawResponse:" + JSON.toJSONString(rawResponse));
        }

        ResponseModel resp = JSON.parseObject(data, ResponseModel.class);
        ResponseMetadata responseMetadata = resp.getResponseMetadata();
        if (responseMetadata == null) {
            return JSON.parseObject(data, type);
        }
        ResponseMetadata.Error err = responseMetadata.getError();
        if (err != null) {
            throw new Exception(String.format("API Error: LogID:%s ErrorCode:%s(%d) %s, rawResponse:%s",
                    resp.getResponseMetadata().getRequestId(),
                    err.getCode(), err.getCodeN(),
                    err.getMessage(),
                    JSON.toJSONString(rawResponse)
            ));
        }

        return JSON.parseObject(data, type);
    }


    /**
     * <p>listStorageSpace</p>
     * <p>ListStorageSpace</p>
     *

     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListStorageSpaceRes listStorageSpace(ListStorageSpaceBody body) throws Exception {
        RawResponse rawResponse = json("ListStorageSpace", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListStorageSpaceRes.class);
    }

    /**
     * <p>listStorageSpaceDetail</p>
     * <p>ListStorageSpaceDetail</p>
     *

     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListStorageSpaceDetailRes listStorageSpaceDetail(ListStorageSpaceDetailBody body) throws Exception {
        RawResponse rawResponse = json("ListStorageSpaceDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListStorageSpaceDetailRes.class);
    }

}
