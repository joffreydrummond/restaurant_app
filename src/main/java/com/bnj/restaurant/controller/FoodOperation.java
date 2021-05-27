package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Food;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RequestMapping("/v1/foods")
@OpenAPIDefinition(
    info = @Info(title = "Food API"),
    servers = {@Server(url = "http://localhost:8080", description = "Local Server")})
public interface FoodOperation {
    @Operation(
            summary = "Returns a list of foods",
            description = "Returns a list of foods",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "A list of foods is returned",
                            content =
                            @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = Food.class))),
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
    List<Food> getFoods();




}