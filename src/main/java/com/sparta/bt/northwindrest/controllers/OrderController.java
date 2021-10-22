package com.sparta.bt.northwindrest.controllers;

import com.sparta.bt.northwindrest.DTO.CustomerDTO;
import com.sparta.bt.northwindrest.DTO.OrderDTO;
import com.sparta.bt.northwindrest.entities.OrderEntity;
import com.sparta.bt.northwindrest.mapping.OrderMap;
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
    private OrderMap orderMap;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/orders")
    @ResponseBody
    public List<OrderDTO> getAllOrders() {
        List<OrderDTO> orderEntities = orderMap.getAllOrders();
        return orderEntities;
    }

    @GetMapping("/orders/orderID={orderID}")
    public List<OrderDTO> getOrderById(@PathVariable Integer orderID) {
        List<OrderDTO> orderEntities = orderMap.getAllOrders()
                .stream()
                .filter(customerEntity -> customerEntity.getId().equals(orderID))
                .toList();

        return orderEntities;
    }

    @GetMapping("/orders/employeeID={employeeID}")
    public List<OrderDTO> getOrderByEmployeeId(@PathVariable String employeeID) {
        List<OrderDTO> orderEntities = orderMap.getAllOrders()
                .stream()
                .filter(employeeEntity -> employeeEntity.getEmployeeID().equals(employeeID))
                .collect(Collectors.toList());

        return orderEntities;
    }

    @GetMapping("/orders/customerID={customerID}")
    public List<OrderDTO> getOrdersByCustomerId(@PathVariable String customerID) {
        List<OrderDTO> orderEntities = orderMap.getAllOrders()
                .stream()
                .filter(employeeEntity -> employeeEntity.getCustomerID().equals(customerID))
                .collect(Collectors.toList());

        return orderEntities;
    }

    @GetMapping("/orders/orderDate={orderDate}")
    public List<OrderDTO> getOrdersByOrderDate(@PathVariable String orderDate) {
        List<OrderDTO> orderEntities = orderMap.getAllOrders()
                .stream()
                .filter(employeeEntity -> employeeEntity.getOrderDate().equals(orderDate))
                .collect(Collectors.toList());

        return orderEntities;
    }

    @GetMapping("/orders/requiredDate={requiredDate}")
    public List<OrderDTO> getOrdersByRequiredDate(@PathVariable String requiredDate) {
        List<OrderDTO> orderEntities = orderMap.getAllOrders()
                .stream()
                .filter(employeeEntity -> employeeEntity.getRequiredDate().equals(requiredDate))
                .collect(Collectors.toList());

        return orderEntities;
    }


    @GetMapping("/orders/shipVia={shipVia}")
    public List<OrderDTO> getOrdersByShipVia(@PathVariable String shipVia) {
        List<OrderDTO> orderEntities = orderMap.getAllOrders()
                .stream()
                .filter(employeeEntity -> employeeEntity.getShipVia().equals(shipVia))
                .collect(Collectors.toList());

        return orderEntities;
    }

    @GetMapping("/orders/freight={freight}")
    public List<OrderDTO> getOrdersByFreight(@PathVariable Double freight) {
        List<OrderDTO> orderEntities = orderMap.getAllOrders()
                .stream()
                .filter(employeeEntity -> employeeEntity.getFreight()==(freight))
                .collect(Collectors.toList());

        return orderEntities;
    }

    @GetMapping("/orders/shipName={shipName}")
    public List<OrderDTO> getOrdersByShipName(@PathVariable String shipName) {
        List<OrderDTO> orderEntities = orderMap.getAllOrders()
                .stream()
                .filter(employeeEntity -> employeeEntity.getShipName().equals(shipName))
                .collect(Collectors.toList());

        return orderEntities;
    }

    @GetMapping("/orders/shipCity={shipCity}")
    public List<OrderDTO> getOrdersByShipCity(@PathVariable String shipCity) {
        List<OrderDTO> orderEntities = orderMap.getAllOrders()
                .stream()
                .filter(employeeEntity -> employeeEntity.getShipCity().equals(shipCity))
                .collect(Collectors.toList());

        return orderEntities;
    }

    @GetMapping("/orders/shipCountry={shipCountry}")
    public List<OrderDTO> getOrdersByShipCountry(@PathVariable String shipCountry) {
        List<OrderDTO> orderEntities = orderMap.getAllOrders()
                .stream()
                .filter(employeeEntity -> employeeEntity.getShipCountry().equals(shipCountry))
                .collect(Collectors.toList());

        return orderEntities;
    }


}
