package com.example.imaginamos_2.marvelaplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class characters {

    public characters(Integer id, String name, String description, Date modified, String resourceURI, List<url> urls, Image thumbnail, comicList comics, storyList stories, eventList events, seriesList series) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.modified = modified;
        this.resourceURI = resourceURI;
        this.urls = urls;
        this.thumbnail = thumbnail;
        this.comics = comics;
        this.stories = stories;
        this.events = events;
        this.series = series;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public List<url> getUrls() {
        return urls;
    }

    public void setUrls(List<url> urls) {
        this.urls = urls;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    public comicList getComics() {
        return comics;
    }

    public void setComics(comicList comics) {
        this.comics = comics;
    }

    public storyList getStories() {
        return stories;
    }

    public void setStories(storyList stories) {
        this.stories = stories;
    }

    public eventList getEvents() {
        return events;
    }

    public void setEvents(eventList events) {
        this.events = events;
    }

    public seriesList getSeries() {
        return series;
    }

    public void setSeries(seriesList series) {
        this.series = series;
    }

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("modified")
    @Expose
    private Date modified;


    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;

    @SerializedName("urls")
    @Expose
    private List<url> urls;

    @SerializedName("thumbnail")
    @Expose
    private Image thumbnail;

    @SerializedName("comics")
    @Expose
    private comicList comics;

    @SerializedName("stories")
    @Expose
    private storyList stories;

    @SerializedName("events")
    @Expose
    private eventList events;

    @SerializedName("series")
    @Expose
    private seriesList series;

}
