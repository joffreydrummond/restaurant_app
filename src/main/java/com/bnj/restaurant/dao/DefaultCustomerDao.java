package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

  class CustomerResultSetExtractor implements ResultSetExtractor<Customer> {
    @Override
    public Customer extractData(ResultSet rs) throws SQLException, DataAccessException {
      rs.next();
      return Customer.builder()
          .customer_id(rs.getInt("customer_id"))
          .first_name(rs.getString("first_name"))
          .last_name(rs.getString("last_name"))
          .address(rs.getString("address"))
          .phone(rs.getString("phone"))
          .email(rs.getString("email"))
          .build();
    }
  }

  @Override
  public Customer getCustomerById(int customer_id) {
    log.debug("I am getCustomersById() in dao");

    final String sql = "SELECT * FROM customers WHERE customer_id=:customer_id";

    Map<String, Object> params = new HashMap<>();
    params.put("customer_id", customer_id);

    return jdbcTemplate.query(sql, params, new CustomerResultSetExtractor());
  }

  @Override
  public Customer createCustomer(Customer customer) {
    log.debug("I am createCustomers() in dao");
    final String sql =
        "INSERT INTO customers (first_name, last_name, address, phone, email) "
            + "VALUES (:first_name, :last_name, :address, :phone, :email)";

    SqlParameterSource sqlParam =
        new MapSqlParameterSource("first_name", customer.getFirst_name())
            .addValue("last_name", customer.getLast_name())
            .addValue("address", customer.getAddress())
            .addValue("phone", customer.getPhone())
            .addValue("email", customer.getEmail());

    KeyHolder keyHolder = new GeneratedKeyHolder();

    jdbcTemplate.update(sql, sqlParam, keyHolder);

    int customer_id = Objects.requireNonNull(keyHolder.getKey()).intValue();

    return Customer.builder()
        .customer_id(customer_id)
        .first_name(customer.getFirst_name())
        .last_name(customer.getLast_name())
        .address(customer.getAddress())
        .phone(customer.getPhone())
        .email(customer.getEmail())
        .build();
  }

  public Customer updateCustomerById(int customer_id, Customer customer) { //tried to
    String sql =
        "UPDATE customers SET first_name = :first_name, last_name = :last_name,"
            + "address = :address, phone = :phone, email = :email WHERE customer_id= :customer_id";

    Customer customerSelected = getCustomerById(customer_id);

    if (customerSelected != null) {
      SqlParameterSource sqlParam =
              new MapSqlParameterSource("first_name", customer.getFirst_name())
                      .addValue("last_name", customer.getLast_name())
                      .addValue("address", customer.getAddress())
                      .addValue("phone", customer.getPhone())
                      .addValue("email", customer.getEmail())
                      .addValue("customer_id", customer_id);



//      Map<String, Object> params = new HashMap<>();
//      params.put("customer_id", customer_id);

      jdbcTemplate.update(sql, sqlParam);

      customerSelected = getCustomerById(customer_id);

    }



//    int rows = jdbcTemplate.update(sql, sqlParam);



    return customerSelected;
  }

  public void deleteCustomerById(int customer_id) {
    final String sql = "DELETE FROM customers WHERE customer_id =?";
    log.debug("I am deleteCustomersById() in dao");

    Map<String, Object> params = new HashMap<>();
    params.put("customer_id", customer_id);

    //            jdbcTemplate.query(sql, params);
  }
}
