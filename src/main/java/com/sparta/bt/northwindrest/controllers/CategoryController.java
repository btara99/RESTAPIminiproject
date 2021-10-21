package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.entities.CategoryEntity;
import com.sparta.bt.northwindrest.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

}
