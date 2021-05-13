package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Food;
import com.bnj.restaurant.entity.Orders;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

import java.util.List;

@OpenAPIDefinition(
    info = @Info(title = "BNJ Order Service"),
    servers = {@Server(url = "http://localhost:8080", description = "Local Server.")})
public interface RestaurantSalesController {

  List<Food> fetchFoodType(String foodType);
}
