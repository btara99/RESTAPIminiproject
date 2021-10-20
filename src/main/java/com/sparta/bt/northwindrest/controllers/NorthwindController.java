package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.entities.CustomerEntity;
import com.sparta.bt.northwindrest.entities.ProductEntity;
import com.sparta.bt.northwindrest.repositories.CustomerRepository;
import com.sparta.bt.northwindrest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class NorthwindController {

    private ProductRepository productRepository;
    private CustomerRepository customerRepository;

    @Autowired
    public NorthwindController(ProductRepository productRepository,CustomerRepository customerRepository) {
        this.productRepository = productRepository;
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    @ResponseBody
    public List<CustomerEntity> getAllCustomers(@RequestParam(required = false)String name){
        if(name == null){
            return customerRepository.findAll();
        }
        List<CustomerEntity> foundCustomers = new ArrayList<>();
        for(CustomerEntity customerEntity: customerRepository.findAll()){
            if(customerEntity.getContactName().contains(name)){
                foundCustomers.add(customerEntity);
            }
        }
        return  foundCustomers;
    }

    @GetMapping("/products")
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Optional<ProductEntity> getProductsByID(@PathVariable Integer id){
        return productRepository.findById(id);
    }




}
