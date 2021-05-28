package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Customer;
import com.bnj.restaurant.entity.Food;
import com.bnj.restaurant.entity.FoodTypes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                .food_type(FoodTypes.valueOf(rs.getString("food_type")))
                .description(rs.getString("description"))
                .is_gluten_free(rs.getBoolean("is_gluten_free"))
                .is_vegan(rs.getBoolean("is_vegan"))
                .price(rs.getBigDecimal("price"))
                .build());
  }

  static class FoodResultSetExtractor implements ResultSetExtractor<Food> {
    @Override
    public Food extractData(ResultSet rs) throws SQLException, DataAccessException {
      rs.next();
      return Food.builder()
          .food_id(rs.getInt("food_id"))
          .food_name(rs.getString("food_name"))
          .food_type(FoodTypes.valueOf(rs.getString("food_type")))
          .description(rs.getString("description"))
          .is_gluten_free(rs.getBoolean("is_gluten_free"))
          .is_vegan(rs.getBoolean("is_vegan"))
          .price(rs.getBigDecimal("price"))
          .build();
    }
  }

  @Override
  public Food getFoodById(int food_id) {
    log.debug("I am getFoodById() in dao");

    final String sql = "SELECT * FROM foods WHERE food_id=:food_id";

    Map<String, Object> params = new HashMap<>();
    params.put("food_id", food_id);

    return jdbcTemplate.query(sql, params, new FoodResultSetExtractor());
  }
}
