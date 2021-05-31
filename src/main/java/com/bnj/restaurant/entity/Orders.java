package com.bnj.restaurant.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@Builder
public class Orders {
    private int order_id;
    private int customer_id;
    private BigDecimal price;
    private Date order_date;
    private boolean order_filled;
    private OrderTypes order_type;
  }
