package com.treehouse.randomjoke.ui.home.di

import com.treehouse.randomjoke.network.popServices
import com.treehouse.randomjoke.ui.home.HomeContract
import com.treehouse.randomjoke.ui.home.HomePresenter
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