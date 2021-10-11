package com.example.daggerapplicationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val battery = Battery()
        val serviceProvider = ServiceProvider()
        val simCard = SimCard(serviceProvider)
        val memoryCard = MemoryCard()
        smartPhone = SmartPhone(battery, memoryCard, simCard)*/

        /*smartPhone = SmartPhone(Battery(), MemoryCard(), SimCard(ServiceProvider()))
        smartPhone.makeCallWithRecording()*/

        //smartPhone = DaggerSmartPhoneComponent.create().getSmartPhoneComponent()
        //DaggerSmartPhoneComponent.create().inject(this)
        //DaggerSmartPhoneComponent.builder().memoryCardModule(MemoryCardModule(500)).build().inject(this)
        (application as SmartPhoneApplication).smartPhoneComponent.inject(this)
        smartPhone.makeCallWithRecording()
    }
}