package com.example.daggerapplicationexample

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NCBatteryModule {

   /* @Provides
    fun providesBatteryInstance(): Battery {
        return NickelCadmiumBattery()
    }*/

    /*@Provides
    fun providesBatteryInstance(nickelCadmiumBattery: NickelCadmiumBattery): Battery {
        return nickelCadmiumBattery
    }*/

    @Binds
    abstract fun bindBatteryInstance(nickelCadmiumBattery: NickelCadmiumBattery): Battery
}