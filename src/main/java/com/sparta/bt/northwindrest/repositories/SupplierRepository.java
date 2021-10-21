package com.sparta.bt.northwindrest.repositories;

import com.sparta.bt.northwindrest.entities.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<SupplierEntity, Integer> {
}