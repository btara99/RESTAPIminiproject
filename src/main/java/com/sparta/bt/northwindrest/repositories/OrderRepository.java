package com.sparta.bt.northwindrest.repositories;

import com.sparta.bt.northwindrest.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
}