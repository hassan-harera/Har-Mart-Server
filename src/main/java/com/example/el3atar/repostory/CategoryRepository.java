package com.example.el3atar.repostory;


import com.example.el3atar.pojo.Category;
import com.example.el3atar.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {}
