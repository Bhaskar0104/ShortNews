package com.example.shortnews.data.api

import com.example.shortnews.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") moshi: String = "9f4337f12cea4f4d99e3642e83a8ecf6"
    ): Response<NewsResponse>
}