package com.siddharth.githubapi.Util;

import com.siddharth.githubapi.Model.GithubUser;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubUserEndPoint {

    @GET("/users/{user}")
    Call<GithubUser> getUser(@Path("user") String user);
}

