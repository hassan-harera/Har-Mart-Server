package com.harera.product.controller;


import com.harera.product.dto.Product;
import com.harera.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

import static com.harera.product.utils.Param.PAGE;
import static com.harera.product.utils.Param.PAGE_SIZE;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public Mono<ResponseEntity<List<Product>>> getProducts(@RequestParam(PAGE) Integer page, @RequestParam(PAGE_SIZE) Integer pageSize) {
        return productService.getProducts(page, pageSize).map(products -> {
            return ResponseEntity.ok().body(products);
        });
    }

//    @GetMapping("/{category}/products")
//    public List<ProductEntity> getCategoryProducts(@PathVariable("category_id") Long category) {
//        return productService.getProducts(category);
//    }

//    @GetMapping("/{product-id}")
//    public ProductEntity getProduct(@PathVariable("product-id") Long productId) {
//        return productService.getProduct(productId).orElse(null);
//    }

//    @PostMapping("/product")
//    public PostProductResponse insertProduct(@RequestBody PostProductRequest request) {
//        productService
//                .insertProduct(request);
//    }
}
