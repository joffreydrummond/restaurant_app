package com.bnj.restaurant.service;

import com.bnj.restaurant.entity.Customer;

import java.util.List;

public class DefaultCustomerService  implements CustomerService{
    @Override
    public List<Customer> getCustomers(String first_name, String last_name, String address, String phone,
                                       String email) {
        return null;
    }
}
