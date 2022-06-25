package com.example.custombuttons;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceholder {
    @GET("all")
    Call<List<Post>> getPost();
}
