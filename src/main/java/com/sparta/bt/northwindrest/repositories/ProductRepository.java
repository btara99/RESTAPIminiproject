package com.sparta.bt.northwindrest.repositories;

import com.sparta.bt.northwindrest.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}