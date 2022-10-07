package com.harera.product.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
@Setter
@Getter
public class ProductEntity {
    @Id()
    @GeneratedValue
    @Column(name = "product_id")
    private Long id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "unit_id")
    private Integer unitId;

    @Column(name = "product_price")
    private Double price;

    @Column(name = "adding_time")
    private Date addingTime;

    public ProductEntity(String name, Integer categoryId, Integer unitId, Double price, Date addingTime) {
        this.name = name;
        this.categoryId = categoryId;
        this.unitId = unitId;
        this.price = price;
        this.addingTime = addingTime;
    }
}
