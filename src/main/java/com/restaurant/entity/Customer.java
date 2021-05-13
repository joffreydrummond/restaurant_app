package com.restaurant.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
  private int customer_id;
  private String first_name;
  private String last_name;
  private String address;
  private String phone;
  private String email;
}
