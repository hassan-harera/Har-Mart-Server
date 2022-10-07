package com.harera.product.service

import com.harera.product.dto.Product
import com.harera.product.mapper.ProductMapper
import com.harera.product.mapper.ProductResponse
import com.harera.product.repository.ProductRepository
import com.harera.product.request.PostProductRequest
import com.harera.product.response.PostProductResponse
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono


@Service
class ProductServiceImpl(
    private val productRepository: ProductRepository,
) : ProductService {

    override fun getProducts(page: Int, pageSize: Int): Mono<List<Product>> = Mono.fromCallable {
        productRepository.getProducts(Pageable.ofSize(pageSize).withPage(page)).map {
            ProductMapper.map(it)
        }
    }

    override fun getProducts(category: Long, page: Int, pageSize: Int): Mono<List<Product>> = Mono.fromCallable {
        productRepository.getCategoryProducts(category, Pageable.ofSize(pageSize).withPage(page)).map {
            ProductMapper.map(it)
        }
    }

    override fun getProduct(productId: Long): Mono<Product> = Mono.fromCallable {
        productRepository.getProduct(productId).let {
            ProductMapper.map(it)
        }
    }

    override fun insertProduct(postProductRequest: PostProductRequest): Mono<PostProductResponse> = Mono.fromCallable {
        val productEntity = ProductMapper.map(postProductRequest)

        productRepository.save(productEntity).let {
            ProductResponse.map(it)
        }
    }
}