package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.dto.EmployeeDTO;
import com.sparta.bt.northwindrest.mapping.EmployeeMap;
import com.sparta.bt.northwindrest.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import java.util.stream.Collectors;

@RestController
public class EmployeeController {

        private EmployeeRepository employeeRepository;

        @Autowired
        private EmployeeMap employeeMap;

        public EmployeeController(EmployeeRepository employeeRepository) {
            this.employeeRepository = employeeRepository;
        }

        @GetMapping("/employees")
        @ResponseBody
        public List<EmployeeDTO> getAllemployees() {
            List<EmployeeDTO> employeeEntities = employeeMap.getAllEmployees();
            return employeeEntities;
        }

        @GetMapping("/employees/employeeID={employeeID}")
        public List<EmployeeDTO> getEmployeesById(@PathVariable Integer employeeID) {
            List<EmployeeDTO> employeeEntities = employeeMap.getAllEmployees()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getId().equals(employeeID))
                    .toList();

            return employeeEntities;
        }
        @GetMapping("/employees/firstName={name}")
        public List<EmployeeDTO> getEmployeesByFirstName(@PathVariable String name){
            List<EmployeeDTO> employeeEntities = employeeMap.getAllEmployees()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getFirstName().equals(name))
                    .collect(Collectors.toList());

            return employeeEntities;
        }

        @GetMapping("/employees/lastName={name}")
        public List<EmployeeDTO> getEmployeeLasyName(@PathVariable String name){
            List<EmployeeDTO> employeeEntities = employeeMap.getAllEmployees()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getLastName().equals(name))
                    .collect(Collectors.toList());

            return employeeEntities;
        }

        @GetMapping("/employees/title={title}")
        public  List<EmployeeDTO> getEmployeeTitle(@PathVariable String title){
            List<EmployeeDTO> employeeEntities = employeeMap.getAllEmployees()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getTitle().equals(title))
                    .collect(Collectors.toList());

            return employeeEntities;
        }

        @GetMapping("/employees/titleOfCourtesy={title}")
        public  List<EmployeeDTO> getEmployeeTitleOfCourtesy(@PathVariable String title){
            List<EmployeeDTO> employeeEntities = employeeMap.getAllEmployees()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getTitleOfCourtesy().equals(title))
                    .collect(Collectors.toList());

            return employeeEntities;
        }

        @GetMapping("/employees/birthDate={birthDate}")
        public  List<EmployeeDTO> getEmployeeBirthDate(@PathVariable String birthDate){
            List<EmployeeDTO> employeeEntities = employeeMap.getAllEmployees()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getBirthDate().equals(birthDate))
                    .collect(Collectors.toList());

            return employeeEntities;
        }
        @GetMapping("/employees/hireDate={hireDate}")
        public  List<EmployeeDTO> getEmployeeHireDate(@PathVariable String hireDate){
            List<EmployeeDTO> employeeEntities = employeeMap.getAllEmployees()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getHireDate().equals(hireDate))
                    .collect(Collectors.toList());

            return employeeEntities;
        }

        @GetMapping("/employees/city={city}")
        public  List<EmployeeDTO> getEmployeeCity(@PathVariable String city){
            List<EmployeeDTO> employeeEntities = employeeMap.getAllEmployees()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getCity().equals(city))
                    .collect(Collectors.toList());

            return employeeEntities;
        }


        @GetMapping("/employees/country={country}")
        public  List<EmployeeDTO> getEmployeeCountry(@PathVariable String country){
            List<EmployeeDTO> employeeEntities = employeeMap.getAllEmployees()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getCountry().equals(country))
                    .collect(Collectors.toList());

            return employeeEntities;
        }

        @GetMapping("/employees/reportsTo={reportsTo}")
        public  List<EmployeeDTO> getEmployeeReportsTo(@PathVariable Integer reportsTo){
            List<EmployeeDTO> employeeEntities = employeeMap.getAllEmployees()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getReportsTo()==(reportsTo))
                    .collect(Collectors.toList());

            return employeeEntities;
        }
}
