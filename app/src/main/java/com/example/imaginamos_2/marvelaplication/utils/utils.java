package com.example.imaginamos_2.marvelaplication.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class utils {

    private static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ssZ";

    public static String parseDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat(DATE_PATTERN);
        return format.format(date);
    }
}
