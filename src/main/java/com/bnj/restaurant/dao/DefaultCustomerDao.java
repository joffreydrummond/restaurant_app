package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class DefaultCustomerDao implements CustomerDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public List<Customer> getCustomers() {
    log.debug("I am getCustomers() in dao");
    return null;
  }
}
