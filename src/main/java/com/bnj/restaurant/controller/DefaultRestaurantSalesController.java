package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Food;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus
@Slf4j
public class DefaultRestaurantSalesController implements RestaurantSalesController {


    @Override
    public List<Food> fetchFoodType(String foodType) {
        return null;
    }
}
