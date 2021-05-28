package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Orders;

import java.util.List;

public interface OrderDao {

    List<Orders> getOrders();

    Orders getOrderById(int order_id);
}
