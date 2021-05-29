package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Food;
import com.bnj.restaurant.entity.Orders;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RequestMapping("/v1/orders")
@OpenAPIDefinition(
        info = @Info(title = "Order API"),
        servers = {@Server(url = "http://localhost:8080", description = "Local Server")})
public interface OrderOperation {

    @Operation(
            summary = "Returns a list of orders",
            description = "Returns a list of orders",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "A list of orders is returned",
                            content =
                            @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = Order.class))),
                    @ApiResponse(
                            responseCode = "404",
                            description = "The requested URL was not found.",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Internal Server Error Occurred",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
            })
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<Orders> getOrders();

    @Operation(
            summary = "Get order by order id",
            description = "Get order by order id",
            responses = {
                    @ApiResponse(
                            responseCode = "201",
                            description = "An order is successfully retrieved",
                            content =
                            @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = Food.class))),
                    @ApiResponse(
                            responseCode = "400",
                            description = "The order id parameters are not correct",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
                    @ApiResponse(
                            responseCode = "404",
                            description = "The order was not found by the order id.",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Internal Server Error Occurred",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
            }
            ,
            parameters = {
                    @Parameter(
                            name = "order_id",
                            allowEmptyValue = false,
                            required = false,
                            description = "The order id (i.e, '1', '2', '3')")
            }
    )
    @GetMapping("/{order_id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    Orders getOrderById(@PathVariable int order_id);
}
