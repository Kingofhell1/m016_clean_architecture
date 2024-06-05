package com.example.m016_clean_architecture.di

import com.example.m016_clean_architecture.data.UsefulActivitiesRepository
import com.example.m016_clean_architecture.domain.GetUsefulActivityUseCase
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideGetUsefulActivityUseCase(usefulActivitiesRepository: UsefulActivitiesRepository)
            : GetUsefulActivityUseCase {
        return GetUsefulActivityUseCase(usefulActivitiesRepository)
    }
}