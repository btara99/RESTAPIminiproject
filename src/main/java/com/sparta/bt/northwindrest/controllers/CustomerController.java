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
    public List<CustomerEntity> getAllCustomers(@RequestParam(required = false)String name,
                                                @RequestParam(required = false)String id){
        List<CustomerEntity> foundCustomers = new ArrayList<>();
        if(name == null && id == null){
            return customerRepository.findAll();
        }
        else if(name != null && id != null){ // add parameters to an array and check if they null or not
            for(CustomerEntity customerEntity: customerRepository.findAll()){
                if(customerEntity.getContactName().contains(name) && customerEntity.getId().contains(id)){
                    foundCustomers.add(customerEntity);
                }
            }
        }
        else if(name != null || id != null){   //????
            for(CustomerEntity customerEntity: customerRepository.findAll()){
                if(customerEntity.getContactName().contains(name) || customerEntity.getId().contains(id)){
                    foundCustomers.add(customerEntity);
                }
            }
        }

        if(foundCustomers.isEmpty()){  // returns 1 value of nulls to show that no customer has been found
            //maybe set values to something
            foundCustomers.add(new CustomerEntity());
        }
        return  foundCustomers;
    }



}
