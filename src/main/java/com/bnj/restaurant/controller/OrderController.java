package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Orders;
import com.bnj.restaurant.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class OrderController implements OrderOperation{

    @Autowired
    private OrderService orderService;

    @Override
    public List<Orders> getOrders() {
        log.debug("I am getOrders() in controller");

        return orderService.getOrders();
    }

    @Override
    public Orders getOrderById(int order_id) {
        log.debug("I am getOrderById() in controller");

        return null;
    }
}
