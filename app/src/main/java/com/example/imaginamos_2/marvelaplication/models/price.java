package com.example.imaginamos_2.marvelaplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class price {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("price")
    @Expose
    private String price;

    public price(String type, String price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
