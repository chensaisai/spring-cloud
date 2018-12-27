package com.ys.api.utils;

import java.io.Serializable;


/**
 * @author: saisai
 * @Date: 2018/11/20 11:13
 */
public class BaseResponse<T> implements Serializable{

    private boolean ifSuccess;
    private String msgCode;
    private String msgContent;
    private String extendData;

    private T rawData;

    public T getRawData() {
        return rawData;
    }
    public void setRawData(T rawData) {
        this.rawData = rawData;
    }

    public boolean getSuccess() {
        return ifSuccess;
    }
    public void setSuccess(boolean success) {
        ifSuccess = success;
    }

    public String getMsgCode() {
        return msgCode;
    }
    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsgContent() {
        return msgContent;
    }
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getExtendData() {
        return extendData;
    }
    public void setExtendData(String extendData) {
        this.extendData = extendData;
    }


}
