package com.treehouse.CatFacts.ui.home.di

import com.treehouse.CatFacts.network.popServices
import com.treehouse.CatFacts.ui.home.HomeContract
import com.treehouse.CatFacts.ui.home.HomePresenter
import dagger.Module
import dagger.Provides

@Module
class HomeModule(private val view: HomeContract.View) {


    @HomeScope
    @Provides
    fun provideHomePresenter(popServices: popServices)
            : HomeContract.Presenter {
        return HomePresenter(popServices, view)
    }
}