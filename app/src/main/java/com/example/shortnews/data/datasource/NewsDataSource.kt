package com.example.shortnews.data.datasource

import com.example.shortnews.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {
    suspend fun getNewsHeadline(
        country: String
    ): Response<NewsResponse>
}