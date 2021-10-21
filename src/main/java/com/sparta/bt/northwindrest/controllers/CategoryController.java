package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.entities.CategoryEntity;
import com.sparta.bt.northwindrest.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/categories")
    @ResponseBody
    public List<CategoryEntity> getAllcategories() {
        return categoryRepository.findAll();
    }

    @GetMapping("/categories/categoryID={categoryId}")
    public Optional<CategoryEntity> getCategoriesById(@PathVariable Integer categoryId) {
        return categoryRepository.findById(categoryId);
    }

}
