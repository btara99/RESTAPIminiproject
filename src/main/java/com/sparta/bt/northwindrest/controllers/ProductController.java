package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.DTO.ProductDTO;
import com.sparta.bt.northwindrest.entities.ProductEntity;
import com.sparta.bt.northwindrest.mapping.ProductMap;
import com.sparta.bt.northwindrest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    private ProductMap productMap;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    @ResponseBody
    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> productEntities = productMap.getAllProducts();
        return productEntities;
    }

    @GetMapping("/products/id={id}")
    public List<ProductDTO> getProductsByID(@PathVariable Integer id){
        List<ProductDTO> productEntities = productMap.getAllProducts()
                .stream()
                .filter(customerEntity -> customerEntity.getId().equals(id))
                .toList();

        return productEntities;
    }

    @GetMapping("/products/name={name}")
    public List<ProductDTO> getProductsByName(@PathVariable String name){
        List<ProductDTO> productEntities = productMap.getAllProducts()
                .stream()
                .filter(customerEntity -> customerEntity.getProductName().equals(name))
                .collect(Collectors.toList());

        return productEntities;
    }

    @GetMapping("/products/supplierID={supplierID}")
    public List<ProductDTO> getProductsBySupplierID(@PathVariable Integer supplierID){
        List<ProductDTO> productEntities = productMap.getAllProducts()
                .stream()
                .filter(customerEntity -> customerEntity.getSupplierID().equals(supplierID))
                .collect(Collectors.toList());

        return productEntities;
    }

    @GetMapping("/products/categoryID={categoryID}")
    public List<ProductDTO> getProductsBycategoryID(@PathVariable Integer categoryID){
        List<ProductDTO> productEntities = productMap.getAllProducts()
                .stream()
                .filter(customerEntity -> customerEntity.getCategoryID().equals(categoryID))
                .collect(Collectors.toList());

        return productEntities;
    }

    @GetMapping("/products/quantityPerUnit={quantityPerUnit}")
    public List<ProductDTO> getProductsByQuantityPerUnit(@PathVariable String quantityPerUnit){
        List<ProductDTO> productEntities = productMap.getAllProducts()
                .stream()
                .filter(customerEntity -> customerEntity.getQuantityPerUnit().equals(quantityPerUnit))
                .collect(Collectors.toList());

        return productEntities;
    }

    @GetMapping("/products/unitPrice={unitPrice}")
    public List<ProductDTO> getProductsByUnitPrice(@PathVariable Double unitPrice){
        List<ProductDTO> productEntities = productMap.getAllProducts()
                .stream()
                .filter(customerEntity -> customerEntity.getUnitPrice().equals(unitPrice))
                .collect(Collectors.toList());

        return productEntities;
    }

    @GetMapping("/products/unitPrice>{unitPrice}")
    public List<ProductDTO> getProductsLargeThenUnitPrice(@PathVariable Double unitPrice){
        List<ProductDTO> productEntities = productMap.getAllProducts()
                .stream()
                .filter(customerEntity -> customerEntity.getUnitPrice()>(unitPrice))
                .collect(Collectors.toList());

        return productEntities;
    }

    @GetMapping("/products/unitPrice<{unitPrice}")
    public List<ProductDTO> getProductsLowerThenUnitPrice(@PathVariable Double unitPrice){
        List<ProductDTO> productEntities = productMap.getAllProducts()
                .stream()
                .filter(customerEntity -> customerEntity.getUnitPrice()<(unitPrice))
                .collect(Collectors.toList());

        return productEntities;
    }

    @GetMapping("/products/unitInStock={unitInStock}")
    public List<ProductDTO> getProductsEqualtoUnitInStock(@PathVariable Integer unitInStock){
        List<ProductDTO> productEntities = productMap.getAllProducts()
                .stream()
                .filter(customerEntity -> customerEntity.getUnitsInStock()==(unitInStock))
                .collect(Collectors.toList());

        return productEntities;
    }

    @GetMapping("/products/unitInStock>{unitInStock}")
    public List<ProductDTO> getProductsGreaterThenUnitInStock(@PathVariable Integer unitInStock){
        List<ProductDTO> productEntities = productMap.getAllProducts()
                .stream()
                .filter(customerEntity -> customerEntity.getUnitsInStock()>(unitInStock))
                .collect(Collectors.toList());

        return productEntities;
    }

    @GetMapping("/products/unitInStock<{unitInStock}")
    public List<ProductDTO> getProductsLowerThenUnitPrice(@PathVariable Integer unitInStock){
        List<ProductDTO> productEntities = productMap.getAllProducts()
                .stream()
                .filter(customerEntity -> customerEntity.getUnitsInStock()<(unitInStock))
                .collect(Collectors.toList());

        return productEntities;
    }

    @GetMapping("/products/discontinued={discontinued}")
    public List<ProductDTO> getProductsThatAreDiscontinued(@PathVariable Integer discontinued){
        List<ProductDTO> productEntities = productMap.getAllProducts()
                .stream()
                .filter(customerEntity -> customerEntity.getDiscontinued()==(discontinued))
                .collect(Collectors.toList());

        return productEntities;
    }
}
