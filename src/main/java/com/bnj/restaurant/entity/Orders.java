package com.bnj.restaurant.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Orders {
    private int order_id;
    private int customer_id;
    private double price;
    private String order_date;
    private boolean order_filled;
  }
