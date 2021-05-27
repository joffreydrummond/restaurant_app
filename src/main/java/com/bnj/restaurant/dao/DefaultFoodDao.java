package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Customer;
import com.bnj.restaurant.entity.Food;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class DefaultFoodDao implements FoodDao {

  @Autowired private NamedParameterJdbcTemplate jdbcTemplate;

  final String sql = "SELECT * FROM foods";

  @Override
  public List<Food> getFoods() {
    log.debug("I am getFoods() in dao");
    return jdbcTemplate.query(
        sql,
        (rs, i) ->
            Food.builder()
                .food_id(rs.getInt("food_id"))
                .food_name(rs.getString("food_name"))
//                .food_type(rs.getString("food_type"))
                .description(rs.getString("description"))
                .is_gluten_free(rs.getBoolean("is_gluten_free"))
                .is_vegan(rs.getBoolean("is_vegan"))
                .price(rs.getBigDecimal("price"))
                .build());
  }
}
