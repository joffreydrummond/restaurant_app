package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class DefaultCustomerDao implements CustomerDao {
  @Override
  public List<Customer> getCustomers() {
    log.debug("I am getCustomers() in dao");
    return null;
  }
}
