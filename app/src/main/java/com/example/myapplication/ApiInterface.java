package com.example.myapplication;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by DieHard_04 on 03-04-2021.
 */
public interface ApiInterface {

    @GET("/all")
    Call<JsonObject> doGetListResources();
}
