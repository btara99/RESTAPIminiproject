package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.DTO.CustomerDTO;
import com.sparta.bt.northwindrest.DTO.CustomerMap;
import com.sparta.bt.northwindrest.entities.CustomerEntity;
import com.sparta.bt.northwindrest.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class CustomerController {

    private CustomerRepository customerRepository;

    @Autowired
//    public CustomerController(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
    private CustomerMap customerMap;

    @GetMapping("/customers")
    @ResponseBody
    public List<CustomerEntity> getAllCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("/customers/new")
    @ResponseBody
    public List<CustomerDTO> getAllCustomersNew(){
        List<CustomerDTO> customerEntities = customerMap.getAllCustomers();
        return customerEntities;
    }

    @GetMapping(value = "/customers/id={id}")
    public Optional<CustomerEntity> getCustomerByID(@PathVariable String id){
        return customerRepository.findById(id);
    }

    @GetMapping("/customers/companyName={companyName}")
    @ResponseBody
    public List<CustomerEntity> getCustomerByCompanyName(@PathVariable String companyName){
        return customerRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getCompanyName().equals(companyName))
                .collect(Collectors.toList());
    }

    @GetMapping("/customers/contactName={contactName}")
    @ResponseBody
    public List<CustomerEntity> getCustomerByContactName(@PathVariable String contactName){
        return customerRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getContactName().equals(contactName))
                .collect(Collectors.toList());
    }


    @GetMapping("/customers/contactTitle={contactTitle}")
    @ResponseBody
    public List<CustomerEntity> getCustomerByContactTitle(@PathVariable String contactTitle){
        return customerRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getContactTitle().equals(contactTitle))
                .collect(Collectors.toList());
    }

    @GetMapping("/customers/address={address}")
    @ResponseBody
    public List<CustomerEntity> getCustomerByAddres(@PathVariable String address){
        return customerRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getAddress().equals(address))
                .collect(Collectors.toList());
    }

    @GetMapping("/customers/city={city}")
    @ResponseBody
    public List<CustomerEntity> getCustomerByCity(@PathVariable String city){
        return customerRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getCity().equals(city))
                .collect(Collectors.toList());
    }

    @GetMapping("/customers/country={country}")
    @ResponseBody
    public List<CustomerEntity> getCustomerByCountry(@PathVariable String country){
        return customerRepository.findAll()
                .stream()
                .filter(customerEntity -> customerEntity.getCountry().equals(country))
                .collect(Collectors.toList());
    }



}
