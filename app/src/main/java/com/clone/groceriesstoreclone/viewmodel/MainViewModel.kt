package com.clone.groceriesstoreclone.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.clone.groceriesstoreclone.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: ProductRepository
) : ViewModel() {
    val products = liveData {
        val data = repository.getProducts()
        emit(data)
    }

    val categories = liveData {
        val data = repository.getCategories()
        emit(data)
    }
}