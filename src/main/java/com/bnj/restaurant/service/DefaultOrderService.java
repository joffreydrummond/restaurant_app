package com.bnj.restaurant.service;

import com.bnj.restaurant.dao.OrderDao;
import com.bnj.restaurant.entity.OrderTypes;
import com.bnj.restaurant.entity.Orders;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DefaultOrderService implements OrderService{

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Orders> getOrders() {
        log.debug("I am getOrders() in service");
        return orderDao.getOrders();
    }

    @Override
    public Orders getOrderById(int order_id) {
        log.debug("I am getOrderById() in service");

        return null;
    }

    @Override
    public Orders createOrder(Orders order) {
        log.debug("I am createOrder() in service");
        return orderDao.createOrder(order);
    }

//    @Override
//    public List<OrderTypes> orderTypes() {
//        return null;
//    }
}
