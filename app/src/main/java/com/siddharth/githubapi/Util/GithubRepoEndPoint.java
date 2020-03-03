package com.siddharth.githubapi.Util;

import com.siddharth.githubapi.Model.GithubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubRepoEndPoint {

    @GET("/users/{user}/repos")
    Call<List<GithubRepo>> getRepo(@Path("user") String name);

}

