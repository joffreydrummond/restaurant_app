package com.bnj.restaurant.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import java.util.Comparator;

@Data
@Builder
public class Customer implements Comparable<Customer> {
  @Id
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
  public int compareTo(Customer that) {
    return Comparator.comparing(Customer::getCustomer_id).compare(this, that);
  }
}
