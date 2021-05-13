package com.restaurant.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class})
public class RestaurantSales {
  
  public static void main(String[] args) {
    SpringApplication.run(RestaurantSales.class, args);
  }

}
