package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.dto.SupplierDTO;
import com.sparta.bt.northwindrest.mapping.SupplierMap;
import com.sparta.bt.northwindrest.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SupplierController {

    private SupplierRepository supplierRepository;

    @Autowired
    private SupplierMap supplierMap;

    public SupplierController(SupplierRepository supplierRepository) {
        this.supplierRepository =  supplierRepository;
    }

    @GetMapping("/suppliers")
    @ResponseBody
    public List<SupplierDTO> getAllSupplier() {
        List<SupplierDTO> supplierEntities = supplierMap.getAllSuppliers();
        return supplierEntities;
    }

    @GetMapping("/suppliers/id={id}")
    public List<SupplierDTO> getSupplierByID(@PathVariable Integer id){
        List<SupplierDTO> supplierEntities = supplierMap.getAllSuppliers()
                .stream()
                .filter(employeeEntity -> employeeEntity.getId().equals(id))
                .toList();

        return supplierEntities;
    }

    @GetMapping("/suppliers/companyName={companyName}")
    @ResponseBody
    public List<SupplierDTO> getSupplierByCompanyName(@PathVariable String companyName){
        List<SupplierDTO> supplierEntities = supplierMap.getAllSuppliers()
                .stream()
                .filter(supplierEntity -> supplierEntity.getCompanyName().equals(companyName))
                .collect(Collectors.toList());

        return supplierEntities;
    }

    @GetMapping("/suppliers/contactName={contactName}")
    @ResponseBody
    public List<SupplierDTO> getSupplierByContactName(@PathVariable String contactName){
        List<SupplierDTO> supplierEntities = supplierMap.getAllSuppliers()
                .stream()
                .filter(supplierEntity -> supplierEntity.getContactName().equals(contactName))
                .collect(Collectors.toList());

        return supplierEntities;
    }

    @GetMapping("/suppliers/contactTitle={contactTitle}")
    @ResponseBody
    public List<SupplierDTO> getSupplierByContactTitle(@PathVariable String contactTitle){
        List<SupplierDTO> supplierEntities = supplierMap.getAllSuppliers()
                .stream()
                .filter(SupplierEntity -> SupplierEntity.getContactTitle().equals(contactTitle))
                .collect(Collectors.toList());

        return supplierEntities;
    }

    @GetMapping("/suppliers/address={address}")
    @ResponseBody
    public List<SupplierDTO> getSupplierByAddress(@PathVariable String address){
        List<SupplierDTO> supplierEntities = supplierMap.getAllSuppliers()
                .stream()
                .filter(SupplierEntity -> SupplierEntity.getAddress().equals(address))
                .collect(Collectors.toList());

        return supplierEntities;
    }

    @GetMapping("/suppliers/city={city}")
    @ResponseBody
    public List<SupplierDTO> getSupplierByCity(@PathVariable String city){
        List<SupplierDTO> supplierEntities = supplierMap.getAllSuppliers()
                .stream()
                .filter(SupplierEntity -> SupplierEntity.getCity().equals(city))
                .collect(Collectors.toList());

        return supplierEntities;
    }

    @GetMapping("/suppliers/country={country}")
    @ResponseBody
    public List<SupplierDTO> getSupplierByCountry(@PathVariable String country){
        List<SupplierDTO> supplierEntities = supplierMap.getAllSuppliers()
                .stream()
                .filter(SupplierEntity -> SupplierEntity.getCountry().equals(country))
                .collect(Collectors.toList());

        return supplierEntities;
    }
}
