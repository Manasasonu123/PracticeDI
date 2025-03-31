package com.example.diexample1

import android.app.Application

class UserApplication:Application() {
    lateinit var appcomponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appcomponent=DaggerAppComponent.builder().build()
    }
}