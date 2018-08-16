package com.example.imaginamos_2.marvelaplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class textObject {

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("language")
    @Expose
    private String language;

    @SerializedName("text")
    @Expose
    private String text;

    public textObject(String type, String language, String text) {
        this.type = type;
        this.language = language;
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
