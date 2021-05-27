package com.bnj.restaurant.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/v1/orders")
@OpenAPIDefinition(
        info = @Info(title = "Order API"),
        servers = {@Server(url = "http://localhost:8080", description = "Local Server")})
public interface OrderOperation {

    List<Order> getOrders();
}
