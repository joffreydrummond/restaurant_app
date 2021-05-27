package com.bnj.restaurant.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DefaultOrderService implements OrderService{
    @Override
    public List<Order> getOrders() {
        log.debug("I am getOrders() in service");
        return null;
    }
}
