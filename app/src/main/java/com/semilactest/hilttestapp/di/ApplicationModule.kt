package com.semilactest.hilttestapp.di

import com.semilactest.hilttestapp.ApplicationService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(
    SingletonComponent::class
)
class ApplicationModule {

    @Provides
    @Singleton
    fun provideDogoService(): ApplicationService = ApplicationService()
}