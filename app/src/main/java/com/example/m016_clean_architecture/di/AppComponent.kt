package com.example.m016_clean_architecture.di

import com.example.m016_clean_architecture.presentation.MainViewModelFactory
import dagger.Component


    @Component(
        modules = [DataModule::class,
            DomainModule::class,
            PresentationModule::class]
    )
    interface AppComponent {

        fun mainViewModelFactory(): MainViewModelFactory
    }
