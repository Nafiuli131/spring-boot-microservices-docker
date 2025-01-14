package com.example.order_service.controller;

import com.example.order_service.CustomerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final CustomerClient customerClient;

    public OrderController(CustomerClient customerClient) {
        this.customerClient = customerClient;
    }

    @GetMapping("/orders")
    public String getOrders() {
        String customers = customerClient.getCustomers();
        return "Orders and Customers: " + customers;
    }
}