package com.example.diexample1

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getAnalyticsServeice():AnalyticsService{
        return MixPanel()
    }
}