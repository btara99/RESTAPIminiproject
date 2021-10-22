package com.sparta.bt.northwindrest.mapping;

import com.sparta.bt.northwindrest.DTO.CustomerDTO;
import com.sparta.bt.northwindrest.entities.CustomerEntity;
import com.sparta.bt.northwindrest.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerMap {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerDTO> getAllCustomers(){
        return((List<CustomerEntity>) customerRepository
                .findAll())
                .stream()
                .map(this::convertToCustomerDTO).collect(Collectors.toList());

    }

    private CustomerDTO convertToCustomerDTO(CustomerEntity customerEntity){
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customerEntity.getId());
        customerDTO.setCompanyName(customerEntity.getCompanyName());
        customerDTO.setContactName(customerEntity.getContactName());
        customerDTO.setContactTitle(customerEntity.getContactTitle());
        customerDTO.setAddress(customerEntity.getAddress());
        customerDTO.setCity(customerEntity.getCity());
        customerDTO.setCountry(customerEntity.getCountry());

        return customerDTO;

    }
}
