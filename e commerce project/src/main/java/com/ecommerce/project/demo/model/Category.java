package com.ecommerce.project.demo.model;

public class Category {
    private Long categoryId;
    private String CategoryName;

    public Category(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Category(String categoryName) {
        CategoryName = categoryName;
    }

    public Category() {
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}

