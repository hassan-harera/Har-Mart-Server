package com.example.el3atar.pojo;


import com.example.el3atar.converter.DateTimeConverter;
import org.joda.time.DateTime;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;

@Entity
public class Product {
    @Id()
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

//    @Ignor
//    @Convert(converter = DateTimeConverter.class)
//    @Column(name = "date_added")
    DateTime addingTime;

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

    public DateTime getAddingTime() {
        return addingTime;
    }

    public void setAddingTime(DateTime addingTime) {
        this.addingTime = addingTime;
    }
}
