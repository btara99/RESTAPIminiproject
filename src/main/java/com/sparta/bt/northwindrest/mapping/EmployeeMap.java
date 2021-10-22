package com.sparta.bt.northwindrest.mapping;


import com.sparta.bt.northwindrest.DTO.CustomerDTO;
import com.sparta.bt.northwindrest.DTO.EmployeeDTO;
import com.sparta.bt.northwindrest.entities.CustomerEntity;
import com.sparta.bt.northwindrest.entities.EmployeeEntity;
import com.sparta.bt.northwindrest.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeMap {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeDTO> getAllEmployees(){
        return((List< EmployeeEntity>) employeeRepository
                .findAll())
                .stream()
                .map(this::convertToEmployeeDTO).collect(Collectors.toList());

    }

    private EmployeeDTO convertToEmployeeDTO(EmployeeEntity employeeEntity){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employeeEntity.getId());
        employeeDTO.setLastName(employeeEntity.getLastName());
        employeeDTO.setFirstName(employeeEntity.getFirstName());
        employeeDTO.setTitle(employeeEntity.getTitle());
        employeeDTO.setTitleOfCourtesy(employeeEntity.getTitleOfCourtesy());
        employeeDTO.setBirthDate(employeeEntity.getBirthDate());
        employeeDTO.setHireDate(employeeEntity.getHireDate());
        employeeDTO.setCity(employeeEntity.getCity());
        employeeDTO.setCountry(employeeEntity.getCountry());
        employeeDTO.setReportsTo(employeeEntity.getReportsTo());

        return employeeDTO;

    }
}
