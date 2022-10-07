package com.harera.product.repository;


import com.harera.product.entity.ProductEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    @Query("SELECT p FROM ProductEntity p WHERE p.categoryId = ?1")
    List<ProductEntity> getCategoryProducts(Long categoryId, Pageable pageable);

    @Query("SELECT p FROM ProductEntity p")
    List<ProductEntity> getProducts(Pageable pageable);

    @Query("SELECT p FROM ProductEntity p where p.id = ?1")
    ProductEntity getProduct(Long productId);
}
