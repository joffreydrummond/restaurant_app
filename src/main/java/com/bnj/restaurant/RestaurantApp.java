package com.bnj.restaurant;

import com.bnj.ComponentScanMarker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class})
public class RestaurantApp {
  
  public static void main(String[] args) {
    SpringApplication.run(RestaurantApp.class, args);
  }

}
