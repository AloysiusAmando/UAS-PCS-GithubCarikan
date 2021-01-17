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
    @Headers("Authorization: token 914fba1154be17e8d11e4feaef615734fb9e74a6")
    fun getSearchUsers(
        @Query("q") query: String
    ) : Call<UserResponse>

    @GET("users/{username}")
    @Headers ("Authorization: token 914fba1154be17e8d11e4feaef615734fb9e74a6")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 914fba1154be17e8d11e4feaef615734fb9e74a6")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 914fba1154be17e8d11e4feaef615734fb9e74a6")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}