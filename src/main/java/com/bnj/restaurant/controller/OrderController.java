package com.bnj.restaurant.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class OrderController implements OrderOperation{
    @Override
    public List<Order> getOrders() {
        return null;
    }
}
