package com.example.m016_clean_architecture.data

import retrofit2.Response
import retrofit2.http.GET
// Предоставляем ответ от сервера
interface GetUsefulActivity {
    @GET("activity/")
    suspend fun getUsefulActivity(): Response<UsefulActivityDto>
}