package com.example.imaginamos_2.marvelaplication.utils;

import com.example.imaginamos_2.marvelaplication.service.apiInterface;
import com.example.imaginamos_2.marvelaplication.service.serviceGenerator;


public class apiUtils {

    public static final String BASE_URL = "https://gateway.marvel.com:443/v1/public/";

    public static apiInterface getService() {
        apiInterface generate = serviceGenerator.getClient(BASE_URL).create(apiInterface.class); 
        return  generate;
    }


}
