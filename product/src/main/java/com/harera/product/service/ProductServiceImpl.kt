package com.example.ecommerce.service

import com.example.ecommerce.pojo.Product
import com.example.ecommerce.repostory.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*


@Service("productService")
class ProductServiceImpl : ProductService {

    @Autowired
    private lateinit var productRepository : ProductRepository

    override fun getProducts(page: Int, pageSize: Int) : List<Product> =
        productRepository.findAll(Pageable.ofSize(pageSize).withPage(page - 1)).toList()

    override fun getProducts(category: String) : List<Product> =
        productRepository.findByCategoryName(category)

    override fun getProduct(productId : Int) : Optional<Product> =
        productRepository.findById(productId)

    override fun insertProduct(product: Product) : Int =
        productRepository.saveAndFlush(product).productId
}