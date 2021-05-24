package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Slf4j
@Component
public class DefaultCustomerDao implements CustomerDao {

  @Autowired private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public List<Customer> getCustomers() {
    log.debug("I am getCustomers() in dao");

    final String sql = "SELECT * FROM customers";
    return
    //            null;
    jdbcTemplate.query(
        sql,
        (rs, i) ->
            Customer.builder()
                .customer_id(rs.getInt("customer_id"))
                .first_name(rs.getString("first_name"))
                .last_name(rs.getString("last_name"))
                .address(rs.getString("address"))
                .phone(rs.getString("phone"))
                .email(rs.getString("email"))
                .build());
  }
}
