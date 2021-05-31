package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Food;
import com.bnj.restaurant.entity.FoodTypes;
import com.bnj.restaurant.entity.OrderTypes;
import com.bnj.restaurant.entity.Orders;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
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

  static class OrderResultSetExtractor implements ResultSetExtractor<Orders> {
    @Override
    public Orders extractData(ResultSet rs) throws SQLException, DataAccessException {
      rs.next();
      return Orders.builder()
          .order_id(rs.getInt("order_id"))
          .customer_id(rs.getInt("customer_id"))
          .price(rs.getBigDecimal("price"))
          .order_date(rs.getString("order_date"))
          .order_filled(rs.getBoolean("order_filled"))
          .order_type(OrderTypes.valueOf(rs.getString("order_type")))
          .build();
    }
  }

  @Override
  public Orders getOrderById(int order_id) {
    log.debug("I am getOrderById() in dao");
    final String sql = "SELECT * FROM orders WHERE order_id=:order_id";

    Map<String, Object> params = new HashMap<>();
    params.put("order_id", order_id);

    return jdbcTemplate.query(sql, params, new DefaultOrderDao.OrderResultSetExtractor());
  }

  @Override
  public Orders createOrder(Orders order) {
    log.debug("I am createOrder() in dao");
    final String sql =
        "INSERT INTO orders (price, order_date, order_filled, order_type, customer_id) "
            + "VALUES (:price, :order_date, :order_filled, :order_type, :customer_id)";

    SqlParameterSource sqlParam =
        new MapSqlParameterSource("price", order.getPrice())
            .addValue("order_date", order.getOrder_date())
            .addValue("order_filled", order.isOrder_filled())
            .addValue("order_type", order.getOrder_type())
            .addValue("customer_id", order.getCustomer_id());

    KeyHolder keyHolder = new GeneratedKeyHolder();

    jdbcTemplate.update(sql, sqlParam, keyHolder);

    int order_id = Objects.requireNonNull(keyHolder.getKey()).intValue();

    return Orders.builder()
        .order_id(order_id)
        .price(order.getPrice())
        .order_date(order.getOrder_date())
        .order_filled(order.isOrder_filled())
        .customer_id(order.getCustomer_id())
        .build();
  }
}
