package com.harera.product.request

data class PostProductRequest(
    val productName: String,
    val unitId: Int,
    val price: Double,
    val categoryId: Int,
)