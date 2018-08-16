package com.example.imaginamos_2.marvelaplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class storyList {
    @SerializedName("available")
    @Expose
    private int available;

    @SerializedName("returned")
    @Expose
    private int returned;

    @SerializedName("collectionURI")
    @Expose
    private String collectionURI;

    @SerializedName("items")
    @Expose
    private List<storySummary> items;

    public storyList(int available, int returned, String collectionURI, List<storySummary> items) {
        this.available = available;
        this.returned = returned;
        this.collectionURI = collectionURI;
        this.items = items;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getReturned() {
        return returned;
    }

    public void setReturned(int returned) {
        this.returned = returned;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public List<storySummary> getItems() {
        return items;
    }

    public void setItems(List<storySummary> items) {
        this.items = items;
    }
}
