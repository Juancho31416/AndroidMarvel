package com.example.imaginamos_2.marvelaplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class eventSummary {
    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;

    @SerializedName("name")
    @Expose
    private String name;

    public eventSummary(String resourceURI, String name) {
        this.resourceURI = resourceURI;
        this.name = name;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
