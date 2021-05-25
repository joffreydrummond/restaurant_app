package com.bnj.restaurant.service;

import com.bnj.restaurant.dao.CustomerDao;
import com.bnj.restaurant.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Slf4j
@Service
public class DefaultCustomerService implements CustomerService {

  @Autowired private CustomerDao customerDao;

  @Override
  public List<Customer> getCustomers() {
    log.debug("I am getCustomers() in service");
    List<Customer> customers = customerDao.getCustomers();
    Collections.sort(customers);

    return customers;
  }

  @Override
  public Customer createCustomer(Customer customer) {
    log.debug("I am createCustomers() in service");

    return customerDao.createCustomer(customer);
  }

  public Customer updateCustomer(Customer customer){
    return customerDao.updateCustomer(customer);
  }

}
