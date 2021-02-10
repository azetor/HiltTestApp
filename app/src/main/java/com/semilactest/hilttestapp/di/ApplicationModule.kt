package com.semilactest.hilttestapp.di

import android.content.Context
import com.semilactest.hilttestapp.ApplicationService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(
    SingletonComponent::class
)
class ApplicationModule {

    @Provides
    @Singleton
    fun provideDogoService(
        @ApplicationContext context: Context
    ): ApplicationService = ApplicationService(context)
}