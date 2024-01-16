package com.byteplus.helper;

public class VodUploadProgressListenerHelper {
    public static void sendVodUploadEvent(com.byteplus.helper.VodUploadProgressListener listener, VodUploadProgressEventType eventType, long bytesSize) {
        if (listener != null) {
            listener.progressChanged(new VodUploadProgressEvent(eventType, bytesSize));
        }
    }
}
