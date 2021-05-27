package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Food;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class DefaultFoodDao implements FoodDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public List<Food> getFoods() {
    log.debug("I am getFoods() in dao");
    return null;
  }
}
