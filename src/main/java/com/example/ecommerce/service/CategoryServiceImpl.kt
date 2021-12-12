package com.example.ecommerce.service

import com.example.ecommerce.pojo.Category
import com.example.ecommerce.repostory.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service("categoryService")
class CategoryServiceImpl : CategoryService {

    @Autowired
    private lateinit var categoryRepository: CategoryRepository

    override fun getCategories(): List<Category> {
        return categoryRepository.findAll()
    }
}