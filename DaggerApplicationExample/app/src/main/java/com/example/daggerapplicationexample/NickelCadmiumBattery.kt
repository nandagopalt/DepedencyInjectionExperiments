package com.example.daggerapplicationexample

import android.util.Log
import javax.inject.Inject

class NickelCadmiumBattery @Inject constructor(): Battery {
    override fun getBatteryBooted() {
            Log.i("MYTAG", "Battery power booted !")
        }
}