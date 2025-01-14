package com.example.order_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "customer-service", url = "http://customer-service:8080")
public interface CustomerClient {
    @GetMapping("/customers")
    String getCustomers();
}
