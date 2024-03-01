package com.openlibrary.bookstore

import com.openlibrary.bookstore.model.BookModel
import kotlinx.coroutines.flow.Flow

interface HomeUseCase {
    operator fun invoke() : Flow<List<BookModel>>
}