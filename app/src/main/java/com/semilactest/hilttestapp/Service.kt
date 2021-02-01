package com.semilactest.hilttestapp

import android.util.Log

interface Service {

    val text: String

    fun level(clazz: Class<*>) = Log
        .d("HILT:${this.hashCode()}:${clazz.simpleName}", text)
}

class ApplicationService(override val text: String = "1") : Service

class ActivityService(override val text: String = "2") : Service

class FragmentService(override val text: String = "3") : Service

class ViewModelService(override val text: String = "4") : Service