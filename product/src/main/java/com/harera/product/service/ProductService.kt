package com.harera.product.service

import com.harera.product.dto.Product
import com.harera.product.entity.ProductEntity
import com.harera.product.request.PostProductRequest
import com.harera.product.response.PostProductResponse
import reactor.core.publisher.Mono
import java.util.*


interface ProductService {

    fun getProducts(page: Int, pageSize: Int = 30): Mono<List<Product>>
    fun getProducts(category: Long, page: Int, pageSize: Int = 30): Mono<List<Product>>
    fun getProduct(productId: Long): Mono<Product>
    fun insertProduct(postProductRequest: PostProductRequest): Mono<PostProductResponse>
}