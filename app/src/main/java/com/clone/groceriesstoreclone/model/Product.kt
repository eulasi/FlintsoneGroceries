package com.clone.groceriesstoreclone.model

data class Product (
    val id: String,
    val name: String,
    val price: Double,
    val image: String,
    val description: String,
    val category: String
)