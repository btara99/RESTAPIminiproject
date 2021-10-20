package com.sparta.bt.northwindrest.repositories;

import com.sparta.bt.northwindrest.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, String>{
}
