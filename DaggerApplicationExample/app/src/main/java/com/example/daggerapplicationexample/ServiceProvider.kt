package com.example.daggerapplicationexample

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    init {
        getServiceProvider()
    }

    fun getServiceProvider(){
        Log.i("MYTAG", "Service provider connected !")
    }
}