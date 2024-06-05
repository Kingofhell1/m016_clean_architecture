package com.example.m016_clean_architecture.di

import com.example.m016_clean_architecture.data.UsefulActivitiesRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideUsefulActivitiesRepository() : UsefulActivitiesRepository {
        return UsefulActivitiesRepository()
    }


}