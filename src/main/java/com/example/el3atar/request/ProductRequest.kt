package com.example.el3atar.request

import com.example.el3atar.pojo.Product
import com.fasterxml.jackson.databind.annotation.JsonSerialize

data class ProductRequest(
    val productName: String,
    val amount: Double,
    val unit: String,
    val price: Double,
    val categoryName: String,

) {
}