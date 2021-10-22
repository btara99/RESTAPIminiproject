package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.dto.CategoryDTO;
import com.sparta.bt.northwindrest.mapping.CategoryMap;
import com.sparta.bt.northwindrest.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMap categoryMap; // this is now used

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/categories")
    @ResponseBody
    public List<CategoryDTO> getAllcategories() {
        List<CategoryDTO> categoryEntities = categoryMap.getAllCategories();
        return categoryEntities;
    }

    @GetMapping(value = "/categories/id={id}")
    public List<CategoryDTO> getCustomerByID(@PathVariable Integer id){
        List<CategoryDTO> categoryEntites = categoryMap.getAllCategories()
                .stream()
                .filter(categoryEntity -> categoryEntity.getId().equals(id))
                .toList();

        return categoryEntites;
    }

}
