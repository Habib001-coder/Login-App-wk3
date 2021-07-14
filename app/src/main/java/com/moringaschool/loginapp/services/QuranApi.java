package com.moringaschool.loginapp.services;

import com.moringaschool.loginapp.models.Chapters;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface QuranApi {
    @GET("Chapters")
    Call<Chapters> getChapters(
            @Query("language") String myAPIKey

    );
}


