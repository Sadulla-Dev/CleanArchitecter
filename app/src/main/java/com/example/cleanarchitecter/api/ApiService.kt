package com.example.cleanarchitecter.api

import com.example.cleanarchitecter.model.ResponseApi
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET
     suspend fun getAllCharacters(
        @Query("page") page: Int
     ): Response<ResponseApi>
}