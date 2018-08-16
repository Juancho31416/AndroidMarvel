package com.example.imaginamos_2.marvelaplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class series {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;

    @SerializedName("startYear")
    @Expose
    private int startYear;

    @SerializedName("endYear")
    @Expose
    private int endYear;

    @SerializedName("rating")
    @Expose
    private String rating;

    @SerializedName("modified")
    @Expose
    private Date modified;


    public series(int id, String title, String description, String resourceURI, int startYear, int endYear, String rating, Date modified) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.resourceURI = resourceURI;
        this.startYear = startYear;
        this.endYear = endYear;
        this.rating = rating;
        this.modified = modified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
