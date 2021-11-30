package com.example.el3atar.service

import com.example.el3atar.pojo.Product
import org.springframework.stereotype.Service
import java.util.*


interface ProductService {

    fun getProducts(page: Int, pageSize: Int = 30): List<Product>
    fun insertProduct(product: Product): Int
    fun getProducts(category: String): List<Product>
    fun getProduct(productId: Int): Optional<Product>
}