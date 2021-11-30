package com.example.el3atar.service

import com.example.el3atar.pojo.Category
import com.example.el3atar.pojo.Product
import com.example.el3atar.repostory.CategoryRepository
import com.example.el3atar.repostory.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*


@Service("categoryService")
class CategoryServiceImpl : CategoryService {

    @Autowired
    private lateinit var categoryRepository: CategoryRepository

    override fun getCategories(): List<Category> {
        return categoryRepository.findAll()
    }
}