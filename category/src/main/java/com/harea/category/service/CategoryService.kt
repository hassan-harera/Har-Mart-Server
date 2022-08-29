package com.example.ecommerce.service

import com.example.ecommerce.pojo.Category


interface CategoryService {

    fun getCategories(): List<Category>
}