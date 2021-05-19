package com.bnj.restaurant.service;

import com.bnj.restaurant.entity.Customer;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Slf4j
public class DefaultCustomerService  implements CustomerService{
    @Override
    public List<Customer> getCustomers( ) {
        log.debug("I am getCustomers() in service");
        return null;
    }
}
