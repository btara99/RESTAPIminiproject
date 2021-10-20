package com.sparta.bt.northwindrest.DTO;

import com.sparta.bt.northwindrest.entities.CustomerEntity;

public class DTOforCustomer {

    public String customerOutputConversion(CustomerEntity customerEntity){
        ApiDTO apiDTO = new ApiDTO();
        apiDTO.setId(customerEntity.getId());
        apiDTO.setContactName(customerEntity.getContactName());
        apiDTO.setCompanyName(customerEntity.getCompanyName());
        apiDTO.setContactTitle(customerEntity.getContactTitle());
        apiDTO.setAddress(customerEntity.getAddress());
        apiDTO.setCity(customerEntity.getCity());
        apiDTO.setCountry(customerEntity.getCountry());

        return apiDTO.toString();
    }
}
