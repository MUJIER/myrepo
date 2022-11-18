package com.huawei.utils;

public class StringUtils extends org.apache.commons.lang3.StringUtils{

    public static boolean isNotNull(Object object) {
        return !isNull(object);
    }

    public static boolean isNull(Object object)
    {
        return object == null;
    }
}
