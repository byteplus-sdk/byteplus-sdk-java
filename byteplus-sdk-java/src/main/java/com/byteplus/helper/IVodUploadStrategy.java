package com.byteplus.helper;

import com.github.rholder.retry.Retryer;
import com.byteplus.service.vod.impl.VodServiceImpl;
import com.byteplus.service.vod.model.business.VodHeaderPair;

import java.io.File;
import java.util.List;

public interface IVodUploadStrategy {

    void directUpload(VodServiceImpl vodService, String host, String oid, String auth, List<VodHeaderPair> uploadHeaderList, File file, Retryer retryer, int storageClass, com.byteplus.helper.VodUploadProgressListener listener) throws Exception;

    void chunkUpload(VodServiceImpl vodService, String host, String oid, String auth, List<com.byteplus.service.vod.model.business.VodHeaderPair> uploadHeaderList, File file, boolean isLargeFile, Retryer retryer, int storageClass, com.byteplus.helper.VodUploadProgressListener listener) throws Exception;

}
