package com.treehouse.CatFacts.ui.home.di

import com.treehouse.CatFacts.di.AppComponent
import com.treehouse.CatFacts.ui.home.MainActivity
import dagger.Component

@Component(dependencies = [AppComponent::class], modules = [HomeModule::class])
@HomeScope
interface HomeComponent {
    fun inject(mainActivity: MainActivity)
}