package com.example.ecommerce.controller;


import com.example.ecommerce.pojo.Category;
import com.example.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@RestController
public class CategoryController {

    @Resource(name = "categoryService")
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getProducts() {
        return categoryService.getCategories();
    }

    @Autowired
    ServletContext servletContext;

    @GetMapping("/images/categories/{image-url}")
    public void getProducts(
            @PathVariable("image-url") String imageUrl,
            HttpServletResponse response
    ) {
        try {
            OutputStream out = response.getOutputStream();
            Files.copy(Path.of(servletContext.getContextPath()+ "C:\\Users\\Harera\\Desktop\\El3atar\\images\\categories\\" + imageUrl), out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
