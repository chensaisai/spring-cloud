package com.ys.api.utils;

import java.io.Serializable;

/**
 * @author: saisai
 * @Date: 2018/11/20 11:13
 */
public class BaseRequest<T> implements Serializable {

    private String extendData;

    private T rawData;

    public T getRawData() {
        return rawData;
    }
    public void setRawData(T rawData) {
        this.rawData = rawData;
    }

    public String getExtendData() {
        return extendData;
    }
    public void setExtendData(String extendData) {
        this.extendData = extendData;
    }

}
