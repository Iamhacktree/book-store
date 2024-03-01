package com.openlibrary.bookstore

import com.openlibrary.bookstore.mapper.mapToDomainModel
import com.openlibrary.bookstore.model.BookModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class HomeUseCaseImpl @Inject constructor(private val repository: HomeRepository) : HomeUseCase {

    override fun invoke(): Flow<List<BookModel>> = flow {
        emit(
            repository.getAll().works.map {
                it.mapToDomainModel()
            }
        )
    }
}