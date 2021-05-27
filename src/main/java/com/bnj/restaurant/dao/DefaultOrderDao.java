package com.bnj.restaurant.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class DefaultOrderDao implements OrderDao{
    @Override
    public List<Order> getOrders() {
        log.debug("I am getOrders() in dao");
        return null;
    }
}
