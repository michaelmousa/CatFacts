package com.treehouse.randomjoke.ui.home.di

import com.treehouse.randomjoke.di.AppComponent
import com.treehouse.randomjoke.ui.home.MainActivity
import dagger.Component

@Component(dependencies = [AppComponent::class], modules = [HomeModule::class])
@HomeScope
interface HomeComponent {
    fun inject(mainActivity: MainActivity)
}