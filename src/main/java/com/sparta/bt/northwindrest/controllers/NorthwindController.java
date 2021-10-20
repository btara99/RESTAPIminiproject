package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.DTO.ApiDTO;
import com.sparta.bt.northwindrest.DTO.DTOforCustomer;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.sparta.bt.northwindrest.entities.CustomerEntity;
import com.sparta.bt.northwindrest.entities.ProductEntity;
import com.sparta.bt.northwindrest.repositories.CustomerRepository;
import com.sparta.bt.northwindrest.repositories.ProductRepository;
import org.json.simple.parser.ParseException;
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
    public List<String> getAllCustomers(@RequestParam(required = false)String name){
        if(name == null){
            List<String> foundCustomers = new ArrayList<>();
            for(CustomerEntity customerEntity: customerRepository.findAll()){
                DTOforCustomer dtOforCustomer = new DTOforCustomer();
                foundCustomers.add(dtOforCustomer.customerOutputConversion(customerEntity));
            }
            return foundCustomers;
        }
        List<String> foundCustomers = new ArrayList<>();
        for(CustomerEntity customerEntity: customerRepository.findAll()){
            if(customerEntity.getContactName().contains(name)){
                DTOforCustomer dtOforCustomer = new DTOforCustomer();
                foundCustomers.add(dtOforCustomer.customerOutputConversion(customerEntity));

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


//    @GetMapping("/test")
//    public String testCase(){
//        String test = "ifhuhfuidhoifhis"+'\n'+
//                "ifhuhfuidhoifhis"+'\n'+
//                "ifhuhfuidhoifhis"+'\n'+
//                "ifhuhfuidhoifhis"+'\n'+
//                "ifhuhfuidhoifhis"+'\n'
//                ;
//        return test;
//    }





}
