package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.dto.CustomerDTO;
import com.sparta.bt.northwindrest.mapping.CustomerMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CustomerController {


    @Autowired
    private CustomerMap customerMap;


    @GetMapping("/customers")
    @ResponseBody
    public List<CustomerDTO> getAllCustomersNew(){
        List<CustomerDTO> customerEntities = customerMap.getAllCustomers();
        return customerEntities;
    }

    @GetMapping(value = "/customers/id={id}")
    public List<CustomerDTO> getCustomerByID(@PathVariable String id){
        List<CustomerDTO> customerEntities = customerMap.getAllCustomers()
                .stream()
                .filter(customerEntity -> customerEntity.getId().equals(id))
                .toList();

        return customerEntities;
    }

    @GetMapping("/customers/companyName={companyName}")
    @ResponseBody
    public List<CustomerDTO> getCustomerByCompanyName(@PathVariable String companyName){
        List<CustomerDTO> customerEntities = customerMap.getAllCustomers()
                .stream()
                .filter(customerEntity -> customerEntity.getCompanyName().equals(companyName))
                .collect(Collectors.toList());

        return customerEntities;
    }


    @GetMapping("/customers/contactName={contactName}")
    @ResponseBody
    public List<CustomerDTO> getCustomerByContactName(@PathVariable String contactName){
        List<CustomerDTO> customerEntities = customerMap.getAllCustomers()
                .stream()
                .filter(customerEntity -> customerEntity.getContactName().equals(contactName))
                .collect(Collectors.toList());

        return customerEntities;
    }


    @GetMapping("/customers/contactTitle={contactTitle}")
    @ResponseBody
    public List<CustomerDTO> getCustomerByContactTitle(@PathVariable String contactTitle){
        List<CustomerDTO> customerEntities = customerMap.getAllCustomers()
                .stream()
                .filter(customerEntity -> customerEntity.getContactTitle().equals(contactTitle))
                .collect(Collectors.toList());

        return customerEntities;
    }

    @GetMapping("/customers/address={address}")
    @ResponseBody
    public List<CustomerDTO> getCustomerByAddres(@PathVariable String address){
        List<CustomerDTO> customerEntities = customerMap.getAllCustomers()
                .stream()
                .filter(customerEntity -> customerEntity.getAddress().equals(address))
                .collect(Collectors.toList());

        return customerEntities;
    }

    @GetMapping("/customers/city={city}")
    @ResponseBody
    public List<CustomerDTO> getCustomerByCity(@PathVariable String city){
        List<CustomerDTO> customerEntities = customerMap.getAllCustomers()
                .stream()
                .filter(customerEntity -> customerEntity.getCity().equals(city))
                .collect(Collectors.toList());

        return customerEntities;
    }

    @GetMapping("/customers/country={country}")
    @ResponseBody
    public List<CustomerDTO> getCustomerByCountry(@PathVariable String country){
        List<CustomerDTO> customerEntities = customerMap.getAllCustomers()
                .stream()
                .filter(customerEntity -> customerEntity.getCountry().equals(country))
                .collect(Collectors.toList());

        return customerEntities;
    }



}
