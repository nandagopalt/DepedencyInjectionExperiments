package com.example.daggerapplicationexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SmartPhone @Inject constructor(
    private val battery: Battery,
    private val memoryCard: MemoryCard,
    private val simCard: SimCard) {
    init {
        battery.getBatteryBooted()
        memoryCard.getMemoryStorage()
        simCard.getServiceConnected()
        Log.i("MYTAG", "SmartPhone Constructed !")
    }

    fun makeCallWithRecording() {
        Log.i("MYTAG", "Calling...")
    }
}