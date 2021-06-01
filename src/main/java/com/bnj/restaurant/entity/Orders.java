package com.bnj.restaurant.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Builder
public class Orders {
  private int order_id;
  private int customer_id;
  private BigDecimal price;

  @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
  private Timestamp order_date;

  private boolean order_filled;

  private OrderTypes order_type;
}
