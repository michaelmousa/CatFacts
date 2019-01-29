package com.treehouse.CatFacts

import android.app.Application
import com.treehouse.CatFacts.di.AppComponent
import com.treehouse.CatFacts.di.DaggerAppComponent

class App : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .build();
    }

    fun getComponent() = appComponent
}