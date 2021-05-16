package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Customer;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

import java.util.List;

@OpenAPIDefinition(
    info = @Info(title = "Customer API"),
    servers = {@Server(url = "http://localhost:8080")})
public interface CustomerController {
  List<Customer> getCustomers();
}
