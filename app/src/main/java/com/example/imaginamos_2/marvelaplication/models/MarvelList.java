package com.example.imaginamos_2.marvelaplication.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MarvelList<O> {
    @SerializedName("offset")
    private int offset;
    @SerializedName("limit")
    private  int limit;
    @SerializedName("total")
    private int total;
    @SerializedName("count")
    private int count;
    @SerializedName("results")
    private List<Object> results;

    public MarvelList(int offset, int limit, int total, int count, List<Object> results) {
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.count = count;
        this.results = results;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Object> getResults() {
        return results;
    }

    public void setResults(List<Object> results) {
        this.results = results;
    }
}
