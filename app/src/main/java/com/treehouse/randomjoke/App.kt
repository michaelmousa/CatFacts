package com.treehouse.randomjoke

import android.app.Application
import com.treehouse.randomjoke.di.AppComponent
import com.treehouse.randomjoke.di.DaggerAppComponent

class App : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .build();
    }

    fun getComponent() = appComponent
}