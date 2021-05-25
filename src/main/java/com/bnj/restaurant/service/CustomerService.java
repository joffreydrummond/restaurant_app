package com.bnj.restaurant.service;

import com.bnj.restaurant.entity.Customer;

import java.util.List;

public interface CustomerService {


  List<Customer> getCustomers();

  Customer getCustomerById(int customer_id);

  Customer createCustomer(Customer customer);

  Customer updateCustomerById(int customer_id, Customer customer);
}
