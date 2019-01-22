package com.treehouse.randomjoke.di


import com.treehouse.randomjoke.network.popServices
import com.treehouse.randomjoke.ui.home.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton
interface AppComponent {
    fun popService(): popServices
}