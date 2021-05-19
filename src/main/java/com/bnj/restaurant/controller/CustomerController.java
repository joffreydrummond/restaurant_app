package com.bnj.restaurant.controller;


import com.bnj.restaurant.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @Slf4j
public class CustomerController implements CustomerOperation{

    @RequestMapping


    @Override
    public List<Customer> getCustomers() {
        log.debug("I am getCustomers() in controller");
        return null;
    }
}
