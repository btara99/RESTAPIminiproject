package com.sparta.bt.northwindrest.controllers;


import com.sparta.bt.northwindrest.entities.CategoryEntity;
import com.sparta.bt.northwindrest.entities.CustomerEntity;
import com.sparta.bt.northwindrest.entities.ProductEntity;
import com.sparta.bt.northwindrest.entities.SupplierEntity;
import com.sparta.bt.northwindrest.repositories.CategoryRepository;
import com.sparta.bt.northwindrest.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class SupplierController {

    private SupplierRepository supplierRepository;

    @Autowired
    public SupplierController(SupplierRepository supplierRepository) {
        this.supplierRepository =  supplierRepository;
    }

    @GetMapping("/suppliers")
    @ResponseBody
    public List<SupplierEntity> getAllSupplier() {
        return supplierRepository.findAll();
    }

    @GetMapping("/suppliers/id={id}")
    public Optional<SupplierEntity> getSupplierByID(@PathVariable Integer id){
        return supplierRepository.findById(id);
    }

    @GetMapping("/suppliers/companyName={companyName}")
    @ResponseBody
    public List<SupplierEntity> getSupplierByCompanyName(@PathVariable String companyName){
        return supplierRepository.findAll()
                .stream()
                .filter(supplierEntity -> supplierEntity.getCompanyName().equals(companyName))
                .collect(Collectors.toList());
    }

    @GetMapping("/suppliers/contactName={contactName}")
    @ResponseBody
    public List<SupplierEntity> getSupplierByContactName(@PathVariable String contactName){
        return supplierRepository.findAll()
                .stream()
                .filter(supplierEntity -> supplierEntity.getContactName().equals(contactName))
                .collect(Collectors.toList());
    }

    @GetMapping("/suppliers/contactTitle={contactTitle}")
    @ResponseBody
    public List<SupplierEntity> getSupplierByContactTitle(@PathVariable String contactTitle){
        return supplierRepository.findAll()
                .stream()
                .filter(SupplierEntity -> SupplierEntity.getContactTitle().equals(contactTitle))
                .collect(Collectors.toList());
    }

    @GetMapping("/suppliers/address={address}")
    @ResponseBody
    public List<SupplierEntity> getSupplierByAddress(@PathVariable String address){
        return supplierRepository.findAll()
                .stream()
                .filter(SupplierEntity -> SupplierEntity.getAddress().equals(address))
                .collect(Collectors.toList());
    }

    @GetMapping("/suppliers/city={city}")
    @ResponseBody
    public List<SupplierEntity> getSupplierByCity(@PathVariable String city){
        return supplierRepository.findAll()
                .stream()
                .filter(SupplierEntity -> SupplierEntity.getCity().equals(city))
                .collect(Collectors.toList());
    }

    @GetMapping("/suppliers/country={country}")
    @ResponseBody
    public List<SupplierEntity> getSupplierByCountry(@PathVariable String country){
        return supplierRepository.findAll()
                .stream()
                .filter(SupplierEntity -> SupplierEntity.getCountry().equals(country))
                .collect(Collectors.toList());
    }
}
