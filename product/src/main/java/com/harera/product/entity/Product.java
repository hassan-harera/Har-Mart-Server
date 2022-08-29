package com.harera.product.entity;


import com.example.ecommerce.converter.DateTimeConverter;

import javax.persistence.*;

@Entity
public class Product {
    @Id()
    @GeneratedValue
    @Column(name = "product_id")
    Integer productId;
    @Column(name = "product_name")
    String productName;
    @Column(name = "category_name")
    String categoryName;
    @Column(name = "amount")
    Double amount;
    @Column(name = "unit")
    String unit;
    @Column(name = "price")
    Double price;
    @Convert(converter = DateTimeConverter.class)
//    @JsonSerialize(using = DateTimeSerializer.class)
    @Column(name = "date_added")
    String addingTime;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddingTime() {
        return addingTime;
    }

    public void setAddingTime(String addingTime) {
        this.addingTime = addingTime;
    }
}
