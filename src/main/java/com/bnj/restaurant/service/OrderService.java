package com.bnj.restaurant.service;

import com.bnj.restaurant.entity.OrderTypes;
import com.bnj.restaurant.entity.Orders;

import java.util.List;

public interface OrderService {
    List<Orders> getOrders();

    List<OrderTypes> orderTypes();
}
