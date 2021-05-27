package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Food;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class DefaultFoodDao implements FoodDao {

  @Override
  public List<Food> getFoods() {
    log.debug("I am getFoods() in dao");
    return null;
  }
}
