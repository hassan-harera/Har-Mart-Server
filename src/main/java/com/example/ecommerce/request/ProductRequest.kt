package com.example.ecommerce.request

data class ProductRequest(
    val productName: String,
    val amount: Double,
    val unit: String,
    val price: Double,
    val categoryName: String,

) {
}