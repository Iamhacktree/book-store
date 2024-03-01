package com.openlibrary.bookstore

import com.openlibrary.bookstore.model.NetworkLove
import com.openlibrary.bookstore.remote.BookStoreApi
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(private val api: BookStoreApi) : HomeRepository {

    override suspend fun getAll(): NetworkLove {
        return api.getAll().body()!!
    }
}