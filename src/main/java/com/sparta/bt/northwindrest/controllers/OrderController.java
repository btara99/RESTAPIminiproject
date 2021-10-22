package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.entities.OrderEntity;
import com.sparta.bt.northwindrest.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class OrderController {

    private OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/orders")
    @ResponseBody
    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/orders/orderID={orderID}")
    public Optional<OrderEntity> getOrderById(@PathVariable Integer orderID) {
        return orderRepository.findById(orderID);
    }

    @GetMapping("/orders/employeeID={employeeID}")
    public List<OrderEntity> getOrderByEmployeeId(@PathVariable String employeeID) {
        return orderRepository.findAll()
                .stream()
                .filter(employeeEntity -> employeeEntity.getEmployeeID().equals(employeeID))
                .collect(Collectors.toList());
    }

    @GetMapping("/orders/customerID={customerID}")
    public List<OrderEntity> getOrdersByCustomerId(@PathVariable String customerID) {
        return orderRepository.findAll()
                .stream()
                .filter(employeeEntity -> employeeEntity.getCustomerID().equals(customerID))
                .collect(Collectors.toList());
    }

    @GetMapping("/orders/orderDate={orderDate}")
    public List<OrderEntity> getOrdersByOrderDate(@PathVariable String orderDate) {
        return orderRepository.findAll()
                .stream()
                .filter(employeeEntity -> employeeEntity.getOrderDate().equals(orderDate))
                .collect(Collectors.toList());
    }

    @GetMapping("/orders/requiredDate={requiredDate}")
    public List<OrderEntity> getOrdersByRequiredDate(@PathVariable String requiredDate) {
        return orderRepository.findAll()
                .stream()
                .filter(employeeEntity -> employeeEntity.getRequiredDate().equals(requiredDate))
                .collect(Collectors.toList());
    }
    

    @GetMapping("/orders/shipVia={shipVia}")
    public List<OrderEntity> getOrdersByShipVia(@PathVariable String shipVia) {
        return orderRepository.findAll()
                .stream()
                .filter(employeeEntity -> employeeEntity.getShipVia().equals(shipVia))
                .collect(Collectors.toList());
    }

    @GetMapping("/orders/freight={freight}")
    public List<OrderEntity> getOrdersByFreight(@PathVariable Double freight) {
        return orderRepository.findAll()
                .stream()
                .filter(employeeEntity -> employeeEntity.getFreight()==(freight))
                .collect(Collectors.toList());
    }

    @GetMapping("/orders/shipName={shipName}")
    public List<OrderEntity> getOrdersByShipName(@PathVariable String shipName) {
        return orderRepository.findAll()
                .stream()
                .filter(employeeEntity -> employeeEntity.getShipName().equals(shipName))
                .collect(Collectors.toList());
    }

    @GetMapping("/orders/shipCity={shipCity}")
    public List<OrderEntity> getOrdersByShipCity(@PathVariable String shipCity) {
        return orderRepository.findAll()
                .stream()
                .filter(employeeEntity -> employeeEntity.getShipCity().equals(shipCity))
                .collect(Collectors.toList());
    }

    @GetMapping("/orders/shipCountry={shipCountry}")
    public List<OrderEntity> getOrdersByShipCountry(@PathVariable String shipCountry) {
        return orderRepository.findAll()
                .stream()
                .filter(employeeEntity -> employeeEntity.getShipCountry().equals(shipCountry))
                .collect(Collectors.toList());
    }


}
