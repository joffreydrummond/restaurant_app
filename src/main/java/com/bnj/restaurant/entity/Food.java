package com.bnj.restaurant.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Food {
    private int food_id;
    private String food_name;
    private String description;
    private boolean is_gluten_free;
    private boolean is_vegan;
    private BigDecimal price;
}
