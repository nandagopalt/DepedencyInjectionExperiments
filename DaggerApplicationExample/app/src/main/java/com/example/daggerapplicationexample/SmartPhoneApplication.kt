package com.example.daggerapplicationexample

import android.app.Application

class SmartPhoneApplication: Application() {
    lateinit var smartPhoneComponent: SmartPhoneComponent
    override fun onCreate() {
        super.onCreate()
        smartPhoneComponent = initDaggerComponent()
    }

    private fun initDaggerComponent(): SmartPhoneComponent =
        DaggerSmartPhoneComponent.builder().memoryCardModule(MemoryCardModule(500)).build()
    }
