package com.example.m016_clean_architecture.di

import com.example.m016_clean_architecture.domain.GetUsefulActivityUseCase
import com.example.m016_clean_architecture.presentation.MainViewModel
import com.example.m016_clean_architecture.presentation.MainViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class PresentationModule {

    @Provides
    fun provideMainViewModel(getUsefulActivityUseCase: GetUsefulActivityUseCase): MainViewModel {
        return MainViewModel(getUsefulActivityUseCase)
    }

    @Provides
    fun provideMainViewModelFactory(mainViewModel: MainViewModel): MainViewModelFactory {
        return MainViewModelFactory(mainViewModel)
    }


}