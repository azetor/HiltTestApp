package com.semilactest.hilttestapp

import android.content.Context
import android.util.Log

interface Service {

    val text: String

    fun level(clazz: Class<*>) = log(clazz, text)

    fun log(clazz: Class<*>, message: String) = Log
        .d("HILT:${this.hashCode()}:${clazz.simpleName}", message)
}

class ApplicationService(
    context: Context,
    override val text: String = "1"
) : Service {

    init {
        Log.d("HILT", "--- ApplicationService ---")
        log(this::class.java, "CONTEXT=${context.hashCode()}")
        Log.d("HILT", "--- ApplicationService ---")
    }
}

class ActivityService(override val text: String = "2") : Service

class FragmentService(override val text: String = "3") : Service

class ViewModelService(override val text: String = "4") : Service