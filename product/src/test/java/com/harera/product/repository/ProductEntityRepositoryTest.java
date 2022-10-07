package com.harera.product.repository;


import com.harera.product.entity.ProductEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.harera.product.data.Product.*;

@SpringBootTest
public class ProductEntityRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void test_to_save_product() {
        ProductEntity productEntity = productRepository
                .save(new ProductEntity(
                        NAME,
                        CATEGORY_ID,
                        UNIT_ID,
                        PRICE,
                        ADDING_TIME
                ));

        Assertions.assertThat(productEntity).isNotNull();
    }
}
