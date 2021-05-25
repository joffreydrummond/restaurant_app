package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> getCustomers();

    Customer createCustomer(Customer customer);

    Customer  updateCustomer(Customer customer);
}
