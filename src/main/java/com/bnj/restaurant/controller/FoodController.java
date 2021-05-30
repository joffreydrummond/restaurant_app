package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Food;
import com.bnj.restaurant.entity.FoodTypes;
import com.bnj.restaurant.service.FoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class FoodController implements FoodOperation {

  @Autowired private FoodService foodService;

  @Override
  public List<Food> getFoods(FoodTypes food_type) {
    log.debug("I am getFoods(food_type) in controller");
    List<Food> foodList;
    if (food_type != null) {
      foodList = foodService.getFoods(food_type);
    } else {
      foodList = foodService.getFoods();
    }
    return foodList;
  }

//  @Override
//  public List<Food> getFoods() {
//    log.debug("I am getFoods() in controller");
//    return foodService.getFoods();
//  }



  @Override
  public Food getFoodById(int food_id) {
    log.debug("I am getFoodById() in controller");
    return foodService.getFoodById(food_id);
  }



}
