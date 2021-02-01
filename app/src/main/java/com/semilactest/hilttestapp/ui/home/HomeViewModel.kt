package com.semilactest.hilttestapp.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semilactest.hilttestapp.ViewModelService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {

    @Inject lateinit var viewModelService: ViewModelService

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    fun sound() {
        this::class.java
            .let {
                Log.d("HILT", "--- VIEW MODEL ---")
                viewModelService.level(it)
                Log.d("HILT", "--- VIEW MODEL ---")
            }
    }
}