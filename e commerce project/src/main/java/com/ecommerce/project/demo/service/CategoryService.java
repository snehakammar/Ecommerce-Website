package com.ecommerce.project.demo.service;

import com.ecommerce.project.demo.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);

    String deleteCategory(Long categoryId);
}
