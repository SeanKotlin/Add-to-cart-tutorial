package com.sklinn.addtocart

import com.sklinn.addtocart.Product
import retrofit2.http.GET
import retrofit2.http.Headers

interface APIService {
    @Headers("Content-Type: application/json", "Accept: application/json")
    @GET("bestRated")
    fun getProducts(
    ): retrofit2.Call<List<Product>>
}