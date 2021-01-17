package com.app.githubcarikan.api

import com.app.githubcarikan.data.model.DetailUserResponse
import com.app.githubcarikan.data.model.User
import com.app.githubcarikan.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 687a155f2679f01c4c19dafc5011ca87c96c41c7")
    fun getSearchUsers(
        @Query("q") query: String
    ) : Call<UserResponse>

    @GET("users/{username}")
    @Headers ("Authorization: token 687a155f2679f01c4c19dafc5011ca87c96c41c7")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 687a155f2679f01c4c19dafc5011ca87c96c41c7")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 687a155f2679f01c4c19dafc5011ca87c96c41c7")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}