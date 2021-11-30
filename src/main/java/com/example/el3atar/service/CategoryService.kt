package com.example.el3atar.service

import com.example.el3atar.pojo.Category
import com.example.el3atar.pojo.Product
import org.springframework.stereotype.Service
import java.util.*


interface CategoryService {

    fun getCategories(): List<Category>
}