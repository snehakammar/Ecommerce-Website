package com.ecommerce.project.demo.controller;

import com.ecommerce.project.demo.model.Category;
import com.ecommerce.project.demo.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    private List<Category> categories = new ArrayList<>();

    @GetMapping("/api/public/categories")
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories=categoryService.getAllCategories();
        return new ResponseEntity<>(categories,HttpStatus.OK);
    }

    @PostMapping("/api/public/categories")
    public ResponseEntity<String> createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return new ResponseEntity<>("category added successfully", HttpStatus.CREATED);
    }
    @DeleteMapping("/api/admin/categories/{categoryId}")
    public ResponseEntity<String> DeleteCategory(@PathVariable Long categoryId) {

        try{

        String status = categoryService.deleteCategory(categoryId);
            ResponseEntity<String> stringResponseEntity = ResponseEntity.status(HttpStatus.OK).body(status);
            return stringResponseEntity;
    }
    catch(ResponseStatusException e){

    return new ResponseEntity<>(e.getReason(), e.getStatusCode());
    }
}
}