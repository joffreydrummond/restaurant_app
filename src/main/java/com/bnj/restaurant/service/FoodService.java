package com.bnj.restaurant.service;

import com.bnj.restaurant.entity.Food;

import java.util.List;

public interface FoodService {

    List<Food> getFoods();
    Food getFoodById(int food_id);
}
