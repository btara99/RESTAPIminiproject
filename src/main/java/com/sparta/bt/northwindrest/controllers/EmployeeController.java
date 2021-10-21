package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.entities.CategoryEntity;
import com.sparta.bt.northwindrest.entities.EmployeeEntity;
import com.sparta.bt.northwindrest.entities.ProductEntity;
import com.sparta.bt.northwindrest.repositories.CategoryRepository;
import com.sparta.bt.northwindrest.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

        private EmployeeRepository employeeRepository;

        @Autowired
        public EmployeeController(EmployeeRepository employeeRepository) {
            this.employeeRepository = employeeRepository;
        }

        @GetMapping("/employees")
        @ResponseBody
        public List<EmployeeEntity> getAllemployees() {
            return employeeRepository.findAll();
        }

        @GetMapping("/employees/employeeID={employeeID}")
        public Optional<EmployeeEntity> getEmployeesById(@PathVariable Integer employeeID) {
            return employeeRepository.findById(employeeID);
        }
        @GetMapping("/employees/firstName={name}")
        public List<EmployeeEntity> getEmployeesByFirstName(@PathVariable String name){
            return employeeRepository.findAll()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getFirstName().equals(name))
                    .collect(Collectors.toList());
        }

        @GetMapping("/employees/lastName={name}")
        public List<EmployeeEntity> getEmployeeLasyName(@PathVariable String name){
            return employeeRepository.findAll()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getLastName().equals(name))
                    .collect(Collectors.toList());
        }

        @GetMapping("/employees/title={title}")
        public List<EmployeeEntity> getEmployeeTitle(@PathVariable String title){
            return employeeRepository.findAll()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getTitle().equals(title))
                    .collect(Collectors.toList());
        }

        @GetMapping("/employees/titleOfCourtesy={title}")
        public List<EmployeeEntity> getEmployeeTitleOfCourtesy(@PathVariable String title){
            return employeeRepository.findAll()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getTitleOfCourtesy().equals(title))
                    .collect(Collectors.toList());
        }

        @GetMapping("/employees/birthDate={birthDate}")
        public List<EmployeeEntity> getEmployeeBirthDate(@PathVariable String birthDate){
            return employeeRepository.findAll()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getBirthDate().equals(birthDate))
                    .collect(Collectors.toList());
        }
        @GetMapping("/employees/hireDate={hireDate}")
        public List<EmployeeEntity> getEmployeeHireDate(@PathVariable String hireDate){
            return employeeRepository.findAll()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getHireDate().equals(hireDate))
                    .collect(Collectors.toList());
        }
        @GetMapping("/employees/address={address}")
        public List<EmployeeEntity> getEmployeeAddress(@PathVariable String address){
            return employeeRepository.findAll()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getAddress().equals(address))
                    .collect(Collectors.toList());
        }
        @GetMapping("/employees/city={city}")
        public List<EmployeeEntity> getEmployeeCity(@PathVariable String city){
            return employeeRepository.findAll()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getCity().equals(city))
                    .collect(Collectors.toList());
        }


        @GetMapping("/employees/postalCode={postalCode}")
        public List<EmployeeEntity> getEmployeePostalCode(@PathVariable String postalCode){
            return employeeRepository.findAll()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getPostalCode().equals(postalCode))
                    .collect(Collectors.toList());
        }

        @GetMapping("/employees/country={country}")
        public List<EmployeeEntity> getEmployeeCountry(@PathVariable String country){
            return employeeRepository.findAll()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getCountry().equals(country))
                    .collect(Collectors.toList());
        }

        @GetMapping("/employees/reportsTo={reportsTo}")
        public List<EmployeeEntity> getEmployeeReportsTo(@PathVariable Integer reportsTo){
            return employeeRepository.findAll()
                    .stream()
                    .filter(employeeEntity -> employeeEntity.getReportsTo()==(reportsTo))
                    .collect(Collectors.toList());
        }
}
