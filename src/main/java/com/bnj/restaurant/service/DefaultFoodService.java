package com.bnj.restaurant.service;

import com.bnj.restaurant.entity.Food;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @Slf4j
public class DefaultFoodService implements FoodService{
    @Override
    public List<Food> getFoods() {
        log.debug("I am getFoods() in service");
        return null;
    }
}
