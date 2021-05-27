package com.bnj.restaurant.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/foods")
@OpenAPIDefinition(
    info = @Info(title = "Food API"),
    servers = {@Server(url = "http://localhost:8080", description = "Local Server")})
public interface FoodOperation {}
