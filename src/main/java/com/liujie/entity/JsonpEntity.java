package com.liujie.entity;

/**
 * 封装返回数据
 * Created by Administrator on 2016-12-12.
 */
public class JsonpEntity {

    private String callback;//回调方法名

    public String returnJsonpData(String returnData) {
        return callback + "('" + returnData + "')";
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
