package com.semilactest.hilttestapp.di

import com.semilactest.hilttestapp.ViewModelService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(
    ViewModelComponent::class
)
class ViewModelModel {

    @Provides
    @ViewModelScoped
    fun provideViewModelService(): ViewModelService = ViewModelService()
}