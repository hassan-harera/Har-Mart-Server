package com.harera.product.mapper;

import com.harera.product.entity.ProductEntity;
import com.harera.product.response.PostProductResponse;

public class ProductResponse {

    public static PostProductResponse map(ProductEntity productEntity) {
        return new PostProductResponse(
                productEntity.getId(),
                productEntity.getName(),
                productEntity.getCategoryId(),
                productEntity.getAmount(),
                productEntity.getUnitId(),
                productEntity.getPrice(),
                productEntity.getAddingTime().toString()
        );
    }
}
