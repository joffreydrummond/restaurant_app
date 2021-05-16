package com.bnj.restaurant.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(title = "Customer API"),
    servers = {@Server(url = "http://localhost:8080")})
public interface CustomerController {}
