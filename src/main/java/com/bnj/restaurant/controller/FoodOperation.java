package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Customer;
import com.bnj.restaurant.entity.Food;
import com.bnj.restaurant.entity.FoodTypes;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    List<Food> getFoods(@RequestParam(required = false, value ="food_type") FoodTypes food_type);

    @Operation(
            summary = "Get food by food id",
            description = "Get food by food id",
            responses = {
                    @ApiResponse(
                            responseCode = "201",
                            description = "A food is successfully retrieved",
                            content =
                            @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = Food.class))),
                    @ApiResponse(
                            responseCode = "400",
                            description = "The food parameters are not correct",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
                    @ApiResponse(
                            responseCode = "404",
                            description = "The food was not found by the food id.",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Internal Server Error Occurred",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
            }
            ,
            parameters = {
                    @Parameter(
                            name = "food_id",
                            allowEmptyValue = false,
                            required = false,
                            description = "The food id (i.e, '1', '2', '3')")
            }
    )
    @GetMapping("/{food_id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    Food getFoodById(@PathVariable int food_id);

//    @Operation(
//            summary = "Get foods by food type",
//            description = "Get foods by food type",
//            responses = {
//                    @ApiResponse(
//                            responseCode = "201",
//                            description = "A list of food type is successfully retrieved",
//                            content =
//                            @Content(
//                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
//                                    schema = @Schema(implementation = Food.class))),
//                    @ApiResponse(
//                            responseCode = "400",
//                            description = "The food type parameters are not correct",
//                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
//                    @ApiResponse(
//                            responseCode = "404",
//                            description = "The food was not found by the food type you entered.",
//                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
//                    @ApiResponse(
//                            responseCode = "500",
//                            description = "Internal Server Error Occurred",
//                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
//            }
//            ,
//            parameters = {
//                    @Parameter(
//                            name = "food_type",
//                            allowEmptyValue = false,
//                            required = false)
//            }
//    )
//    @GetMapping("/{food_type}")
//    @ResponseStatus(code = HttpStatus.OK)
//List<Food> getFoods(@RequestParam(required = false, value ="food_type") FoodTypes food_type);
//
//    @GetMapping
//    @ResponseStatus(code = HttpStatus.OK)
//    List<Food> getFoods(@RequestParam(required = false, value ="food_type") FoodTypes foodType);


}
