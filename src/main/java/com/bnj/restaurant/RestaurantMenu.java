//package com.bnj.restaurant;
//
//import java.sql.SQLException;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//import com.bnj.restaurant.controller.CustomerController;
//import com.bnj.restaurant.controller.FoodController;
//import com.bnj.restaurant.controller.OrderController;
//import com.bnj.restaurant.entity.Customer;
//
//
//public class RestaurantMenu {
//    private final Scanner scan = new Scanner(System.in);
//    private CustomerController customerController = new CustomerController();
//    private FoodController foodController = new FoodController();
//    private OrderController orderController = new OrderController();
//
//    private final List<String> customerOptions = Arrays.asList(
//            "Create New Customer",
//            "Delete Customer",
//            "Show Customer By Customer ID",
//            "Create New Order",
//            "Show All Foods",
//            "Show Food By Food ID",
//            "Update Order Status",
//            "Delete Order",
//            "Close Connection"
//    );
//
//    public RestaurantMenu() throws SQLException {}
//
//    public void start() {
//        String selection = "";
//        do {
//            printMenu();
//            selection = scan.nextLine();
//            try {
//                if (selection.equals("1")) {
//                    ;
//                } else if (selection.equals("2")) {
//                    showUserById();
//                } else if (selection.equals("3")) {
//                    addNewUser();
//                } else if (selection.equals("4")) {
//                    deleteUserById();
//                } else if (selection.equals("5")) {
//                    addNewTodoToUser();
//                } else if (selection.equals("6")) {
//                    getTodosByUserId();
//                } else if (selection.equals("7")) {
//                    updateTodoStatus();
//                } else if (selection.equals("8")) {
//                    deleteTodoById();
//                } else if (selection.equals("9")) {
//                    userDao.closeConn();
//                    System.out.println("--------------------------");
//                    System.out.println("--------------------------");
//                    System.out.println("Thanks for using the ToDo CLI App!");
//                }
//            } catch (SQLException throwables) {
//                System.out.println("Error...not a good sign...debug or go home!");
//                throwables.printStackTrace();
//            }
//
//        } while (!selection.equals("9"));
//    }
//
//
//
//    private void printMenu() {
//        System.out.println("Select an option: \n-------------------------");
//        for (int i = 0; i < customerOptions.size(); i++) {
//            System.out.println(i + 1 + ") " + customerOptions.get(i));
//        }
//    }
//
//    private void addNewCustomer() throws SQLException {
//
//        System.out.println("Enter your first name: ");
//        String first_name = scan.nextLine();
//        System.out.println("Enter your last name: ");
//        String last_name = scan.nextLine();
//        System.out.println("Enter your address: ");
//        String address = scan.nextLine();
//        System.out.println("Enter your phone number: ");
//        String phone = scan.nextLine();
//        System.out.println("Enter your email address: ");
//        String email = scan.nextLine();
//        customerController.createCustomer();
//        System.out.println("New user created successfully!");
//    }
//
//
//
//}
