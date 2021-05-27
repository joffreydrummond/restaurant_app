package com.bnj.restaurant.service;

import com.bnj.restaurant.dao.FoodDao;
import com.bnj.restaurant.entity.Food;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @Slf4j
public class DefaultFoodService implements FoodService{

    @Autowired
    private FoodDao foodDao;

    @Override
    public List<Food> getFoods() {
        log.debug("I am getFoods() in service");
        return null;
    }
}
