package com.wigroup.weatherapp

import android.app.Application
import com.wigroup.weatherapp.di.ApplicationComponent
import com.wigroup.weatherapp.di.DaggerApplicationComponent

class WeatherApp : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}