package com.treehouse.CatFacts.network

import com.treehouse.CatFacts.model.ArrResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface popServices {

    @GET(END_POINT)

fun getRandomDetails(@Query("animal") animal: String,
                     @Query("amount") amount: Int):Call<List<ArrResponse>>
}