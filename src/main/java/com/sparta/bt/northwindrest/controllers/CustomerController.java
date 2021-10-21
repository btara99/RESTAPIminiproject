package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.entities.CustomerEntity;
import com.sparta.bt.northwindrest.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
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
        if(foundCustomers.isEmpty()){  // returns 1 value of nulls to show that no customer has been found
            foundCustomers.add(new CustomerEntity());
        }
        return  foundCustomers;
    }



}
