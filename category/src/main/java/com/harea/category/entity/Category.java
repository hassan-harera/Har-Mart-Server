package com.harea.category.entity;


import javax.persistence.*;

@Entity
public class Category {
    @Id()
    @Column(name = "category_name")
    String categoryName;
    @Column(name = "category_image_url")
    String categoryImageUrl;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryImageUrl() {
        return categoryImageUrl;
    }

    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
    }
}
