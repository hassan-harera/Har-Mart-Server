package com.harera.product.mapper;

import com.harera.product.dto.Product;
import com.harera.product.entity.ProductEntity;
import com.harera.product.request.PostProductRequest;

import java.util.Date;

public class ProductMapper {

    public static Product map(ProductEntity productEntity) {
        return new Product(
                productEntity.getId(),
                productEntity.getName(),
                productEntity.getCategoryId(),
                productEntity.getAmount(),
                productEntity.getUnitId(),
                productEntity.getPrice(),
                productEntity.getAddingTime()
        );
    }

    public static ProductEntity map(PostProductRequest postProductRequest) {
        if (postProductRequest == null) {
            return null;
        }

        return new ProductEntity(
                postProductRequest.getProductName(),
                postProductRequest.getCategoryId(),
                postProductRequest.getUnitId(),
                postProductRequest.getPrice(),
                new Date()
        );
    }
}
