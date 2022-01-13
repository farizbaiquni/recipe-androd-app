package com.example.recipe_app_jetpack_compose.network.response

import com.example.recipe_app_jetpack_compose.network.RecipeDto
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RecipeService {

    @GET("search")
    suspend fun search(
        @Header("Authorization") token: String,
        @Query("page") page: String,
        @Query("query") query: String,
    ): RecipeResponses

    @GET("get")
    suspend fun get(
        @Header("Authorization") token: String,
        @Query("id") id: String,
    ): RecipeDto

}