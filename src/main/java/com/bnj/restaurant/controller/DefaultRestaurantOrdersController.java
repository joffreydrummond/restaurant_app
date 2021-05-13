package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Orders;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus
@Slf4j
public class DefaultRestaurantOrdersController implements RestaurantOrdersController {
    @Override
    public List<Orders> fetchOrders(int order_id) {
        return null;
    }
}
