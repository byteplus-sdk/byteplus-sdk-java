package com.byteplus.util;

import org.apache.http.NameValuePair;

import java.util.Comparator;


public enum  NameValueComparator implements Comparator<NameValuePair> {
    INSTANCE;

    private final static boolean NULL_FIRST = false;

    @Override
    public int compare(NameValuePair o1, NameValuePair o2) {
        if (o1.getName() == null) {
            return (o2.getName() == null) ? 0 : (NULL_FIRST ? -1 : 1);
        } else if (o2.getName() == null) {
            return NULL_FIRST ? 1: -1;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
