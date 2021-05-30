package com.bnj.restaurant.dao;

import com.bnj.restaurant.entity.Food;
import com.bnj.restaurant.entity.FoodTypes;

import java.util.List;

public interface FoodDao {
    List<Food> getFoods();
    List<Food> getFoods(FoodTypes food_type);

    Food getFoodById(int food_id);
//    Food getFoodByType(Food food_type);
}
