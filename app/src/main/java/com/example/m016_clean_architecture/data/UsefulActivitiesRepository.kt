package com.example.m016_clean_architecture.data

import android.util.Log
import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import com.example.m016_clean_architecture.entity.UsefulActivity
import retrofit2.converter.moshi.MoshiConverterFactory

private const val BASE_URL = "http://www.boredapi.com/api/"

class UsefulActivitiesRepository () {

    private val moshi =
        Moshi.Builder().addLast(com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory())
            .build()
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()
// Функция запроса данных из сети и запись их в интерфейс
    suspend fun getUsefulActivity(): UsefulActivity {
        val getUsefulActivity: GetUsefulActivity = retrofit.create(GetUsefulActivity::class.java)
        val usefulActivity = UsefulActivityDto(
            getUsefulActivity.getUsefulActivity().body()?.activity,
            getUsefulActivity.getUsefulActivity().body()?.type,
            getUsefulActivity.getUsefulActivity().body()?.participants,
            getUsefulActivity.getUsefulActivity().body()?.price,
            getUsefulActivity.getUsefulActivity().body()?.link,
            getUsefulActivity.getUsefulActivity().body()?.key,
            getUsefulActivity.getUsefulActivity().body()?.accessibility
        )
        Log.d("Interface:", usefulActivity.activity.toString())
        Log.d("Interface:", usefulActivity.toString())
        return usefulActivity
    }
}