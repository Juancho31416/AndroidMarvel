package com.example.imaginamos_2.marvelaplication.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import com.example.imaginamos_2.marvelaplication.models.*;

public interface apiInterface {

    @GET("characters")
    Call<Response> getCharacters(@Query("apikey") String apiKey,@Query("hash") String hash,@Query("ts") String ts);

    @GET("comics")
    Call<Response> getComics(@Query("apikey") String apiKey,@Query("hash") String hash,@Query("ts") String ts);

    @GET("creators")
    Call<Response> getCreators(@Query("apikey") String apiKey,@Query("hash") String hash,@Query("ts") String ts);

    @GET("series")
    Call<Response> getSeries(@Query("apikey") String apiKey,@Query("hash") String hash,@Query("ts") String ts);

    @GET("events")
    Call<Response> getEvents(@Query("apikey") String apiKey,@Query("hash") String hash,@Query("ts") String ts);

    @GET("stories")
    Call<Response> getStories(@Query("apikey") String apiKey,@Query("hash") String hash,@Query("ts") String ts);


    @GET("characters/{characterID}")
    Call<Response> getCharacterID(@Query("apikey") String apiKey,@Query("hash") String hash,@Query("ts") String ts);

    @GET("comics/{comicID}")
    Call<Response> getComicID(@Query("apikey") String apiKey,@Query("hash") String hash,@Query("ts") String ts);

    @GET("creators/{creatorID}")
    Call<Response> getCreatorID(@Query("apikey") String apiKey,@Query("hash") String hash,@Query("ts") String ts);

    @GET("series/{seriesID}")
    Call<Response> getSeriesID(@Query("apikey") String apiKey,@Query("hash") String hash,@Query("ts") String ts);

    @GET("events/{eventID}")
    Call<Response> getEventID(@Query("apikey") String apiKey,@Query("hash") String hash,@Query("ts") String ts);

    @GET("stories/{storyID}")
    Call<Response> getStorieID(@Query("apikey") String apiKey,@Query("hash") String hash,@Query("ts") String ts);

}
