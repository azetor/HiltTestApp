package com.semilactest.hilttestapp

import android.util.Log
import androidx.multidex.MultiDexApplication
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MainApplication : MultiDexApplication() {

    @Inject lateinit var applicationService: ApplicationService
    // not working is from the lower part of the dependencies graph
//    @Inject lateinit var activityService: ActivityService

    override fun onCreate() {
        super.onCreate()

        this::class.java
            .let {
                Log.d("HILT", "--- APPLICATION ---")
                applicationService.level(it)
                Log.d("HILT", "--- APPLICATION ---")
            }
    }
}