package com.semilactest.hilttestapp.di

import com.semilactest.hilttestapp.ActivityService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(
    ActivityComponent::class
)
class ActivityModule {

    @Provides
    @ActivityScoped
    fun provideFishService(): ActivityService = ActivityService()
}