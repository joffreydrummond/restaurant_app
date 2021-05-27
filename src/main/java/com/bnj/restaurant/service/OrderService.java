package com.bnj.restaurant.service;

import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrders();
}
