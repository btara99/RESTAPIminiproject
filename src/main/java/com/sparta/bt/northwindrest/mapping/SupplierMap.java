package com.sparta.bt.northwindrest.mapping;


import com.sparta.bt.northwindrest.dto.SupplierDTO;
import com.sparta.bt.northwindrest.entities.SupplierEntity;
import com.sparta.bt.northwindrest.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierMap {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<SupplierDTO> getAllSuppliers(){
        return((List<SupplierEntity>) supplierRepository
                .findAll())
                .stream()
                .map(this::convertToSupplierDTO).collect(Collectors.toList());

    }

    private SupplierDTO convertToSupplierDTO(SupplierEntity supplierEntity){
        SupplierDTO supplierDTO = new SupplierDTO();
        supplierDTO.setId(supplierEntity.getId());
        supplierDTO.setCompanyName(supplierEntity.getCompanyName());
        supplierDTO.setContactName(supplierEntity.getContactName());
        supplierDTO.setContactTitle(supplierEntity.getContactTitle());
        supplierDTO.setAddress(supplierEntity.getAddress());
        supplierDTO.setCity(supplierEntity.getCity());
        supplierDTO.setRegion(supplierEntity.getRegion());
        supplierDTO.setRegion(supplierEntity.getRegion());
        supplierDTO.setPostalCode(supplierEntity.getPostalCode());
        supplierDTO.setCountry(supplierEntity.getCountry());
        supplierDTO.setPhone(supplierEntity.getPhone());

        return supplierDTO;

    }
}
