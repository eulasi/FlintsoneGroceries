package com.clone.groceriesstoreclone.network

import com.clone.groceriesstoreclone.model.Category
import com.clone.groceriesstoreclone.model.Product
import retrofit2.http.GET

interface ApiService {
    @GET("https://run.mocky.io/v3/5e9207a6-7dee-49a8-bcda-6933608e0335")
    suspend fun getProducts(): List<Product>

    @GET("https://run.mocky.io/v3/e36d1085-0abd-4a34-9e6b-dcc64e120641")
    suspend fun getCategories(): List<Category>
}