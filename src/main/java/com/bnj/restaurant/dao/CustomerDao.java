package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Customer;

import java.util.List;

public interface CustomerDao {
  List<Customer> getCustomers();

   Customer getCustomerById(int customer_id);

  Customer createCustomer(Customer customer);

//    Customer createCustomer(Customer customer);

    Customer updateCustomerById(int customer_id, Customer customer);

  String deleteCustomerById(int customer_id);
}
