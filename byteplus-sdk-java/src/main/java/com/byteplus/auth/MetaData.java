package com.byteplus.auth;

import lombok.Data;

@Data
public class MetaData {
    private String algorithm;
    private String credentialScope;
    private String signedHeaders;
    private String date;
    private String region;
    private String service;
}
