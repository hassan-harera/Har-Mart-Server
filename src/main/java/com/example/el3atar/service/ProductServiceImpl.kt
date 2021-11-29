package com.example.el3atar.service

import com.example.el3atar.pojo.Product
import com.example.el3atar.repostory.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service


@Service("productService")
class ProductServiceImpl : ProductService {

    @Autowired
    private lateinit var productRepository : ProductRepository

    override fun getProducts(page: Int, pageSize: Int) : List<Product> =
        productRepository.findAll(Pageable.ofSize(pageSize).withPage(page - 1)).toList()
}