package com.bnj.restaurant.controller;


import com.bnj.restaurant.entity.Customer;
import com.bnj.restaurant.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @Slf4j
public class CustomerController implements CustomerOperation{

    @Autowired
    private CustomerService customerService;

    @RequestMapping


    @Override
    public List<Customer> getCustomers() {
        log.debug("I am getCustomers() in controller");
        return null;
    }
}
