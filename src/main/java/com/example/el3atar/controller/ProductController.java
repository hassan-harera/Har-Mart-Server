package com.example.el3atar.controller;


import com.example.el3atar.pojo.Product;
import com.example.el3atar.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {

    @Resource
    private ProductServiceImpl productService;

    @GetMapping("/products")
    public List<Product> getProducts(
            @RequestParam("page") Integer page,
            @RequestParam("page-size") Integer pageSize
    ) {
       return productService.getProducts(page, pageSize);
    }
}
