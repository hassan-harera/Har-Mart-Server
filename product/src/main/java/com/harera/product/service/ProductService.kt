package com.example.ecommerce.service

import com.example.ecommerce.pojo.Product
import java.util.*


interface ProductService {

    fun getProducts(page: Int, pageSize: Int = 30): List<Product>
    fun insertProduct(product: Product): Int
    fun getProducts(category: String): List<Product>
    fun getProduct(productId: Int): Optional<Product>
}