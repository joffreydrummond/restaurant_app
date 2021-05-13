package com.bnj.restaurant.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employees {
    private int emp_id;
    private int order_id;
    private boolean order_filled;
}
