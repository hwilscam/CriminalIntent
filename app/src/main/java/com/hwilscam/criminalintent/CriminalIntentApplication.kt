package com.hwilscam.criminalintent

import android.app.Application

class CriminalIntentApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)


    }

}