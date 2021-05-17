package com.bnj.restaurant.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private int emp_id;
//    private String name; need to add to schema
//    private String role; need to add to schema
    private int order_id;
    private boolean order_filled;
}
