package com.example.jokes.rest

import retrofit2.http.GET

interface NetworkAPI {

    @GET()
    fun jokesRandom():


}