package com.example.imaginamos_2.marvelaplication.models;

import com.google.gson.annotations.SerializedName;

public class Response<O> {
    @SerializedName("code")
    private Integer code;
    @SerializedName("status")
    private String status;
    @SerializedName("attributionHTML")
    private String attributionHTML;
    @SerializedName("data")
    private MarvelList<Object> data;

    public Response(Integer code, String status, String attributionHTML, MarvelList<Object> data) {
        this.code = code;
        this.status = status;
        this.attributionHTML = attributionHTML;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }

    public MarvelList<Object> getData() {
        return data;
    }

    public void setData(MarvelList<Object> data) {
        this.data = data;
    }
}
