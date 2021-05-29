package com.bnj.restaurant.service;

import com.bnj.restaurant.entity.Food;
import com.bnj.restaurant.entity.FoodTypes;

import java.util.List;

public interface FoodService {

    List<Food> getFoods();
    List<Food> getFoods(FoodTypes food_type);
    Food getFoodById(int food_id);
//    Food getFoodByType(Food food_type);
//    List<Food> getFoodsByType(Food food_type);
}
