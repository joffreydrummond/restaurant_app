package com.bnj.restaurant.controller;


import com.bnj.restaurant.entity.Food;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j @RestController
public class FoodController  implements FoodOperation{


    @Override
    public List<Food> getFoods() {
        log.debug("I am getFoods() in controller");
        return null;
    }
}
