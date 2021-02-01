package com.semilactest.hilttestapp.di

import com.semilactest.hilttestapp.FragmentService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

@Module
@InstallIn(
    FragmentComponent::class
)
class FragmentModule {

    @Provides
    @FragmentScoped
    fun provideAntService(): FragmentService = FragmentService()
}