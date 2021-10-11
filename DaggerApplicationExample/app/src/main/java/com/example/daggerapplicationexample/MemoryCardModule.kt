package com.example.daggerapplicationexample

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val memorySize: Int) {
    @Provides
    fun providesMemoryCardInstance(): MemoryCard {
        Log.i("MYTAG", "Size of Memory $memorySize")
        return MemoryCard()
    }
}