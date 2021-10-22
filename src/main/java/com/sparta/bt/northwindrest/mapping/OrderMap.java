package com.sparta.bt.northwindrest.mapping;

import com.sparta.bt.northwindrest.dto.OrderDTO;
import com.sparta.bt.northwindrest.entities.OrderEntity;
import com.sparta.bt.northwindrest.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderMap {

    @Autowired
    private OrderRepository orderRepository;

    public List<OrderDTO> getAllOrders(){
        return((List<OrderEntity>) orderRepository
                .findAll())
                .stream()
                .map(this::convertToOrderDTO).collect(Collectors.toList());

    }

    private OrderDTO convertToOrderDTO(OrderEntity orderEntity){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(orderEntity.getId());
        orderDTO.setCustomerID(orderEntity.getCustomerID());
        orderDTO.setEmployeeID(orderEntity.getEmployeeID());
        orderDTO.setOrderDate(orderEntity.getOrderDate());
        orderDTO.setRequiredDate(orderEntity.getRequiredDate());
        orderDTO.setShippedDate(orderEntity.getShippedDate());
        orderDTO.setShipVia(orderEntity.getShipVia());
        orderDTO.setFreight(orderEntity.getFreight());
        orderDTO.setShipName(orderEntity.getShipName());
        orderDTO.setShipAddress(orderEntity.getShipAddress());
        orderDTO.setShipCity(orderEntity.getShipCity());
        orderDTO.setShipCountry(orderEntity.getShipCountry());

        return orderDTO;

    }
}
