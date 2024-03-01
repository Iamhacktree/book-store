package com.openlibrary.bookstore.remote

import com.openlibrary.bookstore.model.NetworkLove
import retrofit2.Response
import retrofit2.http.GET

interface BookStoreApi {

    @GET("/subjects/love.json")
    suspend fun getAll(): Response<NetworkLove>

}