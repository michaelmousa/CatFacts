package com.treehouse.CatFacts.ui.home

import com.treehouse.CatFacts.model.ArrResponse


interface HomeContract{

    interface View {
        fun showResults(result: List<ArrResponse>)
        fun showError(massege: String)
    }
    interface Presenter{
        fun getRandomDetails(_id:String, __v:String, text: String, updatedAt:String, deleted:String, source:String, used:String)

        //fun getRandomDetails(icon_url:String, id:String, value:String, url: String)
    }
}

