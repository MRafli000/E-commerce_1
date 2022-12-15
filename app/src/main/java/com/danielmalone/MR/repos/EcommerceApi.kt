package com.danielmalone.MR.repos

import com.danielmalone.MR.model.Product
import retrofit2.http.GET

interface EcommerceApi {

    @GET("api/ecommerce/v1/allProducts")
    suspend fun fetchAllProducts(): List<Product>
}
