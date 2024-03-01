package com.openlibrary.bookstore.mapper

import com.openlibrary.bookstore.model.BookModel
import com.openlibrary.bookstore.model.Work


fun Work.mapToDomainModel() : BookModel {
    return BookModel(
        id = this.key ?: "-1",
        title = this.title ?: "",
        subtitle = "",
        type = "Novel",
        price = "500",
        image = this.cover_edition_key.getCoverImage(),
        author = this.authors.joinToString()
    )
}


fun String.getCoverImage() = "https://covers.openlibrary.org/b/olid/$this-M.jpg"