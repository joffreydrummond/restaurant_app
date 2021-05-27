package com.bnj.restaurant.dao;

import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrderDao {

    List<Order> getOrders();
}
