package com.example.imaginamos_2.marvelaplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class stories {

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

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("modified")
    @Expose
    private Date modified;

    @SerializedName("thumbnail")
    @Expose
    private thumbnail thumbnail;

    @SerializedName("comics")
    @Expose
    private comicList comics;

    @SerializedName("series")
    @Expose
    private seriesList series;

    @SerializedName("events")
    @Expose
    private eventList events;

    @SerializedName("characters")
    @Expose
    private characterList characters;

    @SerializedName("creators")
    @Expose
    private creatorList creators;

    @SerializedName("originalIssue")
    @Expose
    private comicSummary originalIssue;

    public stories(int id, String title, String description, String resourceURI, String type, Date modified, com.example.imaginamos_2.marvelaplication.models.thumbnail thumbnail, comicList comics, seriesList series, eventList events, characterList characters, creatorList creators, comicSummary originalIssue) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.resourceURI = resourceURI;
        this.type = type;
        this.modified = modified;
        this.thumbnail = thumbnail;
        this.comics = comics;
        this.series = series;
        this.events = events;
        this.characters = characters;
        this.creators = creators;
        this.originalIssue = originalIssue;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public com.example.imaginamos_2.marvelaplication.models.thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(com.example.imaginamos_2.marvelaplication.models.thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public comicList getComics() {
        return comics;
    }

    public void setComics(comicList comics) {
        this.comics = comics;
    }

    public seriesList getSeries() {
        return series;
    }

    public void setSeries(seriesList series) {
        this.series = series;
    }

    public eventList getEvents() {
        return events;
    }

    public void setEvents(eventList events) {
        this.events = events;
    }

    public characterList getCharacters() {
        return characters;
    }

    public void setCharacters(characterList characters) {
        this.characters = characters;
    }

    public creatorList getCreators() {
        return creators;
    }

    public void setCreators(creatorList creators) {
        this.creators = creators;
    }

    public comicSummary getOriginalIssue() {
        return originalIssue;
    }

    public void setOriginalIssue(comicSummary originalIssue) {
        this.originalIssue = originalIssue;
    }
}
