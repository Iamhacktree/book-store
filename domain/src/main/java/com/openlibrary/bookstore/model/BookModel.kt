package com.openlibrary.bookstore.model


data class BookModel(
    val id: String,
    val title: String,
    val subtitle: String,
    val type: String,
    val price: String,
    val image: String,
    val author: String,
    var qty: Long? = 1L
)
