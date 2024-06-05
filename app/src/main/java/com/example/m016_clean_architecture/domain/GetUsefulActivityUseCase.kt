package com.example.m016_clean_architecture.domain

import com.example.m016_clean_architecture.entity.UsefulActivity
import com.example.m016_clean_architecture.data.UsefulActivitiesRepository

class GetUsefulActivityUseCase (private val usefulActivitiesRepository: UsefulActivitiesRepository
) {
    suspend fun execute(): UsefulActivity {
        return usefulActivitiesRepository.getUsefulActivity()
    }
}