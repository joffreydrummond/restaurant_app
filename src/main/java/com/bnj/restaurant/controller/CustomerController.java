package com.bnj.restaurant.controller;


import com.bnj.restaurant.entity.Customer;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController implements CustomerOperation{


    @Override
    public List<Customer> getCustomers() {
        return null;
    }
}
