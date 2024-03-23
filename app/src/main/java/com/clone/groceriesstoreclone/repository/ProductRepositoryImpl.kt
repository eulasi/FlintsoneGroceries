package com.clone.groceriesstoreclone.repository

import com.clone.groceriesstoreclone.model.Category
import com.clone.groceriesstoreclone.model.Product
import com.clone.groceriesstoreclone.network.ApiService

class ProductRepositoryImpl(private val apiService: ApiService): ProductRepository {
    override suspend fun getProducts(): List<Product> {
        return apiService.getProducts()
    }

    override suspend fun getCategories(): List<Category> {
        return apiService.getCategories()
    }
}