package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.OrderTypes;
import com.bnj.restaurant.entity.Orders;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class DefaultOrderDao implements OrderDao {

  @Autowired private NamedParameterJdbcTemplate jdbcTemplate;


  private OrderTypes orderTypes;

  @Override
  public List<Orders> getOrders() {
    log.debug("I am getOrders() in dao");
    final String sql = "SELECT * FROM orders";
    return jdbcTemplate.query(
        sql,
        (rs, i) ->
            Orders.builder()
                .order_id(rs.getInt("order_id"))
                .customer_id(rs.getInt("customer_id"))
                .price(rs.getBigDecimal("price"))
                .order_date(rs.getString("order_date"))
                .order_filled(rs.getBoolean("order_filled"))
                .order_type(OrderTypes.valueOf(rs.getString("order_type")))
                .build());
  }
}