package com.clone.groceriesstoreclone.repository

import com.clone.groceriesstoreclone.model.Category
import com.clone.groceriesstoreclone.model.Product

interface ProductRepository {
    suspend fun getProducts(): List<Product>
    suspend fun getCategories(): List<Category>
}