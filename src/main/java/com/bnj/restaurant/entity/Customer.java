package com.bnj.restaurant.entity;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class Customer implements Comparable<Customer>{
  private int customer_id;

  @NotBlank(message = "First name is required")
  private String first_name;
  @NotBlank(message = "Last name is required")
  private String last_name;
  @NotBlank(message = "Address is required")
  private String address;
  @NotBlank(message = "Phone number is required")
  private String phone;
  @NotBlank(message = "Email is required")
  private String email;

  @Override
  public int compareTo(Customer o) {
    return 0;
  }
}
