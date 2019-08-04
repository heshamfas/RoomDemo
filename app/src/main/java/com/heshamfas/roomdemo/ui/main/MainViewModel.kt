package com.heshamfas.roomdemo.ui.main

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.heshamfas.roomdemo.Product
import com.heshamfas.roomdemo.ProductRepository

class MainViewModel(application: Application) : AndroidViewModel(application) {
    // TODO: Implement the ViewModel
    private val repository: ProductRepository = ProductRepository(application)
    private val allProducts: LiveData<List<Product>>?
    private val searchResults:MutableLiveData<List<Product>>

    init {
        allProducts = repository.allProducts
        searchResults = repository.searchResults
    }

    fun insertProdcut(name:String){
        repository.findProduct(name)
    }
    fun deleteProduct(name:String){
        repository.deleteProduct(name)
    }

    fun getSearchResults():MutableLiveData<List<Product>>{
        return searchResults
    }

    fun getAllProducts():LiveData<List<Product>>?{
        return allProducts
    }

}
