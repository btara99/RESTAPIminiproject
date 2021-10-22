package com.sparta.bt.northwindrest.mapping;


import com.sparta.bt.northwindrest.DTO.CategoryDTO;
import com.sparta.bt.northwindrest.entities.CategoryEntity;
import com.sparta.bt.northwindrest.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryMap {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryDTO> getAllCategories(){
        return((List<CategoryEntity>) categoryRepository
                .findAll())
                .stream()
                .map(this::convertToCategoryDTO).collect(Collectors.toList());


    }

    private CategoryDTO convertToCategoryDTO(CategoryEntity categoryEntity){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(categoryEntity.getId());
        categoryDTO.setCategoryName(categoryEntity.getCategoryName());
        categoryDTO.setDescription(categoryEntity.getDescription());

        return categoryDTO;

    }
}
