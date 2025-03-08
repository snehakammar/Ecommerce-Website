package com.ecommerce.project.demo.service;

import com.ecommerce.project.demo.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import static java.util.Locale.filter;

@Service
public class CategoryServiceimpl implements CategoryService {
    private List<Category> categories = new ArrayList<>();
    private Long numberId=1L;

    @Override
    public List<Category> getAllCategories(){
        return categories;
    }

    @Override
    public void createCategory(Category category){
       // category.setCategoryId(numberId++);
        categories.add(category);
}

    @Override
    public String deleteCategory(Long categoryId) {
        Category category = categories.stream()
        .filter(c -> c.getCategoryId().equals(categoryId))
                .findFirst().get();
        categories.remove(category);
        return "Category with categoryId:"+categoryId + "deleted successfully";

    }
}

