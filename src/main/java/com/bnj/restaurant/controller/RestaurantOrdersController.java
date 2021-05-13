package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Orders;

import java.util.List;

public interface RestaurantOrdersController {
    List<Orders> fetchOrders(int order_id);
}
