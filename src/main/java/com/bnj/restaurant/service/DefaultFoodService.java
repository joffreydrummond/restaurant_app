package com.bnj.restaurant.service;

import com.bnj.restaurant.dao.FoodDao;
import com.bnj.restaurant.entity.Food;
import com.bnj.restaurant.entity.FoodTypes;
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
        return foodDao.getFoods();
    }

    @Override
    public List<Food> getFoods(FoodTypes food_type) {
        return foodDao.getFoods();
    }

//    @Override
//    public List<Food> getFoods(FoodTypes food_type) {
//                log.debug("I am getFoodByType() in service");
//
//        return foodDao.getFoods(food_type);
//    }

    @Override
    public Food getFoodById(int food_id) {
        log.debug("I am getFoodById() in service");
        return foodDao.getFoodById(food_id);
    }

//    @Override
//    public Food getFoodByType(Food food_type) {
//        log.debug("I am getFoodByType() in service");
//        return foodDao.getFoodByType(food_type);
//    }

//s

}
