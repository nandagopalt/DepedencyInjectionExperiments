package com.example.daggerapplicationexample

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SmartPhoneComponent {

    //fun getSmartPhoneComponent(): SmartPhone
    fun inject(mainActivity: MainActivity)
}