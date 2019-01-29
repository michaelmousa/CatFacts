package com.treehouse.CatFacts.ui.home

import com.treehouse.CatFacts.model.ArrResponse
import com.treehouse.CatFacts.network.popServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomePresenter (private val popServices: popServices,
                     private val view: HomeContract.View
) : HomeContract.Presenter
{
    override fun getRandomDetails(
        _id: String,
        __v: String,
        text: String,
        updatedAt: String,
        deleted: String,
        source: String,
        used: String
    ) {


    popServices.getRandomDetails("",12).enqueue(object : Callback<List<ArrResponse>>

    {
        override fun onFailure(call: Call<List<ArrResponse>>, t: Throwable) {
            view.showError("Please try again")

        }


        override fun onResponse(call: Call<List<ArrResponse>>, response: Response<List<ArrResponse>>) {

            if (response.isSuccessful) {
                view.showResults(response.body()?: emptyList())
            } else {
                view.showError("An unknown error occurred")
            }

        }
    })
    }}


