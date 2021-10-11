package com.example.daggerapplicationexample

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(var serviceProvider: ServiceProvider) {

    fun getServiceConnected() {
        Log.i("MYTAG", "Service in the simcard is connected !")
    }
}