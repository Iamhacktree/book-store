package com.openlibrary.bookstore

import com.openlibrary.bookstore.model.NetworkLove

interface HomeRepository {
    suspend fun getAll(): NetworkLove
}