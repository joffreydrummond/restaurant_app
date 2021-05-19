package com.bnj.restaurant.service;

import com.bnj.restaurant.entity.Customer;

import java.util.List;

public interface CustomerService {
  List<Customer> getCustomers(
      String first_name, String last_name, String address, String phone, String email);
}
