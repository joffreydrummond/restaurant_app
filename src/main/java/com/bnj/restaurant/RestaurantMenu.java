package com.bnj.restaurant;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RestaurantMenu {
    private Scanner scanner = new Scanner(System.in);

    private List<String> customerOptions = Arrays.asList(
            "Create New Customer",
            "Delete Customer",
            "Create New Order",
            "Show Orders By Customer ID",
            "Update Order Status",
            "Delete Order",
            "Close Connection"

    );

}
