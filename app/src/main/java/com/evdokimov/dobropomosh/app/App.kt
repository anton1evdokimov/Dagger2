package com.evdokimov.dobropomosh

import android.app.Application
import com.evdokimov.dobropomosh.di.AppComponent

class App() : Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
//        appComponent = DaggerAppC
    }
}