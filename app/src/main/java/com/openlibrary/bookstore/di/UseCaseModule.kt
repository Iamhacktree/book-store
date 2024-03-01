package com.openlibrary.bookstore.di

import com.openlibrary.bookstore.HomeUseCase
import com.openlibrary.bookstore.HomeUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
interface UseCaseModule {

    @Binds
    fun bindHomeUseCase(impl: HomeUseCaseImpl): HomeUseCase
}