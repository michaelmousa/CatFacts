package com.treehouse.CatFacts.di


import com.treehouse.CatFacts.network.popServices
import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton
interface AppComponent {
    fun popService(): popServices
}