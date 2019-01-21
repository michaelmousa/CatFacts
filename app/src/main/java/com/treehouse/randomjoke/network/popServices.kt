package com.treehouse.randomjoke.network

import retrofit2.Call
import retrofit2.http.GET

interface popServices {

    @GET(END_POINT)
    fun getRandomDetails(): Call<com.treehouse.randomjoke.model.Response>
}