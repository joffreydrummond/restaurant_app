package com.bnj.restaurant.controller;

import com.bnj.restaurant.entity.Customer;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.http.MediaType;

import java.util.List;

@OpenAPIDefinition(
    info = @Info(title = "Customer API"),
    servers = {@Server(url = "http://localhost:8080")})
public interface CustomerController {

  @Operation(
          summary = "Returns a list of customers",
          description = "Returns a list of customers",
          responses = {@ApiResponse(responseCode = "200", description = "A list of customers is returned", content =
          @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Customer.class)))})


  List<Customer> getCustomers();
}
