package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

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

  @Override
  public Customer createCustomer(Customer customer) {
    log.debug("I am createCustomers() in dao");
     final String sql = "INSERT INTO customers (first_name, last_name, address, phone, email) " +
             "VALUES (:first_name, :last_name, :address, :phone, :email)";


SqlParameterSource sqlParam = new MapSqlParameterSource("first_name", customer.getFirst_name())
        .addValue("last_name", customer.getLast_name())
        .addValue("address", customer.getAddress())
        .addValue("phone", customer.getPhone())
        .addValue("email", customer.getEmail());

    KeyHolder keyHolder = new GeneratedKeyHolder();

    jdbcTemplate.update(sql, sqlParam);

    return customer;
  }


}
