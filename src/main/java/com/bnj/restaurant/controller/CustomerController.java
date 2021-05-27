package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Customer;
import com.bnj.restaurant.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class CustomerController implements CustomerOperation {

  @Autowired private CustomerService customerService;

  @Override
  @PostMapping
  public Customer createCustomer(Customer customer) {
    log.debug("I am createCustomers() in controller");

    return customerService.createCustomer(customer);
  }

  @Override
  public Customer getCustomerById(int customer_id) {
    log.debug("I am getCustomersById() in controller");

    return customerService.getCustomerById(customer_id);
  }


  @Override
  public List<Customer> getCustomers() {
    log.debug("I am getCustomers() in controller");

    return customerService.getCustomers();
  }

//  @RequestMapping("/{customer_id}")
  public Customer updateCustomerById(@PathVariable("customer_id")int customer_id, @RequestBody Customer customer) {
    log.debug("I am updateCustomers() in controller");

    return customerService.updateCustomerById(customer_id, customer);
  }

  @Override
  public String deleteCustomerById(@PathVariable("customer_id") int customer_id) {
    log.debug("I am deleteCustomersById() in controller");

    return customerService.deleteCustomerById(customer_id);
  }



}
