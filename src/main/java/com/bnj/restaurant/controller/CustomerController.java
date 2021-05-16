package com.bnj.restaurant.controller;


import com.bnj.restaurant.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @Slf4j
public class CustomerController implements CustomerOperation{


    @Override
    public List<Customer> getCustomers() {
        log.info("I am in the getCustomers() in the controller");
        return null;
    }
}
