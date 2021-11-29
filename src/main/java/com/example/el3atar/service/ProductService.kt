package com.example.el3atar.service

import com.example.el3atar.pojo.Product
import org.springframework.stereotype.Service


@Service("productService")
interface ProductService {

    fun getProducts(page: Int, pageSize: Int = 30): List<Product>
}