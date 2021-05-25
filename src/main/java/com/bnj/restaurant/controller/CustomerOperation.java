package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Customer;
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

// returns list of customers
@RequestMapping("/v1/customers")
@OpenAPIDefinition(
    info = @Info(title = "Customer API"),
    servers = {@Server(url = "http://localhost:8080", description = "Local Server")})
public interface CustomerOperation {
  @Operation(
      summary = "Creates a new customer",
      description = "Creates a new customer",
      responses = {
        @ApiResponse(
            responseCode = "201",
            description = "A new customer is successfully created",
            content =
                @Content(
                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = Customer.class))),
        @ApiResponse(
            responseCode = "400",
            description = "The customer parameters are not correct",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
        @ApiResponse(
            responseCode = "404",
            description = "The customer was not found.",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
        @ApiResponse(
            responseCode = "500",
            description = "Internal Server Error Occurred",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
      })
  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  Customer createCustomer(@RequestBody Customer customer);

  @Operation(
      summary = "Get customer by customer id",
      description = "Get customer by customer id",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "A customer is successfully retrieved",
            content =
                @Content(
                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = Customer.class))),
        @ApiResponse(
            responseCode = "400",
            description = "The customer parameters are not correct",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
        @ApiResponse(
            responseCode = "404",
            description = "The customer was not found by the customer id.",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
        @ApiResponse(
            responseCode = "500",
            description = "Internal Server Error Occurred",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
      }
      ,
      parameters = {
        @Parameter(
            name = "customer_id",
            allowEmptyValue = false,
            required = false,
            description = "The customer id (i.e, '1', '2', '3')")
      }
      )
  @GetMapping("/{customer_id}")
  @ResponseStatus(code = HttpStatus.CREATED)
  Customer getCustomerById(@PathVariable int customer_id);

  @Operation(
      summary = "Returns a list of customers",
      description = "Returns a list of customers",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "A list of customers is returned",
            content =
                @Content(
                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = Customer.class)))
      })
  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  List<Customer> getCustomers();

//        @Operation(
//        summary = "Returns a list of customers",
//        description = "Returns a list of customers",
//        responses = {
//          @ApiResponse(
//              responseCode = "200",
//              description = "A list of customers is returned",
//              content =
//                  @Content(
//                      mediaType = MediaType.APPLICATION_JSON_VALUE,
//                      schema = @Schema(implementation = Customer.class))),
//          @ApiResponse(
//              responseCode = "400",
//              description = "The request parameters are invalid",
//              content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
//          @ApiResponse(
//              responseCode = "404",
//              description = "The customer was not found.",
//              content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
//          @ApiResponse(
//              responseCode = "500",
//              description = "Internal Server Error Occurred",
//              content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
//        })
//    @GetMapping
//    @ResponseStatus(code = HttpStatus.OK)
//    List<Customer> getCustomers();

}
