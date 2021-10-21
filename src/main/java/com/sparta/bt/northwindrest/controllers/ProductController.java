package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.entities.ProductEntity;
import com.sparta.bt.northwindrest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    @ResponseBody
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/products/id={id}")
    public Optional<ProductEntity> getProductsByID(@PathVariable Integer id){
        return productRepository.findById(id);
    }

    @GetMapping("/products/name={name}")
    public List<ProductEntity> getProductsByName(@PathVariable String name){
        return productRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getProductName().equals(name))
                .collect(Collectors.toList());
    }

    @GetMapping("/products/supplierID={supplierID}")
    public List<ProductEntity> getProductsBySupplierID(@PathVariable Integer supplierID){
        return productRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getSupplierID().equals(supplierID))
                .collect(Collectors.toList());
    }

    @GetMapping("/products/categoryID={categoryID}")
    public List<ProductEntity> getProductsBycategoryID(@PathVariable Integer categoryID){
        return productRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getCategoryID().equals(categoryID))
                .collect(Collectors.toList());
    }

    @GetMapping("/products/quantityPerUnit={quantityPerUnit}")
    public List<ProductEntity> getProductsByQuantityPerUnit(@PathVariable String quantityPerUnit){
        return productRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getQuantityPerUnit().equals(quantityPerUnit))
                .collect(Collectors.toList());
    }

    @GetMapping("/products/unitPrice={unitPrice}")
    public List<ProductEntity> getProductsByUnitPrice(@PathVariable Double unitPrice){
        return productRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getUnitPrice().equals(unitPrice))
                .collect(Collectors.toList());
    }
    @GetMapping("/products/unitPrice>{unitPrice}")
    public List<ProductEntity> getProductsLargeThenUnitPrice(@PathVariable Double unitPrice){
        return productRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getUnitPrice()>(unitPrice))
                .collect(Collectors.toList());
    }

    @GetMapping("/products/unitPrice<{unitPrice}")
    public List<ProductEntity> getProductsLowerThenUnitPrice(@PathVariable Double unitPrice){
        return productRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getUnitPrice()<(unitPrice))
                .collect(Collectors.toList());
    }

    @GetMapping("/products/unitInStock={unitInStock}")
    public List<ProductEntity> getProductsEqualtoUnitInStock(@PathVariable Integer unitInStock){
        return productRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getUnitsInStock()==(unitInStock))
                .collect(Collectors.toList());
    }

    @GetMapping("/products/unitInStock>{unitInStock}")
    public List<ProductEntity> getProductsGreaterThenUnitInStock(@PathVariable Integer unitInStock){
        return productRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getUnitsInStock()>(unitInStock))
                .collect(Collectors.toList());
    }
    @GetMapping("/products/unitInStock<{unitInStock}")
    public List<ProductEntity> getProductsLowerThenUnitPrice(@PathVariable Integer unitInStock){
        return productRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getUnitsInStock()<(unitInStock))
                .collect(Collectors.toList());
    }

    @GetMapping("/products/discontinued={discontinued}")
    public List<ProductEntity> getProductsThatAreDiscontinued(@PathVariable Integer discontinued){
        return productRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getDiscontinued()==(discontinued))
                .collect(Collectors.toList());
    }
}
