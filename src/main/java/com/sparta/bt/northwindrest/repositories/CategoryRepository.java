package com.sparta.bt.northwindrest.repositories;

import com.sparta.bt.northwindrest.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}