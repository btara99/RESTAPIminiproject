package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.entities.ProductEntity;
import com.sparta.bt.northwindrest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    @ResponseBody
    public List<ProductEntity> getAllProducts(@RequestParam(required = false)Integer id){
        List<ProductEntity> foundProducts = new ArrayList<>();
        if(id == null){
            return productRepository.findAll();
        }
        else if(id != null){
            for(ProductEntity productEntity: productRepository.findAll()){
                if(productEntity.getId()==id){
                    foundProducts.add(productEntity);
                }
            }
        }
        return foundProducts;
    }

//    @GetMapping("/products/{id}")
//    public Optional<ProductEntity> getProductsByID(@PathVariable Integer id){
//        return productRepository.findById(id);
//    }
}
