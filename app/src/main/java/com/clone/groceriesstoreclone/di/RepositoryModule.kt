package com.clone.groceriesstoreclone.di

import com.clone.groceriesstoreclone.network.ApiService
import com.clone.groceriesstoreclone.repository.ProductRepository
import com.clone.groceriesstoreclone.repository.ProductRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun provideProductRepository(apiService: ApiService): ProductRepository =
        ProductRepositoryImpl(apiService)
}